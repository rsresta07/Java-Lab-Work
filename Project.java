//package DSA;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Project {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        String yes_No;
        do{
            System.out.println("<<<<BOOKING.PK>>>>");

            int searchChoice;
            System.out.println("Enter Your Selection");
            String[] select = {"1.Guest" + "\n" + "0.Exit Application"};
            for(int i = 0; i<select.length;i++){
                System.out.println(select[i]);
            }

            searchChoice = sc1.nextInt();
            switch (searchChoice) {


                case 1:
                    guest sc = new guest();
                    sc.guestlogin();
                    sc.dispmenu();
                    break;
            }
            System.out.println("Do you want Run Again This Program (y or n)");
            yes_No = sc1.next().toUpperCase();
        }
        while (yes_No.equals("Y"));
    sc1.close();
    }
}

class guest extends Project {


    Scanner input = new Scanner(System.in);
    guest theGuest[] = new guest[50];
    public static int count = 0;
    String id,username,phno;
    int p ,r, rs;
    Queue<String> save_queue = new LinkedList<>();
    void guestlogin()
    {
        System.out.println("----Guest Portal----");
        System.out.println("Enter your name");
        username = input.next();
        save_queue.add(username);
        System.out.println("Enter your phone number");
        phno = input.next();
        System.out.println("Enter unique ID");
        id = input.next();
        System.out.println("Account Created");
        LocalDate dt = LocalDate.now();
        dt=LocalDate.now();
        System.out.println(dt);

    }
    void showguest(){
        System.out.println(save_queue);
    }
    void  dispmenu()
    {


        Queue<String> str_queue = new LinkedList<>();
        str_queue.add("1. Hotel Reservation");
        str_queue.add("0. Exit Application");
        System.out.println("----Welcome To the Booking.pk----");
        System.out.println("Please Select From Following Operation");
        System.out.println("****************************************");
        System.out.println(str_queue);
        int choice=input.nextInt();
        switch(choice){
            case 1:
                hms();
                break;
                
            case 2:
                break;
        }
    }

    void hms()

    {

        
        System.out.println("Welcome TO Hotel Reservation");
        System.out.println("Please Select From Following Operation");
        System.out.println("How many people you have");
        p=input.nextInt();
        System.out.println("How many Room you Want");
        r=input.nextInt();
        System.out.println("We Have Three Types of Room");
        System.out.println("1. Business Class Suite");
        System.out.println("2. 3 Star Room");
        System.out.println("3. Local Single Bed Room");
        rs = input.nextInt();
        System.out.println("Total Guest: "+p);
        System.out.println("Total Booked Room: "+r);
        System.out.println("Type of Room is: "+rs);
        if(rs==1){
            System.out.println("Room Booked Sucesfully");
            System.out.println("Total Cost For Business Class Suite is Rs."+r*100000+"/pernight");
        }

        if (rs==2){
            System.out.println("Room Booked Sucessfully");
            System.out.println("Total Cost For 3 Star Room is Rs."+r*50000+"/pernight");
        }
        if (rs == 3) {
                

            System.out.println("Room Booked Sucessfully");
            System.out.println("Total Cost For Single Bed  Room is Rs."+r*15000+"/pernight");

        }


    }

}