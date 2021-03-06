package foodbook;

import foodbook.Helpers.GridButtonPanel;
import java.util.List;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class FoodBook extends JFrame {
    
    private GridButtonPanel gridButtonPanel = new GridButtonPanel();
    private List<JButton> buttonList = new ArrayList<>();
    private static List<SingleIngredient> ingredientList;
    private static Rectangle rect = new Rectangle();
    private static RecipeIO recipeIO;

    public static List<SingleIngredient> getIngredientList() {
        return ingredientList;
    }

    public static RecipeIO getRecipeIO() {
        return recipeIO;
    }
    
    
    public FoodBook(String name) {
        super(name);
        
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    private void addComponentsToPane(final Container pane) {        
        
        // mainPanel = Title(row1) + Buttons(row2)
        final JPanel mainPanel = new JPanel(new GridLayout(1,2));
        
        // Title(row1)...
        mainPanel.add(new JButton("Foodbook - Ustawienia"));
        mainPanel.add(new JButton("Wyjście")); 
        
        JButton optionButton = (JButton) mainPanel.getComponent(0);
        optionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new OptionsGUI();
            }
        });
                
        JButton exitButton = (JButton) mainPanel.getComponent(1);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        // Buttons(row2)...       
        
        final JPanel frontButtons = gridButtonPanel.createGridPanel();
        // Combine above into pane.           
        pane.add(mainPanel, BorderLayout.NORTH);
        pane.add(frontButtons, BorderLayout.CENTER);
        
    }
    
    public static Rectangle getRectangle(){
        return rect;
    }
    
    public static List<SingleIngredient> loadIngredientsFromFile() throws IOException{
        ingredientList = new ArrayList<>();
        ingredientList.clear();
        
        Charset charset = Charset.forName("UTF-8");
        String path = "C:\\Users\\Dell\\Documents\\NetBeansProjects\\FoodBook\\src\\foodbook\\Resources\\Ingredients.txt";
       
        // Read from file ingredients...
        List<String> lines = Files.readAllLines(Paths.get(path), charset);
        
        /*
            SUPER IMPORTANT MESSAGE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        
            For the application to work u need to be sure that ingredients in Ingredients.txt are of format: 
        
            NAME_T_VALUE1_T_VALUE2_T_VALUE3_T_VALUE4_T_VALUE5              //where _T_ is tabulation
        
            Care for spaces or it will be ArrayOfBoundException!!!
        */
        for(int i=0; i<lines.size(); i++){
            String[] parts = new String[4];
            parts = lines.get(i).split("\t");
            
            SingleIngredient singleIngredient = new SingleIngredient(parts[0], parts[1], parts[2], parts[3], parts[4]);
            ingredientList.add(singleIngredient);
        }
        
        return ingredientList;
    }

    public static void main(String[] args) {     
        
        recipeIO = new RecipeIO();     
 
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available...
        }

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //Create and set up the window.
                FoodBook frame = new FoodBook("MyFoodBook");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                //Set up the content pane.
                frame.addComponentsToPane(frame.getContentPane());
                
                //Display the window.
                frame.setUndecorated(true);
                frame.pack();
                frame.setVisible(true);
                                
                //Set up the buttons.                        
                JButton button1 = frame.gridButtonPanel.getGridButton(0, 0);
                button1.setText("Śniadanie");
                button1.setBackground(Color.red);                
                frame.buttonList.add(button1);                      
                                
                JButton button2 = frame.gridButtonPanel.getGridButton(0, 1);
                button2.setText("Obiad");
                button2.setVerticalTextPosition(JButton.CENTER);
                button2.setHorizontalTextPosition(JButton.CENTER);
                button2.setForeground(Color.WHITE);
                button2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
                frame.buttonList.add(button2);
                
                JButton button3 = frame.gridButtonPanel.getGridButton(0, 2);
                button3.setText("Kolacja");
                button3.setVerticalTextPosition(JButton.CENTER);
                button3.setHorizontalTextPosition(JButton.CENTER);
                button3.setForeground(Color.WHITE);
                button3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
                frame.buttonList.add(button3);
                
                JButton button4 = frame.gridButtonPanel.getGridButton(1, 0);
                button4.setText("Dodaj przepis");
                button4.setVerticalTextPosition(JButton.CENTER);
                button4.setHorizontalTextPosition(JButton.CENTER);
                button4.setForeground(Color.WHITE);
                button4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
                frame.buttonList.add(button4);
                
                JButton button5 = frame.gridButtonPanel.getGridButton(1, 1);
                button5.setText("Edytuj przepis");
                button5.setVerticalTextPosition(JButton.CENTER);
                button5.setHorizontalTextPosition(JButton.CENTER);
                button5.setForeground(Color.WHITE);
                button5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
                frame.buttonList.add(button5);
                
                JButton button6 = frame.gridButtonPanel.getGridButton(1, 2);
                button6.setText("Wszystkie przepisy");
                button6.setVerticalTextPosition(JButton.CENTER);
                button6.setHorizontalTextPosition(JButton.CENTER);
                button6.setForeground(Color.WHITE);
                button6.setFont(new Font("Times New Roman", Font.PLAIN, 30));
                frame.buttonList.add(button6);  
                
                // Add buttons background.
                try {
                  ImageIcon button1Icon = new ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\FoodBook\\src\\foodbook\\Resources\\1blur.jpg");
                  button1.setIcon(button1Icon);
                  ImageIcon button2Icon = new ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\FoodBook\\src\\foodbook\\Resources\\2blur.jpg");
                  button2.setIcon(button2Icon);
                  ImageIcon button3Icon = new ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\FoodBook\\src\\foodbook\\Resources\\3blur.jpg");
                  button3.setIcon(button3Icon);
                  ImageIcon button4Icon = new ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\FoodBook\\src\\foodbook\\Resources\\4blur.jpg");
                  button4.setIcon(button4Icon);
                  ImageIcon button5Icon = new ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\FoodBook\\src\\foodbook\\Resources\\5blur.jpg");
                  button5.setIcon(button5Icon);
                  ImageIcon button6Icon = new ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\FoodBook\\src\\foodbook\\Resources\\6blur.jpg");
                  button6.setIcon(button6Icon);
                } catch (Exception ex) {
                  System.out.println(ex);
                }
                
                // Mouse rollover the buttons
                for(JButton b : frame.buttonList){
                    b.setVerticalTextPosition(JButton.CENTER);
                    b.setHorizontalTextPosition(JButton.CENTER);
                    b.setForeground(Color.WHITE);
                    b.setFont(new Font("Times New Roman", Font.PLAIN, 30)); 
                    
                    b.getModel().addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {                    
                    
                    ButtonModel model = (ButtonModel) e.getSource();
                    if (model.isRollover()) {
                        b.setForeground(Color.RED);
                        b.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                        if(b == button1){
                            ImageIcon button1Icon = new ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\FoodBook\\src\\foodbook\\Resources\\1.jpg");
                            button1.setIcon(button1Icon);
                        }
                        if(b == button2){
                            ImageIcon button2Icon = new ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\FoodBook\\src\\foodbook\\Resources\\2.jpg");
                            button2.setIcon(button2Icon);
                        }
                        if(b == button3){
                            ImageIcon button3Icon = new ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\FoodBook\\src\\foodbook\\Resources\\3.jpg");
                            button3.setIcon(button3Icon);
                        }
                        if(b == button4){
                            ImageIcon button4Icon = new ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\FoodBook\\src\\foodbook\\Resources\\4.jpeg");
                            button4.setIcon(button4Icon);
                        }
                        if(b == button5){
                            ImageIcon button5Icon = new ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\FoodBook\\src\\foodbook\\Resources\\5.jpg");
                            button5.setIcon(button5Icon);
                        }
                        if(b == button6){
                            ImageIcon button6Icon = new ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\FoodBook\\src\\foodbook\\Resources\\6.jpg");
                            button6.setIcon(button6Icon);
                        }
                    } else {
                        b.setForeground(Color.WHITE);
                        Border emptyBorder = BorderFactory.createEmptyBorder();
                        b.setBorder(emptyBorder);
                        
                        if(b == button1){
                            ImageIcon button1Icon = new ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\FoodBook\\src\\foodbook\\Resources\\1blur.jpg");
                            button1.setIcon(button1Icon);
                        }
                        if(b == button2){
                            ImageIcon button2Icon = new ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\FoodBook\\src\\foodbook\\Resources\\2blur.jpg");
                            button2.setIcon(button2Icon);
                        }
                        if(b == button3){
                            ImageIcon button3Icon = new ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\FoodBook\\src\\foodbook\\Resources\\3blur.jpg");
                            button3.setIcon(button3Icon);
                        }
                        if(b == button4){
                            ImageIcon button4Icon = new ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\FoodBook\\src\\foodbook\\Resources\\4blur.jpg");
                            button4.setIcon(button4Icon);
                        }
                        if(b == button5){
                            ImageIcon button5Icon = new ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\FoodBook\\src\\foodbook\\Resources\\5blur.jpg");
                            button5.setIcon(button5Icon);
                        }
                        if(b == button6){
                            ImageIcon button6Icon = new ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\FoodBook\\src\\foodbook\\Resources\\6blur.jpg");
                            button6.setIcon(button6Icon);
                        }
                    }
                    
                }   
                });
                }
                
                //Save rectangle of mainWindow for childerWindows.
                rect = frame.getBounds();
                
                // Load ingredient list...
                try {
                    loadIngredientsFromFile();
                } catch (IOException ex) {
                    Logger.getLogger(FoodBook.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            });      
        
        
        
    }

    
}