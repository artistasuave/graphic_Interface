package Exercicio03;

import BaseInterface.JFrameBaseInterface;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
    
    Exercicio03() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
    }
    
    @Override
    public void gerarTela() {
        screen02 = new JFrame();
        screen02.setLayout(null);
        screen02.setLocationRelativeTo(null);
        screen02.setSize(700, 700);
        screen02.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        screen02.setVisible(true);
    }
    
    @Override
    public void adicionarComponentes() {
    }
    
    @Override
    
    public void instanciarComponentes() {
    }
    
    @Override
    public void gerarDimensoes() {
    }
    
    @Override
    public void gerarLocalizacoes() {
    }
    
}
