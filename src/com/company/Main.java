package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Integer numJogadores = 0;
        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual número de jogadores ?");
        numJogadores = scan.nextInt(4);

        for (int i = 0; i < numJogadores; i++) {
            System.out.println("Qual nome do jogardor "+(i+1));
            Jogador jogador = new Jogador();
            jogador.setNome(scan.next());
            jogadores.add(jogador);
        }

    }

   public void setPecas(ArrayList<Jogador> jogadores){


    }
}
