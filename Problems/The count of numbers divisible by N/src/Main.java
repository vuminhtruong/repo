import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int i=0;
        for(;a<=b;a++){
            if(a%c==0)
                i++;
        }
        System.out.println(i);
    }
}