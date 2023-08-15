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
public class Retangulo {
//Declaração dos atributos
    public double base;
    public double altura;

    /**
    Criação do método leDados
     */
    public void leDados() {
        base = InOut.leInt("Informe o valor da base do retângulo: ");
        altura = InOut.leInt("Informe o valor da altura do retântulo: ");
    }
//Criação do método calculaArea
    public double calculaArea() {
        return base * altura;
    }
    public double calculaPerimetro(){
        return 2 * (base * altura);
    }
    //Criação do método que verifica se os lados do retângulo são iguais
public boolean verificaLados() {
    if (base==altura){
      return false;
    }
      else
      {
      return true;
    }
}
}
