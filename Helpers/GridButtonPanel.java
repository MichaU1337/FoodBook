package foodbook.Helpers;

import foodbook.AllIngredientsGUI;
import foodbook.AllRecipesGUI;
import foodbook.RecipeModify;
import foodbook.SingleRecipeGUI;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Buttons that remember their positions in Gridlayout
 */
public class GridButtonPanel {

    private static final int N = 3;
    private final List<JButton> list = new ArrayList<>();


    public JButton getGridButton(int r, int c) {
        //        if(r == 0){    
        //            System.out.println(c);
        //            return list.get(c);
        //        }
        //        else{
        //            int index = c + 3;
        //            return list.get(index);
        //        }

        // BETTER ALTERNATIVE
          int index = r * N + c;
          return list.get(index);
        
    }

    public List<JButton> getButtonList(){
        return list;
    }
    
    public JButton createGridButton(final int row, final int col) {
        JButton b = new JButton();
        b.setPreferredSize(new Dimension(300, 300));
        b.repaint();
        b.addActionListener((ActionEvent e) -> {
            if(b == list.get(0)){
                
                
            } 
            
            if(b == list.get(1)){
                
                
            }
            if(b == list.get(2)){
                try {
                    new AllIngredientsGUI();
                } catch (IOException ex) {
                    Logger.getLogger(GridButtonPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(b == list.get(3)){
                new RecipeModify(); 
            }
            
            if(b == list.get(4)){
                new SingleRecipeGUI();
                
            }
            if(b == list.get(5)){
                new AllRecipesGUI();
                
            }
        });

        return b;
    }

    public JPanel createGridPanel() {
        JPanel p = new JPanel(new GridLayout(2,3));        
        
        for (int i = 0; i < 6; i++) {
            int row = i / 3;
            int col = i % 3;
            JButton gb = createGridButton(row, col);
            list.add(gb);
            p.add(gb);
        }
        return p;
    }
    
}