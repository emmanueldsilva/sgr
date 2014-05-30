/*
 * MenuMesaOcupada.java
 *
 * Created on 13 de Outubro de 2008, 14:48
 */

package sistemarestaurante;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
/**
 *
 * @author  Usu�rio
 */
public class MenuMesaOcupada extends javax.swing.JFrame {

    private ArrayList<Mesa> mesasVinculadas;
    private DefaultListModel numeroMesasVinculadas;
    private int numControle;
    private ControleMesa controle;
    private InterfaceInternaCentral inter;
    private static MenuMesaOcupada instancia = null;
    private Ocupacao ocupacao;
    private MenuConta menuConta;
    
    /** Creates new form MenuMesaOcupada */
    private MenuMesaOcupada(int numControle, ControleMesa controleMesa, 
            Ocupacao ocupacao) 
    {
        initComponents();
        MenuMesaOcupada.centralizarInterface(this);
        this.mesasVinculadas = new ArrayList<Mesa>();
        this.numeroMesasVinculadas = new DefaultListModel();
        this.numControle = numControle;
        this.controle = controleMesa;
        this.ocupacao = ocupacao;
        numeroMesasVinculadas.addElement(mesasVinculadasComboBox.getItemAt(numControle - 1));
        mesasVinculadasComboBox.removeItem(mesasVinculadasComboBox.getItemAt(numControle - 1));
        
        mesasVinculadasList.setModel(numeroMesasVinculadas);
    }

    public static void centralizarInterface(javax.swing.JFrame janela) {  
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int componentWidth = janela.getWidth();
        int componentHeight = janela.getHeight();
        janela.setBounds((screenSize.width-componentWidth)/2, (screenSize.height-componentHeight)/2, componentWidth, componentHeight);
    }
    
    public DefaultListModel getNumeroMesasVinculadas() {
        return numeroMesasVinculadas;
    }

    public void setMesasVinculadasList(JList mesasVinculadasList) {
        this.mesasVinculadasList = mesasVinculadasList;
    }

    public JList getMesasVinculadasList() {
        return mesasVinculadasList;
    }



    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuMesaOcupadaPanel = new javax.swing.JPanel();
        mesaOcupadaLabel = new javax.swing.JLabel();
        numeroMesaLabel = new javax.swing.JLabel();
        numeroMesaTextField = new javax.swing.JTextField();
        numeroOcupantesLabel = new javax.swing.JLabel();
        numeroOcupantesTextField = new javax.swing.JTextField();
        tornarLivreButton = new javax.swing.JButton();
        acessarContaButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        horarioOcupacaoLabel = new javax.swing.JLabel();
        horarioOcupacaoFormattedTextField = new javax.swing.JFormattedTextField();
        horarioSaidaLabel = new javax.swing.JLabel();
        horarioSaidaFormattedTextField = new javax.swing.JFormattedTextField();
        mesaOcupadaSeparator = new javax.swing.JSeparator();
        vincularContaLabel = new javax.swing.JLabel();
        mesasVinculadasComboBox = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        mesasVinculadasList = new javax.swing.JList();
        adicionarMesaVinculadaButton = new javax.swing.JButton();
        removerMesaVinculadaButton = new javax.swing.JButton();
        vincularMesasSelecionadasButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mesa Ocupada");
        setResizable(false);

        menuMesaOcupadaPanel.setBackground(new java.awt.Color(0, 51, 51));
        menuMesaOcupadaPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));

        mesaOcupadaLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        mesaOcupadaLabel.setForeground(new java.awt.Color(204, 0, 51));
        mesaOcupadaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mesaOcupadaLabel.setText("A Mesa est� Ocupada");

        numeroMesaLabel.setForeground(new java.awt.Color(255, 255, 255));
        numeroMesaLabel.setText("N�mero da Mesa:");

        numeroMesaTextField.setColumns(3);
        numeroMesaTextField.setEditable(false);
        numeroMesaTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        numeroOcupantesLabel.setForeground(new java.awt.Color(255, 255, 255));
        numeroOcupantesLabel.setText("N�mero de Ocupantes:");

        numeroOcupantesTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroOcupantesTextFieldActionPerformed(evt);
            }
        });

        tornarLivreButton.setText("Tornar Livre");
        tornarLivreButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tornarLivreButtonMouseClicked(evt);
            }
        });

        acessarContaButton.setText("Acessar Conta");
        acessarContaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acessarContaButtonActionPerformed(evt);
            }
        });

        okButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        horarioOcupacaoLabel.setForeground(new java.awt.Color(255, 255, 255));
        horarioOcupacaoLabel.setText("Hor�rio de Ocupa��o:");

        horarioOcupacaoFormattedTextField.setEditable(false);
        horarioOcupacaoFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        horarioOcupacaoFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        horarioSaidaLabel.setForeground(new java.awt.Color(255, 255, 255));
        horarioSaidaLabel.setText("Hor�rio de Sa�da (hh:mm):");

        horarioSaidaFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        horarioSaidaFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        mesaOcupadaSeparator.setForeground(new java.awt.Color(0, 153, 0));
        mesaOcupadaSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        vincularContaLabel.setForeground(new java.awt.Color(255, 255, 255));
        vincularContaLabel.setText("Mesas a serem Vinculadas � Conta:");

        mesasVinculadasComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" }));

        jScrollPane2.setViewportView(mesasVinculadasList);

        adicionarMesaVinculadaButton.setText("Adicionar Mesa");
        adicionarMesaVinculadaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarMesaVinculadaButtonActionPerformed(evt);
            }
        });

        removerMesaVinculadaButton.setText("Remover Mesa");
        removerMesaVinculadaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerMesaVinculadaButtonActionPerformed(evt);
            }
        });

        vincularMesasSelecionadasButton.setText("Vincular Mesas Selecionadas");
        vincularMesasSelecionadasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vincularMesasSelecionadasButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuMesaOcupadaPanelLayout = new javax.swing.GroupLayout(menuMesaOcupadaPanel);
        menuMesaOcupadaPanel.setLayout(menuMesaOcupadaPanelLayout);
        menuMesaOcupadaPanelLayout.setHorizontalGroup(
            menuMesaOcupadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuMesaOcupadaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuMesaOcupadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesaOcupadaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                    .addGroup(menuMesaOcupadaPanelLayout.createSequentialGroup()
                        .addGroup(menuMesaOcupadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuMesaOcupadaPanelLayout.createSequentialGroup()
                                .addGroup(menuMesaOcupadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(horarioSaidaLabel)
                                    .addComponent(numeroMesaLabel)
                                    .addComponent(numeroOcupantesLabel)
                                    .addComponent(horarioOcupacaoLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(menuMesaOcupadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(horarioOcupacaoFormattedTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                    .addGroup(menuMesaOcupadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(numeroOcupantesTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(numeroMesaTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(horarioSaidaFormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuMesaOcupadaPanelLayout.createSequentialGroup()
                                .addGroup(menuMesaOcupadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(acessarContaButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(tornarLivreButton, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(mesaOcupadaSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuMesaOcupadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(menuMesaOcupadaPanelLayout.createSequentialGroup()
                                .addComponent(vincularContaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mesasVinculadasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(menuMesaOcupadaPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(menuMesaOcupadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(adicionarMesaVinculadaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(removerMesaVinculadaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vincularMesasSelecionadasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(okButton))))
                .addContainerGap())
        );
        menuMesaOcupadaPanelLayout.setVerticalGroup(
            menuMesaOcupadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuMesaOcupadaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mesaOcupadaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuMesaOcupadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuMesaOcupadaPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(menuMesaOcupadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numeroMesaLabel)
                            .addComponent(numeroMesaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuMesaOcupadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numeroOcupantesLabel)
                            .addComponent(numeroOcupantesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuMesaOcupadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(horarioOcupacaoFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(horarioOcupacaoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuMesaOcupadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(horarioSaidaLabel)
                            .addComponent(horarioSaidaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tornarLivreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acessarContaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuMesaOcupadaPanelLayout.createSequentialGroup()
                        .addGroup(menuMesaOcupadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mesasVinculadasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vincularContaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuMesaOcupadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuMesaOcupadaPanelLayout.createSequentialGroup()
                                .addComponent(adicionarMesaVinculadaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(removerMesaVinculadaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vincularMesasSelecionadasButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addComponent(okButton))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(mesaOcupadaSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuMesaOcupadaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuMesaOcupadaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void numeroOcupantesTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroOcupantesTextFieldActionPerformed
// TODO add your handling code here:
    
}//GEN-LAST:event_numeroOcupantesTextFieldActionPerformed

private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
// TODO add your handling code here:
    ocupacao.setHorarioOcupacao(getHorarioOcupacao());
    ocupacao.setHorarioSaida(getHorarioSaida());
    ocupacao.setNumeroOcupantes(getNumOcupantes());
    this.dispose();
}//GEN-LAST:event_okButtonActionPerformed

private void tornarLivreButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tornarLivreButtonMouseClicked

    int resposta = JOptionPane.showConfirmDialog(null, "Aviso: Os dados inseridos na tela anterior " +
            "n�o foram salvos! Deseja salv�-los agora mesmo?", "Cuidado!", JOptionPane.YES_NO_OPTION, 
            JOptionPane.WARNING_MESSAGE);
    if (resposta == 0)
    {
        //sim
    }
    else
    {
        //n�o
    }
    inter = InterfaceInternaCentral.getInstancia();
    inter.ocupadaParaLivre(controle);
    dispose();

}//GEN-LAST:event_tornarLivreButtonMouseClicked

private void adicionarMesaVinculadaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarMesaVinculadaButtonActionPerformed
    // TODO add your handling code here:
    numeroMesasVinculadas.addElement(mesasVinculadasComboBox.getSelectedItem());
    mesasVinculadasComboBox.removeItem(mesasVinculadasComboBox.getSelectedItem());
    mesasVinculadasList.setModel(numeroMesasVinculadas);
}//GEN-LAST:event_adicionarMesaVinculadaButtonActionPerformed

private void removerMesaVinculadaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerMesaVinculadaButtonActionPerformed

    if (!mesasVinculadasList.isSelectionEmpty())
    {
        mesasVinculadasComboBox.addItem(mesasVinculadasList.getSelectedValue());
        numeroMesasVinculadas.remove(mesasVinculadasList.getSelectedIndex());
        mesasVinculadasList.setModel(numeroMesasVinculadas);
    }

}//GEN-LAST:event_removerMesaVinculadaButtonActionPerformed

private void vincularMesasSelecionadasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vincularMesasSelecionadasButtonActionPerformed
// TODO add your handling code here:
    if (mesasVinculadasList.getModel().getSize() != 0)
    {
                    //System.out.println("oi");
        ArrayList<Object> listaAux = new ArrayList<Object>(mesasVinculadasList.getModel().getSize());
        //System.out.println("tamanho lista: " + mesasVinculadasList.getModel().getSize());
        
        for (int i = 0; i < mesasVinculadasList.getModel().getSize(); i++)
        {
            //System.out.println("lol");
            //System.out.println(mesasVinculadasList.getModel().getElementAt(i).toString() + "lol");
            listaAux.add(mesasVinculadasList.getModel().getElementAt(i));
        }
            //System.out.println("adicionou: " + mesasVinculadasList.getModel().getElementAt(i));
        for (Object obj: listaAux)
        {
            //System.out.println("oi");

            ocupacao.addMesa(new Mesa(Integer.parseInt(obj.toString())));
            inter = InterfaceInternaCentral.getInstancia();
            
        }
        inter.vincularMesasOcupadas(ocupacao, numeroMesasVinculadas);
    }
}//GEN-LAST:event_vincularMesasSelecionadasButtonActionPerformed

private void acessarContaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acessarContaButtonActionPerformed
    // TODO add your handling code here:
    ocupacao.setHorarioOcupacao(getHorarioOcupacao());
    ocupacao.setHorarioSaida(getHorarioSaida());
    ocupacao.setNumeroOcupantes(getNumOcupantes());
    menuConta = MenuConta.getInstancia(this.ocupacao);
    menuConta.setVisible(true);
}//GEN-LAST:event_acessarContaButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMesaOcupada().setVisible(true);
            }
        });
    }*/

    public static MenuMesaOcupada getInstancia(int numControle, ControleMesa controleMesa, Ocupacao ocupacao, DefaultListModel lista)
    {
        //if (instancia == null)
        
            instancia = new MenuMesaOcupada(numControle, controleMesa, ocupacao);
            instancia.setControle(controleMesa);
            instancia.setNumControle(numControle);
            instancia.horarioOcupacaoFormattedTextField.setText(ocupacao.getHorarioOcupacao());
            instancia.getMesasVinculadasList().setModel(lista);
        return instancia;
    }
    
    public void setControle(ControleMesa controle) {
        this.controle = controle;
    }

    public int getNumOcupantes()
    {
        if (numeroOcupantesTextField.getText().equals(""))
            return 0;
        return Integer.parseInt(numeroOcupantesTextField.getText());
    }

    public String getHorarioOcupacao()
    {
        return horarioOcupacaoFormattedTextField.getText();
    }

    public String getHorarioSaida()
    {
        return horarioSaidaFormattedTextField.getText();
    }

    public void setNumControle(int numControle) {
        this.numControle = numControle;
    }

    public void setNumMesaTextField(String novoValor)
    {
        numeroMesaTextField.setText(novoValor);
    }

    public void setHorarioOcupacaoTextField(String novoValor)
    {
        horarioOcupacaoFormattedTextField.setText(ocupacao.getHorarioOcupacao());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acessarContaButton;
    private javax.swing.JButton adicionarMesaVinculadaButton;
    private javax.swing.JFormattedTextField horarioOcupacaoFormattedTextField;
    private javax.swing.JLabel horarioOcupacaoLabel;
    private javax.swing.JFormattedTextField horarioSaidaFormattedTextField;
    private javax.swing.JLabel horarioSaidaLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel menuMesaOcupadaPanel;
    private javax.swing.JLabel mesaOcupadaLabel;
    private javax.swing.JSeparator mesaOcupadaSeparator;
    private javax.swing.JComboBox mesasVinculadasComboBox;
    private javax.swing.JList mesasVinculadasList;
    private javax.swing.JLabel numeroMesaLabel;
    private javax.swing.JTextField numeroMesaTextField;
    private javax.swing.JLabel numeroOcupantesLabel;
    private javax.swing.JTextField numeroOcupantesTextField;
    private javax.swing.JButton okButton;
    private javax.swing.JButton removerMesaVinculadaButton;
    private javax.swing.JButton tornarLivreButton;
    private javax.swing.JLabel vincularContaLabel;
    private javax.swing.JButton vincularMesasSelecionadasButton;
    // End of variables declaration//GEN-END:variables

}