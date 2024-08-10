package edu.kaua.exemplo;
import javax.swing.JOptionPane;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        Object[] options = {"Volume +", "Volume -", "On/Off", "Canal +", "Canal -"};

        int primeiroValor = JOptionPane.showOptionDialog(
                null,
                "Estado da TV: " + smartTv.estadoDaTv,
                "Smart_TV",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (primeiroValor == 2) {
            smartTv.ligarTv();
            while (true) {
                int escolha = JOptionPane.showOptionDialog(
                        null,
                        "Estado da TV: " + smartTv.estadoDaTv + "\n" + "Canal: " + smartTv.canal + "\n" + "Volume: " + smartTv.volume,
                        "Smart_TV",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        options,
                        options[0]);
                if (escolha == 0) {
                    smartTv.aumentarVolume();
                }
                if (escolha == 1) {
                    smartTv.diminuirVolume();
                }
                if (escolha == 2) {
                    smartTv.desligarTv();
                    JOptionPane.showMessageDialog(
                            null,
                            "Smart TV desligada.",
                            "Smart_TV!",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                if (escolha == 3) {
                    smartTv.aumentarCanal();
                }
                if (escolha == 4) {
                    smartTv.diminuirCanal();
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(
                    null,
                    "Comando inválido, tente novamente.",
                    "Erro!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
