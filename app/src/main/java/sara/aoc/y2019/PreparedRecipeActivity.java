package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class PreparedRecipeActivity extends AppCompatActivity implements View.OnClickListener {

    TextView reNametvPre, theAmOfDinerstvPre, ingredientstvPre, tiForPretvPre,
            tiToCooktvPre, recipetvPre;
    Button backToMealsBtnPre;

    TextView textViewExperPre;

    ArrayList<String> ingredients = new ArrayList<>(10);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prepared_recipe);

        reNametvPre = findViewById(R.id.reNamePre);
        theAmOfDinerstvPre = findViewById(R.id.theAmOfDinersPre);
        ingredientstvPre = findViewById(R.id.ingredientsPre);
        tiForPretvPre = findViewById(R.id.tiForPrePre);
        tiToCooktvPre = findViewById(R.id.tiToCookPre);
        recipetvPre = findViewById(R.id.recipePre);
        backToMealsBtnPre = findViewById(R.id.backToMealsBtnPre);
        backToMealsBtnPre.setOnClickListener(this);

        textViewExperPre = findViewById(R.id.textViewExper);

        Intent intent = getIntent();

        String recipeName = intent.getStringExtra("RECIPE_NAME");

        //        Intent intent2 = this.getIntent();
        //        Bundle bundle = intent2.getExtras();
        ////Type object = (Type) bundle.getSerializable("KEY");
        //        myRecipesPre =  (ArrayList<Recipes>) bundle.getSerializable("RECIPES");
        ////we can send ArrayList, HashMaps or any serializable objects
        ////Use the Type of the object instead of DataClass
        ////in the ablove example


        //1st recipe:
        if (recipeName.equals("Omelet")) {
            reNametvPre.setText(reNametvPre.getText()+" Omelet");
            theAmOfDinerstvPre.setText(theAmOfDinerstvPre.getText()+" 1");

            ingredients.add("Eggs");
            ingredients.add("Salt");
            ingredients.add("Pepper");
            ingredients.add("Cheese");
            ingredients.add("Olive Oil");

            for (int i = 0; i < 5; i++) {
                ingredientstvPre.setText(ingredientstvPre.getText() + "" + '\n' + "" + (i + 1) + ". "
                        + ingredients.get(i));

            }
            tiForPretvPre.setText(tiForPretvPre.getText()+" 5 mins");
            tiToCooktvPre.setText(tiToCooktvPre.getText()+" 5 mins");
            recipetvPre.setText(recipetvPre.getText() + "Break the 2 eggs into a small bowl"
                    + '\n' + "Mix them, and then add the cheese, salt and pepper."
                    + '\n' + "Wait for the pan to heat and pour what's inside the bowl into it."
                    + '\n' + "Flip it when it starts getting cooked to the other side."
                    + '\n' + "Serve it hot.");
        }

        //2nd recipe:
        if (recipeName.equals("Pancakes")) {
            reNametvPre.setText(reNametvPre.getText()+"Pancakes");
            theAmOfDinerstvPre.setText(theAmOfDinerstvPre.getText()+"8");

            ingredients.add("2 Eggs");
            ingredients.add("1/4 Cup of Sugar");
            ingredients.add("1 Cup of Milk");
            ingredients.add("50 gr Butter");
            ingredients.add("1 1/2 Cup of Flour");
            ingredients.add("2 tsp of Baking Powder");
            ingredients.add("Butter Flavored Oil Spray");

            for (int i = 0; i < 7; i++) {
                ingredientstvPre.setText(ingredientstvPre.getText() + "" + '\n' + (i + 1) +
                        ". " + ingredients.get(i));
            }
            tiForPretvPre.setText(tiForPretvPre.getText()+ " 15 mins");
            tiToCooktvPre.setText(tiToCooktvPre.getText()+ " 10 mins");
            recipetvPre.setText(recipetvPre.getText() + "In a bowl, mix eggs with milk, melted butter and sugar." + '\n' +
                                    "In a separate bowl: Sift flour, baking powder and salt." + '\n' +
                                    "Create a hole in the flour mixture and pour the liquid into it." + '\n' +
                                    "Mix slightly until dough is obtained." + '\n' +
                                    "Grease the pan and pour the mixture into it." + '\n' +
                                    "Cook on fire on both sides until the amount of steam decreases significantly.");
        }

        //3rd recipe:
        if (recipeName.equals("Roasted Salmon with Green Beans and Tomatoes")) {
            reNametvPre.setText(reNametvPre.getText()+"Roasted Salmon with Green Beans and Tomatoes");
            theAmOfDinerstvPre.setText(theAmOfDinerstvPre.getText()+"4");

            ingredients.add("6 Cloves Garlic, smashed");
            ingredients.add("1 1/4 Green Beans, trimmed");
            ingredients.add("2 tbsp. Olive Oil ");
            ingredients.add("Salt");
            ingredients.add("Pepper");
            ingredients.add("0.5 kilogram skinless Salmon fillet, cut into 4 pieces");

            for (int i = 0; i < 6; i++) {
                ingredientstvPre.setText(ingredientstvPre.getText() + "" + '\n' + "" + (i + 1) + ". "
                        + ingredients.get(i));
            }
            tiForPretvPre.setText(tiForPretvPre.getText()+ "20 mins");
            tiToCooktvPre.setText(tiToCooktvPre.getText()+ "20 mins");
            recipetvPre.setText(recipetvPre.getText() + "Heat oven to 220°C." + '\n'
                    + "On large rimmed baking sheet, toss garlic, beans, tomatoes and olives with 1 tablespoon oil and 1/4 teaspoon pepper." + '\n'
                    + "Roast until vegetables are tender and beginning to brown, 12 to 15 minutes." + '\n'
                    + "Meanwhile, heat remaining tablespoon oil in large skillet over medium heat." + '\n'
                    + "Season salmon with 1/4 teaspoon each salt and pepper and cook until golden brown and opaque throughout, 4 to 5 minutes per side." + '\n'
                    + "Serve with vegetables.");
        }

        //4th recipe:
        if (recipeName.equals("Greek Salad")) {
            reNametvPre.setText(reNametvPre.getText()+"Greek Salad");
            theAmOfDinerstvPre.setText(theAmOfDinerstvPre.getText()+"4");

            ingredients.add("1 pt. Cherry Tomatoes, halved");
            ingredients.add("1 Cucumber, thinly sliced into half moons");
            ingredients.add("1 c. halved Kalamata Olives");
            ingredients.add("1/2 Red Onion, thinly sliced");
            ingredients.add("3/4 c. Crumbled Feta");

            for (int i = 0; i < 5; i++) {
                ingredientstvPre.setText(ingredientstvPre.getText() + "" + '\n' + "" + (i + 1) + ". "
                        + ingredients.get(i));

            }
            tiForPretvPre.setText(tiForPretvPre.getText()+ "15 mins");
            tiToCooktvPre.setText(tiToCooktvPre.getText()+ "0 mins");
            recipetvPre.setText(recipetvPre.getText() + "In a large bowl, stir together tomatoes, cucumber, olives, and red onion." + '\n'
                    + "Gently fold in feta.");
        }

        //5th recipe:
        if (recipeName.equals("Bowties and Broccoli")) {
            reNametvPre.setText(reNametvPre.getText()+"Bowties and Broccoli");
            theAmOfDinerstvPre.setText(theAmOfDinerstvPre.getText()+"6");

            ingredients.add("12 oz Pasta");
            ingredients.add("0.5 Frozen Broccoli");
            ingredients.add("3 Tbsp Butter");
            ingredients.add("3 Tbsp grated Parmesan");
            ingredients.add("Salt");
            ingredients.add("Pepper");

            for (int i = 0; i < 6; i++) {
                ingredientstvPre.setText(ingredientstvPre.getText() + "" + '\n' + "" + (i + 1) + ". "
                        + ingredients.get(i));

            }
            tiForPretvPre.setText(tiForPretvPre.getText()+ "5 mins");
            tiToCooktvPre.setText(tiToCooktvPre.getText()+ "10 mins");
            recipetvPre.setText(recipetvPre.getText() + "Bring a pot of water to a boil, then add the pasta." + '\n' +
                    "Boil until the pasta is al dente (7-10 minutes)." + '\n' +
                    "Add the frozen broccoli florets to the boiling pasta water, turn off the heat, and let sit for 1-2 minutes, or until the broccoli is tender-crisp." + '\n' +
                    "Drain the pasta and broccoli in a colander." + '\n' +
                    "Transfer the pasta and broccoli back to the pot (with the heat off) or to a bowl and add the butter." + '\n' +
                    "Toss until the butter has melted and coated everything." + '\n' +
                    "Add the Parmesan, salt and pepper, then toss to coat again." + '\n' +
                    "Serve immediately.");
        }

        //6th recipe:
        if (recipeName.equals("Pesto Chicken")) {
            reNametvPre.setText(reNametvPre.getText()+"Pesto Chicken");
            theAmOfDinerstvPre.setText(theAmOfDinerstvPre.getText()+"1");

            ingredients.add("2 slices of Chicken Breasts");
            ingredients.add("Basil Pesto");
            ingredients.add("6 slices of Mozzarella");
            ingredients.add("1 Tomato");
            ingredients.add("Salt");
            ingredients.add("Pepper");

            for (int i = 0; i < 6; i++) {
                ingredientstvPre.setText(ingredientstvPre.getText() + "" + '\n' + "" + (i + 1) + ". "
                        + ingredients.get(i));

            }
            tiForPretvPre.setText(tiForPretvPre.getText()+ "5 mins");
            tiToCooktvPre.setText(tiToCooktvPre.getText()+ "5 mins");
            recipetvPre.setText(recipetvPre.getText() + "Top the chicken breasts (raw or seared) with salt, pepper and a thick layer of basil pesto." + '\n' +
                    "Place sliced mozzarella cheese on top of the basil pesto." + '\n' +
                    "Finish the assembly of the pesto chicken by layering on a couple of thinly sliced tomatoes." + '\n' +
                    "Bake the Pesto Chicken in the oven at 180 degrees until the chicken is cooked through." + '\n' +
                    "Serve immediately.");
        }

        //7th recipe:
        if (recipeName.equals("Earthquake Cake")) {
            reNametvPre.setText(reNametvPre.getText()+"Earthquake Cake");
            theAmOfDinerstvPre.setText(theAmOfDinerstvPre.getText()+"6");

            ingredients.add("1½ cups of Flour");
            ingredients.add("1¼ tsp Salt");
            ingredients.add("¾ tsp Baking Soda");
            ingredients.add("¾ cup Butter, divided");
            ingredients.add("1 cup Brown Sugar");
            ingredients.add("¼ cup (50 g) Granulated Sugar");
            ingredients.add("1 Egg");
            ingredients.add("2 Egg yolks");
            ingredients.add("2 tsp. Vanilla Extract");
            ingredients.add("6 oz. Bittersweet Chocolate");

            for (int i = 0; i < 10; i++) {
                ingredientstvPre.setText(ingredientstvPre.getText() + "" + '\n' + "" + (i + 1) + ". "
                        + ingredients.get(i));

            }
            tiForPretvPre.setText(tiForPretvPre.getText()+ "30 mins");
            tiToCooktvPre.setText(tiToCooktvPre.getText()+ "30 mins");
            recipetvPre.setText(recipetvPre.getText() + "Place racks in upper and lower thirds of oven; preheat to 150°." + '\n' +
                    "Whisk flour, salt, and baking soda in a small bowl; set aside." + '\n' +
                    "Cook ½ cup butter in a large saucepan over medium heat, swirling often and scraping bottom of pan with a heatproof rubber spatula, until butter foams, then browns, about 4 minutes." + '\n' +
                    "Transfer butter to a large heatproof bowl and let cool 1 minute." + '\n' +
                    "Cut remaining ¼ cup (½ stick; 56 g) butter into small pieces and add to brown butter" + '\n' +
                    "Once butter is melted, add both sugars and whisk, breaking up any clumps, until sugar is incorporated and no lumps remain." + '\n' +
                    "Add egg and egg yolks and whisk until sugar dissolves and mixture is smooth, about 30 seconds." + '\n' +
                    "Whisk in vanilla." + '\n' +
                    "Using rubber spatula, fold reserved dry ingredients into butter mixture just until no dry spots remain, then fold in chocolate." + '\n' +
                    "Using a 1½-oz. scoop (3 Tbsp.), portion out 16 balls of dough and divide between 2 parchment-lined rimmed baking sheets." + '\n' +
                    "Bake cookies, rotating sheets if cookies are browning very unevenly, until deep golden brown and firm around the edges, 8–10 minutes." + '\n' +
                    "Let cool on baking sheets.");
        }

        //8th recipe:
        if (recipeName.equals("Brownies")) {
            reNametvPre.setText(reNametvPre.getText()+"Brownies");
            theAmOfDinerstvPre.setText(theAmOfDinerstvPre.getText()+"4");

            ingredients.add("½ cup Butter");
            ingredients.add("1 cup White Sugar");
            ingredients.add("2 Eggs");
            ingredients.add("1 teaspoon Vanilla Extract");
            ingredients.add("⅓ cup unsweetened Cocoa Powder");
            ingredients.add("½ cup all-purpose Flour");
            ingredients.add("¼ teaspoon Salt");
            ingredients.add("¼ teaspoon Baking Powder");

            for (int i = 0; i < 8; i++) {
                ingredientstvPre.setText(ingredientstvPre.getText() + "" + '\n' + "" + (i + 1) + ". "
                        + ingredients.get(i));

            }
            tiForPretvPre.setText(tiForPretvPre.getText()+ "25 mins");
            tiToCooktvPre.setText(tiToCooktvPre.getText()+ "35 mins");
            recipetvPre.setText(recipetvPre.getText() + "Preheat oven to 350 degrees F (175 degrees C)." + '\n' +
                    "Grease and flour an 8-inch square pan." + '\n' +
                    "In a large saucepan, melt 1/2 cup butter." + '\n' +
                    "Remove from heat, and stir in sugar, eggs, and 1 teaspoon vanilla." + '\n' +
                    "Beat in 1/3 cup cocoa, 1/2 cup flour, salt, and baking powder." + '\n' +
                    "Spread batter into prepared pan." + '\n' +
                    "Bake in preheated oven for 25 to 30 minutes." + '\n' +
                    "Do not overcook.");
        }
    }

    @Override
    public void onClick(View view) {
        if (view == backToMealsBtnPre) {
            Intent i = new Intent(this, MealsActivity.class);
            startActivity(i);
        }
    }
}