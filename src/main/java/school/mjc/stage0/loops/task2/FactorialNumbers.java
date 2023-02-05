package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        //Write a program that will write to console all numbers
        // from factorial row, from 0 up to input from method arguments
        // using while loop, each on new line:
        int i = 0;
        long factorial = 1;
        while (i <= printToInclusive) {
            System.out.println(factorial);
            i++;
            factorial = factorial * i;
        }

    }
}
