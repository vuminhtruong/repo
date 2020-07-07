import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long a=scanner.nextLong();
        String x=scanner.next();
        long b=scanner.nextLong();
        switch (x){
            case "+":
                System.out.print(a+b);
                break;
            case "-":
                System.out.print(a-b);
                break;
            case "*":
                System.out.print(a*b);
                break;
            case "/":
                if(b==0)
                    System.out.print("Division by 0!");
                else
                    System.out.print(a/b);
                break;
            default:
                System.out.print("Unknown operator");

        }
    }
}