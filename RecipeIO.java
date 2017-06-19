package foodbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Michał Mierzwa
 * 
 * Class that holds the list of all recipes and enables to perform save/load operations.
 * 
 */
public class RecipeIO { 
    
    // THE MOST IMPORTANT THING - list of ALL RECIPES - 
    private static List<SingleRecipe> recipeList = new ArrayList<>();   
    // --------------------------------------------------------------
    
    public RecipeIO() {
        // Check if the file exists and load all recipes from it. It does not exist without adding recipe first.
        File f = new File("recipes.ser");
        if(f.exists() && !f.isDirectory()) { 
            loadRecipe();
        }
                
    }
 
    public static void clearRecipeList(){
        
    }
    
    public static void saveRecipeList(List<SingleRecipe> list){
        recipeList = list;        
    }

    public static List<SingleRecipe> getRecipeList() {
        return recipeList;
    }

   public static void saveRecipe(SingleRecipe recipe){        
       if(recipe != null){
           recipeList.add(recipe);
       } 
        try
        {
           FileOutputStream fileOut = new FileOutputStream("recipes.ser");
           ObjectOutputStream out = new ObjectOutputStream(fileOut);
           out.writeObject(recipeList);
           out.close();
           fileOut.close();
           //System.out.println("Zapisano");
        }
        catch(IOException i)
        {
            i.printStackTrace();
        }
    }
 
    void loadRecipe(){
        try
        {
            // Read file...
            FileInputStream fileIn = new FileInputStream("recipes.ser");

            // input the read file...
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // allocate it to the object file already instanciated...
            List<SingleRecipe> loadedRecipes = (List<SingleRecipe>)in.readObject();

            //closes the input stream...
            in.close();

            //closes the file data stream...
            fileIn.close();

            for(SingleRecipe s : loadedRecipes){
                recipeList.add(s);
            }
        }
        catch(IOException i)//exception stuff
        {
            i.printStackTrace();
            return;
        }catch(ClassNotFoundException c)
        {
            System.out.println("Error");
            c.printStackTrace();
            return;
        }
    }
    
    public static void createBackupList(){ 
        if(recipeList != null){
            try
            (FileOutputStream fileOut = new FileOutputStream("allRecipesBACKUP.ser")) {
               ObjectOutputStream out = new ObjectOutputStream(fileOut);
               out.writeObject(recipeList);
               out.close();
            }
            catch(IOException i)
            {
                System.out.println("error with creating backup");
            }
        }
    }
    
    public static void loadBackupList(){
        try
        {
            // Read file...
            FileInputStream fileIn = new FileInputStream("allRecipesBACKUP.ser");

            // input the read file...
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // allocate it to the object file already instanciated...
            List<SingleRecipe> loadedRecipes = (List<SingleRecipe>)in.readObject();

            // close the input stream...
            in.close();

            // close the file data stream...
            fileIn.close();
            
            // clear the list...
            recipeList.clear();
            // and add loaded recipes...
            for(SingleRecipe s : loadedRecipes){
                recipeList.add(s);
            }
        }
        catch(IOException i)//exception stuff
        {
        }catch(ClassNotFoundException c)
        {
            System.out.println("Error");
        }
    }
}
