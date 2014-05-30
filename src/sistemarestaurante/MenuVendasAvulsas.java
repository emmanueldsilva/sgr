/*
 * MenuVendaPequena.java
 *
 * Created on 12 de Setembro de 2008, 00:49
 */

package sistemarestaurante;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author  Usu�rio
 */
public class MenuVendasAvulsas extends javax.swing.JFrame {

    private DefaultListModel listaProdutos;
    private ArrayList<String> listaProdutosArrayList;
    private ControleVendasAvulsas controleVendas;
    /** Creates new form MenuVendaPequena */
    public MenuVendasAvulsas() {
        super("SGR - Sistema Gerenciador de Restaurante (Menu de Vendas Avulsas)");
        initComponents();
        //main();
        listaProdutosArrayList = new ArrayList<String>();
        controleVendas = new ControleVendasAvulsas(this);
            listaProdutos = new DefaultListModel();
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuVendaPequenaPanel = new javax.swing.JPanel();
        vendaPequenaLabel = new javax.swing.JLabel();
        dadosProdutoPanel = new javax.swing.JPanel();
        tipoNomeProdutoLabel = new javax.swing.JLabel();
        tipoNomeProdutoTextField = new javax.swing.JTextField();
        precoLabel = new javax.swing.JLabel();
        quantidadeLabel = new javax.swing.JLabel();
        quantidadeTextField = new javax.swing.JTextField();
        adicionarButton = new javax.swing.JButton();
        precoTextField = new javax.swing.JTextField();
        listaProdutosPanel = new javax.swing.JPanel();
        listaScrollPane = new javax.swing.JScrollPane();
        listaProdutosList = new javax.swing.JList();
        removerItemButton = new javax.swing.JButton();
        valorTotalLabel = new javax.swing.JLabel();
        valorTotalFormattedTextField = new javax.swing.JFormattedTextField();
        okButton = new javax.swing.JButton();
        salvarVendaButton = new javax.swing.JButton();
        itensAvulsosSeparator = new javax.swing.JSeparator();
        vendasSalvasPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vendasSalvasJList = new javax.swing.JList();
        removerVendaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SGR - Menu de Vendas Avulsas");
        setResizable(false);

        menuVendaPequenaPanel.setBackground(new java.awt.Color(0, 51, 51));
        menuVendaPequenaPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));

        vendaPequenaLabel.setFont(new java.awt.Font("Tahoma", 1, 18));
        vendaPequenaLabel.setForeground(new java.awt.Color(255, 255, 255));
        vendaPequenaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vendaPequenaLabel.setText("Venda de Itens Avulsos");

        dadosProdutoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 1, true), "Dados do Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 0))); // NOI18N
        dadosProdutoPanel.setOpaque(false);
        dadosProdutoPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dadosProdutoPanelMouseClicked(evt);
            }
        });

        tipoNomeProdutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        tipoNomeProdutoLabel.setText("Tipo/Nome do Produto:");

        precoLabel.setForeground(new java.awt.Color(255, 255, 255));
        precoLabel.setText("Pre�o:");

        quantidadeLabel.setForeground(new java.awt.Color(255, 255, 255));
        quantidadeLabel.setText("Quantidade:");

        adicionarButton.setText("Adicionar � Lista");
        adicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dadosProdutoPanelLayout = new javax.swing.GroupLayout(dadosProdutoPanel);
        dadosProdutoPanel.setLayout(dadosProdutoPanelLayout);
        dadosProdutoPanelLayout.setHorizontalGroup(
            dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosProdutoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adicionarButton)
                    .addGroup(dadosProdutoPanelLayout.createSequentialGroup()
                        .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(precoLabel)
                            .addComponent(tipoNomeProdutoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoNomeProdutoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addGroup(dadosProdutoPanelLayout.createSequentialGroup()
                                .addComponent(precoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(quantidadeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(quantidadeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        dadosProdutoPanelLayout.setVerticalGroup(
            dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosProdutoPanelLayout.createSequentialGroup()
                .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoNomeProdutoLabel)
                    .addComponent(tipoNomeProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosProdutoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantidadeLabel)
                    .addComponent(quantidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precoLabel)
                    .addComponent(precoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adicionarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listaProdutosPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 1, true), "Lista de Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 0))); // NOI18N
        listaProdutosPanel.setOpaque(false);

        listaProdutosList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaProdutosListValueChanged(evt);
            }
        });
        listaScrollPane.setViewportView(listaProdutosList);

        removerItemButton.setText("Remover Item");
        removerItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listaProdutosPanelLayout = new javax.swing.GroupLayout(listaProdutosPanel);
        listaProdutosPanel.setLayout(listaProdutosPanelLayout);
        listaProdutosPanelLayout.setHorizontalGroup(
            listaProdutosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaProdutosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listaProdutosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(removerItemButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        listaProdutosPanelLayout.setVerticalGroup(
            listaProdutosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaProdutosPanelLayout.createSequentialGroup()
                .addComponent(listaScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removerItemButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        valorTotalLabel.setForeground(new java.awt.Color(255, 255, 255));
        valorTotalLabel.setText("Valor Total da Compra (R$) :");

        valorTotalFormattedTextField.setEditable(false);
        valorTotalFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        valorTotalFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        salvarVendaButton.setText("Salvar Venda");
        salvarVendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarVendaButtonActionPerformed(evt);
            }
        });

        itensAvulsosSeparator.setForeground(new java.awt.Color(51, 153, 0));
        itensAvulsosSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        vendasSalvasPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)), "Vendas Salvas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 153, 0))); // NOI18N
        vendasSalvasPanel.setOpaque(false);

        vendasSalvasJList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                vendasSalvasJListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(vendasSalvasJList);

        removerVendaButton.setText("Remover Venda");
        removerVendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerVendaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vendasSalvasPanelLayout = new javax.swing.GroupLayout(vendasSalvasPanel);
        vendasSalvasPanel.setLayout(vendasSalvasPanelLayout);
        vendasSalvasPanelLayout.setHorizontalGroup(
            vendasSalvasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vendasSalvasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vendasSalvasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                    .addComponent(removerVendaButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        vendasSalvasPanelLayout.setVerticalGroup(
            vendasSalvasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vendasSalvasPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removerVendaButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout menuVendaPequenaPanelLayout = new javax.swing.GroupLayout(menuVendaPequenaPanel);
        menuVendaPequenaPanel.setLayout(menuVendaPequenaPanelLayout);
        menuVendaPequenaPanelLayout.setHorizontalGroup(
            menuVendaPequenaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuVendaPequenaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuVendaPequenaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vendaPequenaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                    .addGroup(menuVendaPequenaPanelLayout.createSequentialGroup()
                        .addGroup(menuVendaPequenaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listaProdutosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(menuVendaPequenaPanelLayout.createSequentialGroup()
                                .addComponent(valorTotalLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorTotalFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(salvarVendaButton))
                            .addComponent(dadosProdutoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itensAvulsosSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuVendaPequenaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(vendasSalvasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(okButton))))
                .addContainerGap())
        );
        menuVendaPequenaPanelLayout.setVerticalGroup(
            menuVendaPequenaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuVendaPequenaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vendaPequenaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuVendaPequenaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuVendaPequenaPanelLayout.createSequentialGroup()
                        .addComponent(dadosProdutoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listaProdutosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuVendaPequenaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valorTotalLabel)
                            .addComponent(valorTotalFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salvarVendaButton)))
                    .addGroup(menuVendaPequenaPanelLayout.createSequentialGroup()
                        .addComponent(vendasSalvasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(itensAvulsosSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuVendaPequenaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuVendaPequenaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void removerItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerItemButtonActionPerformed
// TODO add your handling code here:
    listaProdutos = new DefaultListModel();
    listaProdutos = (DefaultListModel) listaProdutosList.getModel();
    listaProdutosArrayList.remove(listaProdutosList.getSelectedValue().toString());
    listaProdutos.removeElement(listaProdutosList.getSelectedValue());
    controleVendas.calculaValor(listaProdutosArrayList);
    listaProdutosList.setModel(listaProdutos);
}//GEN-LAST:event_removerItemButtonActionPerformed

private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
// TODO add your handling code here:
    dispose();
}//GEN-LAST:event_okButtonActionPerformed

private void salvarVendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarVendaButtonActionPerformed
// TODO add your handling code here:
    controleVendas.adicionaVenda(listaProdutosArrayList, getValorTotal());
}//GEN-LAST:event_salvarVendaButtonActionPerformed

private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed
    // TODO add your handling code here:
    if (getNomeProduto().equals(""))
    {
        JOptionPane.showMessageDialog(null, "Erro! Voc� n�o inseriu o nome ou tipo do produto!", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
    }
    else if (getPreco() == 0)
    {
        JOptionPane.showMessageDialog(null, "Erro! Voc� n�o inseriu o pre�o do produto!", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
    }
    else if (getQuantidade() == 0)
    {
        JOptionPane.showMessageDialog(null, "Erro! Voc� n�o inseriu a quantidade do produto!", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
    }
    else
    {
        String produto = (getNomeProduto() + "    " + "Qtde:" + "    " +
                getQuantidade() + "    " + "Pre�o:" + "    " + getPreco());
        listaProdutos.addElement(produto);
        listaProdutosArrayList.add(produto);
        Collections.sort(listaProdutosArrayList);
        controleVendas.calculaValor(listaProdutosArrayList);

        setListaProdutosList(listaProdutos);
    }
}//GEN-LAST:event_adicionarButtonActionPerformed

private void listaProdutosListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaProdutosListValueChanged
    // TODO add your handling code here:
    if (!listaProdutosList.isSelectionEmpty())
    {
        controleVendas.buscaCamposProduto(listaProdutosList.getSelectedValue().toString());
        controleVendas.calculaValor(listaProdutosArrayList);
    }
}//GEN-LAST:event_listaProdutosListValueChanged

private void vendasSalvasJListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_vendasSalvasJListValueChanged
    // TODO add your handling code here:
    if (!vendasSalvasJList.isSelectionEmpty())
    {
        controleVendas.buscaCamposVenda(vendasSalvasJList.getSelectedValue().toString());
    }
}//GEN-LAST:event_vendasSalvasJListValueChanged

private void dadosProdutoPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dadosProdutoPanelMouseClicked
    // TODO add your handling code here:
    if (!vendasSalvasJList.isSelectionEmpty())
    {
        listaProdutosList.setEnabled(true);
        setListaProdutosList(new DefaultListModel());
        setListaProdutosArrayList(new ArrayList<String>());
        setListaProdutosDefault(new DefaultListModel());
        vendasSalvasJList.clearSelection();
    }
}//GEN-LAST:event_dadosProdutoPanelMouseClicked

private void removerVendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerVendaButtonActionPerformed
    // TODO add your handling code here:
    if (!vendasSalvasJList.isSelectionEmpty())
    {
        int option = JOptionPane.showConfirmDialog(null, "Aviso: Voc� est� prestes a remover um registro de Venda!" +
                " Deseja remover assim mesmo?", "Cuidado!", JOptionPane.YES_NO_OPTION, 
            JOptionPane.WARNING_MESSAGE);
        if (option == 0)
            controleVendas.removeVenda(vendasSalvasJList.getSelectedValue().toString());
    }
}//GEN-LAST:event_removerVendaButtonActionPerformed

public String getNomeProduto()
{
    return tipoNomeProdutoTextField.getText();
}

public void setNomeProduto(String novoNome)
{
    tipoNomeProdutoTextField.setText(novoNome);
}

public double getPreco()
{
    if (precoTextField.getText().equals(""))
        return 0;
    return Double.parseDouble(precoTextField.getText());
}

public void setPreco(double novoValor)
{
    if (novoValor == 0)
        precoTextField.setText("");
    else
        precoTextField.setText(novoValor + "");
}

public int getQuantidade()
{
    if (quantidadeTextField.getText().equals(""))
        return 0;
    return Integer.parseInt(quantidadeTextField.getText());
}

public void setQuantidade(int novaQtde)
{
    if (novaQtde == 0)
        quantidadeTextField.setText("");
    else
        quantidadeTextField.setText(novaQtde + "");
}

public void setListaProdutosList(DefaultListModel lista)
{
    listaProdutosList.setModel(lista);
}

public void setListaVendas(DefaultListModel lista)
{
    vendasSalvasJList.setModel(lista);
}

public double getValorTotal()
{
    return Double.parseDouble(valorTotalFormattedTextField.getText());
}

public void setValorTotal(double novoValor)
{
    valorTotalFormattedTextField.setText(novoValor + "");
}

public ArrayList<String> getListaProdutosArrayList()
{
    return listaProdutosArrayList;
}

public void setListaProdutosArrayList(ArrayList<String> novoArray)
{
    listaProdutosArrayList = novoArray;
}

public DefaultListModel getListaProdutosDefault()
{
    return listaProdutos;
}

public void setListaProdutosDefault(DefaultListModel novaLista)
{
    listaProdutos = novaLista;
}

public JList getListaProdutosList() {
        return listaProdutosList;
}


    /**
    * @param args the command line arguments
    */
    /*public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuVendasAvulsas().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarButton;
    private javax.swing.JPanel dadosProdutoPanel;
    private javax.swing.JSeparator itensAvulsosSeparator;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaProdutosList;
    private javax.swing.JPanel listaProdutosPanel;
    private javax.swing.JScrollPane listaScrollPane;
    private javax.swing.JPanel menuVendaPequenaPanel;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel precoLabel;
    private javax.swing.JTextField precoTextField;
    private javax.swing.JLabel quantidadeLabel;
    private javax.swing.JTextField quantidadeTextField;
    private javax.swing.JButton removerItemButton;
    private javax.swing.JButton removerVendaButton;
    private javax.swing.JButton salvarVendaButton;
    private javax.swing.JLabel tipoNomeProdutoLabel;
    private javax.swing.JTextField tipoNomeProdutoTextField;
    private javax.swing.JFormattedTextField valorTotalFormattedTextField;
    private javax.swing.JLabel valorTotalLabel;
    private javax.swing.JLabel vendaPequenaLabel;
    private javax.swing.JList vendasSalvasJList;
    private javax.swing.JPanel vendasSalvasPanel;
    // End of variables declaration//GEN-END:variables

}