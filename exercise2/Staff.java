
package exercise2;

public class Staff{
    private String name,id;
    private Income income;
    
    public Staff(String name, String id,Income income){
        this.name=name;
        this.id=id;
        this.income=income;
    }
    
    public String getName(){
        return name;
    }
    
    public String getId(){
        return id;
    }
    
    public double calculatNetIncome(){
        return income.getAmount()-income.getTotalTax();
    }
    
    public void displayIncomeinfo(){
        System.out.println("\n\nname\t\t: "+this.name);
        System.out.println("id\t\t: "+this.id+"\n");
    }
    public void displayStaffInfo(){
         System.out.println("\n\nincome\t\t: RM" + income.getAmount());
        System.out.println("type\t\t: " + income.getIncomeType());
        System.out.println("tax\t\t: " + income.getTax() + "%");
        System.out.println("total tax\t: RM" + income.getTotalTax());
        System.out.println("net income\t: RM" + calculatNetIncome());
    }
}
