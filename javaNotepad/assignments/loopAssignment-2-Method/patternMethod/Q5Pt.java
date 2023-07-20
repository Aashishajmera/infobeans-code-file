// 5)
// 12345 
// 12345 
// 12345 
// 12345 
// 12345 

public class Q5Pt {
    // create method:
    public void pt5(){
        for(int r = 1; r <= 5; r++){
			for(int c = 1; c <= 5; c++){
				System.out.print(c);
			}
			System.out.println();
		}
    }

    public static void main(String[] args) {

        Q5Pt obj = new Q5Pt();
        obj.pt5();
    }
}