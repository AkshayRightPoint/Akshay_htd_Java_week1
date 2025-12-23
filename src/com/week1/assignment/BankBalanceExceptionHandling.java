package com.week1.assignment;

public class BankBalanceExceptionHandling {
    public static void checkBalance(float balance) throws BalanceLowCustomeException {
        if(balance<500){
           throw new BalanceLowCustomeException("Balance is low");
        }else{
            System.out.println("Sufficent Balance");
        }
    }

    public static void main(String[] args) {
        float balance = 500.0f;
        try{
            checkBalance(balance);
        }catch (BalanceLowCustomeException ex){
            System.out.println("Low Balance " + ex);
        }
    }
}


class BalanceLowCustomeException extends  Exception{
    public BalanceLowCustomeException(String message){
        super(message);
    }
}