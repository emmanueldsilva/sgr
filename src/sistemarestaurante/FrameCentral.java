/*
 * frameCentral.java
 *
 * Created on 5 de Setembro de 2008, 08:46
 */

package sistemarestaurante;

//import javax.swing.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import static sistemarestaurante.FrameUtils.centralizarInterface;


    /**
 *
 * @author  edamiani
 */
public class FrameCentral extends javax.swing.JFrame{
    
    //Mesa mesa = new Mesa();
    private ArrayList<ControleMesa> conjuntoMesas = new ArrayList<ControleMesa>();
    private static FrameCentral frame = null;
    private final int comprimento = 40, largura = 40;
    private Usuario usuario;

    /** Creates new form frameCentral */
    private FrameCentral() {
        super("SGR - Sistema Gerenciador de Restaurante");
        initComponents();
        centralizarInterface(this);
        /*this.comprimento = 40;
        this.largura = 40;/
        /*Thread thread = new Thread(this);
        thread.start();*/
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCentralPane = new javax.swing.JPanel();
        sgrLabel = new javax.swing.JLabel();
        cadastroFuncionariosButton = new javax.swing.JButton();
        salaoPanel = new javax.swing.JPanel();
        salaoLayeredPane = new javax.swing.JLayeredPane();
        mesaPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cadastroReservasButton = new javax.swing.JButton();
        posicaoInicialButton = new javax.swing.JButton();
        consultaVendasButton = new javax.swing.JButton();
        logadoLabel = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        cadastroProdutosButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        painelCentralPane.setBackground(new java.awt.Color(0, 51, 51));
        painelCentralPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        painelCentralPane.setForeground(new java.awt.Color(255, 255, 255));

        sgrLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sgrLabel.setForeground(new java.awt.Color(255, 255, 255));
        sgrLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sgrLabel.setText("SGR - Sistema Gerenciador de Restaurante");

        cadastroFuncionariosButton.setText("Cadastro de Funcionários");
        cadastroFuncionariosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroFuncionariosButtonActionPerformed(evt);
            }
        });

        salaoPanel.setBackground(new java.awt.Color(255, 255, 255));
        salaoPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));

        salaoLayeredPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));

        mesaPanel.setBackground(new java.awt.Color(255, 153, 153));
        mesaPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        mesaPanel.setVerifyInputWhenFocusTarget(false);
        mesaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaPanelMouseClicked(evt);
            }
        });
        mesaPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mesaPanelMouseDragged(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mesa");

        javax.swing.GroupLayout mesaPanelLayout = new javax.swing.GroupLayout(mesaPanel);
        mesaPanel.setLayout(mesaPanelLayout);
        mesaPanelLayout.setHorizontalGroup(
            mesaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mesaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );
        mesaPanelLayout.setVerticalGroup(
            mesaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mesaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, Short.MAX_VALUE)
                .addContainerGap())
        );

        salaoLayeredPane.add(mesaPanel);
        mesaPanel.setBounds(70, 40, 50, 40);

        javax.swing.GroupLayout salaoPanelLayout = new javax.swing.GroupLayout(salaoPanel);
        salaoPanel.setLayout(salaoPanelLayout);
        salaoPanelLayout.setHorizontalGroup(
            salaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salaoLayeredPane, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
        );
        salaoPanelLayout.setVerticalGroup(
            salaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salaoLayeredPane, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );

        cadastroReservasButton.setText("Cadastro de Reservas");
        cadastroReservasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroReservasButtonActionPerformed(evt);
            }
        });

        posicaoInicialButton.setText("Posição Inicial das Mesas");
        posicaoInicialButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                posicaoInicialButtonMouseClicked(evt);
            }
        });

        consultaVendasButton.setText("Consulta de Vendas");
        consultaVendasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaVendasButtonActionPerformed(evt);
            }
        });

        logadoLabel.setBackground(new java.awt.Color(255, 255, 255));
        logadoLabel.setForeground(new java.awt.Color(254, 254, 254));
        logadoLabel.setText("Logado como:");

        loginLabel.setForeground(new java.awt.Color(255, 255, 255));

        cadastroProdutosButton.setText("Cadastro de Produtos");
        cadastroProdutosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroProdutosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCentralPaneLayout = new javax.swing.GroupLayout(painelCentralPane);
        painelCentralPane.setLayout(painelCentralPaneLayout);
        painelCentralPaneLayout.setHorizontalGroup(
            painelCentralPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCentralPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCentralPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(posicaoInicialButton)
                    .addComponent(sgrLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1109, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCentralPaneLayout.createSequentialGroup()
                        .addComponent(salaoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(painelCentralPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCentralPaneLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelCentralPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(painelCentralPaneLayout.createSequentialGroup()
                                        .addComponent(logadoLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(painelCentralPaneLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(painelCentralPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cadastroProdutosButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(consultaVendasButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(cadastroReservasButton, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(cadastroFuncionariosButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        painelCentralPaneLayout.setVerticalGroup(
            painelCentralPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCentralPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sgrLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCentralPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelCentralPaneLayout.createSequentialGroup()
                        .addComponent(cadastroFuncionariosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cadastroReservasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consultaVendasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cadastroProdutosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logadoLabel))
                    .addComponent(salaoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCentralPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(posicaoInicialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCentralPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCentralPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mesaPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesaPanelMouseClicked
// TODO adicione seu código de manipulação aqui:
    }//GEN-LAST:event_mesaPanelMouseClicked

private void cadastroFuncionariosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroFuncionariosButtonActionPerformed

    MenuCadastroFuncionario cadastroFuncionarios = new MenuCadastroFuncionario();
    cadastroFuncionarios.setVisible(true);
}//GEN-LAST:event_cadastroFuncionariosButtonActionPerformed

private void cadastroReservasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroReservasButtonActionPerformed

    MenuReservas cadastroReservas = new MenuReservas();
    cadastroReservas.setVisible(true);
}//GEN-LAST:event_cadastroReservasButtonActionPerformed

private void mesaPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesaPanelMouseDragged
// TODO add your handling code here:
    // TODO add your handling code here:
    int xSel = mesaPanel.getLocation().x;
    int ySel = mesaPanel.getLocation().y;
    mesaPanel.setLocation((evt.getX()  + xSel )- (mesaPanel.getWidth() / 2),(evt.getY() + ySel) - (mesaPanel.getHeight() / 2));  
    repaint();
    if (evt.getX() == mesaPanel.getX())
    {
        xSel = 49;
    }
    else
    {
    xSel = evt.getX();
    }
    ySel = evt.getY();
    //jLabel1.setText(xSel + "," + ySel);
}//GEN-LAST:event_mesaPanelMouseDragged

private void posicaoInicialButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posicaoInicialButtonMouseClicked

    for (ControleMesa mesa: conjuntoMesas)
    {
        mesa.posicaoInicial();
    }
}//GEN-LAST:event_posicaoInicialButtonMouseClicked

private void consultaVendasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaVendasButtonActionPerformed
    MenuConsultaVendas menuConsulta = new MenuConsultaVendas();
    menuConsulta.setVisible(true);
}//GEN-LAST:event_consultaVendasButtonActionPerformed

    private void cadastroProdutosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroProdutosButtonActionPerformed
        final MenuCadastroProdutos menuCadastroProdutos = MenuCadastroProdutos.getInstancia();
        menuCadastroProdutos.setVisible(Boolean.TRUE);
    }//GEN-LAST:event_cadastroProdutosButtonActionPerformed
/**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameCentral frame = new FrameCentral();
                frame.setVisible(true);
                frame.instanciaMesas();
                framecopy = frame;
            }
        });
    }*/
    /*public void run()
    {
        for (ControleMesa controle: conjuntoMesas)
        {
            try
            {
                thread.sleep(500);
            }
            catch (InterruptedException e)
            {}
            if (controle.getStatus() == 1)
                //conjuntosMesas.set(new ControleMesaOcupada(WIDTH, WIDTH, WIDTH, WIDTH, conjuntoMesas, TEXT_CURSOR, new Ocupacao(controle.getNumControle())));
        }
    }*/

    public static FrameCentral getInstancia()
    {
        if (frame == null)
            frame = new FrameCentral();
        return frame;
    }
    
    public void instanciaMesas()
    {
        
        int x = 30, y = 30;
        
        //Primeira coluna de Mesas.
        ControleMesa mesa;
        
        int numMesa = 01;
        for (int i = 0; i<7 ; i++)
        {
            if (i > 0)
                x += 125;
            else
                x = 60;
            for (int j= 0; j<10; j++)
            {
                if (j > 0)  
                    y += 60;
                else
                    y = 30;
                mesa = new ControleMesaLivre(x, y, comprimento, largura, i);
                mesa.setNumMesa(numMesa);
                conjuntoMesas.add(mesa);
                numMesa++;
            }
        }
        
        mostrarNaTela(conjuntoMesas);
    }
    
    public void mostrarNaTela(ArrayList<ControleMesa> conjuntoMesas)
    {
        //System.out.println("componentes: " + salaoLayeredPane.getComponentCount());
        if (salaoLayeredPane.getComponentCount() == 1)
            for(ControleMesa controle: conjuntoMesas)
            {
                salaoLayeredPane.add(controle.getPainel());
            //mesa.getPainel().setVisible(true);
                controle.setVisible(true);
            }
       else
       {
            salaoLayeredPane.removeAll();
            for(ControleMesa controle: conjuntoMesas)
            {
                salaoLayeredPane.add(controle.getPainel());
                controle.setVisible(true);
            }
       }
    }


    public void setOcupada(ControleMesa controle)
    {
        int index;
        ArrayList<Mesa> mesasVinculadas = new ArrayList<Mesa>();
        mesasVinculadas.add(new Mesa(controle.getNumControle()));
        for (ControleMesa cont: conjuntoMesas)
        {
            if (cont.equals(controle))
            {
                ControleMesaOcupada mesaOcupada = new ControleMesaOcupada(controle.getX(),
                        controle.getY(), controle.getLargura(), controle.getAltura(),
                        cont.getNumControle(), new Ocupacao(mesasVinculadas), new DefaultListModel());
                System.out.println("numcontrole :" + cont.getNumControle());
                index = conjuntoMesas.indexOf(cont);
                cont.setVisible(false);

                conjuntoMesas.set(index, mesaOcupada);
                //salaoLayeredPane.add(mesaOcupada.getPainel());
                break;
            }
        }
        mostrarNaTela(conjuntoMesas);
    }
    

    public void setReservada(ControleMesa controle)
    {
        int index;
        
        for (ControleMesa cont: conjuntoMesas)
        {
            if (cont.equals(controle))
            {
                ControleMesaReservada mesaReservada = new ControleMesaReservada(controle.getX(),
                        controle.getY(), controle.getLargura(), controle.getAltura(),
                        cont.getNumControle(), null, null, null);
                //System.out.println("numcontrole :" + cont.getNumControle());
                index = conjuntoMesas.indexOf(cont);
                cont.setVisible(false);
                System.out.println("lol");
                conjuntoMesas.set(index, mesaReservada);
                //salaoLayeredPane.add(mesaOcupada.getPainel());
                break;
            }
        }
        mostrarNaTela(conjuntoMesas);
    }
    
    
    public void setLivre(ControleMesa controle)
    {
        int index;
        
        for(ControleMesa cont: conjuntoMesas)
        {
            if (cont.equals(controle))
            {
                ControleMesaLivre mesaLivre = new ControleMesaLivre(controle.getX(),
                        controle.getY(), controle.getLargura(), controle.getAltura(),
                        cont.getNumControle());
                index = conjuntoMesas.indexOf(cont);
                cont.setVisible(false);
                conjuntoMesas.set(index, mesaLivre);
                break;
            }
        }
        mostrarNaTela(conjuntoMesas);
    }
    
    
    public void vincularMesasOcupadas(Ocupacao ocupacao, DefaultListModel lista)
    {
        int index;
        System.out.println(ocupacao.getMesas().size());
        for (Mesa mesa: ocupacao.getMesas())
        {
            ControleMesa controleAux = conjuntoMesas.get((mesa.getNumMesa() - 1));
            if (controleAux.getStatus() == 0)
            {
                ControleMesaOcupada mesaOcupada = new ControleMesaOcupada(controleAux.getX(),
                    controleAux.getY(), controleAux.getLargura(), controleAux.getAltura(),
                    controleAux.getNumControle(), ocupacao, lista);
                System.out.println("horario: " + ocupacao.getHorarioOcupacao());
                index = (mesa.getNumMesa() - 1);
                conjuntoMesas.get(index).setVisible(false);
                conjuntoMesas.set(index, mesaOcupada);
                System.out.println("entrou");
                System.out.println("horario: " + ocupacao.getHorarioOcupacao());
            }
        }
        mostrarNaTela(conjuntoMesas);
    }
    
    void setUsuarioLogado(Usuario usuario) {
        this.usuario = usuario;
        loginLabel.setText(usuario.getLogin());
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroFuncionariosButton;
    private javax.swing.JButton cadastroProdutosButton;
    private javax.swing.JButton cadastroReservasButton;
    private javax.swing.JButton consultaVendasButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logadoLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel mesaPanel;
    private javax.swing.JPanel painelCentralPane;
    private javax.swing.JButton posicaoInicialButton;
    private javax.swing.JLayeredPane salaoLayeredPane;
    private javax.swing.JPanel salaoPanel;
    private javax.swing.JLabel sgrLabel;
    // End of variables declaration//GEN-END:variables
    
}
