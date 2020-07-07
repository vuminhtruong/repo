import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // put your code here
        switch (new Scanner(System.in).next()){
            case "gryffindor":
                System.out.print("bravery");
                break;
            case "hufflepuff":
                System.out.print("loyalty");
                break;
            case "slytherin":
                System.out.print("cunning");
                break;
            case "ravenclaw":
                System.out.print("intellect");
                break;
            default:
                System.out.print("not a valid house");
                break;
        }
    }
}