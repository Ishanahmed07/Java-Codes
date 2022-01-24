public class PractiseSet6_Sum {
    public static void main(String[] args) {


//        //Problem 1
//        float[] marks = {65.5f, 89.0f, 55.25f, 98.0f, 100.0f};
//        float sum=0;
//        for(float elements:marks)
//        {
//            sum=sum+elements;
//
//        }
//        System.out.println(sum);


        //Problem 2
        float[] marks = {65.5f, 89.0f, 55.25f, 98.0f, 100.0f};
        float num = 89.0f;
        boolean present = false;
        for(float elements:marks)
        {
            if (num == elements){
                present=true;
                break;
            }
            if (present){
                System.out.println("The element is present in the array.");
            }
            else {
                System.out.println("The element is not present in the array.");
            }

        }

    }
}