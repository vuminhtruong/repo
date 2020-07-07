import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int m=scanner.nextInt();
        int p=scanner.nextInt();
        int k=scanner.nextInt();
        int count=0;
        while(m<k){
            m+=(p/100)*m;
            count++;
        }
        System.out.println(count);
    }
}