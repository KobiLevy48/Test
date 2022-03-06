package Test;

import java.util.Scanner;

// throw exception but print the result.

public class Ex3 {
    public static void main(String[] args) {
        TheCalculator calc = new TheCalculator();
        Thread thread = new Thread(calc);

        for (int i = 0; i<4; i++){
            thread.start();
        }
        thread.start();


    }

    public static class TheCalculator implements Runnable {
        public static int sum;

        @Override
        public void run() {
          calculate();
        }
        public synchronized void calculate(){
            int num1 = 10;
            int num2 = 2;
            System.out.println(num1/num2);
            Thread.currentThread().interrupt();
            System.out.println(num1*num2);
            Thread.currentThread().interrupt();
            System.out.println(num1+num2);
            Thread.currentThread().interrupt();
            System.out.println(num1-num2);
            Thread.currentThread().interrupt();

        }


    }

}
