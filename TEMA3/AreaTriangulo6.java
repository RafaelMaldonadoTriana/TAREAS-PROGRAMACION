package TEMA3;

public class AreaTriangulo6 {
    public static void main(String[]args ) {

        String num1 ;
        System.out.print("Introduce la base del triángulo en cm : \n") ;
        num1 = System.console().readLine() ;

        int base ;
        base = Integer.parseInt(num1) ;

        String num2 ;
        System.out.print("Introduce la altura del triángulo en cm : \n") ;
        num2 = System.console().readLine() ;

        int altura ;
        altura = Integer.parseInt(num2) ;

        double area ;
        area = (base * altura) / 2  ;
        System.out.print("El area del triángulo es  : \n" + area ) ;
    }
}
