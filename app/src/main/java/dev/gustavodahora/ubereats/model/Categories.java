package dev.gustavodahora.ubereats.model;

public class Categories {
    private int imageField;
    private int textField;

    Categories(int imageField, int textField) {
        this.imageField = imageField;
        this.textField = textField;
    }

    public int getImageField() {
        return imageField;
    }

    public void setImageField(int imageField) {
        this.imageField = imageField;
    }

    public int getTextField() {
        return textField;
    }

    public void setTextField(int textField) {
        this.textField = textField;
    }
}
