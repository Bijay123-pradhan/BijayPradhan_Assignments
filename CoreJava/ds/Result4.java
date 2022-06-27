package com.cg.ds;

import java.util.Scanner;

public class Result4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
     System.out.println("enter your marks");
        int i=3;
        int count=0;
        while(i>0){
            int marks=s.nextInt();
            if(marks>60){
                count++;
            }
            i--;
        }
        if(count == 3){
            System.out.println(" You Passed");
        }
        else if(count ==2){
            System.out.println(" You Promoted");
        }
        else if(count == 1){
            System.out.println(" You Failed");
        }
    }
}