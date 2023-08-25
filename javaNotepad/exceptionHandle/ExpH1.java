import java.util.Scanner;

class ExpH1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entr size of array: ");
		int size = sc.nextInt();

		int arr[] = new int[4];

		for (int i = 0; i < size; i++) {
			boolean flag = false;
			do {
				try {
					System.out.println("Enter " + (i + 1) + " element: ");
					arr[i] = sc.nextInt();
				} catch (Exception e) {
					flag = true;
					System.out.println("Array index out of bound: ");
					System.out.println("Enter size");
					size = sc.nextInt();
					flag = false;
					i = -1;
				}
			} while (flag);

		}

	}
}