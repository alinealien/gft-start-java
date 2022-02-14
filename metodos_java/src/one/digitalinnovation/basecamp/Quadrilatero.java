package one.digitalinnovation.basecamp;

public class Quadrilatero {

    public static double area(double lado) {
        return lado * lado;
    }

    public static double area(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura){
        return ((baseMaior+baseMenor)*altura) /2;
    }

}
    //Aula II - Exercicio quadrilatero I
    /*
    public static void area(double lado) {

        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Área do retângulo: " + lado2 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("Área do losango: " + (diagonal1 * diagonal2) / 2);

     */

