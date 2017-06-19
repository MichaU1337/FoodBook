package foodbook;

import java.awt.Component;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import sun.swing.table.DefaultTableCellHeaderRenderer;

public class AllRecipesGUI extends javax.swing.JFrame {

    DefaultListModel DLM = new DefaultListModel();
    List<SingleRecipe> allRecipes;
    
    public AllRecipesGUI() {               
        setUndecorated(true);
        initComponents();
        
        setResizable(false);        
        setLocationRelativeTo(null);
        setBounds(FoodBook.getRectangle());        
        setVisible(true);
        
        // Get all recipes...
        allRecipes = RecipeIO.getRecipeList(); 
        
        // Set model to show all ingredients...
        listRemoveRecipes.setModel(DLM);
        
        // Show all ingredients...
        for(SingleRecipe s : allRecipes){
            DLM.addElement(s.getName());
        }
        
        // *******************************************
        // JTable Configuration to show all recipes...
        // *******************************************
        // Set column names...
        String[] columns = new String[] {
            "Nazwa przepisu", "Opis", "Szybkie", "Tanie", "Dobre"
        };
        
        // Set what data type is in each column...
        final Class[] columnClass = new Class[] {
            String.class, String.class, Boolean.class, Boolean.class, Boolean.class
        };
        
        //Actual data for the table as 2d array...        
        Object[][] data = new Object[allRecipes.size()][5];       
        
        for(int i = 0; i < data.length; i++){
            data[i][0] = allRecipes.get(i).getName();
            data[i][1] = allRecipes.get(i).getDescription();
            data[i][2] = allRecipes.get(i).isQuick();
            data[i][3] = allRecipes.get(i).isCheap();
            data[i][4] = allRecipes.get(i).isGood();
        }   

        // Create model for the table...        
        DefaultTableModel model = new DefaultTableModel(data, columns){
            @Override
            public Class<?> getColumnClass(int columnIndex)
            {
                return columnClass[columnIndex];
            }
            
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            }
        };
        
        // Set the model to the table...
        tableAllRecipes.setModel(model);
        
        // Percentage for columns width...
        float[] columnWidthPercentage = {20.0f, 55.0f, 5.0f, 5.0f, 5.0f};
        
        // Set totalWidth, columnModel and column...
        int totalWidth = tableAllRecipes.getWidth();
        TableColumnModel columnModel = tableAllRecipes.getColumnModel();
        TableColumn column;
        
        /**
         * Adjusting JTables column text to center position.
         */        
        JTableHeader header = tableAllRecipes.getTableHeader();
        header.setDefaultRenderer(new DefaultTableCellHeaderRenderer(){
            
            @Override
            public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            DefaultTableCellHeaderRenderer rendererComponent = (DefaultTableCellHeaderRenderer)super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            
            if(column != 0 & column != 1){
                rendererComponent.setHorizontalAlignment(SwingConstants.CENTER);
            }        
            else{
                rendererComponent.setHorizontalAlignment(SwingConstants.LEFT);
            }          
            return rendererComponent;
            }   
        });        
        // *********************************************************************  
        
        // For every column (5 in this case) calculate width % and apply...
        for (int i = 0; i < 5; i++) {
        column = columnModel.getColumn(i);
        int pWidth = Math.round(columnWidthPercentage[i] * totalWidth);
        column.setPreferredWidth(pWidth);
        }
            
        tableAllRecipes.setRowHeight(tableAllRecipes.getRowHeight()*2);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listRemoveRecipes = new javax.swing.JList<>();
        buttonCancel = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAllRecipes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listRemoveRecipes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listRemoveRecipesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listRemoveRecipes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, 490));

        buttonCancel.setText("Zamknij");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 110, 35));

        buttonSave.setText("Zapisz");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 110, 35));

        tableAllRecipes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableAllRecipes.setFocusable(false);
        jScrollPane2.setViewportView(tableAllRecipes);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 646, 490));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista przepisów (kliknij by usunąć)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Wszystkie dostępne przepisy");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 11, 656, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listRemoveRecipesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listRemoveRecipesMouseClicked
        int selectedIndex = listRemoveRecipes.getSelectedIndex();
        if (selectedIndex != -1) {
            DLM.remove(selectedIndex);
            allRecipes.remove(selectedIndex);
        }
        
        for(SingleRecipe s : allRecipes){
            System.out.println(s.getName());
        }
    }//GEN-LAST:event_listRemoveRecipesMouseClicked

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        RecipeIO.saveRecipeList(allRecipes);
        RecipeIO.saveRecipe(null);
        System.out.println("lista zapisana: " + allRecipes.toString());
        this.dispose();
        
    }//GEN-LAST:event_buttonSaveActionPerformed

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
            java.util.logging.Logger.getLogger(AllRecipesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllRecipesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllRecipesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllRecipesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllRecipesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listRemoveRecipes;
    private javax.swing.JTable tableAllRecipes;
    // End of variables declaration//GEN-END:variables
}
