package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

public class RecipeActivity extends AppCompatActivity implements View.OnClickListener{

    TextView reNametv, theAmOfDinerstv, ingredientstv, tiForPretv,
            tiToCooktv, recipetv;
    Button backToMealsBtn;
    DatabaseReference reff;
    Recipes recipe;
    ImageView imageView;
    Bitmap bitmap;

     ArrayList<Recipes> myRecipes;
    ArrayList<String> ingredients = new ArrayList<>();
    ArrayList<String> selectedItems = new ArrayList<>();

     TextView textViewExper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        reNametv = findViewById(R.id.reName);
        theAmOfDinerstv = findViewById(R.id.theAmOfDiners);
        ingredientstv = findViewById(R.id.ingredients);
        tiForPretv = findViewById(R.id.tiForPre);
        tiToCooktv = findViewById(R.id.tiToCooktv);
        recipetv = findViewById(R.id.recipe);
        backToMealsBtn = findViewById(R.id.backToMealsBtn);
        backToMealsBtn.setOnClickListener(this);

        textViewExper = findViewById(R.id.textViewExper);


        // for now i removed R.drawable.omelet (Bitmappppp/int - from Recipes CLASS

        //1st recipe:
        myRecipes.add(new Recipes("Omelet", 1, 5, 5, "Break the 2 eggs into a small bowl" + '\n'+
                "mix them, and then add the cheese, salt and pepper"+'\n'+"wait for the pan to heat and pour what's inside the bowl into it"
                + '\n' + "flip it when it starts getting cooked to the other side."
                + '\n' + "serve it hot."));

        ingredients.add("eggs");
        ingredients.add("salt");
        ingredients.add("pepper");
        ingredients.add("cheese");

        myRecipes.get(0).setIngredients(ingredients);


        //2nd recipe:
        myRecipes.add(new Recipes("Pancakes", 8, 15, 10, "In a bowl, mix eggs with milk, melted butter and sugar." +'\n'+
                "In a separate bowl: Sift flour, baking powder and salt" + '\n'+ "create a hole in the flour mixture and pour the liquid into it."
                + '\n' + "Mix slightly until dough is obtained." + '\n' +
                "Grease the pan and pour the mixture into it." + '\n' +
                "Cook on fire on both sides until the amount of steam decreases significantly."));

        ingredients.add("2 eggs");
        ingredients.add("1/4 cup of sugar");
        ingredients.add("1 cup of milk");
        ingredients.add("50 gr butter");
        ingredients.add("1 1/2 cup of flour");
        ingredients.add("2 tsp of baking powder");
        ingredients.add("Butter flavored oil spray");

        myRecipes.get(1).setIngredients(ingredients);


        //3rd recipe:
        myRecipes.add(new Recipes("Roasted Salmon with Green Beans and Tomatoes", 4, 20, 20, "Heat oven to 220°C."+ '\n'
        + "On large rimmed baking sheet, toss garlic, beans, tomatoes and olives with 1 tablespoon oil and 1/4 teaspoon pepper." +'\n'
        +"Roast until vegetables are tender and beginning to brown, 12 to 15 minutes." + '\n'
        +"Meanwhile, heat remaining tablespoon oil in large skillet over medium heat." + '\n'
        +"Season salmon with 1/4 teaspoon each salt and pepper and cook until golden brown and opaque throughout, 4 to 5 minutes per side." + '\n'
        +"Serve with vegetables."));

        ingredients.add("6 cloves garlic, smashed");
        ingredients.add("1 1/4 green beans, trimmed");
        ingredients.add("2 tbsp. olive oil ");
        ingredients.add("Salt");
        ingredients.add("Pepper");
        ingredients.add("0.5 kilogram skinless salmon fillet, cut into 4 pieces");

        myRecipes.get(2).setIngredients(ingredients);


        //4th recipe:
        myRecipes.add(new Recipes("Greek Salad", 4, 15, 0, "In a large bowl, stir together tomatoes, cucumber, olives, and red onion."+ '\n'
        +"Gently fold in feta."));

        ingredients.add("1 pt. cherry tomatoes, halved");
        ingredients.add("1 cucumber, thinly sliced into half moons");
        ingredients.add("1 c. halved kalamata olives");
        ingredients.add("1/2 red onion, thinly sliced");
        ingredients.add("3/4 c. crumbled feta");

        myRecipes.get(3).setIngredients(ingredients);


        //5th recipe:
        myRecipes.add(new Recipes("Bowties and Broccoli", 6, 5, 10, "Bring a pot of water to a boil, then add the pasta." + '\n'+
                "Boil until the pasta is al dente (7-10 minutes)." + '\n' +
                "Add the frozen broccoli florets to the boiling pasta water, turn off the heat, and let sit for 1-2 minutes, or until the broccoli is tender-crisp." + '\n' +
                "Drain the pasta and broccoli in a colander." +'\n'+
                "Transfer the pasta and broccoli back to the pot (with the heat off) or to a bowl and add the butter." + '\n' +
                "Toss until the butter has melted and coated everything." + '\n' +
                "Add the Parmesan, salt and pepper, then toss to coat again." + '\n' +
                "Serve immediately."));

        ingredients.add("12 oz pasta");
        ingredients.add("0.5 frozen broccoli");
        ingredients.add("3 Tbsp butter");
        ingredients.add("3 Tbsp grated Parmesan");
        ingredients.add("Salt");
        ingredients.add("Pepper");

        myRecipes.get(4).setIngredients(ingredients);

        //6th recipe:
        myRecipes.add(new Recipes("Pesto Chicken", 1, 5, 5, "Top the chicken breasts (raw or seared) with salt, pepper and a thick layer of basil pesto." + '\n' +
                "Place sliced mozzarella cheese on top of the basil pesto." + '\n' +
                "Finish the assembly of the pesto chicken by layering on a couple of thinly sliced tomatoes." + '\n' +
                "Bake the Pesto Chicken in the oven at 180 degrees until the chicken is cooked through." + '\n' +
                "Serve immediately."));

        ingredients.add("2 slices of Chicken breasts");
        ingredients.add("Basil pesto");
        ingredients.add("6 slices of Mozzarella");
        ingredients.add("1 tomato");
        ingredients.add("Salt");
        ingredients.add("Pepper");


        //7th recipe:
        myRecipes.add(new Recipes("Earthquake cake", 6, 30, 30, "Place racks in upper and lower thirds of oven; preheat to 150°." + '\n' +
                "Whisk flour, salt, and baking soda in a small bowl; set aside.\u2028" + '\n' +
                "Cook ½ cup butter in a large saucepan over medium heat, swirling often and scraping bottom of pan with a heatproof rubber spatula, until butter foams, then browns, about 4 minutes." + '\n' +
                "Transfer butter to a large heatproof bowl and let cool 1 minute." + '\n' +
                "Cut remaining ¼ cup (½ stick; 56 g) butter into small pieces and add to brown butter\u2028" + '\n' +
                "Once butter is melted, add both sugars and whisk, breaking up any clumps, until sugar is incorporated and no lumps remain." + '\n' +
                "Add egg and egg yolks and whisk until sugar dissolves and mixture is smooth, about 30 seconds." + '\n' +
                "Whisk in vanilla." + '\n' +
                "Using rubber spatula, fold reserved dry ingredients into butter mixture just until no dry spots remain, then fold in chocolate." + '\n' +
                "Using a 1½-oz. scoop (3 Tbsp.), portion out 16 balls of dough and divide between 2 parchment-lined rimmed baking sheets." + '\n' +
                "Bake cookies, rotating sheets if cookies are browning very unevenly, until deep golden brown and firm around the edges, 8–10 minutes." + '\n' +
                "Let cool on baking sheets."));

        ingredients.add("1½ cups of flour");
        ingredients.add("1¼ tsp salt");
        ingredients.add("¾ tsp baking soda");
        ingredients.add("¾ cup butter, divided");
        ingredients.add("1 cup brown sugar");
        ingredients.add("¼ cup (50 g) granulated sugar");
        ingredients.add("1 egg");
        ingredients.add("2 egg yolks");
        ingredients.add("2 tsp. vanilla extract");
        ingredients.add("6 oz. bittersweet chocolate");

        myRecipes.get(6).setIngredients(ingredients);


        //8th recipe:
        myRecipes.add(new Recipes("Brownies", 4, 25, 35, "" + '\n' +
                "Preheat oven to 350 degrees F (175 degrees C)." + '\n' +
                "Grease and flour an 8-inch square pan." + '\n' +
                "In a large saucepan, melt 1/2 cup butter." + '\n' +
                "Remove from heat, and stir in sugar, eggs, and 1 teaspoon vanilla." + '\n' +
                "Beat in 1/3 cup cocoa, 1/2 cup flour, salt, and baking powder." + '\n' +
                "Spread batter into prepared pan." + '\n' +
                "Bake in preheated oven for 25 to 30 minutes." + '\n' +
                "Do not overcook."));

        ingredients.add("½ cup butter");
        ingredients.add("1 cup white sugar");
        ingredients.add("2 eggs");
        ingredients.add("1 teaspoon vanilla extract");
        ingredients.add("⅓ cup unsweetened cocoa powder");
        ingredients.add("½ cup all-purpose flour");
        ingredients.add("¼ teaspoon salt");
        ingredients.add("¼ teaspoon baking powder");

        myRecipes.get(7).setIngredients(ingredients);

        // reNametv.setText();
        for (int i = 0; i < myRecipes.get(i).getIngredients().size(); i++){
            ingredientstv.setText(ingredientstv.getText() + "" + '\n' + "" + (i+1) + ". " + ingredients.get(i) );
        }

        ///for (int i = 0; i < recipes[0].getIngredients().length; i++){
            //if (recipes[0].getIngredients()[i]!=null)
               // textView.setText(textView.getText() +" " + (i+1) + ". "+ recipes[0].getIngredients()[i]+ '\n');
           // textView2.setText(textView.getText() +" " + (i+1) + ". "+ recipes[0].getmPicture()[i]+ '\n');
           // reNametv.setText(recipes[0].getReName());


       //}

        }

    public void onClick(View view) {
        if (view == backToMealsBtn) {
            Intent i = new Intent(this, MealsActivity.class);
            startActivity(i);
        }
    }
}

