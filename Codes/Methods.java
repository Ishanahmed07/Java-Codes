public class Methods {



//    ////////// STATIC is used to call the method directly as shown below
//    static int Main(int x , int y){
//        int z;
//        if (x>y) {
//            z=x+y;
//        }
//        else{
//            z=(x+y)*5;
//        }
//            return z;
//        }
//
//    public static void main(String[] args) {
//        int a , b , c;
//        a= 5;
//        b= 6;
//        c=Main(a,b);
//        System.out.println(c);








//    static double circle(double r){
//            double area;
//            area = r*r*3.14;
//            return area;
//        }
//
//        public static void main(String[] args) {
//            double sum ;
//            sum = circle(5);
//            System.out.println(sum);
//        }




    ////////////////////From this method we don't use static in the class by creating object we call the method
    int Main(int x , int y){
        int z ;
        if (x>y) {
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
            return z;
        }
    public static void main(String[] args) {
        Methods main=new Methods();
        int a , b , c;
        a=4;
        b=5;
        c=main.Main(a,b);
        System.out.println(c);






//    float circle(float r){
//        float area;
//        area=r*r*3.14f;
//        return area;
//    }



//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the radius of the circle : ");
//        int a = sc.nextInt();
//        Functions obj = new Functions();
//        float R;
//        R = obj.circle(a);
//        System.out.println(R);
//    }

}
}
