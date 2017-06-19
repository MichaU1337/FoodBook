package foodbook;

import java.awt.Component;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.ConditionalFeature.SWING;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import sun.swing.table.DefaultTableCellHeaderRenderer;

public class AllIngredientsGUI extends javax.swing.JFrame {
    
    private List<SingleIngredient> listOfIngredients;
   
    public AllIngredientsGUI() throws IOException {
        setUndecorated(true);
        initComponents();
        
        setResizable(false);        
        setLocationRelativeTo(null);
        setBounds(FoodBook.getRectangle());        
        setVisible(true);
        
//        listOfIngredients = new ArrayList<>();
//        listOfIngredients.clear();
//        
//        Charset charset = Charset.forName("UTF-8");
//        String path = "C:\\Users\\Dell\\Documents\\NetBeansProjects\\FoodBook\\src\\foodbook\\Resources\\Ingredients.txt";
//       
//        // Read from file ingredients...
//        List<String> lines = Files.readAllLines(Paths.get(path), charset);
//        
//        /*
//            SUPER IMPORTANT MESSAGE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        
//            For the application to work u need to be sure that ingredients in Ingredients.txt are of format: 
//        
//            NAME_T_VALUE1_T_VALUE2_T_VALUE3_T_VALUE4_T_VALUE5              //where _T_ is tabulation
//        
//            Care for spaces or it will be ArrayOfBoundException!!!
//        */
//        for(int i=0; i<lines.size(); i++){
//            String[] parts = new String[4];
//            parts = lines.get(i).split("\t");
//            
//            SingleIngredient singleIngredient = new SingleIngredient(parts[0], parts[1], parts[2], parts[3], parts[4]);
//            listOfIngredients.add(singleIngredient);
//            System.out.println();
//        }
        
        listOfIngredients = FoodBook.getIngredientList();
        // *******************************************
        // JTable Configuration to show all recipes...
        // *******************************************        
        // Set column names...
        String[] columns = new String[] {
            " Nazwa przepisu", "Energia [kcal]", "Białko [g]", "Tłuszcz [g]", "Węglowodany [g]"
        };
        
        // Set what data type is in each column...
        final Class[] columnClass = new Class[] {
            String.class, String.class, String.class, String.class, String.class
        };
        
        //Actual data for the table as 2d array...        
        Object[][] data = new Object[listOfIngredients.size()][5];       
        
        for(int i = 0; i < data.length; i++){
            data[i][0] = listOfIngredients.get(i).getIngredientName();
            data[i][1] = listOfIngredients.get(i).getIngredientEnergy();
            data[i][2] = listOfIngredients.get(i).getIngredientProtein();
            data[i][3] = listOfIngredients.get(i).getIngredientFat();
            data[i][4] = listOfIngredients.get(i).getIngredientCarboHydrates();
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
        tableAllingredients.setModel(model);
        
        // Percentage for columns width...
        float[] columnWidthPercentage = {52.0f, 12.0f, 12.0f, 12.0f, 12.0f};
        
        // Set totalWidth, columnModel and column...
        int totalWidth = tableAllingredients.getWidth();
        TableColumnModel columnModel = tableAllingredients.getColumnModel();
        TableColumn column;
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( SwingConstants.CENTER );
        for(int i=1; i<5; i++){
        tableAllingredients.getColumnModel().getColumn(i).setCellRenderer( centerRenderer );
        }
        
        /**
         * Adjusting JTables column text to center position.
         */        
        JTableHeader header = tableAllingredients.getTableHeader();
        header.setDefaultRenderer(new DefaultTableCellHeaderRenderer(){
            
            @Override
            public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            DefaultTableCellHeaderRenderer rendererComponent = (DefaultTableCellHeaderRenderer)super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            
            if(column != 0){
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
            
        tableAllingredients.setRowHeight(tableAllingredients.getRowHeight()*2);
        
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableAllingredients = new javax.swing.JTable();
        buttonClosePage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableAllingredients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableAllingredients.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableAllingredients);

        buttonClosePage.setText("Zamknij");
        buttonClosePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClosePageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonClosePage, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(buttonClosePage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonClosePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClosePageActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonClosePageActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClosePage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAllingredients;
    // End of variables declaration//GEN-END:variables
}
