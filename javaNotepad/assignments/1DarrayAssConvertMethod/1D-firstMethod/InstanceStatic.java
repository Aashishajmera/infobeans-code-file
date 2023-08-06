class m22{
	private String name ;
	static int n;
	public  void setName(String k){
		this.name = k;
		this.n = 4;
	}
	public String static String getName(){
		return name;
	}
}

class InstanceStatic{
	
/* 	 
	private int n;
	public void setName(){
		name = "Aashish";
		n = 4;
	}
	 */
	
	public static void main(String[] args){
		m22 obj = new m22();
		String k = "Aashish";
		obj.setName(k);
		System.out.println(obj.getName());
		m22 obj1 = new m22();
		k = "ajmera";
		obj1.setName(k);
		System.out.println(obj.getName());
		System.out.println(obj1.getName());
		// System.out.println(m22.n);
		// System.out.println(i);
		
	}
}