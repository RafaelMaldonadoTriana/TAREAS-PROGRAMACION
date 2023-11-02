package TEMA3;

public class ConversorkbMb11 {
    public static void main(String[]args) {

        String num1 ;
        System.out.print("Escriba la cantidad de kb a convertir :") ;
        num1 = System.console().readLine() ;
    
        float kb = Float.parseFloat(num1) ;
    
        double mb ;
        mb = 0.001 ;
    
        double conversor ;
        conversor = kb / mb ;
        System.out.print(kb + "kb son :" + conversor + "Mb") ;
}
}