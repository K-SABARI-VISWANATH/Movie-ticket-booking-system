package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class movie {
    Scanner sc = new Scanner(System.in);
    ArrayList<movname> mo = new ArrayList<movname>();
    ArrayList<ticket> ti = new ArrayList<ticket>();
    int ticketidd = 0;
    public void getChoice(){
        System.out.println("Enter choice");
        System.out.println("1.Show Movies");
        System.out.println("2.Book Ticket");
        System.out.println("3.View Ticket");
        System.out.println("4.Cancel Ticket");
        System.out.println("5.Exit");
        int ch = sc.nextInt();
        switch (ch){
            case 1 : {
                mo.add(new movname("anjaan","$100","12:00pm"));
                mo.add(new movname("villu","$100","03:00pm"));
                mo.add(new movname("paramasivan","$100","06:00pm"));
                for(movname x : mo){
                    System.out.println("Movie name : "+x.mvnm);
                    System.out.println("Movie price : "+x.mvp);
                    System.out.println("Movie time : "+x.mvt);
                    System.out.println("");
                }
                getChoice();
                break;
            }
            case 2 : {
                sc.nextLine();
                System.out.println("Enter the movie name :");
                String Mvnm =  sc.nextLine();
                for(movname x : mo){
                    if((x.mvnm).equalsIgnoreCase(Mvnm)){
                        int[] b = x.book();
                        int id = ticketidd++;
                        ti.add(new ticket(id,x.mvnm,x.mvp,x.mvt,x.n,b));
                        System.out.println("Ticket id : "+id);
                    }
                }
                getChoice();
                break;
            }
            case 3 :{
                sc.nextLine();
                System.out.println("Enter ticket id :");
                int y = sc.nextInt();
                for( ticket t : ti){
                    if(t.ticketId==y){
                        System.out.println("Ticket Id : "+t.ticketId);
                        System.out.println("Movie Name : "+t.mvName);
                        System.out.println("Movie Time : "+t.mvTime);
                        System.out.println("Ticket Price : "+t.mvPrice);
                        System.out.println("Total no of persons :"+t.toft);
                        System.out.println("seats are :"+Arrays.toString(t.bookseats));
                    }
                }
                getChoice();
                break;
            }
            case 4 :{
                sc.nextLine();
                System.out.println("Enter ticket id :");
                int w = sc.nextInt();
                for(ticket d : ti){
                    if(d.ticketId==w){
                        for(movname c : mo){
                            if(c.mvnm.equalsIgnoreCase(d.mvName)){
                                for(int k =0;k<d.bookseats.length;k++){
                                    int ids=1;
                                    for(int i=0;i<10;i++){
                                        for(int j=0;j<10;j++){
                                            if(ids==d.bookseats[k]){
                                                c.seat[i][j]=d.bookseats[k];
                                            }
                                            ids++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ti.remove(w);
                System.out.println("Ticket cancelled successfully");
                getChoice();
                break;
            }
            case 5 :{
                return;
            }
            default:{
                System.out.println("Invalid option");
                break;
            }
        }
    }
    public static void main(String[] args) {
        movie m = new movie();
        m.getChoice();
        // write your code here
    }
}
