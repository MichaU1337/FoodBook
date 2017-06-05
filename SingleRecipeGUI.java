package foodbook;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

public class SingleRecipeGUI extends javax.swing.JFrame {

    List<SingleRecipe> recipeList = RecipeIO.getRecipeList();
    List<JLabel> descList = new ArrayList<>();
    JComboBox<String> combo = this.comboBoxPickRec;
    SingleRecipe pickedRecipe;
    
    public SingleRecipeGUI() {
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);              
        setLocationRelativeTo(null);
        setResizable(false);
        
        initComponents();
        
        setBounds(FoodBook.getRectangle());
        setVisible(true);
        // Create list of labels for description steps...
        descList.add(label11);
        descList.add(label22);
        descList.add(label33);
        descList.add(label44);
        descList.add(label55);
        descList.add(label66);
        
        for(SingleRecipe s : recipeList){
            comboBoxPickRec.addItem(s.getName());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        pictureLabel = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        fastCheckBox = new javax.swing.JCheckBox();
        cheapCheckBox = new javax.swing.JCheckBox();
        goodCheckBox = new javax.swing.JCheckBox();
        labelIngredients = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        labelPreparation = new javax.swing.JLabel();
        comboBoxPickRec = new javax.swing.JComboBox<>();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label11 = new javax.swing.JLabel();
        label22 = new javax.swing.JLabel();
        label33 = new javax.swing.JLabel();
        label44 = new javax.swing.JLabel();
        label55 = new javax.swing.JLabel();
        label66 = new javax.swing.JLabel();
        labelPickRec = new javax.swing.JLabel();
        labelName1 = new javax.swing.JLabel();
        labelName2 = new javax.swing.JLabel();
        labelDesc1 = new javax.swing.JLabel();
        labelDesc2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodbook/Resources/1.jpg"))); // NOI18N

        jButton4.setText("Zamknij");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        fastCheckBox.setText("szybkie");
        fastCheckBox.setEnabled(false);

        cheapCheckBox.setText("tanie");
        cheapCheckBox.setEnabled(false);

        goodCheckBox.setText("dobre");
        goodCheckBox.setEnabled(false);

        labelIngredients.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        labelIngredients.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIngredients.setText("Lista skladnikow:");
        labelIngredients.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelIngredients.setEnabled(false);

        jList1.setBackground(new java.awt.Color(240, 240, 240));
        jList1.setToolTipText("");
        jList1.setEnabled(false);
        jScrollPane3.setViewportView(jList1);

        labelPreparation.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        labelPreparation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPreparation.setText("Sposob przygotowania:");
        labelPreparation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelPreparation.setEnabled(false);

        comboBoxPickRec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wybierz przepis z listy" }));
        comboBoxPickRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPickRecActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("Krok 1");
        label1.setEnabled(false);

        label2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("Krok 2");
        label2.setEnabled(false);

        label3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setText("Krok 3");
        label3.setEnabled(false);

        label4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label4.setText("Krok 4");
        label4.setEnabled(false);

        label5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label5.setText("Krok 5");
        label5.setEnabled(false);

        label6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label6.setText("Krok 6");
        label6.setEnabled(false);

        label11.setEnabled(false);

        label22.setEnabled(false);

        label33.setEnabled(false);

        label44.setEnabled(false);

        label55.setEnabled(false);

        label66.setEnabled(false);

        labelPickRec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPickRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPickRec.setText("Wybierz przepis:");
        labelPickRec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelName1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelName1.setText("Nazwa:");
        labelName1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelName1.setEnabled(false);

        labelName2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelName2.setEnabled(false);

        labelDesc1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDesc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDesc1.setText("Opis:");
        labelDesc1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelDesc1.setEnabled(false);

        labelDesc2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelDesc2.setEnabled(false);

        jButton1.setText("Modyfikuj przepis");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(goodCheckBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cheapCheckBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fastCheckBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(label55, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                                    .addComponent(label44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelIngredients, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelPreparation, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDesc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelName1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelPickRec, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxPickRec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelPickRec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxPickRec, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelName1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDesc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDesc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelIngredients, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPreparation, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(fastCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(cheapCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(goodCheckBox)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label22, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label33, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label44, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label55, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label66, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void comboBoxPickRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPickRecActionPerformed
       // Disable checkboxes 
       cheapCheckBox.setSelected(false);
       fastCheckBox.setSelected(false);
       goodCheckBox.setSelected(false);

       
       int index = comboBoxPickRec.getSelectedIndex();
        
       this.pickedRecipe = recipeList.get(index-1);
       
       labelName2.setEnabled(true);
       labelName2.setText(pickedRecipe.getName());
        
       labelDesc2.setEnabled(true);
       labelDesc2.setText(pickedRecipe.getDescription());
       
       labelIngredients.setEnabled(true);
       labelPreparation.setEnabled(true);
       labelName1.setEnabled(true);
       labelDesc1.setEnabled(true);
       
       jList1.setEnabled(true);
       DefaultListModel model = new DefaultListModel();
       for(String s : pickedRecipe.getIngredientList()){
           model.addElement(s);
       }
       jList1.setModel(model);
       
       for(int i=0; i<pickedRecipe.getPrepList().size(); i++){
           descList.get(i).setEnabled(true);
           descList.get(i).setText(pickedRecipe.getPrepList().get(i));
       }
       
       label1.setEnabled(true);
       label2.setEnabled(true);
       label3.setEnabled(true);
       label4.setEnabled(true);
       label5.setEnabled(true);
       label6.setEnabled(true);
       
       if(pickedRecipe.isCheap()){
           cheapCheckBox.setSelected(true);
       }       
       if(pickedRecipe.isQuick()){
           fastCheckBox.setSelected(true);
       }       
       if(pickedRecipe.isGood()){
           goodCheckBox.setSelected(true);
       }
       
        System.out.println(pickedRecipe.getName());
    }//GEN-LAST:event_comboBoxPickRecActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RecipeModify recipeModify = new RecipeModify(pickedRecipe);
        
       
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cheapCheckBox;
    private javax.swing.JComboBox<String> comboBoxPickRec;
    private javax.swing.JCheckBox fastCheckBox;
    private javax.swing.JCheckBox goodCheckBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label22;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label33;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label44;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label55;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label66;
    private javax.swing.JLabel labelDesc1;
    private javax.swing.JLabel labelDesc2;
    private javax.swing.JLabel labelIngredients;
    private javax.swing.JLabel labelName1;
    private javax.swing.JLabel labelName2;
    private javax.swing.JLabel labelPickRec;
    private javax.swing.JLabel labelPreparation;
    private javax.swing.JLabel pictureLabel;
    // End of variables declaration//GEN-END:variables

}
