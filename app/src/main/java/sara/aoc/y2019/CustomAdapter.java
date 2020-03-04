package sara.aoc.y2019;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class CustomAdapter {

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

    public CustomAdapter(String reName, int theAmOfDiners, Bitmap mPicture, ArrayList<String> ingredients, ArrayList<String> ingRecoToAdd, double tiForPre, double tiToMake, String recipe) {
        this.reName = reName;
        this.theAmOfDiners = theAmOfDiners;
        this.mPicture = mPicture;
        this.ingredients = new ArrayList<>(20);
        this.ingRecoToAdd = new ArrayList<>(10);
        this.tiForPre = tiForPre;
        this.tiToMake = tiToMake;
        this.recipe = recipe;
    }
}
