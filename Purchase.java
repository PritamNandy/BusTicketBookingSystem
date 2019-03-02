package com.pritamlab;
import java.util.*;

public class Purchase {
    Scanner scan = new Scanner(System.in);

    public Purchase(String[][] info) {
        System.out.println("Book a Seat!!!");
        System.out.print("Your Name: ");
        String name = scan.next();
        System.out.print("Your Phone Number: ");
        long phone = scan.nextLong();
        System.out.print("Enter your preferred bus number: ");
        int num = scan.nextInt();
        num--;
        bookTicket(num,name,phone,info);
    }

    public void bookTicket(int num, String name, long phone, String[][] info) {
        Random rand = new Random();
        System.out.println();
        System.out.println("Receipt #" + rand.nextInt(999)+000);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("From: " + info[num][0]);
        System.out.println("To: " + info[num][1]);
        System.out.println("Bus Name: " + info[num][2]);
        System.out.println("Coach: " + info[num][3]);
        System.out.println("Type: " + info[num][4]);
        System.out.println("Price: " + info[num][5]);
        System.out.println("Seat Booked!");
    }

}
