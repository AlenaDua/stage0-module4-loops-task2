package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        //Write a program that will write to console multiplied
        // numbers by input from zero to the number from method arguments
        // using while loop, each on new line(program should also be able to work with negatives):
        int i = 0;
        while (i <= Math.abs(multiplyByAndToInclusive) & multiplyByAndToInclusive != 0) {
            int result = i * multiplyByAndToInclusive;
            System.out.println(result);
            i++;
        }
    }
}
