import java.util.Scanner;
public class CoffeeMachine {
    enum action{
        BUY("buy"),
        FILL("fill"),
        TAKE("take"),
        REMAINING("remaining"),
        EXIT("exit"),
        NONE("");
        private String input;
        action(String input){
            this.input=input;
        }
        private static action findaction(String s){
            for(action a: values()){
                if(a.input.equals(s)){
                    return a;
                }
            }
            return NONE;
        }
    }
    static class Machine{
        private static int water;
        private static int milk;
        private static int coffeebeans;
        private static int cups;
        private static int cash;

        Machine(){
            water=400;
            milk=540;
            coffeebeans=120;
            cups=9;
            cash=550;
        }
        private static boolean checkresources(int x, int y, int z, int t){
            boolean check=true;
            if(x>water){
                System.out.println("Sorry, not enough water!\n");
                check=false;
            }
            if(y>milk){
                System.out.println("Sorry, not enough milk!\n");
                check=false;
            }
            if(z>coffeebeans){
                System.out.println("Sorry, not enough coffee beans!\n");
                check=false;
            }
            if(t>cups){
                System.out.println("Sorry, not enough cups!\n");
                check=false;
            }
            return check;
        }
        private static void buy(String x){
            switch (x){
                case "1":
                    if(checkresources(250,0,16,1)){
                        System.out.println("I have enough resources, making you a coffee!\n");
                        water -=250;
                        coffeebeans -=16;
                        cups -=1;
                        cash +=4;
                    }
                    break;
                case "2":
                    if(checkresources(350,75,20,1)){
                        System.out.println("I have enough resources, making you a coffee!\n");
                        water -=350;
                        milk -=75;
                        coffeebeans -=20;
                        cups -=1;
                        cash +=7;
                    }
                    break;
                case "3":
                    if(checkresources(200,100,12,1)){
                        System.out.println("I have enough resources, making you a coffee!\n");
                        water -=200;
                        milk -=100;
                        coffeebeans -=12;
                        cups -=1;
                        cash +=6;
                    }
            }
        }
        private static void fill(int x,int y,int z,int t){
            water+=x;
            milk+=y;
            coffeebeans+=z;
            cups+=t;
        }
        private static void take(){
            System.out.println("\nI gave you $"+cash+"\n");
            cash=0;
        }
        private static void remaining(){
            System.out.println("\nThe coffee machine has:\n" +
                    water + " of water\n" +
                    milk + " of milk\n" +
                    coffeebeans + " of coffee beans\n" +
                    cups + " of disposable cups\n" +
                    "$" + cash + " of money\n");
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Machine machine = new Machine();
        int water1,milk1,coffeebeans1,cups1,cash1;
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String s=scanner.next();
        while(action.findaction(s)!=action.EXIT){
            switch (action.findaction(s)){
                case BUY:
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String x=scanner.next();
                    Machine.buy(x);
                    break;
                case FILL:
                    System.out.println("Write how many ml of water do you want to add:");
                    water1=scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk1=scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    coffeebeans1=scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    cups1=scanner.nextInt();
                    Machine.fill(water1,milk1,coffeebeans1,cups1);
                    break;
                case TAKE:
                    Machine.take();
                    break;
                case REMAINING:
                    Machine.remaining();
                    break;
                default:
                    System.out.println("Please enter a valid action.");
                    break;
            }
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            s=scanner.next();
        }
    }
}
