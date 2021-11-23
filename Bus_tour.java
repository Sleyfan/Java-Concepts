import java.util.Scanner;
public class Bus_tour{
    public static void main(String[] args) {
      Scanner tour =new Scanner(System.in);

         int price_per_percipant =2500;
         int total_no_percipant =tour.nextInt();
         int total_revenue =price_per_percipant*total_no_percipant;
         System.out.println(total_revenue);
   
  }
   
}
       
   
   