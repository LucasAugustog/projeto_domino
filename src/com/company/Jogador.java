package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Jogador {

    private String nome;
    private ArrayList<Peca> pecas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Peca> getPecas() {
        return pecas;
    }

    public void setPecas(ArrayList<Peca> pecas) {
        this.pecas = pecas;
    }
}
