package sara.aoc.y2019;

import android.graphics.Bitmap;

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
    //tiForPre = time for the meal to prepare
    private int tiForPre;
    //tiToMake = time to make the meal
    private int tiToCook;
    //recipe = the written recipe
    private String recipe;



    public Recipes(String reName, int theAmOfDiners, int tiForPre, int tiToCook, String recipe) {
        this.reName = reName;
        this.theAmOfDiners = theAmOfDiners;
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
        this.ingredients = ingredients;
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

    public void settiToCook(int tiToMake) {
        this.tiToCook = tiToCook;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
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