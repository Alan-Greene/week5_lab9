package inclassex1;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        double region1_sum = 0;
        double region1_average;
        double region2_sum = 0;
        double region2_average;
        double[][] rainfall = {{3.2, 4.7}, {3.4, 6.0}, {3.1, 4.3}};

        for (int months = 0; months < rainfall.length; months++){
            for (int values = 0; values < 1; values ++){
                region1_sum += rainfall[months][values];
            }
        }

        region1_average = region1_sum / rainfall.length;

        for (int months = 0; months < rainfall.length; months++){
            for (int values = 1; values < 2; values ++){
                region2_sum += rainfall[months][values];
            }
        }

        region2_average = region2_sum / rainfall.length;

        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Region", "Jan", "Feb", "Mar", "Average");

        System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-10.2f%n", 1, rainfall[0][0], rainfall[1][0], rainfall[2][0], region1_average);
        System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-10.2f%n", 2, rainfall[0][1], rainfall[1][1], rainfall[2][1], region2_average);
    }
}


