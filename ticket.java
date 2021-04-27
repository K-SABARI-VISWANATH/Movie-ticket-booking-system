package com.company;

public class ticket {
    int ticketId;
    String mvName;
    String mvTime;
    String mvPrice;
    int toft;
    int[] bookseats;
    ticket(int ticketId,String mvName,String mvTime, String mvPrice,int toft,int[] bookseats){
        this.ticketId=ticketId;
        this.mvName=mvName;
        this.mvTime=mvTime;
        this.mvPrice=mvPrice;
        this.toft=toft;
        this.bookseats=bookseats;
    }
}
