class circle {
    double radius;
    double area;
    double peri;

    public void setRadius(int r) {
        radius = r;
    }

    double getRadius() {
        return radius;
    }

    void setArea(int a) {
        area = a;
    }

    double getArea() {
        return radius * radius;
    }

    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void setPeri(double peri) {
        this.peri = peri;
    }

    public double getPeri() {
        return 2 * 3.14 * radius;
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        circle obj = new circle();
        obj.setRadius(5);
        obj.setArea(5);
        obj.setPeri(5);
        System.out.println(obj.getRadius());
        System.out.println(obj.getArea());
        System.out.println(obj.getPeri());

        obj.setName("CodeWithHarry");
        System.out.println(obj.getName());
        obj.setId(234);
        System.out.println(obj.getId());
    }
}
