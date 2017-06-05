package foodbook;

import java.awt.Component;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
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
        // ********************************************************************
        /* Example for JTable - new model 
        
        //headers for the table
        String[] columns = new String[] {
            "Id", "Name", "Hourly Rate", "Part Time"
        };
        
          //actual data for the table in a 2d array
        Object[][] data = new Object[][] {
            {1, "John", 40.0, false },
            {2, "Rambo", 70.0, false },
            {3, "Zorro", 60.0, true },
        };
        
        final Class[] columnClass = new Class[] {
            Integer.class, String.class, Double.class, Boolean.class
        };
        
        //create table model with data
        DefaultTableModel model = new DefaultTableModel(data, columns){
            @Override
            public Class<?> getColumnClass(int columnIndex)
            {
                return columnClass[columnIndex];
            }
        };
        
        jTable1.setModel(model);
        // ********************************************************************
        */
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listRemoveRecipes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listRemoveRecipesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listRemoveRecipes);

        buttonCancel.setText("Zamknij");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        buttonSave.setText("Zapisz");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        tableAllRecipes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableAllRecipes.setFocusable(false);
        jScrollPane2.setViewportView(tableAllRecipes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 404, Short.MAX_VALUE)
                .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listRemoveRecipes;
    private javax.swing.JTable tableAllRecipes;
    // End of variables declaration//GEN-END:variables
}
