/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

import static java.lang.Double.parseDouble;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import static sistemarestaurante.FrameUtils.centralizarInterface;
import static sistemarestaurante.TipoProduto.parseTipoProduto;

/**
 *
 * @author filaboia
 */
public class MenuCadastroProdutos extends javax.swing.JFrame {
    
    public static MenuCadastroProdutos menuCadastroProdutos;
    private Integer produtoIndexEmEdicao;
    private final ControleProduto controleProduto;

    /**
     * Creates new form MenuCadastroProdutos
     */
    public MenuCadastroProdutos() {
        initComponents();
        centralizarInterface(this);
        controleProduto = new ControleProduto();
        initProdutos();
    }

    private void initProdutos() {
        final Vector<Vector<Object>> produtosVector = controleProduto.buscaTodosProdutos();
        for (Vector<Object> produtoVector : produtosVector) {
            ((DefaultTableModel) produtosTable.getModel()).addRow(produtoVector);
        }
    }
    
    public static MenuCadastroProdutos getInstancia() {
        if (menuCadastroProdutos == null) {
            menuCadastroProdutos = new MenuCadastroProdutos();
        }
        return menuCadastroProdutos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        descricaoLabel = new javax.swing.JLabel();
        descricaoText = new javax.swing.JTextField();
        tipoLabel = new javax.swing.JLabel();
        tipoComboBox = new javax.swing.JComboBox();
        precoLabel = new javax.swing.JLabel();
        precoText = new javax.swing.JFormattedTextField();
        cadastroProdutosLabel = new javax.swing.JLabel();
        salvarButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtosTable = new javax.swing.JTable();
        editarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SGR - Cadastro de Produtos");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        descricaoLabel.setForeground(new java.awt.Color(255, 255, 255));
        descricaoLabel.setText("Descrição");

        tipoLabel.setForeground(new java.awt.Color(255, 255, 255));
        tipoLabel.setText("Tipo");

        tipoComboBox.setModel(new javax.swing.DefaultComboBoxModel(TipoProduto.values()));

        precoLabel.setForeground(new java.awt.Color(255, 255, 255));
        precoLabel.setText("Preço (R$)");

        cadastroProdutosLabel.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        cadastroProdutosLabel.setForeground(new java.awt.Color(255, 255, 255));
        cadastroProdutosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cadastroProdutosLabel.setText("Cadastro de Produtos");

        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });

        produtosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Tipo", "Preço (R$)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(produtosTable);

        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(descricaoLabel)
                            .addComponent(tipoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(descricaoText)
                            .addComponent(tipoComboBox, 0, 215, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(precoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(limparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(precoText)))
                    .addComponent(cadastroProdutosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(cadastroProdutosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(descricaoText)
                        .addComponent(precoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(precoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(descricaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvarButton)
                    .addComponent(limparButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarButton)
                    .addComponent(removerButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        final Vector<Object> produtoVector = new Vector<Object>();
        final DefaultTableModel produtosTableModel = (DefaultTableModel) produtosTable.getModel();
        final Vector<Vector<Object>> produtosVector = ((DefaultTableModel) produtosTable.getModel()).getDataVector();
        
        produtoVector.add(descricaoText.getText());
        produtoVector.add(tipoComboBox.getSelectedItem().toString());
        produtoVector.add(parseDouble(precoText.getText()));
        
        if (produtoIndexEmEdicao != null) {
            final Vector<Object> produtoVectorEmEdicao = produtosVector.get(produtoIndexEmEdicao);
            produtosTableModel.removeRow(produtoIndexEmEdicao);
            controleProduto.removeProduto(produtoVectorEmEdicao);
        }
        
        controleProduto.armazenaProduto(produtoVector);
        produtosTableModel.addRow(produtoVector);
        
        limpar();
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        final Integer produtoIndex = produtosTable.convertRowIndexToModel(produtosTable.getSelectedRow());
        final Vector<Vector<Object>> produtosVector = ((DefaultTableModel) produtosTable.getModel()).getDataVector();
        final Vector<Object> produtoVector = produtosVector.get(produtoIndex);
        
        descricaoText.setText((String) produtoVector.get(0));
        tipoComboBox.setSelectedItem(parseTipoProduto((String) produtoVector.get(1)));
        precoText.setText(produtoVector.get(2).toString());
        
        produtoIndexEmEdicao = produtoIndex;
    }//GEN-LAST:event_editarButtonActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        limpar();
    }//GEN-LAST:event_limparButtonActionPerformed

    private void limpar() {
        descricaoText.setText("");
        precoText.setText("");
        produtoIndexEmEdicao = null;
    }

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        final Integer produtoIndex = produtosTable.convertRowIndexToModel(produtosTable.getSelectedRow());
        final Vector<Vector<Object>> produtosVector = ((DefaultTableModel) produtosTable.getModel()).getDataVector();
        final Vector<Object> produtoVector = produtosVector.get(produtoIndex);
        
        new ControleProduto().removeProduto(produtoVector);
        ((DefaultTableModel) produtosTable.getModel()).removeRow(produtoIndex);
    }//GEN-LAST:event_removerButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadastroProdutosLabel;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JTextField descricaoText;
    private javax.swing.JButton editarButton;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel precoLabel;
    private javax.swing.JFormattedTextField precoText;
    private javax.swing.JTable produtosTable;
    private javax.swing.JButton removerButton;
    private javax.swing.JButton salvarButton;
    private javax.swing.JComboBox tipoComboBox;
    private javax.swing.JLabel tipoLabel;
    // End of variables declaration//GEN-END:variables
}
