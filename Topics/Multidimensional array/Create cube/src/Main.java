class ArrayOperations {
    public static int[][][] createCube() {
        int[][][] threeDimArray = new int[3][3][3];
        int i;
        int j;
        int k = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    threeDimArray[i][j][k] = k + 3 * j;
                }
                //k = 0;
            }
        }
        return threeDimArray;
    }
}