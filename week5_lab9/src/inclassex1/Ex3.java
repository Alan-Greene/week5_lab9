package inclassex1;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[][] big_array = new int[20][20];

        int counter = 0;
        for (int row = 0; row < big_array[0].length; row++){
            for (int col = 0; col < big_array[0].length; col++){
                big_array[row][col] += counter;
                counter ++;
            }
        }
        for (int[] row:big_array){
            System.out.println(Arrays.toString(row));
        }
    }
}
