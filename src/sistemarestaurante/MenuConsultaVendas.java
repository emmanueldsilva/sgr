/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ConsultaConta.java
 *
 * Created on 26/11/2008, 21:26:42
 */

package sistemarestaurante;

import java.text.ParseException;
import java.util.Vector;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import javax.swing.table.DefaultTableModel;
import static sistemarestaurante.FrameUtils.centralizarInterface;

/**
 *
 * @author edamiani
 */
public class MenuConsultaVendas extends javax.swing.JFrame {
    
    private final ControleVenda controleVenda;

    /** Creates new form ConsultaConta */
    public MenuConsultaVendas() {
        initComponents();
        controleVenda = new ControleVenda();
        initVendas();
        centralizarInterface(this);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consultaVendasPanel = new javax.swing.JPanel();
        consultaVendasLabel = new javax.swing.JLabel();
        consultarVendasPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        vendasTable = new javax.swing.JTable();
        produtosConsumidosPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtosVendaTable = new javax.swing.JTable();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SGR - Consulta Vendas");
        setResizable(false);

        consultaVendasPanel.setBackground(new java.awt.Color(0, 51, 51));
        consultaVendasPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0), 2));

        consultaVendasLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        consultaVendasLabel.setForeground(new java.awt.Color(255, 255, 255));
        consultaVendasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        consultaVendasLabel.setText("Consulta Vendas");

        consultarVendasPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)), "Consultar Vendas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(51, 153, 0))); // NOI18N
        consultarVendasPanel.setOpaque(false);
        consultarVendasPanel.setPreferredSize(new java.awt.Dimension(415, 325));

        vendasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Entrada", "Saída", "Ocupantes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vendasTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vendasTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(vendasTable);

        javax.swing.GroupLayout consultarVendasPanelLayout = new javax.swing.GroupLayout(consultarVendasPanel);
        consultarVendasPanel.setLayout(consultarVendasPanelLayout);
        consultarVendasPanelLayout.setHorizontalGroup(
            consultarVendasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultarVendasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        consultarVendasPanelLayout.setVerticalGroup(
            consultarVendasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultarVendasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );

        produtosConsumidosPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)), "Produtos da Venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(51, 153, 0))); // NOI18N
        produtosConsumidosPanel.setOpaque(false);
        produtosConsumidosPanel.setPreferredSize(new java.awt.Dimension(415, 325));

        produtosVendaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Tipo", "Preço (R$)", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(produtosVendaTable);

        javax.swing.GroupLayout produtosConsumidosPanelLayout = new javax.swing.GroupLayout(produtosConsumidosPanel);
        produtosConsumidosPanel.setLayout(produtosConsumidosPanelLayout);
        produtosConsumidosPanelLayout.setHorizontalGroup(
            produtosConsumidosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosConsumidosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        produtosConsumidosPanelLayout.setVerticalGroup(
            produtosConsumidosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosConsumidosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        okButton.setText("OK");
        okButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout consultaVendasPanelLayout = new javax.swing.GroupLayout(consultaVendasPanel);
        consultaVendasPanel.setLayout(consultaVendasPanelLayout);
        consultaVendasPanelLayout.setHorizontalGroup(
            consultaVendasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaVendasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(consultaVendasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consultaVendasPanelLayout.createSequentialGroup()
                        .addComponent(consultarVendasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(consultaVendasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(consultaVendasPanelLayout.createSequentialGroup()
                                .addGap(0, 381, Short.MAX_VALUE)
                                .addComponent(okButton))
                            .addComponent(produtosConsumidosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(consultaVendasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        consultaVendasPanelLayout.setVerticalGroup(
            consultaVendasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaVendasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(consultaVendasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(consultaVendasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consultaVendasPanelLayout.createSequentialGroup()
                        .addComponent(produtosConsumidosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(okButton))
                    .addComponent(consultarVendasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(consultaVendasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(consultaVendasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseClicked
        dispose();
    }//GEN-LAST:event_okButtonMouseClicked

    private void vendasTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendasTableMouseClicked
        initProdutosVenda();
    }//GEN-LAST:event_vendasTableMouseClicked

    /**
    * @param args the command line arguments
    */
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuConsultaConta().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel consultaVendasLabel;
    private javax.swing.JPanel consultaVendasPanel;
    private javax.swing.JPanel consultarVendasPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton okButton;
    private javax.swing.JPanel produtosConsumidosPanel;
    private javax.swing.JTable produtosVendaTable;
    private javax.swing.JTable vendasTable;
    // End of variables declaration//GEN-END:variables

    private void initVendas() {
        final Vector<Vector<Object>> vendasVector = controleVenda.buscaTodasVendas();
        for (Vector<Object> vendaVector : vendasVector) {
            ((DefaultTableModel) vendasTable.getModel()).addRow(vendaVector);
        }
    }

    private void initProdutosVenda() {
        try {
            final Integer vendaIndex = vendasTable.convertRowIndexToModel(vendasTable.getSelectedRow());
            final Vector<Vector<Object>> vendasVector = ((DefaultTableModel) vendasTable.getModel()).getDataVector();
            final Vector<Object> vendaVector = vendasVector.get(vendaIndex);
            final DefaultTableModel produtosVendaModel = (DefaultTableModel) produtosVendaTable.getModel();
            
            limparProdutosVendaTable(produtosVendaModel);
            
            for (Vector<Object> produtoVendaVector : controleVenda.buscaProdutosVenda(vendaVector)) {
                produtosVendaModel.addRow(produtoVendaVector);
            }
        } catch (ParseException ex) {
            getLogger(MenuConsultaVendas.class.getName()).log(SEVERE, "Algo muito errado aconteceu. :(", ex);
        }
    }

    private void limparProdutosVendaTable(final DefaultTableModel produtosVendaModel) {
        while (produtosVendaModel.getRowCount() > 0) {
            produtosVendaModel.removeRow(0);
        }
    }

}
