import java.util.Scanner;
public class exercitiu2 {
 public static void main(String[] args) {

  Scanner scan = new Scanner(System.in) ;
  System.out.println("Introduceti numerele!");
  int a = scan.nextInt() ;
  int b = scan.nextInt();

  if (a==b) {System.out.println("Numerele sunt egale");}
  else if (a>b){System.out.println("Primul numar este mai mare");}
  else {System.out.println("Al doilea numar este mai mare");}

 }

}