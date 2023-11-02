package TEMA3;

public class CalcularNota12 {
    public static void main(String[]args) {
        System.out.print("Introduzca la nota del primer examen: ");
        double nota1 = Double.parseDouble(System.console().readLine());

    System.out.print("Introduzca la nota que quiere este trimestre ");
    double notaFinal = Double.parseDouble(System.console().readLine());
    

    double nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;
    
    
     notaFinal = ((nota1 * 40) + (nota2 * 60)) / 100 ;
     nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60 ;
    

    
    System.out.println("Para poder tener " + notaFinal + " este trimestre");
    System.out.println(" Se necesiita sacar un " + nota2 + " en el siguiente examen.");
}
}