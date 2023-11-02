package TEMA2;

public class CalcularFactura6 {
    public static void main(String[]args){

        double BasImp ;
        BasImp = 22.75 ;


        double IVA ;
        IVA = ((22.75 * 21) / 100) ;

        double prectotal ;
        prectotal = BasImp + IVA ;


        System.out.printf("El total de la factura a pagar es :" +  prectotal) ;


    }
}
