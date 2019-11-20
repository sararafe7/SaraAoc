package sara.aoc.y2019;

import java.util.ArrayList;

public class Ingredients {

    private ArrayList<IngredientsCheck> ingredientsChecks;

    public Ingredients(ArrayList<IngredientsCheck> ingredientsChecks) {

        this.ingredientsChecks = new ArrayList<IngredientsCheck>();
    }
    public void addIngredient(IngredientsCheck ingredientsCheck){
        ingredientsChecks.add(ingredientsCheck);
    }
    public void removeIngredient(IngredientsCheck ingredientsCheck){
        ingredientsChecks.remove(ingredientsCheck);
    }
}
