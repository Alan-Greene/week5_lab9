package inclassex1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ex6 {

    static void shuffleArray(int[] num_list)
    {
        Random rnd = ThreadLocalRandom.current();
        for (int i = num_list.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            int a = num_list[index];
            num_list[index] = num_list[i];
            num_list[i] = a;
        }
    }

    public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        int correct_counter = 0;
        int one = 1;
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        shuffleArray(num_list);

        while (counter < 3){
            int current_num = getRandom(num_list);
            System.out.printf("%d + %d = ?%n", one, current_num);
            int answer = 1 + current_num;
            int user_answer = in.nextInt();
            if (user_answer != answer){
                System.out.println("Sorry that is incorrect!");
                counter++;
            } else {
                System.out.println("Correct!");
                correct_counter ++;
            }
        }

        System.out.printf("sorry, you have answered %d questions incorrectly%n", counter);
        System.out.printf("You answered %d correctly", correct_counter);
    }
}
