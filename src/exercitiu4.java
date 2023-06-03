import java.util.Scanner;
public class exercitiu4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Introduceti numarul!");
        int a = scan.nextInt() ;

        if (a%3==0 && a%5==0) {System.out.println("Numarul este divizibil si cu 3 si 5");}
        else if (a%3==0){System.out.println("Numarul este divizibil cu 3");}
        else if (a%5==0){System.out.println("Numarul este divizibil cu 5");}
        else {System.out.println("NUmarul nu este divizibil cu 3 sau 5");}

    }

}