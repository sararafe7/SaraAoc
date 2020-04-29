package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import sara.aoc.y2019.Model.SubCategoryItem;

public class CheckedActivity extends AppCompatActivity {

    private TextView tvParent, tvChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checked);

        tvParent = findViewById(R.id.parent);
        tvChild = findViewById(R.id.child);


        String[] checkedIng = new String[MyCategoriesExpandableListAdapter.childItems.size()];
        int k = 0;
        String ingredient;

        //taskName = i.getExtras().getString("task_name");


        for (int i = 0; i < MyCategoriesExpandableListAdapter.parentItems.size(); i++) {

            String isChecked = MyCategoriesExpandableListAdapter.parentItems.get(i).get(ConstantManager.Parameter.IS_CHECKED);
            if (isChecked.equalsIgnoreCase(ConstantManager.CHECK_BOX_CHECKED_TRUE)) {
                tvParent.setText(tvParent.getText() + MyCategoriesExpandableListAdapter
                        .parentItems.get(i).get(ConstantManager.Parameter.CATEGORY_NAME));
            }
            for (int j = 0; j < MyCategoriesExpandableListAdapter.childItems.get(i).size(); j++) {
                String isChildChecked = MyCategoriesExpandableListAdapter.childItems.get(i).get(j).get(ConstantManager.Parameter.IS_CHECKED);
                if (isChildChecked.equalsIgnoreCase(ConstantManager.CHECK_BOX_CHECKED_TRUE)) {
                    tvChild.setText(tvChild.getText() + " , " + MyCategoriesExpandableListAdapter
                            .parentItems.get(i).get(ConstantManager.Parameter.CATEGORY_NAME) + " " + (j + 1));
                    /*//ingredients = res.getStringArray(R.array.Category1);
                    //tvChild.setText(ingredients[j+1]+" ,");
                    Intent intent = new Intent();
                    //ingredient = intent.getDataString(IngredientsExpandableListActivity.arSubCategory1);
                    //checkedIng[k] = String.valueOf(IngredientsExpandableListActivity.arSubCategory1.indexOf());
                    //checkedIng[k] = (String) MyCategoriesExpandableListAdapter.childItems[i];
                   // k++;
                    //for (int l = 0; l < k-1; l++){
                      //  tvChild.setText(tvChild.getText() + checkedIng[l]+", ");
                    //}
                    /tvChild.setText(checkedIng[k-1]);*/
                    //tvChild.setText(tvChild.getText() + " , " + MyCategoriesExpandableListAdapter
                    //  .childItems.get(i).get(ConstantManager.Parameter.SUB_CATEGORY_NAME) + " ");}



                    //recipes[0]= new Recipes("Omelet", 1, 5, 5, "Break the 2 eggs into a small bowl" + '\n'+
                    //                "mix them, and then add the cheese, salt and pepper"+'\n'+"wait for the pan to heat and pour what's inside the bowl into it"
                    //        + '\n' + "flip it when it starts getting cooked to the other side."
                    //        + '\n' + "serve it hot.");
                    //        ingredientsExper.add("eggs");
                    //        ingredientsExper.add("salt");
                    //        ingredientsExper.add("pepper");
                    //        ingredientsExper.add("cheese");


                    //recipes[1]=new Recipes("Pancakes", 8, 15, 10, "In a bowl, mix eggs with milk, melted butter and sugar." +'\n'+
                    //                "In a separate bowl: Sift flour, baking powder and salt" + '\n'+ "create a hole in the flour mixture and pour the liquid into it."
                    //                + '\n' + "Mix slightly until dough is obtained." + '\n' +
                    //                "Grease the pan and pour the mixture into it." + '\n' +
                    //                "Cook on fire on both sides until the amount of steam decreases significantly.");


                    /*recipes[2]=new Recipes();
        recipes[3]=new Recipes();
        recipes[4]=new Recipes();
        recipes[5]=new Recipes();
        recipes[6]=new Recipes();
        recipes[7]=new Recipes();
        recipes[8]=new Recipes();
        recipes[9]=new Recipes();
        recipes[10]=new Recipes();
        recipes[11]=new Recipes();
        recipes[12]=new Recipes();
        recipes[13]=new Recipes();
        recipes[14]=new Recipes();
        recipes[15]=new Recipes();
        recipes[16]=new Recipes();
        recipes[17]=new Recipes();
        recipes[18]=new Recipes();
        recipes[19]=new Recipes();
*/


                }
            }
        }
    }
}
