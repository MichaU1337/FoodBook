package foodbook;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class RecipeModifyGUI extends javax.swing.JFrame {
    
    DefaultListModel DLM = new DefaultListModel();
    
    // Default constructor with blank fields...
    public RecipeModifyGUI() {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        setUndecorated(true);
        initComponents();
        
        setVisible(true);
        setResizable(false);        
        setLocationRelativeTo(null);
        setBounds(FoodBook.getRectangle());
        
        jList1.setModel(DLM);
        
        
    }
    
    // Constructor with fields filled...
    public RecipeModifyGUI(SingleRecipe recipe){
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        setUndecorated(true);
        initComponents();
        
        setVisible(true);
        setResizable(false);        
        setLocationRelativeTo(null);
        setBounds(FoodBook.getRectangle());
        
        jList1.setModel(DLM);
        
        
        nameTextField.setText(recipe.getName());
        descriptionTextArea.setText(recipe.getDescription());
        
        for(String s : recipe.getIngredientList()){
            DLM.addElement(s);
        }
        
        
    }
    

    public JComboBox<String> getPickIngrComboBox() {
        return pickIngrComboBox;
    }

    public JComboBox<String> getPickUnitComboBox() {
        return pickUnitComboBox;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pictureLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        fastCheckBox = new javax.swing.JCheckBox();
        cheapCheckBox = new javax.swing.JCheckBox();
        goodCheckBox = new javax.swing.JCheckBox();
        buttonChangePicture = new javax.swing.JButton();
        ingredientListLabel = new javax.swing.JLabel();
        pickIngrComboBox = new javax.swing.JComboBox<>();
        quantityTextField = new javax.swing.JTextField();
        pickUnitComboBox = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        ingredientListLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        stepCheckBox1 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        stepCheckBox2 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();
        stepCheckBox3 = new javax.swing.JCheckBox();
        jTextField3 = new javax.swing.JTextField();
        stepCheckBox4 = new javax.swing.JCheckBox();
        jTextField4 = new javax.swing.JTextField();
        stepCheckBox5 = new javax.swing.JCheckBox();
        jTextField5 = new javax.swing.JTextField();
        stepCheckBox6 = new javax.swing.JCheckBox();
        jTextField6 = new javax.swing.JTextField();
        closeWindow = new javax.swing.JButton();
        saveRecipe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodbook/Resources/1.jpg"))); // NOI18N

        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameTextField.setText("Podaj nazwe przepisu...");
        nameTextField.setName(""); // NOI18N
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descriptionTextArea.setRows(5);
        descriptionTextArea.setText("...i opcjonalny opis");
        jScrollPane1.setViewportView(descriptionTextArea);

        fastCheckBox.setText("szybkie");

        cheapCheckBox.setText("tanie");

        goodCheckBox.setText("dobre");

        buttonChangePicture.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonChangePicture.setText("Wybierz zdjecie");
        buttonChangePicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChangePictureActionPerformed(evt);
            }
        });

        ingredientListLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ingredientListLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ingredientListLabel.setText("Lista skladnikow:");
        ingredientListLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pickIngrComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wybierz składnik" }));
        pickIngrComboBox.setAlignmentX(11.0F);

        quantityTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        quantityTextField.setText("Podaj ilosc");
        quantityTextField.setDoubleBuffered(true);
        quantityTextField.setMargin(new java.awt.Insets(2, 4, 2, 2));
        quantityTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityTextFieldFocusLost(evt);
            }
        });
        quantityTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quantityTextFieldMouseClicked(evt);
            }
        });

        pickUnitComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "g", "dag", "kg", "ml", "l", "lyzka", "lyzeczka", "szklanka" }));

        jButton2.setText("Dodaj skladnik");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jList1.setBackground(new java.awt.Color(240, 240, 240));
        jList1.setToolTipText("");
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList1);

        ingredientListLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ingredientListLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ingredientListLabel1.setText("Sposob przygotowania:");
        ingredientListLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        stepCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stepCheckBox1.setText("Krok 1");
        stepCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stepCheckBox1ActionPerformed(evt);
            }
        });

        jTextField1.setEnabled(false);

        stepCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stepCheckBox2.setText("Krok 2");
        stepCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stepCheckBox2ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setEnabled(false);

        stepCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stepCheckBox3.setText("Krok 3");
        stepCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stepCheckBox3ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setEnabled(false);

        stepCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stepCheckBox4.setText("Krok 4");
        stepCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stepCheckBox4ActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setEnabled(false);

        stepCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stepCheckBox5.setText("Krok 5");
        stepCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stepCheckBox5ActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setEnabled(false);

        stepCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stepCheckBox6.setText("Krok 6");
        stepCheckBox6.setToolTipText("");
        stepCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stepCheckBox6ActionPerformed(evt);
            }
        });

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField6.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stepCheckBox6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(stepCheckBox5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stepCheckBox4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stepCheckBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stepCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stepCheckBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addComponent(jTextField5)
                    .addComponent(jTextField6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(stepCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stepCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stepCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stepCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stepCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stepCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        closeWindow.setText("Zamknij");
        closeWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeWindowActionPerformed(evt);
            }
        });

        saveRecipe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        saveRecipe.setText("Dodaj przepis");
        saveRecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveRecipeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pickUnitComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(pickIngrComboBox, 0, 157, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveRecipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ingredientListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(buttonChangePicture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fastCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cheapCheckBox)
                                .addGap(18, 18, 18)
                                .addComponent(goodCheckBox))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(closeWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ingredientListLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameTextField)
                            .addComponent(closeWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonChangePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fastCheckBox)
                    .addComponent(cheapCheckBox)
                    .addComponent(goodCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingredientListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingredientListLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(pickIngrComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pickUnitComboBox))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonChangePictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangePictureActionPerformed
        //Create FileChooser...
        JFileChooser fileChooser = new JFileChooser();
        
        //Set directory when opened...
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        //Set filter so you can pick only graphics...
        FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        fileChooser.setFileFilter(imageFilter);
        
        //Open the dialog...
        int result = fileChooser.showOpenDialog(this);
        
        //Check if the file was picked...
        if (result == JFileChooser.APPROVE_OPTION) 
        {
            //Set the selected file...
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            
            try {
                ImageIcon ic = new ImageIcon((ImageIO.read(selectedFile)));
                Image scaled = ic.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                pictureLabel.setIcon(new ImageIcon(scaled));
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_buttonChangePictureActionPerformed

    private void quantityTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quantityTextFieldMouseClicked
        quantityTextField.setText("");
    }//GEN-LAST:event_quantityTextFieldMouseClicked
    
    public JComboBox<String> getjComboBox1() {
        return pickIngrComboBox;
    }

    private void quantityTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityTextFieldFocusLost

    }//GEN-LAST:event_quantityTextFieldFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(pickIngrComboBox.getModel().getSelectedItem() != "Wybierz składnik" && !quantityTextField.getText().contains("Podaj ilosc")){
            DLM.addElement(pickIngrComboBox.getModel().getSelectedItem() + " " + quantityTextField.getText() + " " + pickUnitComboBox.getModel().getSelectedItem());
        }        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        int selectedIndex = jList1.getSelectedIndex();
        if (selectedIndex != -1) {
            DLM.remove(selectedIndex);
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void stepCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stepCheckBox1ActionPerformed
        if(!jTextField1.isEnabled()){
            jTextField1.setEnabled(true);
            jTextField1.setEditable(true);
        }
        else{
            jTextField1.setText("");
            jTextField1.setEnabled(false);
        }
    }//GEN-LAST:event_stepCheckBox1ActionPerformed

    private void stepCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stepCheckBox2ActionPerformed
       if(!jTextField2.isEnabled()){
            jTextField2.setEnabled(true);
            jTextField2.setEditable(true);
        }
        else{
            jTextField2.setText("");
            jTextField2.setEnabled(false);
        }
    }//GEN-LAST:event_stepCheckBox2ActionPerformed

    private void stepCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stepCheckBox3ActionPerformed
        if(!jTextField3.isEnabled()){
            jTextField3.setEnabled(true);
            jTextField3.setEditable(true);
        }
        else{
            jTextField3.setText("");
            jTextField3.setEnabled(false);
        }
    }//GEN-LAST:event_stepCheckBox3ActionPerformed

    private void stepCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stepCheckBox4ActionPerformed
       if(!jTextField4.isEnabled()){
            jTextField4.setEnabled(true);
            jTextField4.setEditable(true);
        }
        else{
            jTextField4.setText("");
            jTextField4.setEnabled(false);
        }
    }//GEN-LAST:event_stepCheckBox4ActionPerformed

    private void stepCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stepCheckBox5ActionPerformed
        if(!jTextField5.isEnabled()){
            jTextField5.setEnabled(true);
            jTextField5.setEditable(true);
        }
        else{
            jTextField5.setText("");
            jTextField5.setEnabled(false);
        }
    }//GEN-LAST:event_stepCheckBox5ActionPerformed

    private void stepCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stepCheckBox6ActionPerformed
       if(!jTextField6.isEnabled()){
            jTextField6.setEnabled(true);
            jTextField6.setEditable(true);
        }
        else{
            jTextField6.setText("");
            jTextField6.setEnabled(false);
        }
    }//GEN-LAST:event_stepCheckBox6ActionPerformed

    private void closeWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeWindowActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeWindowActionPerformed

    private void saveRecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveRecipeActionPerformed
        SingleRecipe recipe = new SingleRecipe();
        
        recipe.setName(nameTextField.getText());
        recipe.setDescription(descriptionTextArea.getText());

        for(int i=0; i < jList1.getModel().getSize(); i++){
            recipe.getIngredientList().add(jList1.getModel().getElementAt(i));
        }
        
        if(cheapCheckBox.isSelected()){
            recipe.setIsCheap(true);
        }
        
        if(fastCheckBox.isSelected()){
            recipe.setIsQuick(true);
        }
        
        if(goodCheckBox.isSelected()){
            recipe.setIsGood(true);
        }
        recipe.getPrepList().add(jTextField1.getText());
        recipe.getPrepList().add(jTextField2.getText());
        recipe.getPrepList().add(jTextField3.getText());
        recipe.getPrepList().add(jTextField4.getText());
        recipe.getPrepList().add(jTextField5.getText());
        recipe.getPrepList().add(jTextField6.getText());
        
        RecipeIO.saveRecipe(recipe);
        this.dispose();
        
    }//GEN-LAST:event_saveRecipeActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonChangePicture;
    private javax.swing.JCheckBox cheapCheckBox;
    private javax.swing.JButton closeWindow;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JCheckBox fastCheckBox;
    private javax.swing.JCheckBox goodCheckBox;
    private javax.swing.JLabel ingredientListLabel;
    private javax.swing.JLabel ingredientListLabel1;
    private javax.swing.JButton jButton2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox<String> pickIngrComboBox;
    private javax.swing.JComboBox<String> pickUnitComboBox;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JButton saveRecipe;
    private javax.swing.JCheckBox stepCheckBox1;
    private javax.swing.JCheckBox stepCheckBox2;
    private javax.swing.JCheckBox stepCheckBox3;
    private javax.swing.JCheckBox stepCheckBox4;
    private javax.swing.JCheckBox stepCheckBox5;
    private javax.swing.JCheckBox stepCheckBox6;
    // End of variables declaration//GEN-END:variables
}
