import java.sql.SQLOutput;
import java.util.*;
public class Emp {

    public static void main(String[] ag){
        ArrayList l=new ArrayList();

        Scanner sc=new Scanner(System.in);
        while (true){
        System.out.println("1:Add Employee");
        System.out.println("2.View Employee");
        System.out.println("3.Search Employee");
        System.out.println("4.Delete Employee");
        System.out.println("5.Exit");
        int c=sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("enter code");
                int a = sc.nextInt();
                System.out.println("enter name");
                String b = sc.next();
                System.out.println("enter designation ");
                String e = sc.next();
                System.out.println("enter salary");
                double f = sc.nextDouble();
                System.out.println("enter company name");
                String g = sc.next();
                System.out.println("enter phone number");
                double h = sc.nextDouble();
                System.out.println("enter email");
                String i = sc.next();
                l.add(a);
                l.add(b);
                l.add(e);
                l.add(f);
                l.add(g);
                l.add(h);

                break;




        }
        }
    }



}
