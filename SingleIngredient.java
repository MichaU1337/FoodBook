package foodbook;

public class SingleIngredient {
    private String ingredientName = "default";
    private String ingredientEnergy;
    private String ingredientProtein;
    private String ingredientFat;
    private String ingredientCarboHydrates;
    
    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public String getIngredientEnergy() {
        return ingredientEnergy;
    }

    public void setIngredientEnergy(String ingredientEnergy) {
        this.ingredientEnergy = ingredientEnergy;
    }

    public String getIngredientProtein() {
        return ingredientProtein;
    }

    public void setIngredientProtein(String ingredientProtein) {
        this.ingredientProtein = ingredientProtein;
    }

    public String getIngredientFat() {
        return ingredientFat;
    }

    public void setIngredientFat(String ingredientFat) {
        this.ingredientFat = ingredientFat;
    }

    public String getIngredientCarboHydrates() {
        return ingredientCarboHydrates;
    }

    public void setIngredientCarboHydrates(String ingredientCarboHydrates) {
        this.ingredientCarboHydrates = ingredientCarboHydrates;
    }
    
    public SingleIngredient(){
        
    }
    
    public SingleIngredient(String Name, String Energy, String Protein, String Fat, String CarboHydrate){
        this.ingredientName = Name;
        this.ingredientEnergy = Energy;
        this.ingredientProtein = Protein;
        this.ingredientFat = Fat;
        this.ingredientCarboHydrates = CarboHydrate;
    }
    
    
}
