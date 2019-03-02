package com.pritamlab;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Bus eTicket System");
        System.out.println("How do you wanna Search you ticket?");
        System.out.println("Destinations press 1, Bus Company press 2");
        int num = scan.nextInt();
        Search search = new Search(num);
        //Purchase purchase = new Purchase();
        search.Thanks();
        //purchase.Show();

        



    }
}
