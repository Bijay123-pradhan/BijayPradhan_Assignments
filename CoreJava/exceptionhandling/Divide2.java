package com.cg.exceptionhandling;


import java.util.Scanner;

public class Divide2
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.printf("Enter the numerator : ");
            int n = s.nextInt();
            System.out.printf("Enter the  denominator: ");
            int d = s.nextInt();
            try{
                double r=divide(n, d);
                System.out.println("The quotient is: "+r);
            }
            catch (UnsupportedOperationException e) {
            System.out.printf("Can't divide by zero");
        }
    }
    public static double divide(int n, int d) throws UnsupportedOperationException{
        if(d==0){
            throw new UnsupportedOperationException("Exception");
        }
        return n / d;
    }
}
class UnsupportedOperationException extends Exception{
    UnsupportedOperationException(String exception){
        super(exception);
    }
}