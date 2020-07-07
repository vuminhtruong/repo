
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a1=400,a2=540,a3=120,a4=9,a5=550;
        System.out.print("Write action (buy, fill, take, remaining, exit): \n");
        String x = scanner.next();
       while (true) {
           if(x.trim().equals("exit"))
               break;
           else {
               switch (x) {
                   case "remaining":
                       System.out.print("The coffee machine has:\n");
                       System.out.print(a1 + " of water\n" +
                               a2 + " of milk\n" +
                               a3 + " of coffee beans\n" +
                               a4 + " of disposable cups\n" +
                               a5 + " of money\n");
                       break;
                   case "buy":
                       System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:\n");
                       String y1 = scanner.next();
                       if(a4==0)
                           System.out.print("Sorry, not enough disposable cups!\n");
                       else{
                           a4-=1;
                       switch (y1) {
                           case "1":
                               if(a1>=250&&a3>=16){
                                   System.out.print("I have enough resources, making you a coffee!\n");
                                   a1 -= 250;
                                   a3 -= 16;
                                   a5 += 4;
                               }
                               else if(a1<250)
                                   System.out.print("Sorry, not enough water\n");
                               else
                                   System.out.print("Sorry, not enough coffee beans\n");
                               break;
                           case "2":
                               if(a1>=350&&a2>=75&&a3>=20){
                                   System.out.print("I have enough resources, making you a coffee!\n");
                               a1 -= 350;
                               a2 -= 75;
                               a3 -= 20;
                               a5 += 7;}
                               else if(a1<350)
                                   System.out.print("Sorry, not enough water\n");
                               else if(a2<75)
                                   System.out.print("Sorry, not enough milk\n");
                               else
                                   System.out.print("Sorry, not enough coffee beans\n");
                               break;
                           case "3":
                               if(a1>=200&&a2>=100&&a3>=12){
                                   System.out.print("I have enough resources, making you a coffee!\n");
                               a1 -= 200;
                               a2 -= 100;
                               a3 -= 12;
                               a5 += 6;}
                               else if(a1<200)
                                   System.out.print("Sorry, not enough water\n");
                               else if(a2<100)
                                   System.out.print("Sorry, not enough milk\n");
                               else
                                   System.out.print("Sorry, not enough coffee beans\n");
                               break;
                           case "back":
                               break;
                       }}
                       break;
                   case "fill":
                       System.out.print("Write how many ml of water do you want to add:\n");
                       int y2 = scanner.nextInt();
                       System.out.print("Write how many ml of milk do you want to add:\n");
                       int y3 = scanner.nextInt();
                       System.out.print("Write how many grams of coffee beans do you want to add:\n");
                       int y4 = scanner.nextInt();
                       System.out.print("Write how many disposable cups of coffee do you want to add:\n");
                       int y5 = scanner.nextInt();
                       a1 += y2;
                       a2 += y3;
                       a3 += y4;
                       a4 += y5;
                       break;
                   case "take":
                       System.out.print("I gave you " + a5);
                       a5 -= a5;
                       break;

               }
               System.out.println();
               System.out.print("Write action (buy, fill, take, remaining, exit): \n");
               x=scanner.next();
           }
       }
    }
}
