import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        boolean b=false;
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int[] number= new int[x];
        for(int i=0;i<x;i++){
            number[i]=scanner.nextInt();
        }
        int z=scanner.nextInt();
        for(int y:number){
            if(y==z)
                b=true;
        }
        System.out.println(b);
    }
}