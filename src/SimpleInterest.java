import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter principle amount");
        double principal = scan.nextDouble();
        System.out.println("enter  Rate of interest ");
        double rate= scan.nextDouble();
        System.out.println("enter Time in years");
        int time= scan.nextInt();
        double simpleInterest =(principal *rate*time)/100;
        double totalAmount   =principal +simpleInterest ;
        System.out.println(String.format("Simple interest : ₹%.2f",simpleInterest ));
        System.out.println(String.format("Total Amount    : ₹%.2f", totalAmount));    }
}
