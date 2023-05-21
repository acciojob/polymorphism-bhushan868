package com.driver;

public class Main {

    static class Product{
        public int product(int x){

            return (x);
        }
        public int product(int x,int y,int z){

            return (x+y+z);
        }
        public double product(double x,double y,double z){

            return (x+y+z);
        }

    }
    public static void main(String... args){
        Product p=new Product();
        System.out.println(p.product(5));
        System.out.println(p.product(5,23,5));
        System.out.println(p.product(5,23,3));
    }
}