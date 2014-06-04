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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author edamiani
 */
public class MenuConta extends javax.swing.JFrame {

    private DefaultListModel listaProdutos;
    private ArrayList<String> listaProdutosArrayList;
    private ControleVendas controleContas;
    private Ocupacao ocupacao;
    private static MenuConta menuConta = null;
    /** Creates new form MenuConta */
    private MenuConta(Ocupacao ocupacao) {
        initComponents();

        this.centralizarInterface(this);
        this.listaProdutosArrayList = new ArrayList<String>();
        this.controleContas = new ControleVendas(this);
        this.listaProdutos = new DefaultListModel();
        this.ocupacao = ocupacao;
        controleContas.calculaValor(listaProdutosArrayList);
    }

    public static MenuConta getInstancia(Ocupacao ocupacao)
    {
        /*if (ocupacao.getHorarioOcupacao().equals(this.ocupacao.getHorarioOcupacao()))
            menuConta = new MenuConta(ocupacao);*/
        if (menuConta == null)
            menuConta = new MenuConta(ocupacao);
        return menuConta;
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
        tabelaDePrecosTable = new javax.swing.JTable();
        valorTotalLabel = new javax.swing.JLabel();
        valorTotalFormattedTextField = new javax.swing.JFormattedTextField();
        listaScrollPane = new javax.swing.JScrollPane();
        listaProdutosList = new javax.swing.JList();
        removerItemButton = new javax.swing.JButton();
        adicionarButton = new javax.swing.JButton();
        precoTextField = new javax.swing.JTextField();
        outroProdutoTextField = new javax.swing.JTextField();
        outroProdutoLabel = new javax.swing.JLabel();
        precoLabel = new javax.swing.JLabel();
        quantidadeLabel = new javax.swing.JLabel();
        quantidadeTextField = new javax.swing.JTextField();
        encerrarContaButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SGR - Conta Cliente");
        setResizable(false);

        contaPanel.setBackground(new java.awt.Color(0, 51, 51));
        contaPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0), 2));
        contaPanel.setForeground(new java.awt.Color(51, 153, 0));

        contaLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        contaLabel.setForeground(new java.awt.Color(255, 255, 255));
        contaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contaLabel.setText("Conta do Cliente");

        produtosConsumidosPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 0), 1, true), "Produtos Consumidos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(51, 153, 0))); // NOI18N
        produtosConsumidosPanel.setOpaque(false);

        tabelaDePrecosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Espeto Corrido",  new Integer(0)},
                {"Italiana",  new Integer(0)},
                {"Buffet",  new Integer(0)},
                {"Marmitex",  new Integer(0)},
                {"Sopa (mesa)",  new Integer(0)},
                {"Cerveja Garrafa",  new Integer(0)},
                {"½ Cerveja ",  new Integer(0)},
                {"Cerveja Lata 350ml",  new Integer(0)},
                {"Refrigerante Garrafa 290ml",  new Integer(0)},
                {"Refrigerante Lata 350ml",  new Integer(0)},
                {"Refrigerante 600ml",  new Integer(0)},
                {"Refrigerante Litro",  new Integer(0)},
                {"Refrigerante 2 Litros",  new Integer(0)},
                {"Água",  new Integer(0)},
                {"Suco",  new Integer(0)},
                {"Aperitivo",  new Integer(0)},
                {"Vinho (taça)",  new Integer(0)},
                {"Vinho (jarra)",  new Integer(0)}
            },
            new String [] {
                "Nome do Produto", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaDePrecosTable.getTableHeader().setReorderingAllowed(false);
        tabelaDePrecosTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDePrecosTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaDePrecosTable);
        if (tabelaDePrecosTable.getColumnModel().getColumnCount() > 0) {
            tabelaDePrecosTable.getColumnModel().getColumn(0).setResizable(false);
            tabelaDePrecosTable.getColumnModel().getColumn(1).setResizable(false);
        }

        valorTotalLabel.setForeground(new java.awt.Color(255, 255, 255));
        valorTotalLabel.setText("Valor Total da Compra (R$) :");

        valorTotalFormattedTextField.setEditable(false);
        valorTotalFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

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

        adicionarButton.setText("Adicionar Item à Lista");
        adicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarButtonActionPerformed(evt);
            }
        });

        outroProdutoLabel.setForeground(new java.awt.Color(255, 255, 255));
        outroProdutoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        outroProdutoLabel.setText("Outro Produto:");

        precoLabel.setForeground(new java.awt.Color(255, 255, 255));
        precoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precoLabel.setText("Preço:");

        quantidadeLabel.setForeground(new java.awt.Color(255, 255, 255));
        quantidadeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        quantidadeLabel.setText("Quantidade:");

        javax.swing.GroupLayout produtosConsumidosPanelLayout = new javax.swing.GroupLayout(produtosConsumidosPanel);
        produtosConsumidosPanel.setLayout(produtosConsumidosPanelLayout);
        produtosConsumidosPanelLayout.setHorizontalGroup(
            produtosConsumidosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosConsumidosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(produtosConsumidosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(produtosConsumidosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(produtosConsumidosPanelLayout.createSequentialGroup()
                            .addComponent(outroProdutoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(outroProdutoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                        .addComponent(listaScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                        .addComponent(adicionarButton, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, produtosConsumidosPanelLayout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(precoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(precoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(quantidadeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(quantidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(produtosConsumidosPanelLayout.createSequentialGroup()
                        .addComponent(valorTotalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorTotalFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(removerItemButton))
                .addContainerGap())
        );
        produtosConsumidosPanelLayout.setVerticalGroup(
            produtosConsumidosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosConsumidosPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(produtosConsumidosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(produtosConsumidosPanelLayout.createSequentialGroup()
                        .addGroup(produtosConsumidosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(outroProdutoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outroProdutoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(produtosConsumidosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precoLabel)
                            .addComponent(precoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantidadeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adicionarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listaScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removerItemButton)
                        .addGap(28, 28, 28)
                        .addGroup(produtosConsumidosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valorTotalFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorTotalLabel))))
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

    private void listaProdutosListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaProdutosListValueChanged
        // TODO add your handling code here:
        if (!listaProdutosList.isSelectionEmpty()) {
            controleContas.buscaCamposProduto(listaProdutosList.getSelectedValue().toString());
            controleContas.calculaValor(listaProdutosArrayList);
        }
}//GEN-LAST:event_listaProdutosListValueChanged

    private void removerItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerItemButtonActionPerformed
        // TODO add your handling code here:
        listaProdutos = new DefaultListModel();
        listaProdutos = (DefaultListModel) listaProdutosList.getModel();
        listaProdutosArrayList.remove(listaProdutosList.getSelectedValue().toString());
        listaProdutos.removeElement(listaProdutosList.getSelectedValue());
        controleContas.calculaValor(listaProdutosArrayList);
        listaProdutosList.setModel(listaProdutos);
        controleContas.limpaCamposProduto();
}//GEN-LAST:event_removerItemButtonActionPerformed

    private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed
        // TODO add your handling code here:
        if (getNomeProduto().equals("")) {
            JOptionPane.showMessageDialog(null, "Erro! Você não inseriu o nome ou tipo do produto!",
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        } else if (getPreco() == 0) {
            JOptionPane.showMessageDialog(null, "Erro! Você não inseriu o preço do produto!",
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        } else if (getQuantidade() == 0) {
            JOptionPane.showMessageDialog(null, "Erro! Você não inseriu a quantidade do produto!",
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            String produto = (getNomeProduto() + "    " + "Quantidade:" + "    " +
                    getQuantidade() + "    " + "Preço:" + "    " + getPreco());
            listaProdutos.addElement(produto);
            listaProdutosArrayList.add(produto);
            Collections.sort(listaProdutosArrayList);
            controleContas.calculaValor(listaProdutosArrayList);
            controleContas.limpaCamposProduto();
            setListaProdutosList(listaProdutos);
        }
}//GEN-LAST:event_adicionarButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
        dispose();
}//GEN-LAST:event_okButtonActionPerformed

    private void tabelaDePrecosTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDePrecosTableMouseClicked
        // TODO add your handling code here:
        controleContas.calculaValor(listaProdutosArrayList);
    }//GEN-LAST:event_tabelaDePrecosTableMouseClicked

    private void encerrarContaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encerrarContaButtonActionPerformed
        // TODO add your handling code here:
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        ocupacao.setHorarioSaida(sdf.format(data));
        controleContas.armazenarConta(listaProdutosArrayList);
        JOptionPane.showMessageDialog(null, "Conta armazenada com sucesso!",
        "Confirmado!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_encerrarContaButtonActionPerformed

public String getNomeProduto()
{
    return outroProdutoTextField.getText();
}

public void setNomeProduto(String novoNome)
{
    outroProdutoTextField.setText(novoNome);
}

public double getPreco()
{
    if (precoTextField.getText().equals(""))
        return 0;
    return Double.parseDouble(precoTextField.getText());
}

public void setPreco(double novoPreco)
{
    if (novoPreco == 0)
            precoTextField.setText("");
    else
    precoTextField.setText(novoPreco + "");
}

public int getQuantidade()
{
    if (quantidadeTextField.getText().equals(""))
        return 0;
    return Integer.parseInt(quantidadeTextField.getText());
}

public void setQuantidade(int novoValor)
{
    if (novoValor == 0)
         precoTextField.setText("");
    else
    quantidadeTextField.setText("" + novoValor);
}

public void setListaProdutosList(DefaultListModel lista)
{
    listaProdutosList.setModel(lista);
}

public JTable getTable()
{
    return tabelaDePrecosTable;
}

public JList getList()
{
    return listaProdutosList;
}

public double getValorTotal()
{
    return Double.parseDouble(valorTotalFormattedTextField.getText());
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
    private javax.swing.JButton adicionarButton;
    private javax.swing.JLabel contaLabel;
    private javax.swing.JPanel contaPanel;
    private javax.swing.JButton encerrarContaButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaProdutosList;
    private javax.swing.JScrollPane listaScrollPane;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel outroProdutoLabel;
    private javax.swing.JTextField outroProdutoTextField;
    private javax.swing.JLabel precoLabel;
    private javax.swing.JTextField precoTextField;
    private javax.swing.JPanel produtosConsumidosPanel;
    private javax.swing.JLabel quantidadeLabel;
    private javax.swing.JTextField quantidadeTextField;
    private javax.swing.JButton removerItemButton;
    private javax.swing.JTable tabelaDePrecosTable;
    private javax.swing.JFormattedTextField valorTotalFormattedTextField;
    private javax.swing.JLabel valorTotalLabel;
    // End of variables declaration//GEN-END:variables

}
