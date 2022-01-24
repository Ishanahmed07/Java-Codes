// package com.company;
class cylinder {
    private double radius;
    private double height;
    // private double surfaceArea;
    // private double volume;

    // Problem 1
    void setRadius(double r) {
        radius = r;
    }

    double getRadius() {
        return radius;
    }

    void setHeight(double h) {
        height = h;
    }

    double getHeight() {
        return height;
    }

    // Problem 2
    double getSurfaceArea() {
        return 2 * Math.PI * radius * (height + radius); // instead of 3.14 we can use a library Math.PI
    }

    double getVolume() {
        return Math.PI * radius * radius * height;
    }

    // Problem 3
    public cylinder(double rs, double ht) {
        radius = rs;
        height = ht;
    }
}

// Problem 4
class rectangle {
    int length;
    int breadth;

    public rectangle(int l) {
        length = l;
    }

    public rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
}

// Problem 5
class sphere {
    double radius;

    public void getRadius(double radius) {
        this.radius = radius;
    }

    double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    double volume() {
        return (4 / 3f) * Math.PI * radius * radius * radius;
    }
}

public class PracticeSet9_Sum {
    public static void main(String[] args) {
        // cylinder obj = new cylinder(5, 4); // Problem 3 making constructor n passing
        // the value
        // obj.setRadius(5);
        // obj.setHeight(4);

        // //Problem 1
        // System.out.println("The radius of the cylinder is "+obj.getRadius());
        // System.out.println("The height of the cylinder is "+obj.getHeight());

        // //Problem 2
        // System.out.println("The surface area of the cylinder is
        // "+obj.getSurfaceArea());
        // System.out.println("The volume of the cylinder is "+obj.getVolume());

        // //Problem 4
        // rectangle obj1=new rectangle(6,6);
        // System.out.println("The length of the rectangle is "+obj1.length);
        // System.out.println("The breadth of the rectangle is "+obj1.breadth);

        // Problem 5
        sphere s = new sphere();
        s.getRadius(5);
        System.out.println("The surface area of the sphere is " + s.surfaceArea());
        System.out.println("The volume area of the sphere is " + s.volume());
    }
}
