
package com.mycompany.mavenproject2;

 
public class Veiculo{

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(float quilometragem) {
        this.quilometragem = quilometragem;
    }

    public float getSemParar() {
        return SemParar;
    }

    public void setSemParar(float SemParar) {
        this.SemParar = SemParar;
    }

    public Veiculo(int ano, int chassi, float preco, float quilometragem, float SemParar) {
        this.ano = ano;
        this.chassi = chassi;
        this.preco = preco;
        this.quilometragem = quilometragem;
        this.SemParar = SemParar;
    }
    int ano;
    int chassi;
    float preco;
    float quilometragem;
    float SemParar; 
    
    public void PagarPedagio(int ano, int chassi, float preco, float SemParar){
        //Este método será sobrescrito nas subclasses
    }
    
}