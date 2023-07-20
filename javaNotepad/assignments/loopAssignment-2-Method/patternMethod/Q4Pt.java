// 4)
// ***** 
// ***** 
// ***** 
// ***** 
// ***** 

public class Q4Pt {
    public void pt(){
        for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= 5; c++){    
				System.out.print("*");
			}
			System.out.println();
		}
    }
    public static void main(String[] args) {
        Q4Pt obj = new Q4Pt();
        obj.pt();
    }
}
