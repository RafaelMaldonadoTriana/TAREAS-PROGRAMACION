package TEMA3;

public class OperacionesNumeros1 {
    public static void main(String[]args) {

        String num1 ;
        System.out.print("Introduce el primer número para las operaciones : \n") ;
        num1 = System.console().readLine() ;

        int numero1 ;
        numero1 = Integer.parseInt(num1) ;

        String num2 ;
        System.out.print("Introduce el segundo número para las operaciones : \n") ;
        num2 = System.console().readLine() ;

        int numero2 ;
        numero2 = Integer.parseInt(num2) ;

        double resultado ;
        resultado = numero1 * numero2  ;
        System.out.print("El resultado de la multiplicación es : " + resultado ) ;

    }
}
