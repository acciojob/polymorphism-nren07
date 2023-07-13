package com.driver;

import java.util.Scanner;

public class Main {
    public static class Product{
        public int product(int a, int b){
            return a*b;
        }
        public int product( int a, int b, int c){
            return a*b*c;
        }
        public double product( double x, double y){
            return x*y;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
//        System.out.println("enter integer a, b, c");

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

//        System.out.println("enter double data type x, y");
        double x=sc.nextDouble();
        double y= sc.nextDouble();

        Product p=new Product(); // Object of class Product

        int a1= p.product(a,b); // calling method having args int a, int b
        int b1= p.product(a,b,c); // calling method having args int a,int b, int c
        double c1=p.product(x,y); // calling method having arg double x, double y

//        System.out.println("Sum of a+b:-> "+a1+"\n"+"Sum of Integer a+b+c:-> "+b1+"\n"+"Sum of double data type x+y :-> "+c1);

    }
}