/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.inventorymanagementsystem;

/**
    
 * @author Admin
 */
public class main extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(main.class.getName());


    ItemManagement a = new ItemManagement();
    Supplier b = new Supplier();
    setting c = new setting();
   public main(String role) {
       
       
            initComponents();
            
        
        this.getContentPane().add(a);
        this.getContentPane().add(b);
        this.getContentPane().add(c);
        this.getContentPane().setLayout(null);
        dashboard_counts();
        
       a.setBounds(180, 0, 1050, 660);
       b.setBounds(180,  0,   1200,   750); 
       c.setBounds(180, 0, 1200, 750); 
        
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        setWelcomeVisible(true);
        
    
        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        
         if(role.equalsIgnoreCase("User")) {
        c.setVisible(false); 
    } else {
        c.setVisible(false);  
    }
  timer.setEditor(new javax.swing.JSpinner.DateEditor(timer, "hh:mm:ss a"));


javax.swing.Timer liveClock = new javax.swing.Timer(1000, new java.awt.event.ActionListener() {
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        
        timer.setValue(new java.util.Date());
    }
});
liveClock.start();
        }
    

   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btndashbord1 = new javax.swing.JButton();
        btnItemManagement = new javax.swing.JButton();
        btnSuppliers = new javax.swing.JButton();
        btnbill = new javax.swing.JButton();
        totalproduct = new javax.swing.JLabel();
        totalsuplier = new javax.swing.JLabel();
        Lowstock = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        timer = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel6.setFont(new java.awt.Font("Thibus29STru", 1, 70)); // NOI18N
        jLabel6.setText("Welcome");

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Inventory Management System");

        jLabel8.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel8.setText("Total Products:");

        jLabel10.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel10.setText("Suppliers:");

        jLabel2.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel2.setText("Low Stock Items:");

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btndashbord1.setBackground(new java.awt.Color(153, 255, 51));
        btndashbord1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computer.png"))); // NOI18N
        btndashbord1.setText("Dashboard");
        btndashbord1.setToolTipText("");
        btndashbord1.addActionListener(this::btndashbord1ActionPerformed);

        btnItemManagement.setBackground(new java.awt.Color(255, 51, 204));
        btnItemManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventory.png"))); // NOI18N
        btnItemManagement.setText("Item Management");
        btnItemManagement.addActionListener(this::btnItemManagementActionPerformed);

        btnSuppliers.setBackground(new java.awt.Color(255, 255, 102));
        btnSuppliers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/people.png"))); // NOI18N
        btnSuppliers.setText("Suppliers");
        btnSuppliers.addActionListener(this::btnSuppliersActionPerformed);

        btnbill.setBackground(new java.awt.Color(51, 255, 51));
        btnbill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/process.png"))); // NOI18N
        btnbill.setText("Settings");
        btnbill.addActionListener(this::btnbillActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnItemManagement, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                    .addComponent(btndashbord1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSuppliers, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(btnbill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btndashbord1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btnItemManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnbill, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        totalproduct.setBackground(new java.awt.Color(102, 255, 102));
        totalproduct.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        totalproduct.setForeground(new java.awt.Color(0, 204, 0));
        totalproduct.setText("Deneth");

        totalsuplier.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        totalsuplier.setForeground(new java.awt.Color(0, 51, 204));
        totalsuplier.setText("Deneth");

        Lowstock.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        Lowstock.setForeground(new java.awt.Color(255, 0, 0));
        Lowstock.setText("Deneth");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hardware (1).jpg"))); // NOI18N

        timer.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        timer.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.AM_PM));
        timer.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        timer.setFocusCycleRoot(true);

        jLabel3.setBackground(new java.awt.Color(0, 255, 51));
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Deneth Software's");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(timer, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(398, 398, 398)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(totalsuplier, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lowstock, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(611, 611, 611))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timer, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addGap(32, 32, 32)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalsuplier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Lowstock))
                .addGap(193, 193, 193))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        timer.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndashbord1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndashbord1ActionPerformed
      a.setVisible(false);
        b.setVisible(false);
          c.setVisible(false);
        setWelcomeVisible(true);                                               
        this.setSize(1000, 800);
        this.setLocationRelativeTo(null);

    
    }//GEN-LAST:event_btndashbord1ActionPerformed

    private void btnItemManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemManagementActionPerformed
                                                          
      setWelcomeVisible(false);
        b.setVisible(false);
        
        a.setVisible(true);
         c.setVisible(false);
        this.setSize(1000, 700);
         this.setLocationRelativeTo(null);
        this.getContentPane().repaint();
    }//GEN-LAST:event_btnItemManagementActionPerformed

    private void btnSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppliersActionPerformed
    setWelcomeVisible(false);
        a.setVisible(false);
        
        b.setVisible(true);
          c.setVisible(false);
        this.setSize(1300, 600);
        this.setLocationRelativeTo(null);       
                
        this.getContentPane().repaint(); 
    }//GEN-LAST:event_btnSuppliersActionPerformed

    private void btnbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbillActionPerformed
       setWelcomeVisible(false);
        a.setVisible(false);
        
        b.setVisible(false);
        c.setVisible(true);
        
        this.setSize(600,500);
        this.setLocationRelativeTo(null);       
        c.revalidate();     
        this.getContentPane().repaint();  // TODO add your handling code here:
    }//GEN-LAST:event_btnbillActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            
            javax.swing.JFrame frame = new javax.swing.JFrame("Inventory Mangement System");
            frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            
            main mainContent = new main("Admin");
            frame.add(mainContent);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    
        
       java.awt.EventQueue.invokeLater(() -> new main("Admin").setVisible(true));
    }
    private void setWelcomeVisible(boolean visible) {
        jLabel6.setVisible(visible);
        jLabel7.setVisible(visible);  
        jLabel8.setVisible(visible);  
        jLabel10.setVisible(visible); 
        jLabel2.setVisible(visible);  
        totalproduct.setVisible(visible);
        totalsuplier.setVisible(visible);
        Lowstock.setVisible(visible);
        jLabel1.setVisible(visible);
        timer.setVisible(visible);
  
    // End of variables declaration       
        //
       
    }
    public void dashboard_counts() {
    try {
        
        java.sql.Connection con = db.mycon();
        java.sql.Statement s = con.createStatement();
        
    
        java.sql.ResultSet rs1 = s.executeQuery("SELECT COUNT(*) FROM items");
        if(rs1.next()) {
            int prodCount = rs1.getInt(1);
            totalproduct.setText(String.valueOf(prodCount));
        }
        
        
        java.sql.ResultSet rs2 = s.executeQuery("SELECT COUNT(*) FROM suppliers");
        if(rs2.next()) {
            int supCount = rs2.getInt(1);
            totalsuplier.setText(String.valueOf(supCount));
        }
        
      
        java.sql.ResultSet rs3 = s.executeQuery("SELECT COUNT(*) FROM items WHERE qty <= 5");
        if(rs3.next()) {
            int lowCount = rs3.getInt(1);
            Lowstock.setText(String.valueOf(lowCount));
        }
        
    } catch (java.sql.SQLException e) {
        System.out.println("Dashboard Count Error: " + e.getMessage());
        javax.swing.JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
    }
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lowstock;
    private javax.swing.JButton btnItemManagement;
    private javax.swing.JButton btnSuppliers;
    private javax.swing.JButton btnbill;
    private javax.swing.JButton btndashbord1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner timer;
    private javax.swing.JLabel totalproduct;
    private javax.swing.JLabel totalsuplier;
    // End of variables declaration//GEN-END:variables
}
