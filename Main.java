public class Main {
     public static void main(String arg[]){
         VipCustomer petyaVip = new VipCustomer();

         System.out.println (petyaVip.getCreditLimit ());

         VipCustomer customer2 = new VipCustomer("Bob", 25000.00);
         System.out.println (customer2.getName ());

         VipCustomer customer3 = new VipCustomer("Lel", 250.00, "lbbp@gmail.ru");
         System.out.println (customer3.getEmail ());


     }
}
