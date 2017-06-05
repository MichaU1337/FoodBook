package foodbook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SingleRecipe implements Serializable{

    private String name = "Domyślna nazwa";
    private String description = "";
    
    private boolean isQuick = false;
    private boolean isCheap = false;
    private boolean isGood = false;
    
    private List<String> ingredientList = new ArrayList<>();
    private List<String> prepList = new ArrayList<>();
    
    public SingleRecipe() {
        
    }
    
    public SingleRecipe(String name, String desc){
        this.name = name;
        this.description = desc;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isQuick() {
        return isQuick;
    }

    public void setIsQuick(boolean isQuick) {
        this.isQuick = isQuick;
    }

    public boolean isCheap() {
        return isCheap;
    }

    public List<String> getIngredientList() {
        return ingredientList;
    }

    public List<String> getPrepList() {
        return prepList;
    }

    public void setIsCheap(boolean isCheap) {
        this.isCheap = isCheap;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setIsGood(boolean isGood) {
        this.isGood = isGood;
    }
    
    
}
