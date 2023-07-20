// 3)
// *
//  *
//   * 
//    * 
//     * 


class Q3Pt{

    public void pt3(){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                if(i == j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
      
        Q3Pt obj = new Q3Pt();
        obj.pt3();

    }
}