class ArrayOperations {
    public static void reverseElements(int[][] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0, k = arr[i].length - 1; j < k; j++, k--) {
                arr[i][j] ^= arr[i][k];// c =a xor b
                arr[i][k] ^= arr[i][j];// a = b xor c
                arr[i][j] ^= arr[i][k];// b = a xor c
            }
        }
    }

    public static void main(String[] args) {
        int [][] test = new int[][]{{0,0,9,9},{1,2,3,4},{5,6,7,8}};
        reverseElements(test);
    }
}