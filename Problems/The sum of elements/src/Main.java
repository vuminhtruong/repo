import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int sum=0;
        while(a!=0){
            sum+=a;
            a=scanner.nextInt();
        }
        System.out.println(sum);
    }
}