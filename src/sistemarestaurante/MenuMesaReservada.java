/*
 * MenuMesaReservada.java
 *
 * Created on 15 de Outubro de 2008, 15:00
 */

package sistemarestaurante;

import java.util.ArrayList;
import javax.swing.JComboBox;
/**
 *
 * @author  Usu�rio
 */
public class MenuMesaReservada extends javax.swing.JFrame {

    private static MenuMesaReservada menuReservada;
    private ControleReservas controleReservas;
    /** Creates new form MenuMesaReservada */
    private MenuMesaReservada(int numControle, ControleMesa controleMesa) {
        initComponents();
        this.controleReservas = new ControleReservas(this);
    }
    
    public static MenuMesaReservada getInstancia(int numControle, ControleMesa controleMesa)
    {
        if (menuReservada == null)
        {
            menuReservada = new MenuMesaReservada(numControle, controleMesa);
        }
        return menuReservada;
    }
    
    public void setNumMesaTextField(String novoValor)
    {
        numeroMesaTextField.setText(novoValor);
    }
    
    public JComboBox getNomeClienteComboBox()
    {
        //nomeClienteComboBoa
        return nomeClienteComboBox;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        menuMesaReservadaPanel = new javax.swing.JPanel();
        mesaReservadaLabel = new javax.swing.JLabel();
        numeroMesaLabel = new javax.swing.JLabel();
        numeroMesaTextField = new javax.swing.JTextField();
        nomeClienteLabel = new javax.swing.JLabel();
        horarioReservaLabel = new javax.swing.JLabel();
        numeroPessoasLabel = new javax.swing.JLabel();
        numeroPessoasTextField = new javax.swing.JTextField();
        horarioReservaFormattedTextField = new javax.swing.JFormattedTextField();
        tornarLivreButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        tonarOcupadaButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        nomeClienteComboBox = new javax.swing.JComboBox();
        selecionarButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mesa Reservada");
        setResizable(false);

        menuMesaReservadaPanel.setBackground(new java.awt.Color(0, 51, 51));
        menuMesaReservadaPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));

        mesaReservadaLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        mesaReservadaLabel.setForeground(new java.awt.Color(255, 255, 0));
        mesaReservadaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mesaReservadaLabel.setText("A Mesa est� Reservada");

        numeroMesaLabel.setForeground(new java.awt.Color(255, 255, 255));
        numeroMesaLabel.setText("N�mero da Mesa:");

        numeroMesaTextField.setColumns(3);
        numeroMesaTextField.setEditable(false);
        numeroMesaTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nomeClienteLabel.setForeground(new java.awt.Color(255, 255, 255));
        nomeClienteLabel.setText("Nome do Cliente da Reserva:");

        horarioReservaLabel.setForeground(new java.awt.Color(255, 255, 255));
        horarioReservaLabel.setText("Hor�rio da Reserva:");

        numeroPessoasLabel.setForeground(new java.awt.Color(255, 255, 255));
        numeroPessoasLabel.setText("N�mero de Pessoas:");

        numeroPessoasTextField.setEditable(false);
        numeroPessoasTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        horarioReservaFormattedTextField.setEditable(false);
        horarioReservaFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        horarioReservaFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tornarLivreButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        tornarLivreButton.setText("Tornar Livre");
        tornarLivreButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tornarLivreButtonMouseClicked(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 153, 0));

        tonarOcupadaButton.setText("Tornar Ocupada");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nomeClienteComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        nomeClienteComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nomeClienteComboBoxItemStateChanged(evt);
            }
        });

        selecionarButton.setText("Selecionar");
        selecionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuMesaReservadaPanelLayout = new javax.swing.GroupLayout(menuMesaReservadaPanel);
        menuMesaReservadaPanel.setLayout(menuMesaReservadaPanelLayout);
        menuMesaReservadaPanelLayout.setHorizontalGroup(
            menuMesaReservadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuMesaReservadaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuMesaReservadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesaReservadaLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(nomeClienteLabel)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuMesaReservadaPanelLayout.createSequentialGroup()
                        .addGroup(menuMesaReservadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numeroPessoasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(numeroMesaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(horarioReservaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuMesaReservadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuMesaReservadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(numeroPessoasTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(numeroMesaTextField, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(horarioReservaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))
                    .addComponent(nomeClienteComboBox, 0, 250, Short.MAX_VALUE)
                    .addComponent(selecionarButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(tornarLivreButton, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(tonarOcupadaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        menuMesaReservadaPanelLayout.setVerticalGroup(
            menuMesaReservadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuMesaReservadaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mesaReservadaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuMesaReservadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroMesaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroMesaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuMesaReservadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroPessoasLabel)
                    .addComponent(numeroPessoasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuMesaReservadaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horarioReservaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horarioReservaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeClienteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeClienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selecionarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tornarLivreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tonarOcupadaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuMesaReservadaPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuMesaReservadaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void tornarLivreButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tornarLivreButtonMouseClicked
// TODO add your handling code here:
}//GEN-LAST:event_tornarLivreButtonMouseClicked

private void nomeClienteComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nomeClienteComboBoxItemStateChanged
// TODO add your handling code here:
    if (!nomeClienteComboBox.getItemAt(0).toString().equals(""))
    {
    int numeroindex = nomeClienteComboBox.getSelectedIndex();
    controleReservas.buscaCamposReservaMesa(nomeClienteComboBox.getItemAt(numeroindex).toString());
    }
}//GEN-LAST:event_nomeClienteComboBoxItemStateChanged

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    dispose();
}//GEN-LAST:event_jButton1ActionPerformed

private void selecionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarButtonActionPerformed
// TODO add your handling code here:

    int numeroindex = nomeClienteComboBox.getSelectedIndex();
    //System.out.prin
    controleReservas.buscaCamposReservaMesa(nomeClienteComboBox.getItemAt(numeroindex).toString());

}//GEN-LAST:event_selecionarButtonActionPerformed

public void setNumeroPessoasTextField(int novoNum)
{
    numeroPessoasTextField.setText(novoNum + "");
}

public void setHorarioReservaTextField(String novoHorario)
{
    horarioReservaFormattedTextField.setText(novoHorario);
}
    /**
    * @param args the command line arguments
    */
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMesaReservada().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField horarioReservaFormattedTextField;
    private javax.swing.JLabel horarioReservaLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menuMesaReservadaPanel;
    private javax.swing.JLabel mesaReservadaLabel;
    private javax.swing.JComboBox nomeClienteComboBox;
    private javax.swing.JLabel nomeClienteLabel;
    private javax.swing.JLabel numeroMesaLabel;
    private javax.swing.JTextField numeroMesaTextField;
    private javax.swing.JLabel numeroPessoasLabel;
    private javax.swing.JTextField numeroPessoasTextField;
    private javax.swing.JButton selecionarButton;
    private javax.swing.JButton tonarOcupadaButton;
    private javax.swing.JButton tornarLivreButton;
    // End of variables declaration//GEN-END:variables

}