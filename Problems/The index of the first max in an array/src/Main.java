import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        int[] numbers=new int[scanner.nextInt()];
        int max=0;
        for(int i=0;i<numbers.length;i++){
            numbers[i]=scanner.nextInt();
            if(numbers[i]>max)
                max=numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            if (numbers[i]==max){
                System.out.print(i);
                break;
            }
        }
    }
}