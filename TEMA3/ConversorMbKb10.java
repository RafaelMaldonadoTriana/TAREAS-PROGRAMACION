package TEMA3;

public class ConversorMbKb10 {
    public static void main(String[]args) {

    String num1 ;
    System.out.print("Escriba la cantidad de Mb a convertir :") ;
    num1 = System.console().readLine() ;

    float mb = Float.parseFloat(num1) ;

    int kb ;
    kb = 1000 ;

    double conversor ;
    conversor = mb * kb ;
    System.out.print(mb + "Mb son :" + conversor + "kb") ;


    }
}
