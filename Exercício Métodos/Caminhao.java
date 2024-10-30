/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

public class Caminhao extends Veiculo{
    private int CapacidadeTotal;
    private int CapacidadeAtual;

    public Caminhao( int ano, int chassi, float preco, float SemParar, int CapacidadeTotal) {
        super(ano, chassi, preco, 0.0f, SemParar);
        this.CapacidadeAtual = CapacidadeAtual;
        this.CapacidadeTotal = CapacidadeTotal;
        
    }
    
    
    public int getCapacidadeTotal() {
        return CapacidadeTotal;
    }

    public void setCapacidadeTotal(int CapacidadeTotal) {
        this.CapacidadeTotal = CapacidadeTotal;
    }

    public int getCapacidadeAtual() {
        return CapacidadeAtual;
    }

    public void setCapacidadeAtual(int CapacidadeAtual) {
        if(CapacidadeTotal < CapacidadeAtual){
            System.out.println("Carga Excedida!");
        }else{
            this.CapacidadeAtual = CapacidadeAtual;
        }
    }

    
    public void PagarPedagio(){
        if(SemParar<40){
            System.out.println("Caminhão sem dinheiro suficiente!");
        }else{
            SemParar -=40;    
            System.out.println("Dinheiro: "+ SemParar);
        }
    }


    
}