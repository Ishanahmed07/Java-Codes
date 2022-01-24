class employee {
    int id;
    String name;
    public void printDetails(){
        System.out.print("My id is "+id+" and my name id is "+name);
//        System.out.print();
    }
}

public class CustomClass {

    public static void main(String[] args) {
        employee e = new employee();
        e.id=12;
        e.name="Ishan";

//        System.out.println(e.id);
//        System.out.println(e.name);
        e.printDetails();
    }
}
