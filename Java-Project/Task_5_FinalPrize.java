import java.util.*;
public class Task_5_FinalPrize {
    public static void main(String[] args) {
        double productPrize, commissionRate, discountRate;
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter the product prize :");
        productPrize = aa.nextDouble();
        System.out.println("Enter the commission rate in percentage:");
        commissionRate = aa.nextDouble();
        System.out.println("Enter the discount rate in percentage ");
        discountRate = aa.nextDouble();

        System.out.println("The final prize is "+finalPrize(productPrize,commissionRate,discountRate));
    }

    private static double finalPrize(double productPrize,double commissionRate,double discountRate){
        double commissionAmount = (productPrize*commissionRate)/100.00;
        double discountAmount = ((commissionAmount + productPrize) * discountRate)/100.00;
        return productPrize + commissionAmount - discountAmount;
    }
}
