/*
 * import java.util.*;
 * 
 * public class pattern { public static void main(String[] args) {
 * 
 * // Classwork pattern code Scanner sc = new Scanner(System.in); // int n = 5;
 * System.out.println("Enter the number : "); int a = sc.nextInt();
 * System.out.println("The pattern is .....\n\n"); for (int i = 1; i <= a; i++)
 * { for (int j = 1; j <= a; j++) { System.out.print("$" + " "); }
 * System.out.printf("\n"); } sc.close(); } }
 */
// -----------------------------//
// Program for hollow rectangle pattern
// int n = 4, m = 5;for(
// int i = 1;i<=n;i++)
// {
// for (int j = 1; j <= m; j++) {
// if (i == 1 || i == n || j == m || j == 1) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }

// -----------------------------//
// Program to draw a pattern of number
// OUTPUT
/*
 * 1 212 32123 4321234 543212345
 */

// int n = 5;for(
// int i = 1;i<=n;i++)
// {
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int j = i; j >= 1; j--) {
// System.out.print(j);
// }
// for (int j = 2; j <= i; j++) {
// System.out.print(j);
// }
// System.out.println();
// }

// -----------------------------//
// Program to print number pattern
// int sum = 1;for(int i = 1;i<=5;i++){
// for (int j = 1; j <= i; j++) {
// System.out.print(sum + " ");
// sum = sum + 1;
// }
// System.out.println();
// }

// -----------------------------//
// Program to print the pattern for 0 & 1
// for(int i = 1;i<=5;i++){
// for (int j = 1; j <= i; j++) {
// if ((i + j) % 2 == 0) {
// System.out.print("1" + " ");
// } else {
// System.out.print("0" + " ");
// }
// }
// System.out.println();
// }

// -----------------------------//
// Program to draw rhombus
// int n = 5;
// for(int i = 1;i<=5;i++){
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= n; j++) {
// System.out.print("*");
// }
// System.out.println();
// }

// -----------------------------//
// Pyramid number pattern
// for(int i = 1;i<=m;i++){
// for (int j = 1; j <= (m - i); j++) {
// System.out.print(" ");
// }

// for (int j = 1; j <= i; j++) {
// System.out.print(i + " ");
// }

// System.out.println();
// }

// -----------------------------//
// Butterfly pattern
// int n = 4;
// for( int i = 1;i<=n;i++){
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// int space = 2 * (n - i);
// for (int j = 1; j <= space; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.out.print("*");

// }
// System.out.println();
// }
// for(int i = n;i>=1;i--){
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// int space = 2 * (n - i);
// for (int j = 1; j <= space; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.out.print("*");

// }
// System.out.println();

// }

// -----------------------------//
// //Star pattern code
// int pat = 5;
// for (int i = 0; i<pat ; i++){
// for (int j = 0 ; j <=i ; j++){
// System.out.print("*");
// }
// System.out.print("\n");
// }
// }