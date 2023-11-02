package TEMA3;

public class Operaciones4 {
    public static void main(String[]args ) {

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

        double resultado3 ;
        resultado3 = numero1 * numero2  ;
        System.out.print("El resultado de la multiplicación es : \n" + resultado3 ) ;

        double resultado ;
        resultado = numero1 + numero2 ;
        System.out.print("\nEl resultado de la suma es : \n" + resultado) ;

        double resultado2 ;
        resultado2 = numero1 - numero2 ;
        System.out.print("\nEl resultado de la resta es : \n" + resultado2) ;

        double resultado4 ; 
        resultado4 = numero1 / numero2 ;
        System.out.print("\nEl resultado de la división es : \n" + resultado4) ;
    }
}
