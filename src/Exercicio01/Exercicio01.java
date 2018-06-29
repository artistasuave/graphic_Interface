package Exercicio01;

import BaseInterface.JFrameBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author Michelle de Jesus Rogerio
 */
public class Exercicio01 implements JFrameBaseInterface {

    private JFrame screen00;
    private JLabel jLabelNome, jLabelSobrenome;
    private JTextField jTextFieldNome, jTextFieldSobrenome;
    private JButton jButtonConcatenar;

    public Exercicio01() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoBotaoConcatenar();
    }

    @Override
    public void gerarTela() {
        screen00 = new JFrame();
        screen00.setLayout(null);
        screen00.setLocationRelativeTo(null);
        screen00.setSize(300, 300);
        screen00
                .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen00.setVisible(true);
    }

    @Override
    public void adicionarComponentes() {
        screen00.add(jLabelNome);
        screen00.add(jLabelSobrenome);
        screen00.add(jTextFieldNome);
        screen00.add(jTextFieldSobrenome);
        screen00.add(jButtonConcatenar);
    }

    @Override
    public void instanciarComponentes() {
        jLabelNome = new JLabel("Nome");
        jLabelSobrenome = new JLabel("Sobrenome");
        jTextFieldNome = new JTextField();
        jTextFieldSobrenome = new JTextField();
        jButtonConcatenar = new JButton("Concatenar");
    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(20, 20);
        jLabelSobrenome.setSize(20, 20);
        jTextFieldNome.setSize(30, 20);
        jTextFieldSobrenome.setSize(30, 20);
        jButtonConcatenar.setSize(40, 40);
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNome.setLocation(10, 10);
        jLabelSobrenome.setLocation(45, 10);
        jTextFieldNome.setLocation(10, 45);
        jTextFieldSobrenome.setLocation(45, 45);
        jButtonConcatenar.setLocation(100, 100);
    }

    public void acaoBotaoConcatenar() {
        jButtonConcatenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome = jTextFieldNome.getText().trim().toUpperCase();
                String sobrenome = jTextFieldSobrenome.getText().trim().toUpperCase();

                //name validation
                try {
                    if (nome.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "É obrigatório inserir o nome");
                        jTextFieldNome.requestFocus();
                        return;
                    }
                    if (nome.length() < 3) {
                        JOptionPane.showMessageDialog(null, "Nome precisa ter pelo menos"
                                + "3 caracteres");
                        jTextFieldNome.requestFocus();
                        return;
                    }
                } catch (Exception en) {
                    JOptionPane.showMessageDialog(null, "Insira somente letras nos campos");
                }

                //surname validation
                try {
                    if (sobrenome.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "É obrigatório inserir o sobrenome");
                        jTextFieldSobrenome.requestFocus();
                        return;
                    }
                    if (sobrenome.length() < 3) {
                        JOptionPane.showMessageDialog(null, "O sobrenome precisa ter pelo menos"
                                + "3 caracteres");
                        jTextFieldSobrenome.requestFocus();
                        return;
                    }
                } catch (Exception en) {
                    JOptionPane.showMessageDialog(null, "Insira somente letras nos campos");
                }
                
                JOptionPane.showMessageDialog(null, "Os nomes concatenados são: "
                + nome + " " + sobrenome);
            }

        });
        
    }
}
