/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;


//O arquivo radio é uma classe sem herança  que deve conter os
//atributos: estacao, canal e volume. 
//Do tipo String, inteiro e inteiro respectivamente.
public class Radio{
    private String estacao;
    private int canal;
    private int volume;
    
    public Radio(String estacao) {
        this.estacao = estacao;
        this.canal = canal;
        this.volume = volume;
        if(estacao.equals("AM")){
                canal = 20;
        }else{
            if(estacao.equals("FM")){
                canal = 80;
            }
        }
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void AumentarVolume(){
        if(volume == 100){
            volume = volume;
        }else{
            volume+=10;
        }   
    }
    
    public void DiminuirVolume(){
        if(volume == 0){
            volume = volume;
        }else{
            volume-=10; 
        }
    }
  
}