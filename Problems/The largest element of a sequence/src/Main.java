import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        int i=0;
        int a=scanner.nextInt();
        while(a!=0){
            i= Math.max(a, i);
            a=scanner.nextInt();
        }
        System.out.println(i);
    }
}