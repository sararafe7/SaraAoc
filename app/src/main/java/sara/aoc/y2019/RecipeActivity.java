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

public class RecipeActivity extends AppCompatActivity implements View.OnClickListener {

    TextView reNametv, theAmOfDinerstv, ingredientstv, tiForPretv,
            tiToCooktv, recipetv;
    Button backToMealsBtn;
    DatabaseReference reff;
    Recipes recipe;
    ImageView imageView;
    Bitmap bitmap;

    ArrayList<Recipes> myRecipes = new ArrayList<>();
    ArrayList<String> selectedItems = new ArrayList<>();
    ArrayList<String> ingredients = new ArrayList<>();
    ArrayList<String> ingredients1 = new ArrayList<>();
    ArrayList<String> ingredients2 = new ArrayList<>();
    ArrayList<String> ingredients3 = new ArrayList<>();
    ArrayList<String> ingredients4 = new ArrayList<>();
    ArrayList<String> ingredients5 = new ArrayList<>();
    ArrayList<String> ingredients6 = new ArrayList<>();
    ArrayList<String> ingredients7 = new ArrayList<>();

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
        myRecipes.add(new Recipes("Omelet", 1, 4, 5, 5, "Break the 2 eggs into a small bowl"
                + '\n' + "Mix them, and then add the cheese, salt and pepper."
                + '\n' + "Wait for the pan to heat and pour what's inside the bowl into it."
                + '\n' + "Flip it when it starts getting cooked to the other side."
                + '\n' + "Serve it hot."));

        ingredients.add("Eggs");
        ingredients.add("Salt");
        ingredients.add("Pepper");
        ingredients.add("Cheese");

        //////////myRecipes.get(0).setIngredients(ingredients);
        //myRecipes.get(0).setOneExper(0, "Eggs");
        //////////    myRecipes.get(0).setIngredients(ingredients);


        //2nd recipe:
        myRecipes.add(new Recipes("Pancakes", 8, 7, 15, 10, "In a bowl, mix eggs with milk, melted butter and sugar." + '\n' +
                "In a separate bowl: Sift flour, baking powder and salt." + '\n' +
                "Create a hole in the flour mixture and pour the liquid into it." + '\n' +
                "Mix slightly until dough is obtained." + '\n' +
                "Grease the pan and pour the mixture into it." + '\n' +
                "Cook on fire on both sides until the amount of steam decreases significantly."));

        ingredients1.add("2 Eggs");
        ingredients1.add("1/4 Cup of Sugar");
        ingredients1.add("1 Cup of Milk");
        ingredients1.add("50 gr Butter");
        ingredients1.add("1 1/2 Cup of Flour");
        ingredients1.add("2 tsp of Baking Powder");
        ingredients1.add("Butter Flavored Oil Spray");

        //////   myRecipes.get(1).setIngredients(ingredients);


        //3rd recipe:
        myRecipes.add(new Recipes("Roasted Salmon with Green Beans and Tomatoes", 4, 6, 20, 20, "Heat oven to 220°C." + '\n'
                + "On large rimmed baking sheet, toss garlic, beans, tomatoes and olives with 1 tablespoon oil and 1/4 teaspoon pepper." + '\n'
                + "Roast until vegetables are tender and beginning to brown, 12 to 15 minutes." + '\n'
                + "Meanwhile, heat remaining tablespoon oil in large skillet over medium heat." + '\n'
                + "Season salmon with 1/4 teaspoon each salt and pepper and cook until golden brown and opaque throughout, 4 to 5 minutes per side." + '\n'
                + "Serve with vegetables."));

        ingredients2.add("6 Cloves Garlic, smashed");
        ingredients2.add("1 1/4 Green Beans, trimmed");
        ingredients2.add("2 tbsp. Olive Oil ");
        ingredients2.add("Salt");
        ingredients2.add("Pepper");
        ingredients2.add("0.5 kilogram skinless Salmon fillet, cut into 4 pieces");

        ///////      myRecipes.get(2).setIngredients(ingredients);


        //4th recipe:
        myRecipes.add(new Recipes("Greek Salad", 4, 5, 15, 0, "In a large bowl, stir together tomatoes, cucumber, olives, and red onion." + '\n'
                + "Gently fold in feta."));

        ingredients3.add("1 pt. Cherry Tomatoes, halved");
        ingredients3.add("1 Cucumber, thinly sliced into half moons");
        ingredients3.add("1 c. halved Kalamata Olives");
        ingredients3.add("1/2 Red Onion, thinly sliced");
        ingredients3.add("3/4 c. Crumbled Feta");

///////        myRecipes.get(3).setIngredients(ingredients);


        //5th recipe:
        myRecipes.add(new Recipes("Bowties and Broccoli", 6, 6, 5, 10, "Bring a pot of water to a boil, then add the pasta." + '\n' +
                "Boil until the pasta is al dente (7-10 minutes)." + '\n' +
                "Add the frozen broccoli florets to the boiling pasta water, turn off the heat, and let sit for 1-2 minutes, or until the broccoli is tender-crisp." + '\n' +
                "Drain the pasta and broccoli in a colander." + '\n' +
                "Transfer the pasta and broccoli back to the pot (with the heat off) or to a bowl and add the butter." + '\n' +
                "Toss until the butter has melted and coated everything." + '\n' +
                "Add the Parmesan, salt and pepper, then toss to coat again." + '\n' +
                "Serve immediately."));

        ingredients4.add("12 oz Pasta");
        ingredients4.add("0.5 Frozen Broccoli");
        ingredients4.add("3 Tbsp Butter");
        ingredients4.add("3 Tbsp grated Parmesan");
        ingredients4.add("Salt");
        ingredients4.add("Pepper");

//////        myRecipes.get(4).setIngredients(ingredients);

        //6th recipe:
        myRecipes.add(new Recipes("Pesto Chicken", 1, 6, 5, 5, "Top the chicken breasts (raw or seared) with salt, pepper and a thick layer of basil pesto." + '\n' +
                "Place sliced mozzarella cheese on top of the basil pesto." + '\n' +
                "Finish the assembly of the pesto chicken by layering on a couple of thinly sliced tomatoes." + '\n' +
                "Bake the Pesto Chicken in the oven at 180 degrees until the chicken is cooked through." + '\n' +
                "Serve immediately."));

        ingredients5.add("2 slices of Chicken Breasts");
        ingredients5.add("Basil Pesto");
        ingredients5.add("6 slices of Mozzarella");
        ingredients5.add("1 Tomato");
        ingredients5.add("Salt");
        ingredients5.add("Pepper");


        //7th recipe:
        myRecipes.add(new Recipes("Earthquake cake", 6, 10, 30, 30, "Place racks in upper and lower thirds of oven; preheat to 150°." + '\n' +
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

        ingredients6.add("1½ cups of Flour");
        ingredients6.add("1¼ tsp Salt");
        ingredients6.add("¾ tsp Baking Soda");
        ingredients6.add("¾ cup Butter, divided");
        ingredients6.add("1 cup Brown Sugar");
        ingredients6.add("¼ cup (50 g) Granulated Sugar");
        ingredients6.add("1 Egg");
        ingredients6.add("2 Egg yolks");
        ingredients6.add("2 tsp. Vanilla Extract");
        ingredients6.add("6 oz. Bittersweet Chocolate");

/////        //myRecipes.get(6).setIngredients(ingredients);


        //8th recipe:
        myRecipes.add(new Recipes("Brownies", 4, 8, 25, 35, "" + '\n' +
                "Preheat oven to 350 degrees F (175 degrees C)." + '\n' +
                "Grease and flour an 8-inch square pan." + '\n' +
                "In a large saucepan, melt 1/2 cup butter." + '\n' +
                "Remove from heat, and stir in sugar, eggs, and 1 teaspoon vanilla." + '\n' +
                "Beat in 1/3 cup cocoa, 1/2 cup flour, salt, and baking powder." + '\n' +
                "Spread batter into prepared pan." + '\n' +
                "Bake in preheated oven for 25 to 30 minutes." + '\n' +
                "Do not overcook."));

        ingredients7.add("½ cup Butter");
        ingredients7.add("1 cup White Sugar");
        ingredients7.add("2 Eggs");
        ingredients7.add("1 teaspoon Vanilla Extract");
        ingredients7.add("⅓ cup unsweetened Cocoa Powder");
        ingredients7.add("½ cup all-purpose Flour");
        ingredients7.add("¼ teaspoon Salt");
        ingredients7.add("¼ teaspoon Baking Powder");

        //////myRecipes.get(7).setIngredients(ingredients);

        // reNametv.setText();
//        for (int i = 0; i < myRecipes.get(0).getIngredients().size(); i++) {
  //          ingredientstv.setText(myRecipes.get(0).getIngredients().get(0));
    //    }

        //ingredientstv.getText() + "" + '\n' + "" + (i + 1) + ". " + ingredients.get(i)

        for (int i = 0; i < MyCategoriesExpandableListAdapter.parentItems.size(); i++) {

            for (int j = 0; j < MyCategoriesExpandableListAdapter.childItems.get(i).size(); j++) {
                String isChildChecked = MyCategoriesExpandableListAdapter.childItems.get(i).get(j).get(ConstantManager.Parameter.IS_CHECKED);

                if (isChildChecked.equalsIgnoreCase(ConstantManager.CHECK_BOX_CHECKED_TRUE)) {
                    textViewExper.setText(textViewExper.getText() + " , " + MyCategoriesExpandableListAdapter
                            .childItems.get(i).get(j).get(ConstantManager.Parameter.SUB_CATEGORY_NAME));
                    selectedItems.add(MyCategoriesExpandableListAdapter
                            .childItems.get(i).get(j).get(ConstantManager.Parameter.SUB_CATEGORY_NAME));

                }
            }
        }


        ArrayList<String> finalIngredients = new ArrayList<>();
        int count = 0;

        //i for recipes
        for (int i = 0; i < myRecipes.size(); i++) {

            finalIngredients = myRecipes.get(i).getIngredients();

            //j for selectedItems
            for (int j = 0; j < selectedItems.size(); j++) {

                //k for ingredients
                for (int k = 0; k < ingredients.size(); k++) {
                    if (ingredients.get(k).contains(selectedItems.get(j)))
                        count++;
                }
            }
            if ((count / myRecipes.get(i).getNoOfIngredients()) >= 0.8) {
                reNametv.setText(myRecipes.get(i).getReName());

            }


        }

        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putSerializable("RECIPES", myRecipes);
        intent.putExtras(bundle);


        ///for (int i = 0; i < recipes[0].getIngredients().length; i++){
        //if (recipes[0].getIngredients()[i]!=null)
        // textView.setText(textView.getText() +" " + (i+1) + ". "+ recipes[0].getIngredients()[i]+ '\n');
        // textView2.setText(textView.getText() +" " + (i+1) + ". "+ recipes[0].getmPicture()[i]+ '\n');
        //}

    }
        public void onClick (View view){
            if (view == backToMealsBtn) {
                Intent i = new Intent(this, MealsActivity.class);
                startActivity(i);
            }
        }
}

