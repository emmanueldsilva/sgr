/*
 * TabelaDePre�os.java
 *
 * Created on 15 de Setembro de 2008, 23:29
 */

package sistemarestaurante;

/**
 *
 * @author  Usu�rio
 */
public class TabelaDePre�os extends javax.swing.JFrame {

    /** Creates new form TabelaDePre�os */
    public TabelaDePre�os() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelTabelaDePrecosPanel = new javax.swing.JPanel();
        tabelaDePrecosLabel = new javax.swing.JLabel();
        produtosPrecosPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDePrecosTable = new javax.swing.JTable();
        atualizarListaButton = new javax.swing.JButton();
        limparCamposButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SGR - Tabela de Pre�os");
        setResizable(false);

        painelTabelaDePrecosPanel.setBackground(new java.awt.Color(204, 204, 255));
        painelTabelaDePrecosPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tabelaDePrecosLabel.setFont(new java.awt.Font("Tahoma", 1, 18));
        tabelaDePrecosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tabelaDePrecosLabel.setText("Tabela de Pre�os");

        produtosPrecosPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 1, true), "Produtos e Pre�os"));
        produtosPrecosPanel.setOpaque(false);

        tabelaDePrecosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Espeto Corrido", "18.00"},
                {"Italiana", "13.00"},
                {"Buffet", "12.00"},
                {"Marmitex", "6.50"},
                {"Sopa (mesa)", "9.00"},
                {"Cerveja Garrafa", "4.00"},
                {"� Cerveja ", "2.50"},
                {"Cerveja Lata 350ml", "2.50"},
                {"Refrigerante Garrafa 290ml", "2.00"},
                {"Refrigerante Lata 350ml", "2.50"},
                {"Refrigerante 600ml", "3.00"},
                {"Refrigerante Litro", "3.00"},
                {"Refrigerante 2 Litros", "4.00"},
                {"�gua", "2.00"},
                {"Suco", "2.00"},
                {"Aperitivo", "3.00"},
                {"Vinho (ta�a)", "3.00"},
                {"Vinho (jarra)", "8.00"}
            },
            new String [] {
                "Nome do Produto", "Pre�o"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaDePrecosTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaDePrecosTable);
        tabelaDePrecosTable.getColumnModel().getColumn(0).setResizable(false);
        tabelaDePrecosTable.getColumnModel().getColumn(1).setResizable(false);

        javax.swing.GroupLayout produtosPrecosPanelLayout = new javax.swing.GroupLayout(produtosPrecosPanel);
        produtosPrecosPanel.setLayout(produtosPrecosPanelLayout);
        produtosPrecosPanelLayout.setHorizontalGroup(
            produtosPrecosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produtosPrecosPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        produtosPrecosPanelLayout.setVerticalGroup(
            produtosPrecosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosPrecosPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        atualizarListaButton.setText("Atualizar Lista");

        limparCamposButton.setText("Limpar Campos");

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelTabelaDePrecosPanelLayout = new javax.swing.GroupLayout(painelTabelaDePrecosPanel);
        painelTabelaDePrecosPanel.setLayout(painelTabelaDePrecosPanelLayout);
        painelTabelaDePrecosPanelLayout.setHorizontalGroup(
            painelTabelaDePrecosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaDePrecosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTabelaDePrecosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabelaDePrecosLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addComponent(produtosPrecosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTabelaDePrecosPanelLayout.createSequentialGroup()
                        .addComponent(okButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atualizarListaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limparCamposButton)))
                .addContainerGap())
        );
        painelTabelaDePrecosPanelLayout.setVerticalGroup(
            painelTabelaDePrecosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaDePrecosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabelaDePrecosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(produtosPrecosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelTabelaDePrecosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limparCamposButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarListaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTabelaDePrecosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTabelaDePrecosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_okButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaDePre�os().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarListaButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparCamposButton;
    private javax.swing.JButton okButton;
    private javax.swing.JPanel painelTabelaDePrecosPanel;
    private javax.swing.JPanel produtosPrecosPanel;
    private javax.swing.JLabel tabelaDePrecosLabel;
    private javax.swing.JTable tabelaDePrecosTable;
    // End of variables declaration//GEN-END:variables

}
