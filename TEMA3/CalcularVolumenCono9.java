package TEMA3;

public class CalcularVolumenCono9 {
    public static void main(String[]args ) {

        String num1 ;
        System.out.print("Introduce el radio de la base del cono en cm : \n") ;
        num1 = System.console().readLine() ;

        int base ;
        base = Integer.parseInt(num1) ;

        String num2 ;
        System.out.print("Introduce la altura del cono en cm : \n") ;
        num2 = System.console().readLine() ;

        float altura = Float.parseFloat(num2) ;


        double volumen ;
        volumen = /*((1/3*(3.14))*/((base*base) * altura*(0.33)*3.14)  ;
        System.out.print("El volumen del cono es  : \n" + volumen ) ;
    }
}
