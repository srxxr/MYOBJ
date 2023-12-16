package H3;

public class R_3_24 {
    public static int[][][] Arrays3(int[][][] array1, int[][][] array2) {
        if (array1.length != array2.length || array1[0].length != array2[0].length || array1[0][0].length != array2[0][0].length) {
            throw new IllegalArgumentException("Arrays must have the same dimensions.");
        }

        int[][][] result = new int[array1.length][array1[0].length][array1[0][0].length];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                for (int k = 0; k < array1[i][j].length; k++) {
                    result[i][j][k] = array1[i][j][k] + array2[i][j][k];
                }
            }
        }

        return result;
    }

}
