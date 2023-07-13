package com.driver;



public class Main {
    public static class Product{
        public int product(int a, int b){
            return a+b;
        }
        public int product( int a, int b, int c){
            return a+b+c;
        }
        public double product( double x, double y){
            return x+y;
        }
    }

    public static void main(String[] args) {


        int a=1;
        int b=2;
        int c=3;


        double x=1.5;
        double y= 4.5;

        Product p=new Product(); // Object of class Product

        int a1= p.product(a,b); // calling method having args int a, int b
        int b1= p.product(a,b,c); // calling method having args int a,int b, int c
        double c1=p.product(x,y); // calling method having arg double x, double y

    }
}