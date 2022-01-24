import javax.naming.ldap.ManageReferralControl;

// interface baseI {
//     void method();
// }

// class baseC {
//     public void method() {
//         System.out.println("hello");
//     }
// }

// public class ttest extends baseC implements baseI {
//     public static void main(String[] args) {
//         (new ttest()).method();
//     }
// }

// class ttest {
//     public static void main(String[] args) {
//         int mask = 0x00F;
//         int value = 0x2222;
//         System.out.println(value & mask);
//     }
// }

// import java.io.*;
// import java.util.*;

// class ttest{
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//         String A = sc.next();
//         String B = sc.next();
//         /* Enter your code here. Print output to STDOUT. */
//         A.toLowerCase();
//         B.toLowerCase();
//         int len = A.length() + B.length();
//         System.out.println(len);
//         if (A[0] > B[0]) {
//             System.out.println("Yes");
//         } else {
//             System.out.println("No");
//         }
//     }
// }

// public class ttest {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[6];
//         // for (int i = 0; i < arr.length; i++) {
//         // arr[i] = sc.nextInt();
//         // }
//         // System.out.println(Arrays.toString(arr));

//         // for (int element : arr) {
//         // System.out.print(element + " ");
//         // }

//         // for (int i = 0; i < arr.length; i++) {
//         // System.out.print(arr[i] + " + ");
//         // }

//         String[] str = new String[5];
//         for (int i = 0; i < str.length; i++) {
//             str[i] = sc.nextLine();
//         }
//         System.out.println(Arrays.toString(str));
//         str[0] = "h";
//         str[0] = "Ishan";
//         System.out.println(Arrays.toString(str));
//         sc.close();
//     }
// }

// public class ttest {
//     public static void main(String[] args) {
//         int[] arr = { 5, 6, 7, 8, 9, 6 };
//         // int len = arr.length-1;
//         // swap1();
//         reeverse(arr);
//         System.out.println(Arrays.toString(arr));
//     }

//     static void reeverse(int[] arr) {
//         int start = 0;
//         int end = arr.length - 1;
//         while (start < end) {
//             swap1(arr, start, end);
//             start++;
//             end--;
//         }
//     }

//     static void swap1(int[] arr, int start, int end) {
//         int temp = arr[start];
//         arr[start] = arr[end];
//         arr[end] = temp;
//     }
// }

// public class ttest {
//     public static void main(String[] args) {
//         int[] arr = { 5, 6, 11, 8, 9, 6 };
//         System.out.println((max(arr)));
//     }

//     static int max(int[] arr) {
//         int maxVal = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > maxVal) {
//                 maxVal = arr[i];
//             }
//         }
//         return maxVal;
//     }
// }

// public class ttest {
//     public static void main(String[] args) {
//         String s = "JDFJHKHFKU";
//         // System.out.println(s.toLowerCase());
//         System.out.println(s.toCharArray());
//     }
// }

public class ttest {
    public static void main(String[] args) {
        String str = "GeeksForGeeks";
        System.out.println(delAlternate(str));

    }

    static String delAlternate(String S) {
        String str = "";
        for (int i = 0; i < S.length(); i++) {
            if (i % 2 == 0) {
                str = str + S.charAt(i);
            }
        }
        return str;
    }
}