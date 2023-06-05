class TypeCasting {
	public static void main(String[] args) {

		double num = 43.7;
		int convertNum = (int) (num);
		System.out.println(convertNum);

		float num2 = 34.2f;
		int convertNum2 = (int) num2;
		System.out.println(convertNum2);

		byte num3 = 127;
		byte num4 = (byte) (65 + num3);
		System.out.println(num4);

	}

}