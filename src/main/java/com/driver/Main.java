package com.driver;

import java.util.Scanner;

public class Main {
    Product p=new Product();
    Scanner s=new Scanner(System.in);
    int x=p.product(s.nextInt(),s.nextInt());
    int y=p.product(s.nextInt(),s.nextInt(),s.nextInt());
    double z=p.product(s.nextDouble(),s.nextDouble());

}