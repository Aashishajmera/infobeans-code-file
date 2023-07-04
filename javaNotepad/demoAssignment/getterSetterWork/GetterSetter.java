class Student{
	private String name;
	private int rollNum;
	
	public String getname(){
		return name;
	}
	
	public void setname(String name){
		this.name = name;
	}
	
	public int getrollNum(){
		return rollNum;
	}
	
	public void setrollNum(int rollNum){
		if(rollNum <= 0){
			throw new IllegalArgumentException("Invalid digit");
		}
		this.rollNum = rollNum;
	}
}

public class GetterSetter{
		public static void main(String[] args){
			Student st = new Student();
			st.setname("Aashis ajmera");
			st.setrollNum(4);
		}
	}