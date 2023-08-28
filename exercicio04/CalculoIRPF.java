/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio04;

/**
 *
 * @author 20222TPMI0035
 */
public class CalculoIRPF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        impostoRenda meuImposto = new impostoRenda();
        meuImposto.Ledados();
        if (meuImposto.verificaDados()){
            InOut.MsgDeInforma("O valor do salario liquido dessa pessoa é ",(meuImposto.calculaImposto()));
        }
        else {
            //Mostra mensagem de erro, se os lados forem iguais
            InOut.MsgDeErro("ERRO", "O salario é menor que zero.");
            
        }
    }
    
}
