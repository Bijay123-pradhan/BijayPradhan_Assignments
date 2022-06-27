package com.cg.ds;


public class Armstrong2 {
    public static void main(String[] args) {
     System.out.println("The all armstromg number are between 100 to 999 :");
        for (int n = 100; n <1000; n++) {
            int sum=0;
            int i=n;
            
            while(i>0){
                int dif=i%10;
                sum = sum+dif*dif*dif;
                i/=10;
            }
            if(n==sum){
            	System.out.println(+n);
            }
        }
    }
}
