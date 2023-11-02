package TEMA3;

public class ConversorEurosPesetas2 {
    public static void main(String[]args) {

        int peseta ;
        peseta = 166 ;

        String euros ;
        System.out.print("Escriba la cantidad de Euros para convertir : \n ") ;
        euros = System.console().readLine() ;
        
        float eurosconversor = Float.parseFloat(euros) ;
        

        double conversor ;
        conversor = eurosconversor * peseta ;
        System.out.printf(euros + " euros son : " + conversor  + "pesetas") ;





    }
}
