
abstract class pen0 {
    public abstract void write();

    public abstract void refill();
}

class foutainPen extends pen0 {
    void changeNib() {
        System.out.println("Changing the nib");
    }

    @Override
    public void write() {
        System.out.println("Writing ....");
    }

    @Override
    public void refill() {
        System.out.println("Refilling ...");
    }
}

interface Basics {
    void eat();

    void sleep();
}

class Monkey {
    void jump() {
        System.err.println("Jumping....");
    }

    void bite() {
        System.out.println("Biting....");
    }
}

class Human extends Monkey implements Basics {
    void speak() {
        System.out.println("Speaking.....");
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping....");
    }

}

abstract class TelePhone {
    public abstract void ring();

    public abstract void lift();

    public abstract void disconnect();

}

class smartTelephone implements myPhone {
    public void ring() {
        System.out.println("Ringing....");
    }

    public void lift() {
        System.out.println("Lifting....");
    }

    public void disconnect() {
        System.out.println("Disconnecting.....");
    }
}

interface myPhone {
    public void ring();

    public void lift();

    public void disconnect();
}

interface tvRemote {
    void volumeUp();

    void changeChannel();

}

interface smartTVRemote extends tvRemote {
    public default void volumeUp() {
        System.out.println("Turnig up the volume ....");
    }
}

public class PracticeSet11_Sum {
    public static void main(String[] args) {
        // // Q1 & Q2
        // foutainPen fp = new foutainPen();
        // fp.changeNib();
        // fp.write();
        // fp.refill();

        // // Q3
        // Human h = new Human();
        // h.eat();

        // // Q4
        // smartTelephone sm = new smartTelephone();
        // sm.lift();

        // // Q5
        // Monkey m = new Human(); // ----> Polymrophism show by making reference of
        // monkey in human class
        // // this object can only cal the methods of monkey class
        // m.jump();
        // m.bite();
        // // m.eat(); --> throw an error coz the method eat() is of another class

    }

}
