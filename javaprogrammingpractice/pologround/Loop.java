class Loop {
    public static void main(String[] args) {
        int[] A = { 0, 2, 4, 1, 3 };
        for (int i = 0; i < A.length; i++) {
            A[i] = A[(A[i] + 3) % A.length];
        }
        // for(int i = 0; i < A.length; i++){
        //     System.out.println(A[i]);
        // }
    }
}