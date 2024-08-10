package edu.kaua.exemplo;

import javax.swing.*;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.print("Estado da TV: " + smartTv.estadoDaTv);

        String primeiroValor = JOptionPane.showInputDialog("Digite algo...");
        if (primeiroValor.equals("Ligar")){
            smartTv.ligarTv();
            System.out.print("Estado da TV: " + smartTv.estadoDaTv);
            System.out.print("Canal da Tv: " + smartTv.canal);
            System.out.print("Volume da TV: " + smartTv.volume);
        }
        else {
            System.out.print("Comando inválido");
        }
    }
}
