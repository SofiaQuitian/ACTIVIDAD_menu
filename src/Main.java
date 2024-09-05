import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double V,I,R;
        int op,opc;

        System.out.print(" Actividad en Clase ");
        System.out.print(" Elige la opcion del ejercicio que deseas reealizar: ");
        System.out.println(" 1-Ejercicio1 (Ley de ohm) ");
        System.out.println(" 2-Ejercicio2 (Notas) ");
        opc = teclado.nextInt();
        switch (opc) {
            case 1:
                System.out.print(" BIENVENID@S A LA LEY DE OHM ");
                System.out.println(" Elige la opcion que deseas hallar: ");
                System.out.println(" 1)Voltaje ");
                System.out.println(" 2)Resistencia ");
                System.out.println(" 3)Corriente ");
                System.out.println(" 4)Salir ");
                op = teclado.nextInt();

                if (op == 1) {

                    System.out.println(" Ingrese los valores de Corriente y Resistencia: ");
                    I = teclado.nextDouble();
                    R = teclado.nextDouble();
                    V = I*R;
                    System.out.println(" El valor del Voltaje es: "+V);

                }else if (op == 2) {
                    System.out.println(" Ingrese los valores de Corriente y Voltaje: ");
                    I = teclado.nextDouble();
                    V = teclado.nextDouble();
                    R = V/I;
                    System.out.println(" El valor de la Resistencia es: "+R);

                }else if (op == 3) {

                    System.out.println(" Ingrese los valores de Resistencia y Voltaje: ");
                    R = teclado.nextDouble();
                    V = teclado.nextDouble();
                    I = V/R;
                    System.out.println(" El valor de la Corriente es: "+I);

                }else if (op == 4) {

                    System.out.println(" Saliste del programa ");
                }
            case 2:
                double c1,c2,c3,T,Q,P,nota,def;
                int opcion;

                System.out.println( " BIENVENIDOS AL PROGRAMA PARA CALCULAR TUS NOTAS ");

                System.out.println( " Ingrese la opcion del corte del que deseas calcular tus notas: ");

                System.out.println( "1. Corte 1 ");
                System.out.println(" Ingrese cada una de las notas: ");
                System.out.println(" 1)Tareas: ");
                System.out.println(" 2)Quices: ");
                System.out.println(" 3)Parcial: ");
                T = teclado.nextDouble();
                Q = teclado.nextDouble();
                P = teclado.nextDouble();
                c1 = (T+Q+P)*0.35;


                System.out.println( "2. Corte 2 ");
                System.out.println(" Ingrese cada una de las notas: ");
                System.out.println(" 1)Tareas: ");
                System.out.println(" 2)Quices: ");
                System.out.println(" 3)Parcial: ");
                T = teclado.nextDouble();
                Q = teclado.nextDouble();
                P = teclado.nextDouble();
                c2 = (T+Q+P)*0.35;

                System.out.println( "3. Corte 3 ");
                System.out.println(" Ingrese cada una de las notas: ");
                System.out.println(" 1)Tareas: ");
                System.out.println(" 2)Quices: ");
                System.out.println(" 3)Parcial: ");
                T = teclado.nextDouble();
                Q = teclado.nextDouble();
                P = teclado.nextDouble();
                c3 = (T+Q+P)*0.30;

                def = (c1+c2+c3)/3;
                System.out.println("Su nota definitiva es: " +def);

                if (def >= 3.0  <= 5.0){
                    System.out.println( " Aprobaste ");

                }else if (def >= 1.9 < 3.0){
                    System.out.println( " Habilitas ");

                }else if (def >= 0 <= 1.9){
                    System.out.println( " Reprobaste ");
                }else if () {
                    System.out.println( " Error en las notas ingresadas ");
            }
        }
    }
}







