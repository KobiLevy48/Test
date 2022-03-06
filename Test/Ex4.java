package Test;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter X and N: ");
        int x=scr.nextInt();
        int n= scr.nextInt();
        System.out.println(func(x,n));

    }
    public static double func(int x, int n){
        boolean flag = false;
        double sum = 0;
        for (int i = 1;i<=n; i++){

            if(flag){
                sum+= ((Math.pow(x,2*i))/factorial(i));
                flag =false;
            }
            else{
                sum+= (-((Math.pow(x,2*i))/factorial(i)));
                flag=true;
            }
        }
        return sum;
    }
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        return num*factorial(num-1);
    }
}
