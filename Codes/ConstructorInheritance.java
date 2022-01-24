
class base1 {
    int x;

    base1() {
        System.out.println("Hello i am a constructor.");
    }

    base1(int x) {
        System.out.println("Setting the value of x as " + x);
    }
}

class derived1 extends base1 {
    int y;

    derived1() {
        System.out.println("Hey! Wassup");
    }

    derived1(int x, int y) {
        super(x);
        System.out.println("Setting the value of y as " + y);
    }
}

class childderived extends derived1 {
    int z;

    childderived() {
        System.out.println("i  am constructor.");
    }

    childderived(int x, int y, int z) {
        super(x, y);
        System.out.println("Setting the value of z as " + z);
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        // base1 b = new base1(5,45,5);
        // derived1 d = new derived1(5 ,6);
        childderived c = new childderived(8, 9, 6);
        System.out.println(c);
    }
}
