/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

public class Moto extends Veiculo{
    
    public Moto(int ano, int chassi, float preco, float SemParar, int cilindradas) {
        super(ano, chassi, preco,0.0f, SemParar);
        this.cilidradas = cilidradas;
    }
    
    public int getCilidradas() {
        return cilidradas;
    }

    public void setCilidradas(int cilidradas) {
        this.cilidradas = cilidradas;
    }
    private int cilidradas;


    
    public void PagarPedagio(){
        if(SemParar<10){
            System.out.println("Moto sem dinheiro suficiente!");
        }else{
            SemParar -=10;       
            System.out.println("Dinheiro: "+ SemParar);    
        }
    }

}