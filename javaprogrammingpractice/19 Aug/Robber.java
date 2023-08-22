import java.util.Scanner;

class Operation {
    public int operation(int arr[]) {
        int totalMoneyEven = 0, totalMoneyOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                totalMoneyEven += arr[i];
            }else{
                totalMoneyOdd+=arr[i];
            }
        }
        if(totalMoneyEven > totalMoneyOdd){
            return totalMoneyEven;
        }else{
            return totalMoneyOdd;
        }
        // return totalMoney;
    }
}

class Robber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of House: ");
        int size = sc.nextInt();

        // create a array:
        int arr[] = new int[size];

        // input array element:
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the amount of " + (i+1) + " house ");

            arr[i] = sc.nextInt();
        }

        // create a object of operation class:
        Operation objO = new Operation();
        int ans = objO.operation(arr);
        System.out.println("Total amount is: " + ans);
    }
}