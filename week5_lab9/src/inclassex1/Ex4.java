package inclassex1;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        int[][] mr_array = new int[20][2];
        int counter = 2;

         for (int i = 0; i < mr_array.length; i++) {
             mr_array[i][0] = counter;
             counter += 2;
             mr_array[i][1] = mr_array[i][0] + counter;
             if (mr_array[i][1] == 82) {
                 mr_array[i][1] = 40;
             }
         }
         System.out.printf("%-10s %-10s %-10s%n", "Row", "Col0", "Col1");
         for (int i = 0; i < mr_array.length; i++)
            System.out.printf("%-10d %-10d %-10d%n", i, mr_array[i][0], mr_array[i][1]);
    }
}
