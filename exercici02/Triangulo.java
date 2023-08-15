/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici02;

/**
 *
 * @author 20222TPMI0035
 */
public class Triangulo {
    public double ladoA;
    public double ladoB;
    public double ladoC;
    
    public void Ledados(){
        ladoA = InOut.leInt("Qual o valor do ladoA ?");
        ladoB = InOut.leInt("Qual o valor do ladoB ?");
        ladoC = InOut.leInt("Qual o valor do ladoC ?");
    }
    public double Area(){
       double s = (ladoA+ladoB+ladoC)/2;
       double calculoArea = s * (s-ladoA) * (s-ladoB)* (s-ladoC);
       double area = calculoArea 
        
    }
    
    public boolean verificaTriangulo(){
        if (ladoA < ladoB+ladoC && ladoC < ladoB+ladoA && ladoB < ladoA+ladoC) {
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
}
