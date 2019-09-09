import java.util.*;

public class Ticket_number {
    public static void main(String[] args) {
        System.out.print("Enter your ticket numbers: ");
        Scanner input = new Scanner(System.in);
        Integer inputTicketNumber = input.nextInt();
        Integer checker = 0, identify, temp = inputTicketNumber;
       while(temp != 0){
           temp /= 10;
           checker += 1;
       }
       if(checker >= 7){
           System.out.println("Invalid-Ticket-Number!!!");
       }else{
           System.out.println("The digit that removed: " + inputTicketNumber%10);
           identify = (inputTicketNumber/10) % 7;
           System.out.println("The identify is : " + identify);
       }
    }
}
