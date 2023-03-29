/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import static inf3n212.carrro.INF3N212Carrro.cadPessoa;
import java.util.ArrayList;
import model.Carro;
/**
 *
 * @author 182110084
 */
public class Ccarro {
    ArrayList<Carro> carros = new ArrayList();
    
    public void addCarro(Carro c){
        this.carros.add(c);
    } 
    public void removeCarro(Carro c){
        this.carros.remove(c);
    }
    public ArrayList<Carro> getCarros(){
        return this.carros;
    }
    public Carro getCarroPlaca(String placa){
        Carro c = null;
        for (Carro carro : carros){
            if (carro.getPlaca().equals(placa)){
            c = carro;
            break;
                
            }
        }
        return c;
    }
    
    public void mockCarros(){
        Carro c1 = new Carro();
        c1.setPlaca("abc1f34");
        c1.setAnoFab(2023);
        c1.setAnoMod(2023);
        c1.setMarca("Fiat");
        c1.setModelo("Palio");
        c1.setTpCambio("Manual");
        c1.setCombustivel("Flex");
        c1.setCor("Bege");
        c1.setProprietario( cadPessoa.getPessoaCPF("30668518006"));
        addCarro(c1);
        
        Carro c2 = new Carro();
        c2.setPlaca("abc1f33");
        c2.setAnoFab(2023);
        c2.setAnoMod(2023);
        c2.setMarca("Fiat");
        c2.setModelo("Touro");
        c2.setTpCambio("Manual");
        c2.setCombustivel("Flex");
        c2.setCor("Vermelho");
        c2.setProprietario( cadPessoa.getPessoaCPF("30668518007"));
        addCarro(c2);
    }
}//fim Classe CCarro
