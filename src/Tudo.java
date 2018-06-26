
import BaseInterface.JFrameBaseInterface;
import Exercicio01.Exercicio01;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Michelle de Jesus Rogério
 */
public class Tudo implements JFrameBaseInterface {

    private JFrame startScreen;
    private JButton jButton00, jButton01, jButton02, jButton03, jButton04, jButton05, jButton06;
    private JLabel titulo;

    public Tudo() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        System.out.println("asdas");
        /*
         acaoJButton00();
         acaoJButton01();
         acaoJButton02();
         acaoJButton03();
         acaoJButton04();
         acaoJButton05();
         acaoJButton06();*/
        startScreen.setVisible(true);
    }

    @Override
    public void gerarTela() {
        startScreen = new JFrame();
        startScreen.setSize(500, 500);
        startScreen.setLayout(null);
        startScreen.setLocationRelativeTo(null);
        startScreen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        startScreen.add(titulo);
        startScreen.add(jButton00);
        startScreen.add(jButton01);
        startScreen.add(jButton02);
        startScreen.add(jButton03);
        startScreen.add(jButton04);
        startScreen.add(jButton05);
        startScreen.add(jButton06);
    }

    @Override
    public void instanciarComponentes() {
        titulo = new JLabel("Lista de Exercícios - Interface Gráfica");
        jButton00 = new JButton("Exercício 1");
        jButton01 = new JButton("Exercício 2");
        jButton02 = new JButton("Exercício 3");
        jButton03 = new JButton("Exercício 4");
        jButton04 = new JButton("Exercício 5");
        jButton05 = new JButton("Exercício 6");
        jButton06 = new JButton("Exercício 7");
    }

    @Override
    public void gerarDimensoes() {
        titulo.setSize(400, 20);
        jButton00.setSize(100, 100);
        jButton01.setSize(100, 100);
        jButton02.setSize(100, 100);
        jButton03.setSize(100, 100);
        jButton04.setSize(100, 100);
        jButton05.setSize(100, 100);
        jButton06.setSize(100, 100);
    }

    @Override
    public void gerarLocalizacoes() {
        titulo.setLocation(150, 10);
        jButton00.setLocation(90, 40);
        jButton01.setLocation(195, 40);
        jButton02.setLocation(300, 40);
        jButton03.setLocation(90, 145);
        jButton04.setLocation(195, 145);
        jButton05.setLocation(300, 145);
        jButton06.setLocation(90, 250);
    }
    
     public void acaoJButton00() {
     jButton00.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {
     new Exercicio01();
     }

     });
     }
 /*
     public void acaoJButton01() {
     jButton00.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {
     new Exercicio02();
     }

     });
     }

     public void acaoJButton02() {
     jButton00.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {
     new Exercicio03();
     }

     });
     }

     public void acaoJButton03() {
     jButton00.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {
     new Exercicio04();
     }

     });
     }

     public void acaoJButton04() {
     jButton00.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {
     new Exercicio05();
     }

     });
     }

     public void acaoJButton05() {
     jButton00.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {
     new Exercicio06();
     }

     });
     }

     public void acaoJButton06() {
     jButton00.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {
     new Exercicio07();
     }

     });
     }
     */
}
