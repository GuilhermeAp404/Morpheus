/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Util.Mascara;
import Model.Cliente;
import dao.ClienteDAO;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tegon Faria
 */
public class TelaCliente extends javax.swing.JFrame {

    Cliente cliente = new Cliente();
    ClienteDAO clienteDAO = new ClienteDAO();
    ArrayList<Cliente> listaCliente = new ArrayList<>();
    
    public TelaCliente() {
        initComponents();
        setMask();
        carregaCliente();
        tfNomeCl.requestFocus();
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
        tbCliente = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbNomeCl = new javax.swing.JLabel();
        tfNomeCl = new javax.swing.JTextField();
        lbCPFcl = new javax.swing.JLabel();
        tfCPFCl = new javax.swing.JFormattedTextField();
        tfCelularCl = new javax.swing.JFormattedTextField();
        lbCelCl = new javax.swing.JLabel();
        tfDnCl = new javax.swing.JFormattedTextField();
        lbDnCl = new javax.swing.JLabel();
        tfDrCl = new javax.swing.JFormattedTextField();
        lbDrCl = new javax.swing.JLabel();
        tfEmailCl = new javax.swing.JFormattedTextField();
        lbEmailCl = new javax.swing.JLabel();
        btGravarCl = new javax.swing.JButton();
        btAlterarCl = new javax.swing.JButton();
        btDeletarcl = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        tfBuscarCl = new javax.swing.JFormattedTextField();
        btLimpaPesquisa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        tbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Cliente", "CPF", "Data Registro", "Data Nascimento", "Celular", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCliente);
        if (tbCliente.getColumnModel().getColumnCount() > 0) {
            tbCliente.getColumnModel().getColumn(1).setMinWidth(100);
            tbCliente.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbCliente.getColumnModel().getColumn(1).setMaxWidth(100);
            tbCliente.getColumnModel().getColumn(2).setMinWidth(90);
            tbCliente.getColumnModel().getColumn(2).setPreferredWidth(90);
            tbCliente.getColumnModel().getColumn(2).setMaxWidth(90);
            tbCliente.getColumnModel().getColumn(3).setMinWidth(95);
            tbCliente.getColumnModel().getColumn(3).setPreferredWidth(95);
            tbCliente.getColumnModel().getColumn(3).setMaxWidth(95);
            tbCliente.getColumnModel().getColumn(4).setMinWidth(110);
            tbCliente.getColumnModel().getColumn(4).setPreferredWidth(110);
            tbCliente.getColumnModel().getColumn(4).setMaxWidth(110);
            tbCliente.getColumnModel().getColumn(5).setMinWidth(160);
            tbCliente.getColumnModel().getColumn(5).setPreferredWidth(160);
            tbCliente.getColumnModel().getColumn(5).setMaxWidth(160);
        }

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        lbNomeCl.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        lbNomeCl.setText("Nome");

        tfNomeCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeClActionPerformed(evt);
            }
        });
        tfNomeCl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNomeClKeyPressed(evt);
            }
        });

        lbCPFcl.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        lbCPFcl.setText("CPF");

        tfCPFCl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCPFClKeyPressed(evt);
            }
        });

        tfCelularCl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCelularClKeyPressed(evt);
            }
        });

        lbCelCl.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        lbCelCl.setText("Celular");

        tfDnCl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfDnClKeyPressed(evt);
            }
        });

        lbDnCl.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        lbDnCl.setText("Data de Nascimento");

        tfDrCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDrClActionPerformed(evt);
            }
        });
        tfDrCl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfDrClKeyPressed(evt);
            }
        });

        lbDrCl.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        lbDrCl.setText("Data Registro");

        tfEmailCl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfEmailClKeyPressed(evt);
            }
        });

        lbEmailCl.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        lbEmailCl.setText("E-mail");

        btGravarCl.setText("Gravar");
        btGravarCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarClActionPerformed(evt);
            }
        });
        btGravarCl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btGravarClKeyPressed(evt);
            }
        });

        btAlterarCl.setText("Alterar");
        btAlterarCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarClActionPerformed(evt);
            }
        });

        btDeletarcl.setText("Deletar");
        btDeletarcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarclActionPerformed(evt);
            }
        });

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNomeCl)
                            .addComponent(tfNomeCl, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCPFcl)
                            .addComponent(tfCPFCl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCelCl)
                            .addComponent(tfCelularCl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEmailCl)
                            .addComponent(tfEmailCl, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDnCl)
                            .addComponent(tfDnCl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDrCl)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(tfDrCl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(btGravarCl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btDeletarcl, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btAlterarCl, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbNomeCl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNomeCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbCPFcl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCPFCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbCelCl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCelularCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbEmailCl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEmailCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDnCl)
                            .addComponent(lbDrCl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btAlterarCl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btDeletarcl))
                            .addComponent(btGravarCl)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfDnCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfDrCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNovo)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        tfBuscarCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuscarClActionPerformed(evt);
            }
        });
        tfBuscarCl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBuscarClKeyPressed(evt);
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
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbBuscar)
                        .addGap(4, 4, 4)
                        .addComponent(tfBuscarCl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btBuscarCl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimpaPesquisa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBuscar)
                    .addComponent(btBuscarCl)
                    .addComponent(tfBuscarCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpaPesquisa))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeClActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeClActionPerformed

    private void btAlterarClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarClActionPerformed
        update();
        carregaCliente();
    }//GEN-LAST:event_btAlterarClActionPerformed

    private void btDeletarclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarclActionPerformed
        delete();
        carregaCliente();
    }//GEN-LAST:event_btDeletarclActionPerformed

    private void tfDrClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDrClActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDrClActionPerformed

    private void btGravarClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarClActionPerformed
        grava();
        carregaCliente();
    }//GEN-LAST:event_btGravarClActionPerformed

    private void btBuscarClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarClActionPerformed
        busca();
    }//GEN-LAST:event_btBuscarClActionPerformed

    private void tfBuscarClKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBuscarClKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            getRootPane().setDefaultButton(btBuscarCl);
            btBuscarClKeyPressed(evt);
        }
    }//GEN-LAST:event_tfBuscarClKeyPressed

    private void btBuscarClKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btBuscarClKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btBuscarCl.doClick();
        }
    }//GEN-LAST:event_btBuscarClKeyPressed

    private void tfNomeClKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeClKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            tfCPFCl.requestFocus();
    }//GEN-LAST:event_tfNomeClKeyPressed

    private void tfCPFClKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCPFClKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            tfCelularCl.requestFocus();
    }//GEN-LAST:event_tfCPFClKeyPressed

    private void tfCelularClKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCelularClKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            tfEmailCl.requestFocus();
    }//GEN-LAST:event_tfCelularClKeyPressed

    private void tfEmailClKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEmailClKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            tfDnCl.requestFocus();
    }//GEN-LAST:event_tfEmailClKeyPressed

    private void tfDnClKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDnClKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            tfDrCl.requestFocus();
    }//GEN-LAST:event_tfDnClKeyPressed

    private void tfDrClKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDrClKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            getRootPane().setDefaultButton(btGravarCl);
        }
    }//GEN-LAST:event_tfDrClKeyPressed

    private void btGravarClKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btGravarClKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            btGravarCl.doClick();
    }//GEN-LAST:event_btGravarClKeyPressed

    private void tbClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClienteMouseClicked
        int row = tbCliente.getSelectedRow();
        tfNomeCl.setText((String) tbCliente.getValueAt(row, 0));
        tfCPFCl.setText((String) tbCliente.getValueAt(row, 1));
        tfCelularCl.setText((String) tbCliente.getValueAt(row, 4));
        tfEmailCl.setText((String) tbCliente.getValueAt(row, 5));
        tfDnCl.setText((String) tbCliente.getValueAt(row, 3));
        tfDrCl.setText((String) tbCliente.getValueAt(row, 2));
    }//GEN-LAST:event_tbClienteMouseClicked

    private void btLimpaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpaPesquisaActionPerformed
        tfBuscarCl.setText("");
        carregaCliente();
    }//GEN-LAST:event_btLimpaPesquisaActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        limpa();
    }//GEN-LAST:event_btNovoActionPerformed

    private void tfBuscarClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuscarClActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuscarClActionPerformed

    private void setMask() {
        tfCelularCl.setFormatterFactory(Mascara.getCelMask());
        tfDnCl.setFormatterFactory(Mascara.getDataMask());
        tfDrCl.setFormatterFactory(Mascara.getDataMask());
        tfCPFCl.setFormatterFactory(Mascara.getCpfMask());
        tfBuscarCl.setFormatterFactory(Mascara.getCpfMask());
    }

    private void limpa() {
        tfNomeCl.setText("");
        tfCPFCl.setText("");
        tfDrCl.setText("");
        tfDnCl.setText("");
        tfEmailCl.setText("");
        tfCelularCl.setText("");
        tfNomeCl.requestFocus();
    }

    private void grava() {
        if (tfNomeCl.getText().isEmpty() || tfCPFCl.getText().isEmpty() || tfDrCl.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Erro - Campos necessários não preenchidos");
        } else {
            String nome = tfNomeCl.getText();
            String cpf = tfCPFCl.getText();
            String cel = tfCelularCl.getText();
            String email = tfEmailCl.getText();
            String d_nascimento = tfDnCl.getText();
            String d_registro = tfDrCl.getText();
            if (ClienteDAO.getInstance().create(new Cliente(nome, email, cpf, d_nascimento, cel, d_registro))) {
                JOptionPane.showMessageDialog(rootPane, "Sucesso");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Falhou - Tente Novamente");
            }
        }
        limpa();
    }

    private void update() {
        if (tfNomeCl.getText().isEmpty() || tfCPFCl.getText().isEmpty() || tfDrCl.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Existe algum campo vazio");
        } else {
            String nome = tfNomeCl.getText();
            String cpf = tfCPFCl.getText();
            String celular = tfCelularCl.getText();
            String data_nascimento = tfDnCl.getText();
            String data_registro = tfDrCl.getText();
            String email = tfEmailCl.getText();
            Cliente c = new Cliente(nome, email, cpf, data_nascimento, celular, data_registro);
            dao.ClienteDAO.getInstance().update(c);
            limpa();
        }

    }

    private void delete() {
        if(tfCPFCl.getText().equals("___.___.___-__")){
            JOptionPane.showMessageDialog(rootPane, "Não foi possivel executar essa função");
        }else{
            dao.ClienteDAO.getInstance().delete(tfCPFCl.getText());
            limpa();
        }
    }

    private void busca() {
        cliente = clienteDAO.find(tfBuscarCl.getText());
        DefaultTableModel model = (DefaultTableModel) tbCliente.getModel();
        
        model.setNumRows(0);
        
        model.addRow(new Object[]{
            cliente.getNome(),
            cliente.getCpf(),
            cliente.getData_registro(),
            cliente.getData_nascimento(),
            cliente.getCelular(),
            cliente.getEmail()
        });
    }

    private void carregaCliente() {
        listaCliente = (ArrayList<Cliente>) clienteDAO.read();
        DefaultTableModel model = (DefaultTableModel) tbCliente.getModel();
        
        model.setNumRows(0);
        
        for(Cliente cl: listaCliente){
            model.addRow(new Object[]{
                cl.getNome(),
                cl.getCpf(),
                cl.getData_registro(),
                cl.getData_nascimento(),
                cl.getCelular(),
                cl.getEmail()
            });
        }
    }

    private DefaultTableModel getTableModel(List<Cliente> lista) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("Data Registro");
        modelo.addColumn("Data Nascimento");
        modelo.addColumn("Celular");
        modelo.addColumn("Email");
        for (Cliente c : lista) {
            String[] reg = {c.getNome(), c.getCpf(), c.getData_registro(), c.getData_nascimento(), c.getCelular(), c.getEmail()};
            modelo.addRow(reg);
        }
        return modelo;
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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarCl;
    private javax.swing.JButton btBuscarCl;
    private javax.swing.JButton btDeletarcl;
    private javax.swing.JButton btGravarCl;
    private javax.swing.JButton btLimpaPesquisa;
    private javax.swing.JButton btNovo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBuscar;
    private javax.swing.JLabel lbCPFcl;
    private javax.swing.JLabel lbCelCl;
    private javax.swing.JLabel lbDnCl;
    private javax.swing.JLabel lbDrCl;
    private javax.swing.JLabel lbEmailCl;
    private javax.swing.JLabel lbNomeCl;
    private javax.swing.JTable tbCliente;
    private javax.swing.JFormattedTextField tfBuscarCl;
    private javax.swing.JFormattedTextField tfCPFCl;
    private javax.swing.JFormattedTextField tfCelularCl;
    private javax.swing.JFormattedTextField tfDnCl;
    private javax.swing.JFormattedTextField tfDrCl;
    private javax.swing.JFormattedTextField tfEmailCl;
    private javax.swing.JTextField tfNomeCl;
    // End of variables declaration//GEN-END:variables
}