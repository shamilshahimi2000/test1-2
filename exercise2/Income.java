
package exercise2;

public class Income {
    private String incomeType;
    private double amount,tax;
    
    
    public Income(String IncomeType,double Amount,double Tax){
        incomeType=IncomeType;
        amount=Amount;
        tax=Tax;
    }
    
    public String getIncomeType(){
        return incomeType;
    }
    
    public double getAmount(){
        return amount;
    }
    
    public double getTax(){
        return tax;
    }
    
    public double getTotalTax(){
        return (tax/100)*amount;
    }
    
}
