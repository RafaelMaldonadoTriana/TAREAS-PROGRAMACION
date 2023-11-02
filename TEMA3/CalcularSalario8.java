package TEMA3;

public class CalcularSalario8 {
    public static void main(String[]args){ 
    String horas ;
        System.out.print("Escriba la cantidad de la horas trabajadas este mes : \n") ;
        horas = System.console().readLine() ;


        double Hora ;
        Hora = Integer.parseInt(horas) ;

        int DinHoras ;
        DinHoras = 12 ;

        double salario ;
        salario = Hora * DinHoras ;


        System.out.printf("Tu salario este mes es :" +  salario + "$") ;
}
}