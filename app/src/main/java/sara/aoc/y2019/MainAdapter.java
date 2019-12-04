package sara.aoc.y2019;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class MainAdapter extends BaseExpandableListAdapter {

    Context context;
    List<String> listCategory;
    HashMap<String,List<String>> listIngCheck;

    public MainAdapter (Context context, List<String> listCategory, HashMap<String,List<String>>
                        listIngCheck){
        this.context = context;
        this.listCategory = listCategory;
        this.listIngCheck = listIngCheck;
    }

    @Override
    public int getGroupCount() {
        return listCategory.size();
    }

    @Override
    public int getChildrenCount(int i) {
        //i=groupPosition
        return this.listIngCheck.get(this.listCategory.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        //i=groupPosition
        return this.listCategory.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        //i=groupPosition
        //i1=childPosition
        return this.listIngCheck.get(this.listCategory.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        //i=groupPosition
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        //i1=childPosition
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        //i=groupPosition
        String category = (String) getGroup(i);
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.list_category, null);
        }

        TextView textView = view.findViewById(R.id.list_parent);
        textView.setText(category);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        //i=groupPosition
        //i1=childPosition
        String child = (String) getChild(i, i1);
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.list_ing_check, null);
        }
        TextView textView = view.findViewById(R.id.list_child);
        textView.setText(child);
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
