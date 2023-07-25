class m22{
	private static String name ;
	static int n;
	public static void setName(){
		name = "Aashish";
		n = 4;
	}
	public String getName(){
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
		obj.setName();
		System.out.println(obj.getName());
		// System.out.println(m22.n);
		// System.out.println(i);
		
	}
}