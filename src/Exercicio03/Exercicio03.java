package Exercicio03;

import BaseInterface.JFrameBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Michelle de Jesus Rogério
 */
public class Exercicio03 implements JFrameBaseInterface {

    private JFrame screen02;
    private JLabel jLabelNumero, jLabelTabuada;
    private JTextField jTextFieldNumero;
    private JTextArea jTextAreaTabuada;
    private JScrollPane jScrollPaneTabuada;
    private JButton jButtonTabuada;

    public Exercicio03() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        actionJButtonTabuada();
        toSetUpJScrollPane();
    }

    @Override
    public void gerarTela() {
        screen02 = new JFrame();
        screen02.setLayout(null);
        screen02.setLocationRelativeTo(null);
        screen02.setSize(600, 600);
        screen02.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        screen02.setVisible(true);
    }

    @Override
    public void adicionarComponentes() {
        screen02.add(jLabelTabuada);
        screen02.add(jLabelNumero);
        screen02.add(jTextFieldNumero);
        screen02.add(jTextAreaTabuada);
        screen02.add(jScrollPaneTabuada);
        screen02.add(jButtonTabuada);
    }

    @Override

    public void instanciarComponentes() {
        jLabelNumero = new JLabel("Número");
        jTextFieldNumero = new JTextField();
        jLabelTabuada = new JLabel("Tabuada");
        jTextAreaTabuada = new JTextArea();
        jScrollPaneTabuada = new JScrollPane();
        jButtonTabuada = new JButton("Gerar Tabuada");

    }

    @Override
    public void gerarDimensoes() {
        jLabelNumero.setSize(100, 20);
        jLabelTabuada.setSize(50, 20);
        jTextFieldNumero.setSize(150, 20);
        jTextAreaTabuada.setSize(300, 300);
        jScrollPaneTabuada.setSize(300, 300);
        jButtonTabuada.setSize(150, 50);

    }

    @Override
    public void gerarLocalizacoes() {
        jLabelNumero.setLocation(10, 10);
        jLabelTabuada.setLocation(230, 10);
        jTextFieldNumero.setLocation(10, 35);
        jTextAreaTabuada.setLocation(230, 35);
        jScrollPaneTabuada.setLocation (230, 80);
        jButtonTabuada.setLocation(10, 60);
    }

    public void actionJButtonTabuada() {
        jButtonTabuada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                generateTabuada();
            }

        });
    }
    
    private void toSetUpJScrollPane(){
        jScrollPaneTabuada.setViewportView(jTextAreaTabuada);
        jScrollPaneTabuada.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneTabuada.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jTextAreaTabuada.setLineWrap(true);
    }

    public void generateTabuada() {
        try {
            int number = Integer.parseInt(jTextFieldNumero.getText().trim());
            int calculate = 0;
            String tabuada = "";

            for (int i = 0; i <= 20; i++) {
                calculate = number * i;
                tabuada += number + " x " + i + " = " + calculate + "\n";
            }
            jTextAreaTabuada.setText(tabuada);
        } catch (NumberFormatException el) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO!"
                    + "\nO campo não pode estar vazio."
                    + "\nTambém não são aceitas letras nem caracteres especiais."
                    +"\n"
                    + "\nInsira um numeral para gerar a tabuada."+"\n");
            jTextFieldNumero.requestFocus();
            return;
        }

    }
}
