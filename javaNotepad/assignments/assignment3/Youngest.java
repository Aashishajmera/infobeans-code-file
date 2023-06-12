import java.util.Scanner;

public class Youngest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age1 = sc.nextInt();
		System.out.println("Enter your age: ");
		int age2 = sc.nextInt();
		System.out.println("Enter your age: ");
		int age3 = sc.nextInt();

		if (age1 > age2 && age1 > age3) {
			System.out.println(age1 + " is oldest: ");
		}  if (age1 < age2 && age1 < age3) {
			System.out.println(age1 + " is youngest: ");
		} if (age2 > age3 && age2 > age1) {
			System.out.println(age2 + " is oldest: ");
		} if (age2 < age1 && age2 < age3) {
			System.out.println(age2 + " is youngest: ");
		}  if (age3 > age2 && age3 > age1) {
			System.out.println(age3 + " is oldest: ");
		}    if (age3 < age1 && age3 < age2) {
			System.out.println(age3 + " is youngest: ");
		}
	}
}