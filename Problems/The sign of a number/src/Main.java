import java.util.Scanner;

public class Main {

    public static int sign(int number) {
        // write your code here
        if(number<0)
            number=-1;
        return(number>0?1:number);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}