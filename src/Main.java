import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        for (int i=0; i<n; i++){
            for (int j=n; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        int max1 = 5;
        String p1 = "";
        for(int i = 1; i<=max1; i++){
            for(int j = i; j <= max1; j++){
                System.out.print("* ");
            }
            System.out.println();
            p1 = p1 + "  ";
            System.out.print(p1);
        }
        System.out.println();

        int max2 = 5;
        String p2= "     ";
        for (int i = max2; i > 0; i--){
            System.out.print(p2);
            p2 = p2.substring(0, i-1);
            for (int j = max2; j > i-1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int max = 5;
        String p3 = "     ";
        String p4 = "";
        for (int i = max; i > 0; i--){
            System.out.print(p3);
            p3 = p3.substring(0, i-1);
            System.out.print("/");
            System.out.print(p4);
            System.out.println("\\");
            p4 = p4 +"  ";
        }
        for (int i = max; i >0; i--){
            p3 = p3 + " ";
            System.out.print(p3);
            System.out.print("\\");
            p4 = p4.substring(0, p4.length() -2);
            System.out.print(p4);
            System.out.println("/");
        }
        System.out.println();

        String one = "+ - + - +";
        String two = "- + - + _";
        String three = two;
        for (int i = 0; i < max; i++){
            if (three.equals(two)){
                three = one;
                System.out.println(three);
            }
            else {
                three = two;
                System.out.println(three);
            }
        }
    }
}