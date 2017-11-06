/** CIS 157
 * Week 3 Homework
 * Nicholas Dean on 10/1/2017.
 */


import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lineCount = 1;

        System.out.print("Enter street name: ");
        String st = sc.nextLine();

        System.out.print("Enter street number: ");
        int sn = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter number of rooms: ");
        int nr = sc.nextInt();
        sc.nextLine();

        //Room 1
        System.out.print("Enter room name: ");
        String r1 = sc.nextLine();

        System.out.print("Enter room square footage: ");
        int sqr1 = sc.nextInt();
        sc.nextLine();

        //Room2
        System.out.print("Enter room name: ");
        String r2 = sc.nextLine();
        System.out.print("Enter room square footage: ");
        int sqr2 = sc.nextInt();
        sc.nextLine();

        //Room 3
        System.out.print("Enter room name: ");
        String r3 = sc.nextLine();
        System.out.print("Enter room square footage: ");
        int sqr3 = sc.nextInt();
        sc.nextLine();

        //Room 4
        System.out.print("Enter room name: ");
        String r4 = sc.nextLine();
        System.out.print("Enter room square footage: ");
        int sqr4 = sc.nextInt();
        sc.nextLine();


        //Room 5
        System.out.print("Enter room name: ");
        String r5 = sc.nextLine();
        System.out.print("Enter room square footage: ");
        int sqr5 = sc.nextInt();
        sc.nextLine();

        //Price per Square foot
        System.out.print("Enter price per square foot: ");
        double ppsf = sc.nextDouble();
        sc.nextLine();

        //line 1
        System.out.println(lineCount + ".                   Street: " + st + " #" + sn);
        lineCount++;

        //line 2
        System.out.println(lineCount + ".              Total Rooms: " + nr + " " + r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
        lineCount++;

        //line 3
        System.out.println(lineCount + ".               Total Area: " + (sqr1 + sqr2 + sqr3 + sqr4 + sqr5) + " sq. ft.");
        lineCount++;

        //line4
        System.out.println(lineCount + ".         Price per sq. ft: $" + ppsf);

        //line 5
        System.out.println(lineCount + ". Estimated property value: $" + (ppsf * (double) (sqr1 + sqr2 + sqr3 + sqr4 + sqr5)));
    }//main

}//MainApp
