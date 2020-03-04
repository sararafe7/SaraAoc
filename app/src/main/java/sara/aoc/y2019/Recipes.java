package sara.aoc.y2019;

import android.graphics.Bitmap;

import java.util.ArrayList;

public class Recipes {
    //reName = recipe name
    private String reName;
    //theAmOfDiners = theAmountOfDiners
    private int theAmOfDiners;
    //mPicture = meal picture
    private Bitmap mPicture;
    //ingredients = the necessary ingredients for the recipe
    private ArrayList<String> ingredients;
    //ingRecoToAdd = ingredients recommended to add but not necessary
    private ArrayList<String> ingRecoToAdd;
    //tiForPre = time for the meal to prepare
    private double tiForPre;
    //tiToMake = time to make the meal
    private double tiToMake;
    //recipe = the written recipe
    private String recipe;



    public Recipes(String reName, int theAmOfDiners, Bitmap mPicture, ArrayList<String> ingredients, ArrayList<String> ingRecoToAdd, double tiForPre, double tiToMake, String recipe) {
        this.reName = reName;
        this.theAmOfDiners = theAmOfDiners;
        this.mPicture = mPicture;
        this.ingredients = new ArrayList<>(20);
        this.ingRecoToAdd = new ArrayList<>(10);
        this.tiForPre = tiForPre;
        this.tiToMake = tiToMake;
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

    public Bitmap getmPicture() {
        return mPicture;
    }

    public void setmPicture(Bitmap mPicture) {
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

    public void setTiForPre(double tiForPre) {
        this.tiForPre = tiForPre;
    }

    public double getTiToMake() {
        return tiToMake;
    }

    public void setTiToMake(double tiToMake) {
        this.tiToMake = tiToMake;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public Recipes() {
    }
}