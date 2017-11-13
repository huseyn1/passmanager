package main;

import DAO.MethodDao;
import Utils.AES;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.PassManagerModel;


public class Run extends javax.swing.JFrame {

//    public static Cipher ecipher;
//    public static Cipher dcipher;
//    public static SecretKey key;
   
    final String secretKey = "myKey";

    public Run() {
        
        initComponents();
        show_table();
        
        }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        descInput = new javax.swing.JTextField();
        desc = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        topWord = new javax.swing.JLabel();
        passInput = new javax.swing.JPasswordField();
        descinfo = new javax.swing.JLabel();
        nameinfo = new javax.swing.JLabel();
        passinfo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablepass = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        descInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descinput(evt);
            }
        });

        desc.setText("DESC");

        name.setText("NAME");

        nameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInput(evt);
            }
        });

        jLabel3.setText("PASSWORD");

        addButton.setText("add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        topWord.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        topWord.setForeground(new java.awt.Color(255, 255, 255));
        topWord.setText("PASSWORD MANAGER PROGRAM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(topWord, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(topWord, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        passInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passInput(evt);
            }
        });

        descinfo.setText("Insert you Description");

        nameinfo.setText("Insert your name");

        passinfo.setText("Insert your password");

        jButton1.setText("reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTablepass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DESC", "NAME", "PASWWORD"
            }
        ));
        jTablepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablepassMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTablepass);

        jLabel1.setText("For show encrypted password click the line please");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(name)
                                    .addComponent(desc)
                                    .addComponent(descInput, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(nameInput)
                                    .addComponent(passInput))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descinfo)
                                    .addComponent(nameinfo)
                                    .addComponent(passinfo)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addButton)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(desc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descinfo))
                        .addGap(18, 18, 18)
                        .addComponent(name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameinfo))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passinfo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descinput(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descinput

    }//GEN-LAST:event_descinput

    private void passInput(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passInput

    }//GEN-LAST:event_passInput

    
    public void show_table(){
    
        MethodDao dao=new MethodDao();
        List<PassManagerModel> list=dao.showData();
        DefaultTableModel tableModel= (DefaultTableModel) jTablepass.getModel();
        
        for (PassManagerModel model : list ){
        
            tableModel.addRow(new Object[]{model.getDesc(),model.getName(),model.getPassword()});
        }
             
    }
    
    public void clear_table(){
    
         MethodDao dao=new MethodDao();
        List<PassManagerModel> list=dao.showData();
        DefaultTableModel tableModel= (DefaultTableModel) jTablepass.getModel();
        tableModel.setRowCount(0);
   
    }
    


    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        String desc1=descInput.getText();
        String pass1=passInput.getText();
        String name1=nameInput.getText();
        String encryptPassword=AES.encrypt(pass1, secretKey) ;
        String descfromdb="";
        String namefromdb="";
        MethodDao dao=new MethodDao();
        List<PassManagerModel> list=dao.showData();
        
         for (PassManagerModel model : list ){
        
           descfromdb=model.getDesc();
           namefromdb=model.getName();
         }
        
        if (pass1.equals("")){
        JOptionPane.showMessageDialog(null, "password xanasi doldurulmalidir");
        }
        else if(desc1.equals(descfromdb) || name1.equals(namefromdb)){
            
                JOptionPane.showMessageDialog(null, "Melumat tekrarlana bilmez");

        
        }
        else{

        PassManagerModel model=new PassManagerModel(desc1, name1, encryptPassword);
        MethodDao insertDao=new MethodDao();
        boolean isInserted=insertDao.insertData(model);
        if (isInserted==true){
            
            JOptionPane.showMessageDialog(null, "melumatlarin daxil edilmesi ugurla basa catdi");
            clear_table();
            show_table();

            System.out.println("daxil olma ugurlu oldu");
        }
        else{
        
            JOptionPane.showMessageDialog(null, "siz evvel daxil olmus deyeri yeniden daxil ede bilmezsiniz");
            System.out.println("daxil olmada xeta var");
        }
        
        }
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void nameInput(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInput
      //AD YAZMAQ YERI BURDADI
    }//GEN-LAST:event_nameInput

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        descInput.setText("");
        passInput.setText("");
        nameInput.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTablepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablepassMouseClicked

        int index=jTablepass.getSelectedRow();
        TableModel model=jTablepass.getModel();
        String password=(String) model.getValueAt(index, 2);
        
        String decryptedString = AES.decrypt(password, secretKey) ;
       JOptionPane.showMessageDialog(null,decryptedString);
        
//        try {
//            key = KeyGenerator.getInstance("DES").generateKey();
//            dcipher = Cipher.getInstance("DES");
//            dcipher.init(Cipher.DECRYPT_MODE, key);
//            String decrypted = decrypt(password);
//            
//            JOptionPane.showMessageDialog(null, decrypted);
//
//        } catch (NoSuchAlgorithmException ex) {
//
//          ex.printStackTrace();
//            
//        } catch (NoSuchPaddingException ex) {
//          ex.printStackTrace();
//
//        } catch (InvalidKeyException ex) {
//          ex.printStackTrace();
//
//        }

        
    }//GEN-LAST:event_jTablepassMouseClicked

    
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
            java.util.logging.Logger.getLogger(Run.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Run.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Run.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Run.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Run().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel desc;
    private javax.swing.JTextField descInput;
    private javax.swing.JLabel descinfo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablepass;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameinfo;
    private javax.swing.JPasswordField passInput;
    private javax.swing.JLabel passinfo;
    private javax.swing.JLabel topWord;
    // End of variables declaration//GEN-END:variables

  
}
