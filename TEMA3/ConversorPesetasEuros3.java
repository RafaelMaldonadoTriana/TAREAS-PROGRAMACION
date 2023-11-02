package TEMA3;

public class ConversorPesetasEuros3 {
    public static void main(String[]args) {

        String peseta ;
        System.out.print("Escriba la cantidad de Pesetas para convertir \n") ;
        peseta = System.console().readLine();

        float pesetasconversor = Float.parseFloat(peseta) ;
        
        int euros ;
        euros = 166 ;
        

        double conversor ;
        conversor = pesetasconversor / euros ;
        System.out.printf(peseta + " pesetas son : " + conversor  + "euros") ;
    }
}
