class Pattern{
	public void drowPattern(){
		for(int i = 1; i <= 4; i++){
			char a = 65;
			for(int j = 4; j >= i; j--){
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}
}

class Q5pattern2{
	public static void main(String[] args){
		Pattern obj = new Pattern();
		obj.drowPattern();
	}
}