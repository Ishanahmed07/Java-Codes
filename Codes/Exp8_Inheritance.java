import java.util.*;

class circle20 {
    public double radius;

    double areaOfCircle(double radius) {
        this.radius = radius;
        System.out.print("\nThe area of the Circle is : ");
        return radius * radius * 3.14f;
    }
}

class cylinder20 extends circle20 {
    public double height;

    double areaOfCylinder(double radius, double height) {
        this.height = height;
        System.out.print("\nThe area of the Cylinder is : ");
        return 3.14f * radius * radius * height;
    }
}

class Rectangle30 {
    public double length;
    public double beradth;

    public void setLength(Double length) {
        this.length = length;
    }

    void areaOfRectangle(Double length, Double beradth) {
        System.out.print("\nThe area of Rectangle is : " + length * beradth + "\n");
    }
}

class Cuboid0 extends Rectangle30 {
    public double beradth;

    public void setBeradth(Double beradth) {
        this.beradth = beradth;
    }

    void areaOfCuboid(Double length, Double beradth) {
        this.length = length;
        this.beradth = beradth;
        System.out.println("\nThe area of the Cuboid is " + 2 * length * beradth + "\n");
    }
}

class perimeter {
    double radius;
    double length;
    double height;
    double breadth;
}

class rectangle0 extends perimeter {
    void calc(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        double peri = 2 * (length + breadth);
        System.out.println("The perimeter of the rectangle is " + peri);
    }
}

class circle0 extends perimeter {
    void calc(int radius) {
        this.radius = radius;
        double peri = 2 * 3.14f * radius;
        System.out.println("The perimeter of the circle is " + peri);
    }
}

class square10 extends perimeter {
    void calc(int length) {
        this.length = length;
        double peri = 4 * length;
        System.out.println("The perimeter of the square is " + peri);
    }
}

public class Exp8_Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cylinder20 obj = new cylinder20();
        Cuboid0 obj1 = new Cuboid0();

        System.out.println("\nWhat do you want to calculate : ");
        System.out.println("\n1 --> Area\n2 --> Perimeter");
        System.out.print("\nselect the option : ");
        int ch = sc.nextInt();
        if (ch > 2) {
            System.out.println("Enter the correct option..");
        }
        if (ch == 1) {

            System.out.println("\n");
            System.out.println(" ........................................");
            System.out.println("|            AREA CALCULATION            |");
            System.out.println(" ........................................");

            System.out.println("\nSelect the shape --> ");
            int choice;
            do {
                System.out.println(
                        "\n\n1 --> Area of circle\n2 --> Area of Cylinder\n3 --> Area of Rectangle \n4 --> Area of Cuboid\n0 --> EXIT");

                System.out.print("\nEnter your choice : ");
                choice = sc.nextInt();
                switch (choice) {
                case 0:
                    return;

                case 1:
                    System.out.print("\nEnter the radius : ");
                    Double radius1 = sc.nextDouble();
                    System.out.print(obj.areaOfCircle(radius1));
                    break;

                case 2:
                    System.out.print("\nEnter the radius : ");
                    Double radius2 = sc.nextDouble();
                    System.out.print("Enter the height : ");
                    double height = sc.nextDouble();
                    System.out.println(obj.areaOfCylinder(radius2, height));
                    break;

                case 3:
                    System.out.print("\nEnter the length : ");
                    double length1 = sc.nextDouble();
                    System.out.print("Enter the breadth : ");
                    Double breadth1 = sc.nextDouble();
                    obj1.areaOfRectangle(length1, breadth1);
                    break;
                case 4:
                    System.out.print("\nEnter the length : ");
                    Double length2 = sc.nextDouble();
                    System.out.print("Enter the breadth : ");
                    Double breadth2 = sc.nextDouble();
                    obj1.areaOfCuboid(length2, breadth2);
                    break;

                default:
                    System.out.println("Enter the correct option...");
                    break;

                }
                System.out.println("\nDo you want to continue : ");
                System.out.println("1 --> Yes\n2 --> No");
                System.out.print("Select the option : ");
                int o = sc.nextInt();
                if (o == 2) {
                    choice = 0;
                }
            } while (choice != 0);
        } else {

            System.out.println("\n");
            System.out.println(" ........................................");
            System.out.println("|          PERIMETER CALCULATION         |");
            System.out.println(" ........................................");
            System.out.println("\nSelect the shape --> ");
            int opt;
            do {
                System.out.println(
                        "\n1 --> Perimeter of Rectangle\n2 --> Perimeter of Square\n3 --> Perimeter of Circle\n0 --> EXIT");
                System.out.print("\nSelect the shape : ");
                opt = sc.nextInt();
                switch (opt) {
                case 1:
                    rectangle0 rect = new rectangle0();
                    System.out.print("\nEnter length : ");
                    int length = sc.nextInt();
                    System.out.print("Enter the breadth : ");
                    int breadth = sc.nextInt();
                    rect.calc(length, breadth);
                    break;
                case 2:
                    square10 square = new square10();
                    System.out.print("\nEnter length : ");
                    int length1 = sc.nextInt();
                    square.calc(length1);
                    break;
                case 3:
                    circle0 cir = new circle0();
                    System.out.print("\nEnter the readius of the circle : ");
                    int radius = sc.nextInt();
                    cir.calc(radius);
                    break;
                }

                System.out.println("\nDo you want to continue : ");
                System.out.println("1 --> Yes\n2 --> No");
                System.out.print("Select the option : ");
                int o = sc.nextInt();
                if (o == 2) {
                    opt = 0;
                }

            } while (opt != 0);
        }

        sc.close();
    }
}
