/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Pessoa;

/**
 *
 * @author 182110084
 */
public class CPessoa {

    ArrayList<Pessoa> pessoas = new ArrayList<>();
    int idPessoa = 1;

    public int geraID() {
        return this.idPessoa++;
    }

    /**
     * Metódo addPessoa adiciona Pessoa no ArrayList pessoas
     *
     * @param p
     */
    public void addPessoa(Pessoa p) {
        this.pessoas.add(p);
    }

    /**
     * Método removePessoa remove Pessoa do ArrayList pessoas
     *
     * @param p
     */
    public void removePessoa(Pessoa p) {
        this.removePessoa(p);
    }

    public ArrayList<Pessoa> getPessoas() {
        return this.pessoas;
    }

    public Pessoa getPessoaCPF(String CPF) {
        Pessoa p = null;
        for (Pessoa pes : pessoas) {
            if (pes.getCpf().equals(CPF)) {
                p = pes;
                break;

            }
        }//fim foreach
        return p;

    }

    public void mockPessoas() {
Pessoa p1 = new Pessoa();
p1.setIdPessoa(geraID());
p1.setCpf("30668518006");
p1.setNome("Holyfield");
p1.setTelefone("51999889988");
p1.setEndereco("Rua das Atrocidades");
        addPessoa(p1);
Pessoa p2 = new Pessoa();

p2.setIdPessoa(geraID());
p2.setCpf("12368518006");
p2.setNome("Holy");
p2.setTelefone("51999889966");
p2.setEndereco("Rua das Bondades");
        addPessoa(p2);
    }

}//fim classe controller

