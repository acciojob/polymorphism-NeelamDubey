package com.driver;

import java.util.Scanner;

public class Main {
    Product p=new Product();
    Scanner s=new Scanner(System.in);
    int x=s.nextInt(),y=s.nextInt(),z=s.nextInt();
    int k=s.nextInt(), l=s.nextInt();
    double t=s.nextDouble(), q=s.nextDouble();
    int n=p.product(x,y);
    int m=p.product(k,l,z);
    double o=p.product(t,q);

}