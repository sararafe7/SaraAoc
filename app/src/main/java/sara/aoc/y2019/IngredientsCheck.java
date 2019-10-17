package sara.aoc.y2019;

public class IngredientsCheck {
    private boolean checkbox;
    private String ingredient;

    public IngredientsCheck(boolean checkbox, String ingredient) {
        this.checkbox = checkbox;
        this.ingredient = ingredient;
    }

    public boolean isCheckbox() {
        return checkbox;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setCheckbox(boolean checkbox) {
        this.checkbox = checkbox;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
}
