import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        switch (a){
            case 1:
                System.out.print("Yes!");
                break;
            case 2:
            case 3:
            case 4:
                System.out.print("No!");
                break;
            default:
                System.out.print("Unknown number");
                break;
        }
    }
}