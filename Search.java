package com.pritamlab;
import java.util.*;
import java.io.*;

public class Search  {

    Scanner scan = new Scanner(System.in);
    String from,to,bus;
    int m = 0,n = 0;
    String[][] info = new String[10][6];

    public Search(int num) throws IOException {
        if(num == 1)
        {
            DestinationSearch();
        }
         else if(num == 2)
        {
            BusSearch();
        }
         else
        {
            System.out.print("Please Give a Valid Input.");
        }
    }

    public Search() {

    }

    public void DestinationSearch() throws IOException  {
        System.out.print("From: ");
        from = scan.next();
        System.out.print("To: ");
        to = scan.next();
        DResult();
    }

    public void DResult() throws IOException {
        //int m = 0,n = 0;
        File file = new File("C:\\Users\\Pritam\\IdeaProjects\\BusTicket\\src\\com\\pritamlab\\bus.txt");
        Scanner srch = new Scanner(file);
        while(srch.hasNextLine())
        {
            String f = srch.next(), t = srch.next();
            if(f.equals(from) && t.equals(to))
            {
                info[m][n] = from;
                n++;
                info[m][n] = to;
                n++;
                info[m][n] = srch.next();
                n++;
                info[m][n] = srch.next();
                n++;
                info[m][n] = srch.next();
                n++;
                info[m][n] = srch.next();
                m++;
                n = 0;
            }
            else
            {
                if(!srch.hasNextLine())
                    break;
                else
                    srch.nextLine();
            }
        }
        showResult();
    }

    public void BusSearch() throws IOException {
        System.out.print("Bus Name: ");
        bus = scan.next();
        BResult();
    }

    public void BResult() throws IOException {
        //int m = 0,n = 0;
        File file = new File("C:\\Users\\Pritam\\IdeaProjects\\BusTicket\\src\\com\\pritamlab\\bus.txt");
        Scanner srch = new Scanner(file);
        while(srch.hasNextLine())
        {
            String a = srch.next(), b = srch.next(), c = srch.next();
            if(c.equals(bus))
            {
                info[m][n] = a;
                n++;
                info[m][n] = b;
                n++;
                info[m][n] = c;
                n++;
                info[m][n] = srch.next();
                n++;
                info[m][n] = srch.next();
                n++;
                info[m][n] = srch.next();
                m++;
                n = 0;
            }
            else
            {
                if(!srch.hasNextLine())
                    break;
                else
                    srch.nextLine();
            }
        }
        showResult();
    }

    public void showResult()
    {
        System.out.println("Here is your search Result");
        for(int i = 0; i < m; i++)
        {
            System.out.print("No.: " + ++i);
            System.out.print(", From: " + info[i][0]);
            System.out.print(", To: " + info[i][1]);
            System.out.print(", Bus Name: " + info[i][2]);
            System.out.print(", Coach: " + info[i][3]);
            System.out.print(", Type: " + info[i][4]);
            System.out.println(", Price: " + info[i][5]);
        }
        Purchase purchase = new Purchase(info);
    }


    public void Thanks() {
        System.out.println("Thank You for using our Application");
    }

}
