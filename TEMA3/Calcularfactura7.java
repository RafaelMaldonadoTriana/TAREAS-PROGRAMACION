package TEMA3;

public class Calcularfactura7 {
    public static void main(String[]args){

        // SOLO SALE SIN DECIMALES//
        String BasImp ;
        System.out.print("Escriba la cantidad de la base imponible : \n") ;
        BasImp = System.console().readLine() ;

        float Base = Float.parseFloat(BasImp) ;



        //double Base ;
        //Base = Integer.parseInt(BasImp) ;

        double IVA ;
        IVA = ((Base * 21) / 100) ;

        double prectotal ;
        prectotal = Base + IVA ;


        System.out.printf("El total de la factura a pagar es :" +  prectotal) ;
    }

}
