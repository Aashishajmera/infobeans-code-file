class ArithmeticOperator {
	public static void main(String args[]) {

		// Airthmetic operator (+, -, *, /, %)

		// Addition of two number
		byte num1 = 32;
		byte num2 = 43;
		int num3 = num1 + num2;
		System.out.println(num1 + " and " + num2 + " Addition is: " + num3);

		// Subtraction of two number
		int num4 = num1 - num2;
		System.out.println(num1 + " and " + num2 + " Subtraction is: " + num4);

		// multiply of two number
		int num5 = num1 * num2;
		System.out.println(num1 + " and " + num2 + " multiply is: " + num5);

		// Divide of two number
		byte num6 = 14;
		byte num7 = 7;
		byte num8 = (byte) (num6 / num7);
		System.out.println(num6 + " divide by " + num7 + " divide is: " + num8);

		// And Modules
		byte num9 = (byte) (num6 % num7);
		System.out.println(num6 + " and " + num7 + " modules is: " + num9);

	}
}