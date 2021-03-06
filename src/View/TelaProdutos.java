/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Produto;
import Util.Converte;
import Util.Mascara;
import dao.ProdutoDAO;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tegon Faria
 */
public class TelaProdutos extends javax.swing.JFrame {

    Produto produto = new Produto();
    ProdutoDAO produtoDAO = new ProdutoDAO();
    ArrayList<Produto> listaProdutos = new ArrayList<>();
    
    public TelaProdutos() {
        initComponents();
        setMask();
        carregaProdutos();
        tfDescProd.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbBuscar = new javax.swing.JLabel();
        btBuscarCl = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btGravar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfDescProd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfMarcaProd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfQtdProd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfCodProd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfCustoProd = new javax.swing.JFormattedTextField();
        tfValorProd = new javax.swing.JFormattedTextField();
        tfBuscarProd = new javax.swing.JFormattedTextField();
        btLimpaPesquisa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setOpaque(false);

        lbBuscar.setText("Buscar:");

        btBuscarCl.setText("Buscar");
        btBuscarCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarClActionPerformed(evt);
            }
        });
        btBuscarCl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btBuscarClKeyPressed(evt);
            }
        });

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Produto", "Marca", "Custo", "Valor", "Quantidade"
            }
        ));
        tbProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProdutos);
        if (tbProdutos.getColumnModel().getColumnCount() > 0) {
            tbProdutos.getColumnModel().getColumn(0).setMinWidth(60);
            tbProdutos.getColumnModel().getColumn(0).setPreferredWidth(60);
            tbProdutos.getColumnModel().getColumn(0).setMaxWidth(60);
            tbProdutos.getColumnModel().getColumn(2).setMinWidth(90);
            tbProdutos.getColumnModel().getColumn(2).setPreferredWidth(90);
            tbProdutos.getColumnModel().getColumn(2).setMaxWidth(90);
            tbProdutos.getColumnModel().getColumn(3).setMinWidth(70);
            tbProdutos.getColumnModel().getColumn(3).setPreferredWidth(70);
            tbProdutos.getColumnModel().getColumn(3).setMaxWidth(70);
            tbProdutos.getColumnModel().getColumn(4).setMinWidth(70);
            tbProdutos.getColumnModel().getColumn(4).setPreferredWidth(70);
            tbProdutos.getColumnModel().getColumn(4).setMaxWidth(70);
            tbProdutos.getColumnModel().getColumn(5).setMinWidth(90);
            tbProdutos.getColumnModel().getColumn(5).setPreferredWidth(90);
            tbProdutos.getColumnModel().getColumn(5).setMaxWidth(90);
        }

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Mercadoria\n"));

        btGravar.setText("Gravar");
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });
        btGravar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btGravarKeyPressed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btDeletar.setText("Deletar");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        jLabel1.setText("Descri????o do Produto");

        tfDescProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfDescProdKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        jLabel2.setText("Marca");

        tfMarcaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMarcaProdActionPerformed(evt);
            }
        });
        tfMarcaProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfMarcaProdKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        jLabel4.setText("Custo");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        jLabel5.setText("Valor");

        tfQtdProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfQtdProdKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        jLabel6.setText("Quantidade");

        tfCodProd.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        jLabel7.setText("Codigo:");

        tfCustoProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCustoProdKeyPressed(evt);
            }
        });

        tfValorProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfValorProdKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(tfCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(tfMarcaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(170, 170, 170)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(tfCustoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(tfValorProd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(tfQtdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(tfDescProd)))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btGravar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btDeletar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDeletar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDescProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfMarcaProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfQtdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfValorProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCustoProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar)
                    .addComponent(tfCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        tfBuscarProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBuscarProdKeyPressed(evt);
            }
        });

        btLimpaPesquisa.setText("Limpa Pesquisa");
        btLimpaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpaPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbBuscar)
                        .addGap(4, 4, 4)
                        .addComponent(tfBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscarCl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimpaPesquisa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBuscar)
                    .addComponent(btBuscarCl)
                    .addComponent(tfBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpaPesquisa))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimpaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpaPesquisaActionPerformed
        tfBuscarProd.setText("");
        carregaProdutos();
    }//GEN-LAST:event_btLimpaPesquisaActionPerformed

    private void tfBuscarProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarProdKeyPressed

    }//GEN-LAST:event_tfBuscarProdKeyPressed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        limpa();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        deleta();
        carregaProdutos();
    }//GEN-LAST:event_btDeletarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        update();
        carregaProdutos();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btGravarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btGravarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            btGravar.doClick();
    }//GEN-LAST:event_btGravarKeyPressed

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        grava();
        carregaProdutos();
    }//GEN-LAST:event_btGravarActionPerformed

    private void tbProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutosMouseClicked
        String padrao = "##.##";
        DecimalFormat df = new DecimalFormat(padrao);
        int row = tbProdutos.getSelectedRow();
        int id = (int) tbProdutos.getValueAt(row, 0);
        produto = produtoDAO.findById(id);

        tfDescProd.setText(produto.getDescricao());
        tfMarcaProd.setText(produto.getMarca());
        tfCustoProd.setText(df.format(produto.getCusto()));
        tfValorProd.setText(df.format(produto.getValor()));
        tfQtdProd.setText(df.format(produto.getQuantidade()));
        tfCodProd.setText(String.valueOf(produto.getCodigo()));

    }//GEN-LAST:event_tbProdutosMouseClicked

    private void btBuscarClKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btBuscarClKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            btBuscarCl.doClick();
    }//GEN-LAST:event_btBuscarClKeyPressed

    private void btBuscarClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarClActionPerformed
        buscar();
    }//GEN-LAST:event_btBuscarClActionPerformed

    private void tfMarcaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMarcaProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMarcaProdActionPerformed

    private void tfDescProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDescProdKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tfMarcaProd.requestFocus();
        }
    }//GEN-LAST:event_tfDescProdKeyPressed

    private void tfMarcaProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMarcaProdKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tfCustoProd.requestFocus();
        }
    }//GEN-LAST:event_tfMarcaProdKeyPressed

    private void tfCustoProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCustoProdKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tfValorProd.requestFocus();
        }
    }//GEN-LAST:event_tfCustoProdKeyPressed

    private void tfValorProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfValorProdKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tfQtdProd.requestFocus();
        }
    }//GEN-LAST:event_tfValorProdKeyPressed

    private void tfQtdProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQtdProdKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            getRootPane().setDefaultButton(btGravar);
        }
    }//GEN-LAST:event_tfQtdProdKeyPressed

    private void setMask() {
        tfCustoProd.setFormatterFactory(Mascara.getValorMask());
        tfValorProd.setFormatterFactory(Mascara.getValorMask());
    }

    private void limpa() {
        tfDescProd.setText("");
        tfMarcaProd.setText("");
        tfCustoProd.setText("00,00");
        tfValorProd.setText("00,00");
        tfQtdProd.setText("");
        tfCodProd.setText("");
    }

    private void grava() {
        listaProdutos = (ArrayList<Produto>) produtoDAO.findByName(tfDescProd.getText());
        if (tfDescProd.getText().isEmpty() || tfCustoProd.getText().isEmpty() || tfValorProd.getText().isEmpty()
            || tfQtdProd.getText().isEmpty() || Integer.parseInt(tfQtdProd.getText())<0) {
            JOptionPane.showMessageDialog(rootPane, "Erro campos necessarios n??o preenchidos");
        } else if(listaProdutos.size()!= 0) {
            JOptionPane.showMessageDialog(rootPane, "Produto ja cadastrado");
        } else{
            String desc = tfDescProd.getText();
            String marca = tfMarcaProd.getText();
            double custo = Converte.textoToValue(tfCustoProd.getText());
            double valor = Converte.textoToValue(tfValorProd.getText());
            int qtd = Integer.parseInt(tfQtdProd.getText());
            if (dao.ProdutoDAO.getInstance().create(new Produto(desc, marca, qtd, custo, valor))) {
                JOptionPane.showMessageDialog(rootPane, "Sucesso");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro - Tente novamente");
            }
        }
        limpa();
    }

    private void buscar() {
        listaProdutos = (ArrayList<Produto>) produtoDAO.findByName(tfBuscarProd.getText());
        DefaultTableModel model = (DefaultTableModel) tbProdutos.getModel();
        model.setNumRows(0);
        for(Produto p: listaProdutos){
            model.addRow(new Object[]{
                p.getCodigo(),
                p.getDescricao(),
                p.getMarca(),
                p.getCusto(),
                p.getValor(),
                p.getQuantidade()
            });
            tbProdutos.setModel(model);
        }
    }

    private void deleta() {
        try{
            dao.ProdutoDAO.getInstance().delete(Integer.parseInt((String) tfCodProd.getText()));
            limpa();
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(rootPane, "N??o foi possivel realizar a opera????o");
        }
    }

    private void update() {
        if (tfDescProd.getText().isEmpty() || tfCustoProd.getText().isEmpty() || tfValorProd.getText().isEmpty()
                || tfQtdProd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Erro campos necessarios n??o preenchidos");
        }else {
            int cod = Integer.parseInt(tfCodProd.getText());
            String desc = tfDescProd.getText();
            String marca = tfMarcaProd.getText();
            double custo = Converte.textoToValue(tfCustoProd.getText());
            double preco = Converte.textoToValue(tfValorProd.getText());
            int qtd = Integer.parseInt(tfQtdProd.getText());
            Produto produto = new Produto(cod, desc, marca, qtd, custo, preco);
            dao.ProdutoDAO.getInstance().update(produto);
            limpa();
        }
    }

    private void carregaProdutos() {
        listaProdutos = (ArrayList<Produto>) produtoDAO.read();
        DefaultTableModel model = (DefaultTableModel) tbProdutos.getModel();
        model.setNumRows(0);
        for(Produto p: listaProdutos){
            model.addRow(new Object[]{
                p.getCodigo(),
                p.getDescricao(),
                p.getMarca(),
                p.getCusto(),
                p.getValor(),
                p.getQuantidade()
            });
            tbProdutos.setModel(model);
        }
    }

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
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btBuscarCl;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btLimpaPesquisa;
    private javax.swing.JButton btNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBuscar;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JFormattedTextField tfBuscarProd;
    private javax.swing.JTextField tfCodProd;
    private javax.swing.JFormattedTextField tfCustoProd;
    private javax.swing.JTextField tfDescProd;
    private javax.swing.JTextField tfMarcaProd;
    private javax.swing.JTextField tfQtdProd;
    private javax.swing.JFormattedTextField tfValorProd;
    // End of variables declaration//GEN-END:variables
}
