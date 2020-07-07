import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int i=0;
        int y=0;
        for(;i<a;i++){
            int x=scanner.nextInt();
            if(x%6==0)
                y+=x;
        }
        System.out.println(y);
    }
}