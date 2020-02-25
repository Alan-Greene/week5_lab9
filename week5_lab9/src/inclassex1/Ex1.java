package inclassex1;

public class Ex1 {

    public static void main(String[] args) {
        double sum = 0;
        double[][] balances = {{6.7, 4.4, 7.9, 9.2, 7.1}, {9.0, 6.7, 3.3, 2.7, 20.1}};

        for (double[] row:balances){
            for (double col:row){
                sum += col;
            }
        }

        System.out.printf("The sum of the 2d array is: %.2f%n", sum);

    }
}
