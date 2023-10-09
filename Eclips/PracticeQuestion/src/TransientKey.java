import java.beans.Transient;

public class TransientKey {
	transient static int a = 9;
	public static void main(String[] args) {
		System.out.println(a);
	}
}
