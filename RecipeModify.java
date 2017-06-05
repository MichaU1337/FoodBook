package foodbook;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;


/*
    *
    *
    Default constructor = Add Recipe window with all fields blank. 
    Constructor (SingleRecipe) = Show recipe window with fields filled.
    *
    */
public class RecipeModify {

    private List<String> ingredientList = new ArrayList<>();
    private RecipeModifyGUI modifyGUI;
    //private RecipeModifyGUI modifyGUI = new RecipeModifyGUI();
    String[] ingredients = {"groch", "kapusta", "buraki", "ziemniaki", "czosnek"};
    
    public RecipeModify() {       
        RecipeModifyGUI modifyGUI = new RecipeModifyGUI();
        
        for(String s : ingredients){
            ingredientList.add(s);
        }
        
        // ComboBox with a placeholder text that cant be picked from the dropdown list - super tryhard solution.
        PopupMenuListener popupmenulistener = new PopupMenuListener() {       
            
            JComboBox<String> combo = modifyGUI.getPickIngrComboBox();           
            
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {                
                combo.removeAllItems();
                
                for(String s : ingredientList){
                   combo.addItem(s);
                }
                combo.setSelectedItem(null);
            }            
            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {  
                if(combo.getSelectedItem() == null){
                    System.out.println("Nie wybrano żadnego składnika");
                    combo.removeAllItems();
                    combo.addItem("Wybierz składnik");
                }                
                if((String)combo.getSelectedItem() != "Wybierz składnik"){                    
                    combo.addItem((String)combo.getSelectedItem());
                    System.out.println("Wybrano składnik z listy");
                }
            }
            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {
                System.out.println("Anulowano wybranie składnika np. escacpe, lost focus itd.");
            }
        };    
        modifyGUI.getPickIngrComboBox().addPopupMenuListener(popupmenulistener);
    }

    public RecipeModify(SingleRecipe recipe) {       
        RecipeModifyGUI modifyGUI = new RecipeModifyGUI(recipe);   
        
        for(String s : ingredients){
            ingredientList.add(s);
        }
        
        // ComboBox with a placeholder text that cant be picked from the dropdown list - super tryhard solution.
        PopupMenuListener popupmenulistener = new PopupMenuListener() {       
            
            JComboBox<String> combo = modifyGUI.getPickIngrComboBox();           
            
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {                
                combo.removeAllItems();
                
                for(String s : ingredientList){
                   combo.addItem(s);
                }
                combo.setSelectedItem(null);
            }            
            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {  
                if(combo.getSelectedItem() == null){
                    System.out.println("Nie wybrano żadnego składnika");
                    combo.removeAllItems();
                    combo.addItem("Wybierz składnik");
                }                
                if((String)combo.getSelectedItem() != "Wybierz składnik"){                    
                    combo.addItem((String)combo.getSelectedItem());
                    System.out.println("Wybrano składnik z listy");
                }
            }
            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {
                System.out.println("Anulowano wybranie składnika np. escacpe, lost focus itd.");
            }
        };    
        modifyGUI.getPickIngrComboBox().addPopupMenuListener(popupmenulistener);
    }
    
    public RecipeModifyGUI getModifyGUI() {
        return modifyGUI;
    }
}
