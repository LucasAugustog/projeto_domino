package com.company;

import java.util.ArrayList;
import java.util.List;

//A terceira classe, chamada Tabuleiro,
// conterá três listas: uma com a lista dos jogadores (2 até4),
// outra com a lista de peças disponíveis (viradas para baixo - escondidas)
// e outra com as peças que já  foram  jogadas.

public class Tabuleiro {

    private List<String> nomes;
    private List<Peca> pecasViradas;
    private List<Peca> pecasJogadas;

    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }

    public List<Peca> getPecasViradas() {
        return pecasViradas;
    }

    public void setPecasViradas(List<Peca> pecasViradas) {
        this.pecasViradas = pecasViradas;
    }

    public List<Peca> getPecasJogadas() {
        return pecasJogadas;
    }

    public void setPecasJogadas(List<Peca> pecasJogadas) {
        this.pecasJogadas = pecasJogadas;
    }

//Métodos

    private ArrayList<Peca> gerarPecas(){
        ArrayList<Peca> pecas = new ArrayList<Peca>();
        for(int i = 0; i<=6 ; i++){
            for (int j = 0; j<=6;j++){
                Peca peca = new Peca();
                peca.setLadoA(i);
                peca.setLadoB(j);
                pecas.add(peca);
            }
        }
        return pecas;
    }
}
