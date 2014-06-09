/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MenuConta.java
 *
 * Created on 26/11/2008, 13:29:13
 */

package sistemarestaurante;

import static java.lang.Double.parseDouble;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edamiani
 */
public class MenuVenda extends javax.swing.JFrame {

    private final Ocupacao ocupacao;
    private final ControleVenda controleVendas;
    private final ControleProduto controleProduto;
    /** Creates new form MenuConta */
    public MenuVenda(Ocupacao ocupacao) {
        controleVendas = new ControleVenda();
        controleProduto = new ControleProduto();
        initComponents();
        initProdutos();
        this.centralizarInterface(this);
        this.ocupacao = ocupacao;
    }
    
    private void initProdutos() {
        final Vector<Vector<Object>> produtosVendaVector = controleProduto.buscaTodosProdutos();
        for (Vector<Object> produtoVendaVector : produtosVendaVector) {
            ((DefaultTableModel) produtosVendaTable.getModel()).addRow(produtoVendaVector);
        }
    }

    public static void centralizarInterface(javax.swing.JFrame janela) {  
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int componentWidth = janela.getWidth();
        int componentHeight = janela.getHeight();
        janela.setBounds((screenSize.width-componentWidth)/2, (screenSize.height-componentHeight)/2, componentWidth, componentHeight);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contaPanel = new javax.swing.JPanel();
        contaLabel = new javax.swing.JLabel();
        produtosConsumidosPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtosVendaTable = new javax.swing.JTable();
        valorTotalLabel = new javax.swing.JLabel();
        valorTotalFormattedTextField = new javax.swing.JFormattedTextField();
        encerrarContaButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SGR - Detalhes Venda");
        setResizable(false);

        contaPanel.setBackground(new java.awt.Color(0, 51, 51));
        contaPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0), 2));
        contaPanel.setForeground(new java.awt.Color(51, 153, 0));

        contaLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        contaLabel.setForeground(new java.awt.Color(255, 255, 255));
        contaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contaLabel.setText("Detalhes Venda");

        produtosConsumidosPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 0), 1, true), "Produtos Consumidos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(51, 153, 0))); // NOI18N
        produtosConsumidosPanel.setOpaque(false);

        produtosVendaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Produto", "Tipo", "Preço (R$)", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        produtosVendaTable.getTableHeader().setReorderingAllowed(false);
        produtosVendaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produtosVendaTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(produtosVendaTable);
        if (produtosVendaTable.getColumnModel().getColumnCount() > 0) {
            produtosVendaTable.getColumnModel().getColumn(0).setResizable(false);
            produtosVendaTable.getColumnModel().getColumn(1).setResizable(false);
            produtosVendaTable.getColumnModel().getColumn(2).setResizable(false);
            produtosVendaTable.getColumnModel().getColumn(3).setResizable(false);
        }

        valorTotalLabel.setForeground(new java.awt.Color(255, 255, 255));
        valorTotalLabel.setText("Valor Total da Compra (R$) :");

        valorTotalFormattedTextField.setEditable(false);
        valorTotalFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout produtosConsumidosPanelLayout = new javax.swing.GroupLayout(produtosConsumidosPanel);
        produtosConsumidosPanel.setLayout(produtosConsumidosPanelLayout);
        produtosConsumidosPanelLayout.setHorizontalGroup(
            produtosConsumidosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produtosConsumidosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(produtosConsumidosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                    .addGroup(produtosConsumidosPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(valorTotalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorTotalFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        produtosConsumidosPanelLayout.setVerticalGroup(
            produtosConsumidosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosConsumidosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(produtosConsumidosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorTotalFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorTotalLabel))
                .addContainerGap())
        );

        encerrarContaButton.setText("Encerrar Conta e Salvar");
        encerrarContaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encerrarContaButtonActionPerformed(evt);
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contaPanelLayout = new javax.swing.GroupLayout(contaPanel);
        contaPanel.setLayout(contaPanelLayout);
        contaPanelLayout.setHorizontalGroup(
            contaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contaPanelLayout.createSequentialGroup()
                        .addComponent(encerrarContaButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okButton))
                    .addComponent(produtosConsumidosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contaPanelLayout.setVerticalGroup(
            contaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(produtosConsumidosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(encerrarContaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        dispose();
}//GEN-LAST:event_okButtonActionPerformed

    private void encerrarContaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encerrarContaButtonActionPerformed
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        ocupacao.setHorarioSaida(sdf.format(data));
        ocupacao.setProdutosVendaVector(getProdutosVendaVector());
        controleVendas.salvarVenda(ocupacao);
        JOptionPane.showMessageDialog(null, "Conta armazenada com sucesso!",
        "Confirmado!", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }//GEN-LAST:event_encerrarContaButtonActionPerformed

    private void produtosVendaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtosVendaTableMouseClicked
        final Vector produtosVendaVector = getProdutosVendaVector();
        setValorTotal(controleVendas.calculcarValorTotal(produtosVendaVector));
    }//GEN-LAST:event_produtosVendaTableMouseClicked

    private Vector getProdutosVendaVector() {
        return ((DefaultTableModel) produtosVendaTable.getModel()).getDataVector();
    }

public JTable getTable()
{
    return produtosVendaTable;
}

public double getValorTotal()
{
    return parseDouble(valorTotalFormattedTextField.getText());
}

public void setValorTotal(double novoValor)
{
    valorTotalFormattedTextField.setText(novoValor + "");
}

public Ocupacao getOcupacao() {
    return ocupacao;
}



    /**
    * @param args the command line arguments
    */
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuConta().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contaLabel;
    private javax.swing.JPanel contaPanel;
    private javax.swing.JButton encerrarContaButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton okButton;
    private javax.swing.JPanel produtosConsumidosPanel;
    private javax.swing.JTable produtosVendaTable;
    private javax.swing.JFormattedTextField valorTotalFormattedTextField;
    private javax.swing.JLabel valorTotalLabel;
    // End of variables declaration//GEN-END:variables

}
