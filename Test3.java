
package test3;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("enter something : ");
        String a=sc.nextLine();
        System.out.print("enter something : ");
        String b=sc.nextLine();
        
        if(a.equals(b))
            System.out.print("both String are same");
        else
            System.out.print("the string are not same");
        
    }
    
}
