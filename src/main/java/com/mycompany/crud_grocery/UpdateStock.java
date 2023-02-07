/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.crud_grocery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class UpdateStock extends javax.swing.JPanel {

    /**
     * Creates new form UpdateStock
     */
    public UpdateStock() {
        initComponents();
           jPanelUpdateStock.setVisible(false);
        list();
    }
    
    public void list(){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRUD_Grocery","admin","admin");
            String s = "select * from stock"; 
            PreparedStatement st = con.prepareStatement(s);
            ResultSet rs=  st.executeQuery();          
            itemlist.addItem("Select");
            while(rs.next()){
                itemlist.addItem(rs.getString(2));
            }        
            itemlist.setSelectedIndex(0);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemname = new javax.swing.JLabel();
        itemcode = new javax.swing.JLabel();
        itemcode_name = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        updatestock_table = new javax.swing.JTable();
        updatestock = new javax.swing.JButton();
        jPanelUpdateStock = new javax.swing.JPanel();
        qty_value = new javax.swing.JTextField();
        Rate = new javax.swing.JLabel();
        rate_value = new javax.swing.JTextField();
        Quantity = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        upgrade = new javax.swing.JButton();
        getstock = new javax.swing.JButton();
        itemlist = new javax.swing.JComboBox<>();
        back = new javax.swing.JButton();

        itemname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        itemname.setText("Name :");

        itemcode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        itemcode.setText("Code :");

        itemcode_name.setEditable(false);
        itemcode_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        itemcode_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemcode_nameActionPerformed(evt);
            }
        });

        updatestock_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        updatestock_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        updatestock_table.setPreferredSize(new java.awt.Dimension(300, 30));
        updatestock_table.setRowHeight(30);
        jScrollPane2.setViewportView(updatestock_table);

        updatestock.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updatestock.setText("Update Stock");
        updatestock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatestockActionPerformed(evt);
            }
        });

        jPanelUpdateStock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        qty_value.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qty_value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty_valueActionPerformed(evt);
            }
        });
        jPanelUpdateStock.add(qty_value, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 1, 160, 30));

        Rate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Rate.setText("Rate       :");
        jPanelUpdateStock.add(Rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, 30));

        rate_value.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rate_value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rate_valueActionPerformed(evt);
            }
        });
        jPanelUpdateStock.add(rate_value, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 160, 30));

        Quantity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Quantity.setText("Quantity :");
        jPanelUpdateStock.add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 30));

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton2.setText("GET STOCK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelUpdateStock.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 165, 230, 50));

        upgrade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        upgrade.setText("Upgrade");
        upgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upgradeActionPerformed(evt);
            }
        });
        jPanelUpdateStock.add(upgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 100, 30));

        getstock.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getstock.setText("Get Stock");
        getstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getstockActionPerformed(evt);
            }
        });

        itemlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemlistActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(242, 242, 242));
        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setText("<- Back");
        back.setActionCommand("CLOSE");
        back.setBorder(null);
        back.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelUpdateStock, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(getstock, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(itemname)
                                        .addGap(16, 16, 16)
                                        .addComponent(itemlist, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(itemcode)
                                        .addGap(28, 28, 28)
                                        .addComponent(itemcode_name, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(updatestock, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemlist, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(itemname)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(getstock)
                            .addComponent(updatestock))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jPanelUpdateStock, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemcode_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(itemcode)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void itemcode_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemcode_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemcode_nameActionPerformed

    private void updatestockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatestockActionPerformed
        jPanelUpdateStock.setVisible(true);
        Quantity.setVisible(true);
        Rate.setVisible(true);
        qty_value.setVisible(true);
        rate_value.setVisible(true);
        upgrade.setVisible(true);
    }//GEN-LAST:event_updatestockActionPerformed

    private void qty_valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty_valueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qty_valueActionPerformed

    private void rate_valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rate_valueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rate_valueActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void upgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upgradeActionPerformed
        try{
            int q=0;
            float r=0;
            DefaultTableModel model;
            model = (DefaultTableModel) updatestock_table.getModel();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CRUD_Grocery","admin","admin");
            String sr="select * from stock where Item_Name=? ";
            PreparedStatement str = con.prepareStatement(sr);
            if(itemlist.getSelectedIndex()==0)
            {JOptionPane.showMessageDialog(this, "Please Enter Item Properly");}
            else{
                String y=(String) itemlist.getSelectedItem();
                str.setString(1,y);
                ResultSet rs=  str.executeQuery();
                if(rs.next()){
                    q=rs.getInt(4);
                }
                String s="update Product set Rate=?,Quantity=? where Item_Name=?";
                PreparedStatement st=con.prepareStatement(s);
                String rate=(String) rate_value.getText();
                String qty=(String) qty_value.getText();
                String x= (String) itemlist.getSelectedItem();
                int qt=Integer.parseInt(qty);
                qt=qt+q;
                if("".equals(rate) || "".equals(qty))
                JOptionPane.showMessageDialog(this, "Please Enter Item Properly");
                else{
                    st.setString(1,rate);
                    st.setString(2,Integer.toString(qt));
                    st.setString(3, x);
                    Frame=new JFrame("Cancel");
                    if(JOptionPane.showConfirmDialog(Frame,"Confirm you want to update stock?", "Grocery Store", JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION ){
                        st.execute();
                        JOptionPane.showMessageDialog(this, "Stock Updated!");
                    }
                    model.setValueAt(Float.parseFloat(rate),0,2);
                    model.setValueAt(qt,0,3);}
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        qty_value.setText("");
        rate_value.setText("");
    }//GEN-LAST:event_upgradeActionPerformed

    private void getstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getstockActionPerformed
        if(itemlist.getSelectedIndex()>0){
            float rate=0;;
            int code,quan=0;
            try {
                DefaultTableModel model;
                model = (DefaultTableModel) updatestock_table.getModel();
                //modelpri = (DefaultTableModel) pri.billtable.getModel();
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRUD_Grocery","admin","admin");
                String x= (String) itemlist.getSelectedItem();
                String s="SELECT * FROM Product WHERE Item_Name=?";
                PreparedStatement st = con.prepareStatement(s);
                st.setString(1, x);
                ResultSet rs = st.executeQuery();
                if(model.getRowCount()>0)
                model.removeRow(0);
                if(rs.next()){
                    rate=rs.getFloat(3);
                    quan =rs.getInt(4);
                    code= rs.getInt(1);
                    model.addRow(new Object[]{code,itemlist.getSelectedItem(),rate,quan});
                    itemcode_name.setText(Integer.toString(code));
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Not Found");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Please Enter Item Properly");
        }

        //itemlist.setSelectedIndex(0);        // TODO add your handling code here:
    }//GEN-LAST:event_getstockActionPerformed

    private void itemlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemlistActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_itemlistActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Frame=new JFrame("Close");
        if(JOptionPane.showConfirmDialog(Frame,"Confirm if you want to close?", "Departmental Store", JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION )
        {  Stock SS = new Stock();
            SS.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_backActionPerformed

    private JFrame Frame;
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
            java.util.logging.Logger.getLogger(Update_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Quantity;
    private javax.swing.JLabel Rate;
    private javax.swing.JButton back;
    private javax.swing.JButton getstock;
    private javax.swing.JLabel itemcode;
    private javax.swing.JTextField itemcode_name;
    private javax.swing.JComboBox<String> itemlist;
    private javax.swing.JLabel itemname;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanelUpdateStock;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField qty_value;
    private javax.swing.JTextField rate_value;
    private javax.swing.JButton updatestock;
    private javax.swing.JTable updatestock_table;
    private javax.swing.JButton upgrade;
    // End of variables declaration//GEN-END:variables
}
