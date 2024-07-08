//package com.console;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        int l,b,a;
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        l=sc.nextInt();
        b=sc.nextInt();
        a=l*b;
        System.out.println("Area =" +a);
    }    
}
