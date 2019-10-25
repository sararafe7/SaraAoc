package sara.aoc.y2019;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

    public class CustomAdapter2 extends ArrayAdapter<IngredientsCheck> {

        private int resourceLayout;
        private Context mContext;

        public CustomAdapter2(Context context, int resource, List<IngredientsCheck> items) {
            super(context, resource, items);
            this.resourceLayout = resource;
            this.mContext = context;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View v = convertView;
            if(v == null)
                v = LayoutInflater.from(mContext).inflate(resourceLayout,parent,false);


            IngredientsCheck p = getItem(position);

            if (p != null) {
                TextView tvName = (TextView) v.findViewById(R.id.tvIngredientName);
                tvName.setText(p.getIngredient());

                CheckBox checkBox = v.findViewById(R.id.checkBox);
                checkBox.setChecked(p.isCheckbox());

            }

            return v;
        }

    }


