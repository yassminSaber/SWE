import java.util.*;

public class main {
    public static void main(String[] args){
       int choice1 , choice2,choice3 ,numOfSlots ;
       String answer , answer2;
       long playerPhone , ownerPhone;
       int playerID , ownerID;
       String playerName,playerEmail,playerLocation,playerPassword;
       String ownerName,ownerEmail,ownerLocation,ownerPassword;
       String groundName, groundLocation;
       float pricePerHour;
       double cancellationPeriod, area;
       User player = new User();
       User owner = new User();
       PlaYground playground = new PlaYground();
       Scanner input = new Scanner(System.in);
       System.out.println("1-sign up");
       System.out.println("2-log in");
       choice1 = input.nextInt();
       switch(choice1){
           case 1:
               System.out.println("1-player");
               System.out.println("2-play ground owner");
               choice2 = input.nextInt();
               switch(choice2){
                   case 1:
                       System.out.println("Name: ");
                       playerName = input.next();
                       player.setName(playerName);
                       System.out.println("Email: ");
                       playerEmail = input.next();
                       player.setEmail(playerEmail);
                       System.out.println("Password: ");
                       playerPassword = input.next();
                       player.setPassword(playerPassword);
                       System.out.println("Location: ");
                       playerLocation = input.next();
                       player.setLocation(playerLocation);
                       System.out.println("phone: ");
                       playerPhone= input.nextLong();
                       player.setPhone(playerPhone);
                       System.out.println("ID: ");
                       playerID=input.nextInt();
                       player.setId(playerID);
                       System.out.println("Do you want to book a play ground?(yes,no) ");
                       answer = input.next();
                       if(answer.equals("yes")){
                            System.out.println("Enter number of time slots:");
                            numOfSlots = input.nextInt();
                            System.out.println("Total price is: "+playground.bookAplayGround(numOfSlots));
                       }
                       else if(answer.equals("no")) {
                             return;       
                       }
                       break;
                   case 2:
                       System.out.println("Name: ");
                       ownerName = input.next();
                       owner.setName(ownerName);
                       System.out.println("Email: ");
                       ownerEmail = input.next();
                       owner.setEmail(ownerEmail);
                       System.out.println("Password: ");
                       ownerPassword = input.next();
                      owner.setPassword(ownerPassword);
                       System.out.println("Location: ");
                       ownerLocation = input.next();
                       owner.setLocation(ownerLocation);
                       System.out.println("phone: ");
                       ownerPhone= input.nextLong();
                       owner.setPhone(ownerPhone);
                       System.out.println("ID: ");
                       ownerID=input.nextInt();
                       owner.setId(ownerID);
                       System.out.println("Add a play ground");
                       System.out.println("Name: ");
                       groundName = input.next();
                       playground.setName(groundName);
                       System.out.println("Location: ");
                       groundLocation = input.next();
                       playground.setLocation(groundLocation);
                       System.out.println("Area: ");
                       area = input.nextDouble();
                       playground.setArea(area);
                       System.out.println("price per hour: ");
                       pricePerHour = input.nextFloat();
                       playground.setPricePerHour(pricePerHour);
                       System.out.println("cancellation period: ");
                       cancellationPeriod = input.nextDouble();
                       System.out.println("do you want to show your play ground information?(yes , no)");
                       answer2 = input.next();
                       if(answer2.equals("yes")){
                       playground.displayPlayground();
                       }else if(answer2.equals("no")){
                           return;
                       }
                       break;
                       }
                   case 2:
                       System.out.println("1-player");
                       System.out.println("2-owner");
                       choice3 = input.nextInt();
                       if(choice3== 1){
                       System.out.println("user name: ");
                       playerName= input.next();
                       player.setName(playerName);
                       System.out.println("password: ");  
                       playerPassword = input.next();
                       player.setPassword(playerPassword);
                       System.out.println("Do you want to book a play ground?(yes,no) ");
                       answer = input.next();
                       if(answer.equals("yes")){
                            System.out.println("Enter number of time slots:");
                            numOfSlots = input.nextInt();
                            System.out.println("Total price is: "+playground.bookAplayGround(numOfSlots));
                       }
                       else if(answer.equals("no")) {
                             return;       
                       }
                       }else if(choice3==2){
                           System.out.println("user name: ");
                           ownerName= input.next();
                           owner.setName(ownerName);
                           System.out.println("password: ");
                           ownerPassword = input.next();
                           owner.setPassword(ownerPassword);
                       }
                       break;
                        
               }
       }
    }
