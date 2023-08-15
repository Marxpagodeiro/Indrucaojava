/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

/**
 *
 * @author Edilson
 */
public class TesteRetangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Retangulo meuRetangulo = new Retangulo(); //Instancia variável
        meuRetangulo.leDados(); //Executa o método de leitura dos dados
        if (meuRetangulo.verificaLados()){ //Verifica se o retorno do método é true ou false
            //Mostra o resultado da área do retãngulo, se a base for diferente da altura
            InOut.MsgDeInforma("Área do Retângulo",Double.toString(meuRetangulo.calculaArea()));
            InOut.MsgDeInforma("O perimetro do Retângulo",Double.toString(meuRetangulo.calculaPerimetro()));
        } else {
            //Mostra mensagem de erro, se os lados forem iguais
            InOut.MsgDeErro("ERRO", "Base do retângulo é igual a altura.");
            
        }
    }
}
