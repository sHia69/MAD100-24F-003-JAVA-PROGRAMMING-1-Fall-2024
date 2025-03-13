/* Author: Hia Al Saleh
 * Date: December 5th, 2024
 * File: Poster.java
 * 
 * Description:
 * Poster class
 * This class is an abstract class that has a title and an image field.
 * 
 * Purpose:
 * To create an abstract class that has fields and methods that are common to other classes.
 */
package com.moviegame;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public abstract class Poster {
    private String title;
    private Image image;

    public Poster(String title, Image image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public Image getImage() {
        return image;
    }

    public ImageView getImageView() {
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200);
        imageView.setPreserveRatio(true);
        return imageView;
    }

    public abstract String getAdditionalInfo();

    public Text getTitleText() {
        Text text = new Text(title + "\n" + getAdditionalInfo());
        text.setFont(new Font("Arial", 24));
        text.setTextAlignment(TextAlignment.CENTER);
        return text;
    }
}