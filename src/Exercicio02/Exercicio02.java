package Exercicio02;

import BaseInterface.JFrameBaseInterface;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author Michelle de Jesus Rogério
 */
public class Exercicio02 implements JFrameBaseInterface {

    private JFrame screen01;
    private JLabel jLabelNumero;
    private JTextField jTextFieldNumero;
    private JButton jButtonTabuada;

    public Exercicio02() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        actionButtonCalcular();
        addKeyPressed();
    }

    @Override
    public void gerarTela() {
        screen01 = new JFrame();
        screen01.setLayout(null);
        screen01.setLocationRelativeTo(null);
        screen01.setSize(300, 300);
        screen01.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        screen01.setVisible(true);
    }

    @Override
    public void adicionarComponentes() {
        screen01.add(jLabelNumero);
        screen01.add(jTextFieldNumero);
        screen01.add(jButtonTabuada);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Número");
        jTextFieldNumero = new JTextField();
        jButtonTabuada = new JButton("Calcular");
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(50, 20);
        jTextFieldNumero.setSize(50, 20);
        jButtonTabuada.setSize(100, 100);
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero.setLocation(20, 20);
        jTextFieldNumero.setLocation(20, 50);
        jButtonTabuada.setLocation(20, 80);
    }

    public void actionButtonCalcular() {
        jButtonTabuada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                calcular();

            }

        }
        );

    }

    private void calcular() throws HeadlessException {
        try {
            int numero = Integer.parseInt(jTextFieldNumero.getText().trim());
            int calculo = 0;

            calculo = (numero * 50);
            JOptionPane.showMessageDialog(null, "O número inserido multiplicado por 50 é: " + calculo);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Insira apenas numerais no campo solicitado");
            jTextFieldNumero.requestFocus();
            return;
        }
    }

    private void addKeyPressed() {
        jTextFieldNumero.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        calcular();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

        });
    }

}
