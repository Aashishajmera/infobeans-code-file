class ASCII{
	public void ascii(char a){
		int result = a;
		System.out.println(result);
	}
}

class Q3ASCII{
	public static void main(String[] args){
		char a = 'a';
		ASCII obj = new ASCII();
		obj.ascii(a);
	}
}