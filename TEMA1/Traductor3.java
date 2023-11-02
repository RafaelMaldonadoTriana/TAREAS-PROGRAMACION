public class Traductor3 {
    public static void main(String[] args) {

        //CON TABULADORES (LIGHT MODE)
        System.out.println("portátil\tlaptop");
        System.out.println("ratón\tmouse ");
        System.out.println("baño\tbathroom");
        System.out.println("machine\tmáquina");
        System.out.println("perro\tdog");
        System.out.println("gato\tcat");
        System.out.println("rojo\tred");
        System.out.println("azul\tblue");
        System.out.println("verde\tgreen");
        System.out.println("negro\tblack");

        //SIN TABULADORES (HARD MODE)
        System.out.printf("\033[36m%-15s\033[30;41m%s\033[0m\n", "portátil" ,"laptop");
        System.out.printf("\033[33m%-15s\033[30;42m%s\033[0m\n","ratón" ,"mouse");
        System.out.printf("\033[34m%-15s\033[30;43m%s\033[0m\n", "baño" ,"bathroom");
        System.out.printf("\033[35m%-15s\033[30;44m%s\033[0m\n","machine" ,"máquina");
        System.out.printf("\033[37m%-15s\033[30;45m%s\033[0m\n","perro" ,"dog");
        System.out.printf("\033[38m%-15s\033[30;46m%s\033[0m\n","gato" ,"cat");
        System.out.printf("\033[32m%-15s\033[30;47m%s\033[0m\n","rojo" ,"red");
        System.out.printf("\033[31m%-15s\033[30;43m%s\033[0m\n","azul" ,"blue");
        System.out.printf("\033[30m%-15s\033[30;41m%s\033[0m\n","verde" ,"green");
        System.out.printf("\033[36m%-15s\033[30;42m%s\033[0m\n","negro" ,"black");

    }
}
