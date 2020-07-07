import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[] numbers=new int[scanner.nextInt()];
        int max=0,count=0,count1=0;
        for(int i=0;i<numbers.length;i++){
            numbers[i]=scanner.nextInt();
            if(numbers[i]>max&&i!=numbers.length-1){
                count++;
            }
            if(numbers[i]<=max) {
                count1=Math.max(count,count1);
                count=1;
            }
            if((i==numbers.length-1)&&numbers[i]>max){
                count++;
                count1=Math.max(count,count1);
            }
            max=numbers[i];
        }
        System.out.print(count1);
    }
}