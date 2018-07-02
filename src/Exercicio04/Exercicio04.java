package Exercicio04;

import BaseInterface.JFrameBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author Michelle de Jesus Rogério
 */
public class Exercicio04 implements JFrameBaseInterface {

    private JFrame screen03;
    private JLabel jLabelNumero;
    private JTextField jTextFieldNumero;
    private JButton jButtonVerificar;

    public Exercicio04() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        actionJButtonVerificar();
    }

    @Override
    public void gerarTela() {
        screen03 = new JFrame();
        screen03.setLayout(null);
        screen03.setLocationRelativeTo(null);
        screen03.setSize(150, 230);
        screen03.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        screen03.setVisible(true);
    }

    @Override
    public void adicionarComponentes() {
        screen03.add(jLabelNumero);
        screen03.add(jTextFieldNumero);
        screen03.add(jButtonVerificar);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Número");
        jTextFieldNumero = new JTextField();
        jButtonVerificar = new JButton("Verificar");
    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(50, 20);
        jTextFieldNumero.setSize(100, 20);
        jButtonVerificar.setSize(100, 100);
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero.setLocation(10, 10);
        jTextFieldNumero.setLocation(10, 35);
        jButtonVerificar.setLocation(10, 60);
    }

    public void actionJButtonVerificar() {
        jButtonVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    int insertedNumber = Integer.parseInt(jTextFieldNumero.getText().trim());
                    String evenOrOdd = "";
                    String positiveOrNegative = "";

                    //even or odd
                    if (insertedNumber % 2 == 0) {
                        evenOrOdd = "par";
                    }
                    if (insertedNumber % 2 != 0) {
                        evenOrOdd = "ímpar";
                    }
                    //positive or negative
                    if (insertedNumber < 0) {
                        positiveOrNegative = "negativo";
                    }
                    if (insertedNumber > 0) {
                        positiveOrNegative = "positivo";
                    }
                    if (insertedNumber == 0) {
                        positiveOrNegative = "neutro";
                    }
                    JOptionPane.showMessageDialog(null,
                            insertedNumber
                            + " é um número " + evenOrOdd
                            + " e " + positiveOrNegative);

                } catch (NumberFormatException el) {
                    JOptionPane.showMessageDialog(null, "ATENÇÃO!"
                            + "\nO campo não pode estar vazio."
                            + "\nTambém não são aceitas letras nem caracteres especiais."
                            + "\n"
                            + "\nInsira um numeral para realizar a verificação." + "\n");
                    jTextFieldNumero.requestFocus();
                    return;
                }
            }
        });
    }

}
