import java.util.Scanner;

//class  sum{
//    double width,height,length;
//    public sum(double w,double h,double l){
//        width = w;
//        height = h;
//        length = l;
//    }
//    sum(){
//        width=height=length=0;
//    }
//    sum(double len){
//        width=height=length=len;
//    }
//    double volume(){
//        return width*height*length;
//    }
//}
public class ConstructorOverloading {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width : ");
        int a = sc.nextInt();
        System.out.print("Enter height : ");
        int b = sc.nextInt();
        System.out.print("Enter length : ");
        int c = sc.nextInt();
        sum obj = new sum(a, b, c);
        sum obj1 = new sum();
        sum obj2 = new sum(c);
        double vol;
        vol = obj.volume();
        System.out.println("Volume of box is " + vol);
        vol = obj1.volume();
        System.out.println("Volume = " + vol);
        vol = obj2.volume();
        System.out.println("Volume of cube is " + vol);
        sc.close();

    }
}
