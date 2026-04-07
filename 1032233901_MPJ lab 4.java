import java.util.*;
import java.io.*;

class Customer {
    int id;
    String name;
    double balance;

    Customer(int i, String n, double b) throws Exception {
        if (i < 1 || i > 20)
            throw new Exception("Wrong id");
        if (b < 1000)
            throw new Exception("Min 1000 needed");

        id = i;
        name = n;
        balance = b;
    }

    void addMoney(double x) throws Exception {
        if (x <= 0)
            throw new Exception("Invalid");
        balance = balance + x;
    }

    void takeMoney(double x) throws Exception {
        if (x > balance)
            throw new Exception("Less balance");
        balance = balance - x;
    }
}

public class BankFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter id:");
            int id = sc.nextInt();

            System.out.println("Enter name:");
            String name = sc.next();

            System.out.println("Enter balance:");
            double bal = sc.nextDouble();

            Customer c = new Customer(id, name, bal);

            System.out.println("1 Add  2 Withdraw");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.println("Enter money:");
                double m = sc.nextDouble();
                c.addMoney(m);
            } else {
                System.out.println("Enter money:");
                double m = sc.nextDouble();
                c.takeMoney(m);
            }

            FileWriter f = new FileWriter("data.txt", true);
            f.write(c.id + " " + c.name + " " + c.balance + "\n");
            f.close();

            System.out.println("Done");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}