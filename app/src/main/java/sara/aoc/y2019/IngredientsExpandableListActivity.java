package sara.aoc.y2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import sara.aoc.y2019.Model.DataItem;
import sara.aoc.y2019.Model.SubCategoryItem;

public class IngredientsExpandableListActivity extends AppCompatActivity implements View.OnClickListener{

    private ExpandableListView lvCategory;

    private ArrayList<DataItem> arCategory;
    private ArrayList<SubCategoryItem> arSubCategory;
    private ArrayList<ArrayList<SubCategoryItem>> arSubCategoryFinal;

    private ArrayList<HashMap<String, String>> parentItems;
    private ArrayList<ArrayList<HashMap<String, String>>> childItems;
    private MyCategoriesExpandableListAdapter myCategoriesExpandableListAdapter;

    private CheckedTextView chtvDone;
    private TextView textView;


    ArrayList<String> selectedItems = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients_expandable_list);

        chtvDone = findViewById(R.id.chtvDone);
        chtvDone.setOnClickListener(this);
        textView = findViewById(R.id.reNametv);
        setupReferences();

    }

    private void setupReferences() {

        lvCategory = findViewById(R.id.lvCategory);
        arCategory = new ArrayList<>();
        arSubCategory = new ArrayList<>();
        parentItems = new ArrayList<>();
        childItems = new ArrayList<>();

        Resources res = getResources();

        DataItem dataItem = new DataItem();
        dataItem.setCategoryId("1");
        dataItem.setCategoryName("Vegetables");

        String[] ingredients = res.getStringArray(R.array.Category1);
        arSubCategory = new ArrayList<>();
        for(int i = 1; i < 6; i++) {

            SubCategoryItem subCategoryItem = new SubCategoryItem();
            subCategoryItem.setCategoryId(String.valueOf(i));
            subCategoryItem.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            String ingredient = ingredients[i];
            subCategoryItem.setSubCategoryName(ingredient);
            arSubCategory.add(subCategoryItem);
        }
        dataItem.setSubCategory(arSubCategory);
        arCategory.add(dataItem);

        dataItem = new DataItem();
        dataItem.setCategoryId("2");
        dataItem.setCategoryName("Fruits");

        ingredients = res.getStringArray(R.array.Category2);
        arSubCategory = new ArrayList<>();
        for(int i = 0; i < 3; i++) {

            SubCategoryItem subCategoryItem = new SubCategoryItem();
            subCategoryItem.setCategoryId(String.valueOf(i));
            subCategoryItem.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            String ingredient = ingredients[i];
            subCategoryItem.setSubCategoryName(ingredient);
            arSubCategory.add(subCategoryItem);
        }
        dataItem.setSubCategory(arSubCategory);
        arCategory.add(dataItem);

        dataItem = new DataItem();
        dataItem.setCategoryId("3");
        dataItem.setCategoryName("Dairy");

        ingredients = res.getStringArray(R.array.Category3);
        arSubCategory = new ArrayList<>();
        for(int i = 0; i < 3; i++) {

            SubCategoryItem subCategoryItem = new SubCategoryItem();
            subCategoryItem.setCategoryId(String.valueOf(i));
            subCategoryItem.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            String ingredient = ingredients[i];
            subCategoryItem.setSubCategoryName(ingredient);
            arSubCategory.add(subCategoryItem);
        }
        dataItem.setSubCategory(arSubCategory);
        arCategory.add(dataItem);

        dataItem = new DataItem();
        dataItem.setCategoryId("4");
        dataItem.setCategoryName("Meats");

        ingredients = res.getStringArray(R.array.Category4);
        arSubCategory = new ArrayList<>();
        for(int i = 0; i < 3; i++) {

            SubCategoryItem subCategoryItem = new SubCategoryItem();
            subCategoryItem.setCategoryId(String.valueOf(i));
            subCategoryItem.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            String ingredient = ingredients[i];
            subCategoryItem.setSubCategoryName(ingredient);
            arSubCategory.add(subCategoryItem);
        }
        dataItem.setSubCategory(arSubCategory);
        arCategory.add(dataItem);

        dataItem = new DataItem();
        dataItem.setCategoryId("5");
        dataItem.setCategoryName("Fish and Seafood");

        ingredients = res.getStringArray(R.array.Category5);
        arSubCategory = new ArrayList<>();
        for(int i = 0; i < 3; i++) {

            SubCategoryItem subCategoryItem = new SubCategoryItem();
            subCategoryItem.setCategoryId(String.valueOf(i));
            subCategoryItem.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            String ingredient = ingredients[i];
            subCategoryItem.setSubCategoryName(ingredient);
            arSubCategory.add(subCategoryItem);
        }
        dataItem.setSubCategory(arSubCategory);
        arCategory.add(dataItem);

        dataItem = new DataItem();
        dataItem.setCategoryId("6");
        dataItem.setCategoryName("Baking and Grains");

        ingredients = res.getStringArray(R.array.Category6);
        arSubCategory = new ArrayList<>();
        for(int i = 0; i < 3; i++) {

            SubCategoryItem subCategoryItem = new SubCategoryItem();
            subCategoryItem.setCategoryId(String.valueOf(i));
            subCategoryItem.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            String ingredient = ingredients[i];
            subCategoryItem.setSubCategoryName(ingredient);
            arSubCategory.add(subCategoryItem);
        }
        dataItem.setSubCategory(arSubCategory);
        arCategory.add(dataItem);

        dataItem = new DataItem();
        dataItem.setCategoryId("7");
        dataItem.setCategoryName("Spices and Condiments");

        ingredients = res.getStringArray(R.array.Category7);
        arSubCategory = new ArrayList<>();
        for(int i = 0; i < 3; i++) {

            SubCategoryItem subCategoryItem = new SubCategoryItem();
            subCategoryItem.setCategoryId(String.valueOf(i));
            subCategoryItem.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            String ingredient = ingredients[i];
            subCategoryItem.setSubCategoryName(ingredient);
            arSubCategory.add(subCategoryItem);
        }
        dataItem.setSubCategory(arSubCategory);
        arCategory.add(dataItem);


        Log.d("TAG", "setupReferences: "+arCategory.size());

        for(DataItem data : arCategory){
//                        Log.i("Item id",item.id);
            ArrayList<HashMap<String, String>> childArrayList =new ArrayList<HashMap<String, String>>();
            HashMap<String, String> mapParent = new HashMap<String, String>();

            mapParent.put(ConstantManager.Parameter.CATEGORY_ID,data.getCategoryId());
            mapParent.put(ConstantManager.Parameter.CATEGORY_NAME,data.getCategoryName());

            int countIsChecked = 0;

            for(SubCategoryItem subCategoryItem : data.getSubCategory()) {

                HashMap<String, String> mapChild = new HashMap<String, String>();
                mapChild.put(ConstantManager.Parameter.SUB_ID,subCategoryItem.getSubId());
                mapChild.put(ConstantManager.Parameter.SUB_CATEGORY_NAME,subCategoryItem.getSubCategoryName());
                mapChild.put(ConstantManager.Parameter.CATEGORY_ID,subCategoryItem.getCategoryId());
                mapChild.put(ConstantManager.Parameter.IS_CHECKED,subCategoryItem.getIsChecked());

                if(subCategoryItem.getIsChecked().equalsIgnoreCase(ConstantManager.CHECK_BOX_CHECKED_TRUE)) {
                    countIsChecked++;
                }
                childArrayList.add(mapChild);
            }


            if(countIsChecked == data.getSubCategory().size()) {

                data.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_TRUE);
            }else {
                data.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            }

            mapParent.put(ConstantManager.Parameter.IS_CHECKED,data.getIsChecked());
            childItems.add(childArrayList);
            parentItems.add(mapParent);

        }

        ConstantManager.parentItems = parentItems;
        ConstantManager.childItems = childItems;


        myCategoriesExpandableListAdapter = new MyCategoriesExpandableListAdapter(this,parentItems,childItems,false);
        lvCategory.setAdapter(myCategoriesExpandableListAdapter);
    }


    @Override
    public void onClick(View view) {
        if(view==chtvDone) {
            for (int i = 0; i < MyCategoriesExpandableListAdapter.parentItems.size(); i++) {
                String isChecked = MyCategoriesExpandableListAdapter.parentItems.get(i).get(ConstantManager.Parameter.IS_CHECKED);
                if (isChecked.equalsIgnoreCase(ConstantManager.CHECK_BOX_CHECKED_TRUE)) {
                    textView.setText(textView.getText() + MyCategoriesExpandableListAdapter
                            .parentItems.get(i).get(ConstantManager.Parameter.CATEGORY_NAME));
                }
                for (int j = 0; j < MyCategoriesExpandableListAdapter.childItems.get(i).size(); j++) {
                    String isChildChecked = MyCategoriesExpandableListAdapter.childItems.get(i).get(j).get(ConstantManager.Parameter.IS_CHECKED);

                    if (isChildChecked.equalsIgnoreCase(ConstantManager.CHECK_BOX_CHECKED_TRUE)) {
                        textView.setText(textView.getText() + " , " + MyCategoriesExpandableListAdapter
                                .childItems.get(i).get(j).get(ConstantManager.Parameter.SUB_CATEGORY_NAME));
                        selectedItems.add(MyCategoriesExpandableListAdapter
                                .childItems.get(i).get(j).get(ConstantManager.Parameter.SUB_CATEGORY_NAME));

                    }
                }
            }
            textView.setText(selectedItems.toString());
        }


    }
}

