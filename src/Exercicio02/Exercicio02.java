package Exercicio02;

import BaseInterface.JFrameBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
        adicionarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        acaoBotaoCalcular();
    }

    @Override
    public void gerarTela() {
        screen01 = new JFrame();
        screen01.setLayout(null);
        screen01.setLocationRelativeTo(null);
        screen01.setSize(500, 500);
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
        jLabelNumero.setLocation(20,20);
        jTextFieldNumero.setLocation(20,50);
        jButtonTabuada.setLocation(20, 65);
    }
    
    public void acaoBotaoCalcular(){
        jButtonTabuada.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
        
        // number validation
                         
            }
            
        });
    }

}
