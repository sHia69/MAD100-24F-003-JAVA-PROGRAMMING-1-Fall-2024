package src;
/* Name: Hia Al Saleh
 * Date: November 15th, 2024
 * File: Main.java
 * 
 * Description:
 * Main Class for labs 18, 19, and 20
 * Create a main class that stores a list of your favourite top 10 movies.
 * Output the top 10 movies to the screen
 * 
 * Purpose:
 * Practice creating classes and objects (OOP).
 */

public class Main {
    public static void main(String[] args) 
    {
        Movie[] movies = new Movie[10];
        movies[0] = new Movie(new Genre("Action", "Movies that are full of action"), 2019, "Avengers: Endgame", "The Avengers assemble to undo Thanos' actions", new Actor("Robert", "Downey Jr.", 56, "Iron Man"), 8.4);
        movies[1] = new Movie(new Genre("Comedy", "Movies that are funny"), 1993, "Groundhog Day", "A man relives the same day over and over", new Actor("Bill", "Murray", 70, "Phil Connors"), 8.0);
        movies[2] = new Movie(new Genre("Drama", "Movies that are full of drama"), 1999, "The Green Mile", "A death row corrections officer forms a bond with an inmate", new Actor("Tom", "Hanks", 65, "Paul Edgecomb"), 8.6);
        movies[3] = new Movie(new Genre("Horror", "Movies that are scary"), 2017, "Get Out", "A young African-American visits his white girlfriend's parents", new Actor("Daniel", "Kaluuya", 32, "Chris Washington"), 7.7);
        movies[4] = new Movie(new Genre("Romance", "Movies that are romantic"), 2004, "The Notebook", "A young couple falls in love during the early 1940s", new Actor("Ryan", "Gosling", 40, "Noah Calhoun"), 7.8);
        movies[5] = new Movie(new Genre("Sci-Fi", "Movies that are full of science fiction"), 2010, "Inception", "A thief who steals corporate secrets through dream-sharing technology", new Actor("Leonardo", "DiCaprio", 46, "Dom Cobb"), 8.8);
        movies[6] = new Movie(new Genre("Thriller", "Movies that are full of suspense"), 1995, "Se7en", "Two detectives hunt a serial killer who uses the seven deadly sins", new Actor("Brad", "Pitt", 57, "David Mills"), 8.6);
        movies[7] = new Movie(new Genre("Mystery", "Movies that are full of mystery"), 2019, "Knives Out", "A detective investigates the death of a patriarch of an eccentric family", new Actor("Daniel", "Craig", 53, "Benoit Blanc"), 7.9);
        movies[8] = new Movie(new Genre("Documentary", "Movies that are based on real events"), 2018, "Free Solo", "A rock climber attempts to climb El Capitan without ropes", new Actor("Alex", "Honnold", 36, "Himself"), 8.2);
        movies[9] = new Movie(new Genre("Fantasy", "Movies that are full of fantasy"), 2001, "The Lord of the Rings: The Fellowship of the Ring", "A hobbit sets out on a quest to destroy a powerful ring", new Actor("Elijah", "Wood", 40, "Frodo Baggins"), 8.8);

        Genre[] genres = new Genre[10];
        genres[0] = new Genre("Action", "Movies that are full of action");
        genres[1] = new Genre("Comedy", "Movies that are funny");
        genres[2] = new Genre("Drama", "Movies that are full of drama");
        genres[3] = new Genre("Horror", "Movies that are scary");
        genres[4] = new Genre("Romance", "Movies that are romantic");
        genres[5] = new Genre("Sci-Fi", "Movies that are full of science fiction");
        genres[6] = new Genre("Thriller", "Movies that are full of suspense");
        genres[7] = new Genre("Mystery", "Movies that are full of mystery");
        genres[8] = new Genre("Documentary", "Movies that are based on real events");
        genres[9] = new Genre("Fantasy", "Movies that are full of fantasy");

        Actor[] actors = new Actor[10];
        actors[0] = new Actor("Christian", "Bale", 46, "Batman");
        actors[1] = new Actor("Will", "Ferrell", 53, "Ron Burgundy");
        actors[2] = new Actor("Tim", "Robbins", 61, "Andy Dufresne");
        actors[3] = new Actor("Morgan", "Freeman", 83, "Red");
        actors[4] = new Actor("Heath", "Ledger", 28, "The Joker");
        actors[5] = new Actor("Paul", "Rudd", 51, "Brian Fantana");
        actors[6] = new Actor("Steve", "Carell", 57, "Brick Tamland");
        actors[7] = new Actor("David", "Koechner", 58, "Champ Kind");
        actors[8] = new Actor("Jack", "Black", 51, "Shelly Oberon");
        actors[9] = new Actor("Karen", "Gillan", 32, "Ruby Roundhouse");


    System.out.println("\nMovies with their properties, genres, and actors:");
    for (int i = 0; i < 50; i++) {
        System.out.print(".");
    }
    System.out.println();
    for (Movie movie : movies) {
            System.out.println("Movie title: " + movie.getTitle());
            System.out.println("Year: " + movie.getYear());
            System.out.println("Description: " + movie.getDescription());
            System.out.println("Rating: " + movie.getRating());
            System.out.println("Genre: " + movie.getGenres().getName() + " - " + movie.getGenres().getDescription());
            System.out.println("Actor: " + movie.getActors().getFirstName() + " " + movie.getActors().getLastName() + " as " + movie.getActors().getDescription() + ", Age: " + movie.getActors().getAge());
            System.out.println("-----------------------------------------------------------");
        }
    }
}
