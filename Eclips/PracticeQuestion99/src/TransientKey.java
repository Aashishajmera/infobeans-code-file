import java.beans.Transient;

public class TransientKey {
	transient int a = 9;
	int b = 20;

	public static void main(String[] args) {
		TransientKey transient1 = new TransientKey();
		System.out.println(transient1.a);
		System.out.println(transient1.b);
	}
}
