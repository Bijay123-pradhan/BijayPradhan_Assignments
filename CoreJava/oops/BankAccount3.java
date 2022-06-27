package com.cg.oops;

abstract class bank{
	   abstract public void disp();
	}
	class savings_Account extends bank{
	    double balance;
	    double fixdeposite;
	    public savings_Account(double balance,double fixdeposite){
	        this.balance=balance;
	        this.fixdeposite=fixdeposite;
	    }
	    public void disp(){
	        System.out.println("Total money in saving:"+(balance+fixdeposite));
	    }
	    public double get(){
	        return balance+fixdeposite;
	    }
	}
	class current_Account extends bank{
	    double balance;
	    double cashcredit;
	    public current_Account(double balance,double  cashcredit){
	        this.balance=balance;
	        this. cashcredit= cashcredit;
	    }
	    public void disp(){
	        System.out.println("Total money in current: "+(balance+ cashcredit));
	    }
	    public double get(){
	        return balance+cashcredit;
	    }
	}

	public class BankAccount3 {
	    public static void main(String[] args) {
	        savings_Account s=new savings_Account(30000,4000);
	        current_Account c=new current_Account(500000,20000);
	        s.disp();
	        c.disp();
	        double totalAmount=s.get()+c.get();
	        System.out.println("The total money in bank: "+totalAmount);
	    }
	}