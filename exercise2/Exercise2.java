
package exercise2;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Income income;
        Staff staff;
        String name,id,incomeType;
        double tax,amount;
        
        System.out.print("name\t\t: ");
        name=sc.nextLine();
        System.out.print("id\t\t: ");
        id=sc.nextLine();
        System.out.print("income type\t: ");
        incomeType = sc.nextLine();
        System.out.print("income amount\t: RM");
        amount = sc.nextDouble();
        System.out.print("tax percentage\t: ");
        tax = sc.nextDouble();
        
        
        income=new Income(incomeType,amount,tax);
        staff=new Staff(name,id,income);
        
        staff.displayIncomeinfo();
        staff.displayStaffInfo();
    }
}
