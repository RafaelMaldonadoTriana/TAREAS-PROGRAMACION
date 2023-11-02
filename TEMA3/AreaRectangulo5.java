package TEMA3;

public class AreaRectangulo5 {
    public static void main(String[]args ) {

        String num1 ;
        System.out.print("Introduce la base del rectángulo en cm : \n") ;
        num1 = System.console().readLine() ;

        int base ;
        base = Integer.parseInt(num1) ;

        String num2 ;
        System.out.print("Introduce la altura del rectángulo en cm : \n") ;
        num2 = System.console().readLine() ;

        int altura ;
        altura = Integer.parseInt(num2) ;

        double area ;
        area = (base * altura)  ;
        System.out.print("El area rectángulo es  : \n" + area ) ;
    }
}
