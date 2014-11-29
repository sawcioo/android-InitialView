package me.bienia.initialview;

/**
 * Created by sawcioo on 29.11.14.
 */
public class InitialViewPage {

    private String title;
    private int titleTextSize = 12;

    private String description;
    private int descriptionTextSize = 12;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTitleTextSize() {
        return titleTextSize;
    }

    public void setTitleTextSize(int titleTextSize) {
        this.titleTextSize = titleTextSize;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDescriptionTextSize() {
        return descriptionTextSize;
    }

    public void setDescriptionTextSize(int descriptionTextSize) {
        this.descriptionTextSize = descriptionTextSize;
    }
}
