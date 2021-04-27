package com.company;

import java.util.Scanner;

public class movname {
    Scanner sc = new Scanner(System.in);
    String mvnm = "";
    String mvp = "";
    String mvt = "";
    int n=0;
    int cap =100;
    int s=1;
    int[][] seat = new int[10][10];
    movname(String mvnm,String mvp,String mvt){
        this.mvnm=mvnm;
        this.mvp=mvp;
        this.mvt=mvt;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                seat[i][j]=s;
                s++;
            }
        }
    }
    public int[] book(){
        System.out.println("Number of tickets :");
        n = sc.nextInt();
        int[] a = new int[n];
        for(int ii=0;ii<n;ii++){
            view();
            System.out.println("Enter the seat number : ");
            int s = sc.nextInt();
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    if(seat[i][j]==s){
                        seat[i][j]=-1;
                        a[ii]=s;
                    }
                }
            }
            System.out.println("Ticket booked at seat number "+s);
        }
        return a;
    }
    public void view(){
        System.out.println("----------------------SCREEN----------------------");
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(" | "+seat[i][j]);
            }
            System.out.println("");
        }
    }
}

