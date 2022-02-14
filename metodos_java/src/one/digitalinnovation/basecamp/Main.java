package one.digitalinnovation.basecamp;

public class Main {

    public static void main (String [] args){

    //Retornos
    System.out.println("Exercicios retornos");

    double areaQuadrado = Quadrilatero.area(3);
    System.out.println("Área do quadrado: " + areaQuadrado);

    double areaRetangulo = Quadrilatero.area(5,5);
    System.out.println("Área do retângulo: " + areaRetangulo);

    double areaTrapezio = Quadrilatero.area(7,8,9);
    System.out.println("Área do trapezio: " + areaTrapezio);


   //Quadrilatero
   //Prestar atenção quando adcionar nova sobrecarga(definir se é float ou doble 5d(double)/5f(float))
        /*
    System.out.println("Exercicio Quadrilátero:");
    Quadrilatero.area(3);
    Quadrilatero.area(5d, 5d);
    Quadrilatero.area(7,8,9);
    Quadrilatero.area(5f, 5f);
*/
    }
}
    /*
    // Referente a aula I - Entendendo Metodos Java
    // Calculadora
    System.out.println("Exercicio Calculadora");
    Calculadora.soma(3, 6);
    Calculadora.subtracao(9, 1.8);
    Calculadora.multiplicacao(7, 8);
    Calculadora.divisao(5, 2.5);

    // Mensagem
    System.out.println("Exercicio Mensagem");
    Mensagem.obterMensagem(9);
    Mensagem.obterMensagem(14);
    Mensagem.obterMensagem(1);


    // Emprestimo
    System.out.println("Exercicio Emprestimo");
    Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
    Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
    Emprestimo.calcular(1000, 5);

     */

