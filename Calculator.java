import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Simple Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Square");
            System.out.println("7. Power");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if(choice >= 1 && choice <= 5) {
                System.out.print("Enter first number: ");
                int a = sc.nextInt();

                System.out.print("Enter second number: ");
                int b = sc.nextInt();

                switch(choice) {
                    case 1:
                        System.out.println("Result = " + (a + b));
                        break;
                    case 2:
                        System.out.println("Result = " + (a - b));
                        break;
                    case 3:
                        System.out.println("Result = " + (a * b));
                        break;
                    case 4:
                        if(b != 0)
                            System.out.println("Result = " + (a / b));
                        else
                            System.out.println("Cannot divide by zero");
                        break;
                    case 5:
                        System.out.println("Result = " + (a % b));
                        break;
                }
            }
            else if(choice == 6) {
                System.out.print("Enter number: ");
                int a = sc.nextInt();
                System.out.println("Square = " + (a * a));
            }
            else if(choice == 7) {
                System.out.print("Enter base: ");
                int a = sc.nextInt();

                System.out.print("Enter power: ");
                int b = sc.nextInt();

                int result = 1;
                for(int i = 1; i <= b; i++) {
                    result = result * a;
                }
                System.out.println("Result = " + result);
            }

        } while(choice != 8);

        System.out.println("Calculator Closed.");
        sc.close();
    }
}