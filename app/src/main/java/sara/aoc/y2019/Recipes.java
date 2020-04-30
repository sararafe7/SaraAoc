package sara.aoc.y2019;

import java.util.ArrayList;

public class Recipes {
    //reName = recipe name
    private String reName;
    //theAmOfDiners = theAmountOfDiners
    private int theAmOfDiners;
    //mPicture = meal picture
    ////private Bitmap mPicture;
    private int mPicture;
    //ingredients = the necessary ingredients for the recipe
    private ArrayList<String> ingredients;
    //noOfIngredients
    private int noOfIngredients;
    //tiForPre = time for the meal to prepare
    private int tiForPre;
    //tiToMake = time to make the meal
    private int tiToCook;
    //recipe = the written recipe
    private String recipe;


    public Recipes(String reName, int theAmOfDiners, ArrayList<String> ingredients, int noOfIngredients, int tiForPre, int tiToCook, String recipe) {
        this.reName = reName;
        this.theAmOfDiners = theAmOfDiners;
        for (int i = 0; i < ingredients.size(); i++)
        {
            this.ingredients.set(i, ingredients.get(i));
        }
        this.noOfIngredients = noOfIngredients;
        this.tiForPre = tiForPre;
        this.tiToCook = tiToCook;
        this.recipe = recipe;
    }

    public Recipes(String reName, int theAmOfDiners, int noOfIngredients, int tiForPre, int tiToCook, String recipe) {
        this.reName = reName;
        this.theAmOfDiners = theAmOfDiners;
        this.noOfIngredients = noOfIngredients;
        this.tiForPre = tiForPre;
        this.tiToCook = tiToCook;
        this.recipe = recipe;
    }




    public String getReName() {
        return reName;
    }

    public void setReName(String reName) {
        this.reName = reName;
    }

    public int getTheAmOfDiners() {
        return theAmOfDiners;
    }

    public void setTheAmOfDiners(int theAmOfDiners) {
        this.theAmOfDiners = theAmOfDiners;
    }

    //public Bitmap getmPicture() {
       // return mPicture;
    //}

    //public void setmPicture(Bitmap mPicture) {
      //  this.mPicture = mPicture;
    //}


    public int getmPicture() {
        return mPicture;
    }

    public void setmPicture(int mPicture) {
        this.mPicture = mPicture;
    }

    public ArrayList<String> getIngredients() {
       return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        for (int i = 0; i < ingredients.size(); i++){
            this.ingredients.set(i, ingredients.get(i));

//            List<Integer> newList = new ArrayList<>(oldList);

        }
    }

    //public void setOneExper(int i, String string){
      //  this.ingredients.set(i, string);
   // }

    public int getNoOfIngredients() {
        return noOfIngredients;
    }

    public void setNoOfIngredients(int noOfIngredients) {
        this.noOfIngredients = noOfIngredients;
    }

    public double getTiForPre() {
        return tiForPre;
    }

    public void setTiForPre(int tiForPre) {
        this.tiForPre = tiForPre;
    }

    public int getTiToCook() {
        return tiToCook;
    }

    public void setTiToCook(int tiToCook) {
        this.tiToCook = tiToCook;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getIndex(int i){
        return this.ingredients.get(i);
    }

    @Override
    public String toString() {
        return "Recipes{" +
                "reName='" + reName + '\'' +
                ", theAmOfDiners=" + theAmOfDiners +
                ", mPicture=" + mPicture +
                ", ingredients=" + ingredients +
                ", tiForPre=" + tiForPre +
                ", tiToCook=" + tiToCook +
                ", recipe='" + recipe + '\'' +
                '}';
    }
}