import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Introduceti puntctajul!");
        int p = scan.nextInt() ;
    //    System.out.println(p) ;
       if (p>=90 && p<=100) {System.out.println("A");}
       else if (p<=89 && p>=80) {System.out.println("B");}
       else if (p<=79 && p>=70) {System.out.println("C");}
       else if (p<=69 && p>=60) {System.out.println("D");}
       else if (p<=59 && p>=50) {System.out.println("E");}
       else if (p<=49 && p>=0) {System.out.println("F"); }
       else {System.out.println("out of range");} ;

     }

}