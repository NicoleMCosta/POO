package com.mycompany.mavenproject2;

public class Carro extends Veiculo{
    boolean automatico;
    Radio frequencia = new Radio("FM");
    Radio amplitude = new Radio("AM");
    
    public Carro(int ano, int chassi, float preco, float SemParar, boolean automatico) {
        super(ano, chassi, preco, 0.0f, SemParar);
        this.automatico = automatico;
    }
    

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public Radio getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Radio frequencia) {
        this.frequencia = frequencia;
    }

    public Radio getAmplitude() {
        return amplitude;
    }

    public void setAmplitude(Radio amplitude) {
        this.amplitude = amplitude;
    }



    public void PagarPedagio(){
        if(SemParar<20){
            System.out.println("Carro sem dinheiro suficiente!");
        }else{
            SemParar -=20;
            System.out.println("Dinheiro: "+ SemParar);
        }      
    }
    
    
}