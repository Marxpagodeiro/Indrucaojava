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
public class impostoRenda {
    double valSalBruto;
    double valSalLiquido;
    double valDesconto;
 
    public void Ledados(){
        valSalBruto= InOut.leInt("Qual o valor você recebe de salario Bruto");
    }
    
    public boolean verificaDados() {
        return valSalBruto >= 0;
    }
    
    void calculaImposto(){
        if (valSalBruto<1903.99){
            valDesconto = 0;
            valSalLiquido = valSalBruto - valDesconto;
        }else if(valSalBruto<2826.66){
            valDesconto = (valSalBruto*0.075) - 142.80;
            valSalLiquido = valSalBruto - valDesconto;
        }else if(valSalBruto<3751.06){
            valDesconto = (valSalBruto*0.15) - 354.80;
            valSalLiquido = valSalBruto - valDesconto;
        }else if(valSalBruto<4664.68){
            valDesconto = (valSalBruto*0.225) - 636.13;
            valSalLiquido = valSalBruto - valDesconto;
        }else if(valSalBruto>=4664.68){
            valDesconto = (valSalBruto*0.275) - 869.36;
            valSalLiquido = valSalBruto - valDesconto;
        }
    }
    
    
    
}
