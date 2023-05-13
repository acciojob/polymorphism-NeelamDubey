package com.driver;

public class Product {
    public int product(int x, int y)
    {
        return Math.max(x,y);
    }
    public int product(int x, int y, int z)
    {
        int f= Math.max(x,y);
        return Math.max(f,z);
    }
    public double product(double x, double y)
    {
        return Math.max(x,y);
    }
}
