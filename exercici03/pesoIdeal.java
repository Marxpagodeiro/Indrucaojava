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
public class pesoIdeal {
    double alt;
    double peso;
    char sexo;
    public void Ledados(){
        alt = InOut.leDouble("Qual o valor da aultura ?");
        peso = InOut.leDouble("Qual o valor do peso ?");
        sexo = InOut.leChar("Qual o sexo ?");
    }
    public boolean verificaDados(){
        if (sexo == 'M' || sexo == 'F'){
            if (peso > 2 && peso < 200 && alt > 1 && alt < 2.50){
                return true;
                
            }
            else{
                return false;
            }
        }
        else {
            return false;
        }
    }
    
    public double calculaPesoIdeal(){
        double pesoIdeal = 0;
        if (sexo == 'M'){
            pesoIdeal = (72.7 * alt) - 58;
            return pesoIdeal;
        }
        else if(sexo == 'F'){
            pesoIdeal = (62.1 * alt) - 44.7;
            return pesoIdeal;
        }
        else{
            return pesoIdeal;
        }
    }
    
}
 