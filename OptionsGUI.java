package foodbook;

import java.awt.Component;
import java.io.File;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Michał Mierzwa
 * 
 */
public class OptionsGUI extends javax.swing.JFrame {

    public OptionsGUI() {
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);              
        setLocationRelativeTo(null);
        setResizable(false);
        
        initComponents();
        
        setBounds(FoodBook.getRectangle());
        setVisible(true);
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        
        disablePanels();
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonCloseWindow = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelSaveData = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        labelCreateBackup = new javax.swing.JLabel();
        buttonCreateBackup = new javax.swing.JButton();
        labelLoadBackup = new javax.swing.JLabel();
        buttonLoadBackup = new javax.swing.JButton();
        labelBackup = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelSaveToDatabase = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFieldAdres = new javax.swing.JTextField();
        textFieldLogin = new javax.swing.JTextField();
        textFieldHaslo = new javax.swing.JTextField();
        buttonSaveConf = new javax.swing.JButton();
        labelTestConn = new javax.swing.JLabel();
        buttonTestConn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelIngreList = new javax.swing.JLabel();
        labelAvailIngr = new javax.swing.JLabel();
        comboBoxIngredients = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonCloseWindow.setText("Zamknij");
        buttonCloseWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseWindowActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        labelSaveData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelSaveData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSaveData.setText("Sposób zapisu danych:");
        labelSaveData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jRadioButton1.setText("Zapisz do pliku");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Zapisz do bazy danych:");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSaveData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSaveData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        labelCreateBackup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCreateBackup.setForeground(new java.awt.Color(255, 0, 0));
        labelCreateBackup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCreateBackup.setText("Utwórz kopię zapasową");

        buttonCreateBackup.setText("Kopiuj do pliku");
        buttonCreateBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateBackupActionPerformed(evt);
            }
        });

        labelLoadBackup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLoadBackup.setForeground(new java.awt.Color(255, 0, 0));
        labelLoadBackup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLoadBackup.setText("Wczytaj kopię zapasową");

        buttonLoadBackup.setText("Wczytaj z pliku");
        buttonLoadBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoadBackupActionPerformed(evt);
            }
        });

        labelBackup.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelBackup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBackup.setText("Konfiguracja kopii zapasowej:");
        labelBackup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelBackup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLoadBackup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCreateBackup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCreateBackup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelLoadBackup, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBackup)
                .addGap(18, 18, 18)
                .addComponent(labelCreateBackup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCreateBackup)
                .addGap(18, 18, 18)
                .addComponent(labelLoadBackup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonLoadBackup)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        labelSaveToDatabase.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelSaveToDatabase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSaveToDatabase.setText("Konfiguracja baz danych:");
        labelSaveToDatabase.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Adres:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Login:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Hasło:");

        textFieldAdres.setText("Podaj adres bazy danych");

        textFieldLogin.setText("Podaj login");

        textFieldHaslo.setText("Podaj Haslo");

        buttonSaveConf.setText("Save");

        labelTestConn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelTestConn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTestConn.setText("Testuj połączenie z DB");

        buttonTestConn.setText("Test");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Save DB configuration");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSaveToDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTestConn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldAdres, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(textFieldLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldHaslo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonTestConn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonSaveConf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSaveToDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldAdres))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldHaslo))
                .addGap(8, 8, 8)
                .addComponent(labelTestConn, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonTestConn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSaveConf)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelIngreList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelIngreList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIngreList.setText("Modyfikacja listy składników");
        labelIngreList.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        labelAvailIngr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAvailIngr.setText("Wszystkie dostępne składniki:");

        comboBoxIngredients.setMaximumRowCount(10);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAvailIngr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelIngreList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(comboBoxIngredients, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIngreList, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelAvailIngr, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxIngredients, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCloseWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(345, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonCloseWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCreateBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateBackupActionPerformed
        // Check if the backup file already exists...
        File f = new File("allRecipesBACKUP.ser");
        
       // if it does...
        if(f.exists() && !f.isDirectory()) {
            // ask what do we do next...
            int reply = JOptionPane.showConfirmDialog(null, "Czy na pewno chcesz zastąpić poprzednią wersję kopii zapasowej?", "Wykonywanie backup przepisow...", JOptionPane.YES_NO_OPTION);           
            
            //if u say yes...
            if (reply == JOptionPane.YES_OPTION) {
                // overwrite new backup...
                RecipeIO.createBackupList();
                // and show dialog
                JOptionPane.showMessageDialog(null, "Zaktualizowano kopię zapasową wszystkich przepisów");
            }
            // else close the window and do nothing...
            else {
                System.out.println("Anulowano tworzenie kopii zapasowej");    
            }              
        }
        // if the file does not exist, create backup file right away...
        else{
            RecipeIO.createBackupList();
        }
        
        
        
        
        
    }//GEN-LAST:event_buttonCreateBackupActionPerformed

    private void buttonCloseWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseWindowActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCloseWindowActionPerformed

    private void buttonLoadBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoadBackupActionPerformed
        
        // Check if the backup file already exists...
        File f = new File("allRecipesBACKUP.ser");
        
       // if it does...
        if(f.exists() && !f.isDirectory()) {
            // ask what do we do next...
            int reply = JOptionPane.showConfirmDialog(null, "UTRACISZ DOTYCHCZASOWE PRZEPISY! Kontynuować wczytywanie!?", "Wczytywanie kopii zapasowej przepisow...", JOptionPane.YES_NO_OPTION);              
            //if u say yes...
            if (reply == JOptionPane.YES_OPTION) {
                // load new backup...
                RecipeIO.loadBackupList();
                // and show dialog
                JOptionPane.showMessageDialog(null, "Załadowano kopię zapasową wszystkich przepisów");
            }
            // else close the window and do nothing...
            else {
                System.out.println("Anulowano tworzenie kopii zapasowej");    
            }              
        }
        // if the file does not exist, create backup file right away...
        else{
            JOptionPane.showMessageDialog(null, "Brak kopii zapasowej - utworz ja najpierw by wczytac...");
        }  
    }//GEN-LAST:event_buttonLoadBackupActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        Component[] panel2comps = jPanel2.getComponents();
        for(Component c : panel2comps){
            c.setEnabled(true);
        }
        
        Component[] panel3comps = jPanel3.getComponents();
        for(Component c : panel3comps){
            c.setEnabled(false);
        }
        
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        Component[] panel2comps = jPanel2.getComponents();
        for(Component c : panel2comps){
            c.setEnabled(false);
        }
        
        Component[] panel3comps = jPanel3.getComponents();
        for(Component c : panel3comps){
            c.setEnabled(true);
        }
     
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(OptionsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCloseWindow;
    private javax.swing.JButton buttonCreateBackup;
    private javax.swing.JButton buttonLoadBackup;
    private javax.swing.JButton buttonSaveConf;
    private javax.swing.JButton buttonTestConn;
    private javax.swing.JComboBox<String> comboBoxIngredients;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel labelAvailIngr;
    private javax.swing.JLabel labelBackup;
    private javax.swing.JLabel labelCreateBackup;
    private javax.swing.JLabel labelIngreList;
    private javax.swing.JLabel labelLoadBackup;
    private javax.swing.JLabel labelSaveData;
    private javax.swing.JLabel labelSaveToDatabase;
    private javax.swing.JLabel labelTestConn;
    private javax.swing.JTextField textFieldAdres;
    private javax.swing.JTextField textFieldHaslo;
    private javax.swing.JTextField textFieldLogin;
    // End of variables declaration//GEN-END:variables

    private void disablePanels() {
        Component[] panel2comps = jPanel2.getComponents();
        for(Component c : panel2comps){
            c.setEnabled(false);
        }
        
        Component[] panel3comps = jPanel3.getComponents();
        for(Component c : panel3comps){
            c.setEnabled(false);
        }
    }
    
    
}
