/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici03;

/**
 *
 * @author 20222TPMI0035
 */
public class CalculoPeso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pesoIdeal meuPeso = new pesoIdeal();
        meuPeso.Ledados();
        if (meuPeso.verificaDados()){
            InOut.MsgDeInforma("O peso Ideal da pessoa em questão é : ", Double.toString(meuPeso.calculaPesoIdeal()));
            
        }
        else{
            InOut.MsgDeErro("ERRO","Os dados não são válidos!");
        }
    }
    
}
