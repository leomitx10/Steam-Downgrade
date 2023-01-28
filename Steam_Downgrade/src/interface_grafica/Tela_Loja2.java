/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interface_grafica;

import Controle.ImagemDAO;
import Controle.JogoDAO;
import Controle.ManipularImagem;
import static interface_grafica.Tela_PagamentoB.biblioteca;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Imagem;
import model.Jogo;
import model.Loja;

/**
 *
 * @author leandro
 */
public class Tela_Loja2 extends javax.swing.JFrame {
    public static Carrinho carrinho = new Carrinho();
    public static Tela_ListaDesejo listadesejo = new Tela_ListaDesejo();
    public static Tela_Perfil2 perfillista = new Tela_Perfil2();

    

    /**
     * Creates new form Tela_Loja2
     */
    public Tela_Loja2() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
        
        JogoDAO objjogo = new JogoDAO();
            
            ArrayList<Jogo> lista = objjogo.listJogos();
            
            /*for (int i =0;i<lista.size();i++)*/
            lblTitulo1.setText(lista.get(0).getNome());
            lblValor1.setText("R$ "+Float.toString(lista.get(0).getValor()));
            
            lblTitulo2.setText(lista.get(1).getNome());
            lblValor2.setText("R$ "+Float.toString(lista.get(1).getValor()));
            
            lblTitulo3.setText(lista.get(2).getNome());
            lblValor3.setText("R$ "+Float.toString(lista.get(2).getValor()));
            
            
            lblTitulo4.setText(lista.get(3).getNome());
            lblValor4.setText("R$ "+Float.toString(lista.get(3).getValor()));
            
            lblTitulo5.setText(lista.get(4).getNome());
            lblValor5.setText("R$ "+Float.toString(lista.get(4).getValor()));
            
            lblTitulo6.setText(lista.get(5).getNome());
            lblValor6.setText("R$ "+Float.toString(lista.get(5).getValor()));
            
            if(lista.size()>=7){
                lblTitulo7.setText(lista.get(6).getNome());
                lblValor7.setText("R$ "+Float.toString(lista.get(6).getValor()));
                
                int id6 = 7;
                ImagemDAO dao6 = new ImagemDAO();
                Imagem exe6 = dao6.buscar(id6);
                ManipularImagem.exibiImagemLabel(exe6.getImagem(), labelimagem7); 
            }else{
                 lblTitulo7.setText("");
                 lblValor7.setText("");
                 jButton24.setVisible(false);
                 jButton25.setVisible(false);
                 labelimagem7.setText("");
            }
            
            if(lista.size()>=8){
                lblTitulo8.setText(lista.get(7).getNome());
                lblValor8.setText("R$ "+Float.toString(lista.get(7).getValor()));
                
                int id7 = 8;
                ImagemDAO dao7 = new ImagemDAO();
                Imagem exe7 = dao7.buscar(id7);
                ManipularImagem.exibiImagemLabel(exe7.getImagem(), lblimagem8); 
            }else{
                lblTitulo8.setText("");
                lblValor8.setText("");
                jButton23.setVisible(false);
                jButton22.setVisible(false);
                lblimagem8.setText("");
                
            }if(lista.size()>=9){
                lblTitulo9.setText(lista.get(8).getNome());
                lblValor9.setText("R$ "+Float.toString(lista.get(8).getValor()));
                
                int id8 = 9;
                ImagemDAO dao8 = new ImagemDAO();
                Imagem exe8 = dao8.buscar(id8);
                ManipularImagem.exibiImagemLabel(exe8.getImagem(), lblimagem9); 
                
            }else{
                lblTitulo9.setText("");
                lblValor9.setText("");
                jButton27.setVisible(false);
                jButton26.setVisible(false);
                lblimagem9.setText("");
            }
            
            if(lista.size()>=10){
                lblTitulo10.setText(lista.get(9).getNome());
                lblValor10.setText("R$ "+Float.toString(lista.get(9).getValor()));
                
                int id9 = 10;
                ImagemDAO dao10 = new ImagemDAO();
                Imagem exe10 = dao10.buscar(id9);
                ManipularImagem.exibiImagemLabel(exe10.getImagem(), lblimagem10); 
                
            }else{
                lblTitulo10.setText("");
                lblValor10.setText("");
                jButton29.setVisible(false);
                jButton28.setVisible(false);
                lblimagem10.setText("");
            }
            
     /////////////////////////
     Loja.MostrarCapaJogo();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        lblValor1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        lblTitulo3 = new javax.swing.JLabel();
        lblValor4 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        lblTitulo4 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
        lblValor3 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        lblTitulo2 = new javax.swing.JLabel();
        lblValor2 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        lblTitulo5 = new javax.swing.JLabel();
        lblValor6 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        lblTitulo6 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        lblValor5 = new javax.swing.JLabel();
        lblValor8 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        lblTitulo8 = new javax.swing.JLabel();
        lblValor7 = new javax.swing.JLabel();
        lblimagem8 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        lblTitulo7 = new javax.swing.JLabel();
        labelimagem1 = new javax.swing.JLabel();
        labelimagem2 = new javax.swing.JLabel();
        labelimagem3 = new javax.swing.JLabel();
        labelimagem4 = new javax.swing.JLabel();
        labelimagem5 = new javax.swing.JLabel();
        labelimagem6 = new javax.swing.JLabel();
        labelimagem7 = new javax.swing.JLabel();
        lblimagem9 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        lblValor9 = new javax.swing.JLabel();
        lblTitulo9 = new javax.swing.JLabel();
        lblimagem10 = new javax.swing.JLabel();
        lblValor10 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        lblTitulo10 = new javax.swing.JLabel();
        btnDeslogar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jButton3.setText("Perfil");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Biblioteca");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Lista de Desejo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/turbo (1).png"))); // NOI18N

        jButton8.setText("Carrinho");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Ajuda");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                jDesktopPane1AncestorRemoved(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setMaximumSize(new java.awt.Dimension(150, 150));

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("+ Carrinho");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblValor1.setText("R$ 250,00");

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("+ Lista de Desejo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        lblTitulo3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblTitulo3.setText("Spider-Man");

        lblValor4.setText("gratuito");

        jButton10.setBackground(new java.awt.Color(102, 102, 102));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("+ Lista de Desejo");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        lblTitulo4.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblTitulo4.setText("The Sims 4");

        jButton11.setBackground(new java.awt.Color(0, 153, 0));
        jButton11.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("+ Carrinho");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        lblTitulo1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblTitulo1.setText("oooooooo");
        lblTitulo1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblTitulo1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblValor3.setText("R$ 150,00");

        jButton14.setBackground(new java.awt.Color(0, 153, 0));
        jButton14.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("+ Carrinho");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(102, 102, 102));
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("+ Lista de Desejo");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        lblTitulo2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblTitulo2.setText("God of War");

        lblValor2.setText("R$ 100,00");

        jButton16.setBackground(new java.awt.Color(0, 153, 0));
        jButton16.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("+ Carrinho");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(102, 102, 102));
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("+ Lista de Desejo");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(0, 153, 0));
        jButton18.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("+ Carrinho");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(102, 102, 102));
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("+ Lista de Desejo");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        lblTitulo5.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblTitulo5.setText("Teste");

        lblValor6.setText("gratuito");

        jButton20.setBackground(new java.awt.Color(102, 102, 102));
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("+ Lista de Desejo");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        lblTitulo6.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblTitulo6.setText("teste");

        jButton21.setBackground(new java.awt.Color(0, 153, 0));
        jButton21.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("+ Carrinho");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        lblValor5.setText("R$ 150,00");

        lblValor8.setText("--------");

        jButton22.setBackground(new java.awt.Color(102, 102, 102));
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("+ Lista de Desejo");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(0, 153, 0));
        jButton23.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("+ Carrinho");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        lblTitulo8.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblTitulo8.setText("-------");

        lblValor7.setText("-------");

        jButton24.setBackground(new java.awt.Color(0, 153, 0));
        jButton24.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("+ Carrinho");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(102, 102, 102));
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("+ Lista de Desejo");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        lblTitulo7.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblTitulo7.setText("-------");

        labelimagem1.setText("jLabel1");
        labelimagem1.setMaximumSize(new java.awt.Dimension(150, 150));
        labelimagem1.setMinimumSize(new java.awt.Dimension(150, 150));
        labelimagem1.setPreferredSize(new java.awt.Dimension(150, 150));

        labelimagem2.setText("jLabel1");
        labelimagem2.setMaximumSize(new java.awt.Dimension(150, 150));
        labelimagem2.setMinimumSize(new java.awt.Dimension(150, 150));
        labelimagem2.setPreferredSize(new java.awt.Dimension(150, 150));

        labelimagem3.setText("jLabel1");
        labelimagem3.setMaximumSize(new java.awt.Dimension(150, 150));
        labelimagem3.setMinimumSize(new java.awt.Dimension(150, 150));
        labelimagem3.setPreferredSize(new java.awt.Dimension(150, 150));

        labelimagem4.setText("jLabel1");
        labelimagem4.setMaximumSize(new java.awt.Dimension(150, 150));
        labelimagem4.setMinimumSize(new java.awt.Dimension(150, 150));
        labelimagem4.setPreferredSize(new java.awt.Dimension(150, 150));

        labelimagem5.setText("jLabel1");
        labelimagem5.setMaximumSize(new java.awt.Dimension(150, 150));
        labelimagem5.setMinimumSize(new java.awt.Dimension(150, 150));
        labelimagem5.setPreferredSize(new java.awt.Dimension(150, 150));

        labelimagem6.setMaximumSize(new java.awt.Dimension(150, 150));
        labelimagem6.setMinimumSize(new java.awt.Dimension(150, 150));
        labelimagem6.setPreferredSize(new java.awt.Dimension(150, 150));

        labelimagem7.setText("jLabel1");
        labelimagem7.setMaximumSize(new java.awt.Dimension(150, 150));
        labelimagem7.setMinimumSize(new java.awt.Dimension(150, 150));
        labelimagem7.setPreferredSize(new java.awt.Dimension(150, 150));

        lblimagem9.setMaximumSize(new java.awt.Dimension(150, 150));
        lblimagem9.setMinimumSize(new java.awt.Dimension(150, 150));
        lblimagem9.setPreferredSize(new java.awt.Dimension(150, 150));

        jButton26.setBackground(new java.awt.Color(102, 102, 102));
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("+ Lista de Desejo");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(0, 153, 0));
        jButton27.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("+ Carrinho");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        lblValor9.setText("-------");

        lblTitulo9.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblTitulo9.setText("-------");

        lblValor10.setText("--------");

        jButton28.setBackground(new java.awt.Color(102, 102, 102));
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("+ Lista de Desejo");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(0, 153, 0));
        jButton29.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText("+ Carrinho");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        lblTitulo10.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblTitulo10.setText("-------");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelimagem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValor3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelimagem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(lblValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelimagem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelimagem4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelimagem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblValor5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblTitulo5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(54, 54, 54))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblimagem9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelimagem7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblValor7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblTitulo7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblValor9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblTitulo9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(48, 48, 48)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblimagem10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblimagem8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelimagem6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(12, 12, 12)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValor10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblTitulo10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(jButton16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValor2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTitulo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(lblValor4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTitulo4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(jButton21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblValor6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTitulo6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(lblTitulo8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblValor8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelimagem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton17))
                    .addComponent(labelimagem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton15)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblValor4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton10))
                    .addComponent(labelimagem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblValor3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton6))
                    .addComponent(labelimagem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelimagem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelimagem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblValor5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblValor6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton20)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValor8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValor7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton22)
                            .addComponent(jButton25)))
                    .addComponent(lblimagem8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelimagem7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblimagem9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblValor9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton26))
                    .addComponent(lblimagem10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblValor10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton28)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        btnDeslogar.setText("Deslogar");
        btnDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeslogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addGap(18, 18, 18)
                .addComponent(btnDeslogar)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton8)
                            .addComponent(jButton9)
                            .addComponent(btnDeslogar)
                            .addComponent(jButton3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        Tela_Perfil2 a = new Tela_Perfil2();
            
            a.setVisible(true);
        //Tela_Perfil telaPerfil = new Tela_Perfil();
        //jDesktopPane1.add(telaPerfil);
        //telaPerfil.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Tela_ListaDesejo x = new Tela_ListaDesejo();
            this.dispose();
            x.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Tela_Ajuda x = new Tela_Ajuda();
            this.dispose();
            x.setVisible(true);
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         Tela_Biblioteca a = new Tela_Biblioteca();
            this.dispose();
            a.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeslogarActionPerformed
        biblioteca.listabiblioteca.clear();
        perfillista.perfil.clear();
        Tela_Usuario b = new Tela_Usuario();
        this.dispose();
        b.setVisible(true);
    }//GEN-LAST:event_btnDeslogarActionPerformed

    private void jDesktopPane1AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jDesktopPane1AncestorRemoved

    }//GEN-LAST:event_jDesktopPane1AncestorRemoved

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        JogoDAO jogodao = new JogoDAO();
        ArrayList<Jogo> lj = jogodao.listJogos();
        listadesejo.listadejogos.add(lj.get(1));
        for(Jogo j: listadesejo.listadejogos){
            System.out.println(j.getNome());
        }
        JOptionPane.showMessageDialog(null, "Adicionado a lista de desejo", "Adicionado", 1);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
       JogoDAO jogodao = new JogoDAO();
        ArrayList<Jogo> lj = jogodao.listJogos();
        carrinho.listadejogos.add(lj.get(1));
        for(Jogo j: carrinho.listadejogos){
            System.out.println(j.getNome());
        }
       JOptionPane.showMessageDialog(null, "Adicionado ao carrinho", "Adicionado", 1);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        JogoDAO jogodao = new JogoDAO();
        ArrayList<Jogo> lj = jogodao.listJogos();
        listadesejo.listadejogos.add(lj.get(0));
        for(Jogo j: listadesejo.listadejogos){
            System.out.println(j.getNome());
        }
        JOptionPane.showMessageDialog(null, "Adicionado a lista de desejo", "Adicionado", 1);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        JogoDAO jogodao = new JogoDAO();
        ArrayList<Jogo> lj = jogodao.listJogos();

        carrinho.listadejogos.add(lj.get(0));
        for(Jogo j: carrinho.listadejogos){
            System.out.println(j.getNome());
        }
        JOptionPane.showMessageDialog(null, "Adicionado ao carrinho", "Adicionado", 1);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void lblTitulo1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblTitulo1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTitulo1AncestorAdded

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       JogoDAO jogodao = new JogoDAO();
        ArrayList<Jogo> lj = jogodao.listJogos();
        carrinho.listadejogos.add(lj.get(3));
        for(Jogo j: carrinho.listadejogos){
            System.out.println(j.getNome());
    }//GEN-LAST:event_jButton11ActionPerformed
    JOptionPane.showMessageDialog(null, "Adicionado ao carrinho", "Adicionado", 1);
    }
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        JogoDAO jogodao = new JogoDAO();
        ArrayList<Jogo> lj = jogodao.listJogos();
        listadesejo.listadejogos.add(lj.get(3));
        for(Jogo j: listadesejo.listadejogos){
            System.out.println(j.getNome());
        }
        JOptionPane.showMessageDialog(null, "Adicionado a lista de desejo", "Adicionado", 1);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JogoDAO jogodao = new JogoDAO();
        ArrayList<Jogo> lj = jogodao.listJogos();
        listadesejo.listadejogos.add(lj.get(2));
        for(Jogo j: listadesejo.listadejogos){
            System.out.println(j.getNome());
        }
        JOptionPane.showMessageDialog(null, "Adicionado a lista de desejo", "Adicionado", 1);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JogoDAO jogodao = new JogoDAO();
        ArrayList<Jogo> lj = jogodao.listJogos();
        carrinho.listadejogos.add(lj.get(2));
        for(Jogo j: carrinho.listadejogos){
            System.out.println(j.getNome());
        }
        JOptionPane.showMessageDialog(null, "Adicionado ao carrinho", "Adicionado", 1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Carrinho x = new Carrinho();
            this.dispose();
            x.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        JogoDAO jogodao = new JogoDAO();
        ArrayList<Jogo> lj = jogodao.listJogos();
        carrinho.listadejogos.add(lj.get(4));
        for(Jogo j: carrinho.listadejogos){
            System.out.println(j.getNome());
        }
        JOptionPane.showMessageDialog(null, "Adicionado ao carrinho", "Adicionado", 1);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        JogoDAO jogodao = new JogoDAO();
        ArrayList<Jogo> lj = jogodao.listJogos();
        listadesejo.listadejogos.add(lj.get(4));
        for(Jogo j: listadesejo.listadejogos){
            System.out.println(j.getNome());
        }
        JOptionPane.showMessageDialog(null, "Adicionado a lista de desejo", "Adicionado", 1);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        JogoDAO jogodao = new JogoDAO();
        ArrayList<Jogo> lj = jogodao.listJogos();
        listadesejo.listadejogos.add(lj.get(5));
        for(Jogo j: listadesejo.listadejogos){
            System.out.println(j.getNome());
        }
        JOptionPane.showMessageDialog(null, "Adicionado a lista de desejo", "Adicionado", 1);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        JogoDAO jogodao = new JogoDAO();
        ArrayList<Jogo> lj = jogodao.listJogos();
        carrinho.listadejogos.add(lj.get(5));
        for(Jogo j: carrinho.listadejogos){
            System.out.println(j.getNome());
        }
        JOptionPane.showMessageDialog(null, "Adicionado ao carrinho", "Adicionado", 1);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        JogoDAO jogodao = new JogoDAO();
        ArrayList<Jogo> lj = jogodao.listJogos();
        listadesejo.listadejogos.add(lj.get(7));
        for(Jogo j: listadesejo.listadejogos){
            System.out.println(j.getNome());
        }
        JOptionPane.showMessageDialog(null, "Adicionado a lista de desejo", "Adicionado", 1);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        JogoDAO jogodao = new JogoDAO();
        ArrayList<Jogo> lj = jogodao.listJogos();
        carrinho.listadejogos.add(lj.get(7));
        for(Jogo j: carrinho.listadejogos){
            System.out.println(j.getNome());
        }
        JOptionPane.showMessageDialog(null, "Adicionado ao carrinho", "Adicionado", 1);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        JogoDAO jogodao = new JogoDAO();
        ArrayList<Jogo> lj = jogodao.listJogos();
        carrinho.listadejogos.add(lj.get(6));
        for(Jogo j: carrinho.listadejogos){
            System.out.println(j.getNome());
        }
        JOptionPane.showMessageDialog(null, "Adicionado ao carrinho", "Adicionado", 1);
     
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        JogoDAO jogodao = new JogoDAO();
        ArrayList<Jogo> lj = jogodao.listJogos();
        listadesejo.listadejogos.add(lj.get(6));
        for(Jogo j: listadesejo.listadejogos){
            System.out.println(j.getNome());
        }
        JOptionPane.showMessageDialog(null, "Adicionado a lista de desejo", "Adicionado", 1);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        JogoDAO jogodao = new JogoDAO();
        ArrayList<Jogo> lj = jogodao.listJogos();
        listadesejo.listadejogos.add(lj.get(8));
        for(Jogo j: listadesejo.listadejogos){
            System.out.println(j.getNome());
        }
        JOptionPane.showMessageDialog(null, "Adicionado a lista de desejo", "Adicionado", 1);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
         JogoDAO jogodao = new JogoDAO();
        ArrayList<Jogo> lj = jogodao.listJogos();
        carrinho.listadejogos.add(lj.get(8));
        for(Jogo j: carrinho.listadejogos){
            System.out.println(j.getNome());
        }
        JOptionPane.showMessageDialog(null, "Adicionado ao carrinho", "Adicionado", 1);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        JogoDAO jogodao = new JogoDAO();
        ArrayList<Jogo> lj = jogodao.listJogos();
        listadesejo.listadejogos.add(lj.get(9));
        for(Jogo j: listadesejo.listadejogos){
            System.out.println(j.getNome());
        }
        JOptionPane.showMessageDialog(null, "Adicionado a lista de desejo", "Adicionado", 1);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        JogoDAO jogodao = new JogoDAO();
        ArrayList<Jogo> lj = jogodao.listJogos();
        carrinho.listadejogos.add(lj.get(9));
        for(Jogo j: carrinho.listadejogos){
            System.out.println(j.getNome());
        }
        JOptionPane.showMessageDialog(null, "Adicionado ao carrinho", "Adicionado", 1);
    }//GEN-LAST:event_jButton29ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Loja2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Loja2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Loja2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Loja2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Loja2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeslogar;
    public static javax.swing.JButton jButton10;
    public static javax.swing.JButton jButton11;
    public static javax.swing.JButton jButton14;
    public static javax.swing.JButton jButton15;
    public static javax.swing.JButton jButton16;
    public static javax.swing.JButton jButton17;
    public static javax.swing.JButton jButton18;
    public static javax.swing.JButton jButton19;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton20;
    public static javax.swing.JButton jButton21;
    public static javax.swing.JButton jButton22;
    public static javax.swing.JButton jButton23;
    public static javax.swing.JButton jButton24;
    public static javax.swing.JButton jButton25;
    public static javax.swing.JButton jButton26;
    public static javax.swing.JButton jButton27;
    public static javax.swing.JButton jButton28;
    public static javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    public static javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel labelimagem1;
    public static javax.swing.JLabel labelimagem2;
    public static javax.swing.JLabel labelimagem3;
    public static javax.swing.JLabel labelimagem4;
    public static javax.swing.JLabel labelimagem5;
    public static javax.swing.JLabel labelimagem6;
    public static javax.swing.JLabel labelimagem7;
    public static javax.swing.JLabel lblTitulo1;
    public static javax.swing.JLabel lblTitulo10;
    public static javax.swing.JLabel lblTitulo2;
    public static javax.swing.JLabel lblTitulo3;
    public static javax.swing.JLabel lblTitulo4;
    public static javax.swing.JLabel lblTitulo5;
    public static javax.swing.JLabel lblTitulo6;
    public static javax.swing.JLabel lblTitulo7;
    public static javax.swing.JLabel lblTitulo8;
    public static javax.swing.JLabel lblTitulo9;
    public static javax.swing.JLabel lblValor1;
    public static javax.swing.JLabel lblValor10;
    public static javax.swing.JLabel lblValor2;
    public static javax.swing.JLabel lblValor3;
    public static javax.swing.JLabel lblValor4;
    public static javax.swing.JLabel lblValor5;
    public static javax.swing.JLabel lblValor6;
    public static javax.swing.JLabel lblValor7;
    public static javax.swing.JLabel lblValor8;
    public static javax.swing.JLabel lblValor9;
    public static javax.swing.JLabel lblimagem10;
    public static javax.swing.JLabel lblimagem8;
    public static javax.swing.JLabel lblimagem9;
    // End of variables declaration//GEN-END:variables


}
