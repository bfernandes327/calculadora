/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto;
import calculo.soma;
import impressora.impressao;
/**
 *
 * @author 962027
 */
public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1 = 5;
        int valor2 = 7;
        int resultado = soma.somar(valor1, valor2);
       //System.out.println(resultado);
       impressao.imprimirResultado(resultado);
    }
    
}
