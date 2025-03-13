package src;
/* Author: Hia Al Saleh
 * Date: November 15th, 2024
 * File: lab20.java
 * 
 * Description:
 * Lab 20 - (Movie Class)
 * Build a movie class that contains the following:
 * List of Genres (Must use your Genre class)
 * Year
 * Title
 * Description
 * List of actors (Must use your actor class)
 * Rating
 * The class should have getters and setters
 * The class should have a no-args constructor
 * The class should have another constructor that allows for all the information to be provided
 * The class should contain a method called listAllActors() that displays the names of all the actors in the movie
 * When a movie is treated as a string it should return the title, rating and description
 * 
 * Create another class that stores a list of your favourite top 10 movies.
 * Output the top 10 movies to the screen
 * 
 * Purpose:
 * Practice creating classes and objects.
 */

public class Movie {
     private Genre genres;
     private int year;
     private String title;
     private String description;
     private Actor actors; 
     private double rating;
 
     // No-args constructor
     public Movie() {}
 
     // Constructor with parameters
     public Movie(Genre genres, int year, String title, String description, Actor actors, double rating) {
         this.genres = genres;
         this.year = year;
         this.title = title;
         this.description = description;
         this.actors = actors;
         this.rating = rating;
     }
 
     // Getters and Setters for each attribute
     public Genre getGenres() {
         return genres;
     }
 
     public void setGenres(Genre genres) {
         this.genres = genres;
     }
 
     public int getYear() {
         return year;
     }
 
     public void setYear(int year) {
         this.year = year;
     }
 
     public String getTitle() {
         return title;
     }
 
     public void setTitle(String title) {
         this.title = title;
     }
 
     public String getDescription() {
         return description;
     }
 
     public void setDescription(String description) {
         this.description = description;
     }
 
     public Actor getActors() {
         return actors;
     }
 
     public void setActors(Actor actors) {
         this.actors = actors;
     }
 
     public double getRating() {
         return rating;
     }
 
     public void setRating(double rating) {
         this.rating = rating;
     }
 
     // listAllActors method
     public void listAllActors() {
        System.out.println("Actors in " + title + ": " + actors);
     }

     public String toString() {
         return title + " (Rating: " + rating + "): " + description;
     }
 }
