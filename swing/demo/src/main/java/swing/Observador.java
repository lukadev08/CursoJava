package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //faz a operacao da janela de fechar sair do programa
        janela.setSize(400,200);
        janela.setLayout(new FlowLayout());//centraliza e modifica o botao
        janela.setLocationRelativeTo(null);//centraliza a janela no centro do computador

        JButton botao = new JButton("Clicar");
        janela.add(botao);

        botao.addActionListener(e -> {System.out.println("Evento ocorreu!!");
    });//classe anonima que chama o metodo a ser executado (com lambda)

            

        janela.setVisible(true);
    }
}