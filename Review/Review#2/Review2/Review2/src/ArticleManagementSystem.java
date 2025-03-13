import java.util.Scanner;

public class ArticleManagementSystem {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          ArticleManager articleManager = new ArticleManager(10);

          boolean exit = false;

          do {
              System.out.println("1. Add Article"
                      + "\n2. Remove Article"
                      + "\n3. Edit Article"
                      + "\n4. Get Article with Highest Views"
                      + "\n5. Display Articles"
                      + "\n6. Exit");

              System.out.print("Enter your choice: ");
              int choice = input.nextInt();

              switch (choice) {
                  case 1:
                      System.out.print("Enter title: ");
                      String title = input.next();
                      System.out.print("Enter author: ");
                      String author = input.next();
                      System.out.print("Enter content: ");
                      String content = input.next();
                      System.out.print("Enter views: ");
                      int views = input.nextInt();
                      System.out.print("Enter additional property: ");
                      String additionalProperty = input.next();

                      Article article = new Article(title, author, content, views, additionalProperty);
                      articleManager.addArticle(article);
                      break;
                  case 2:
                      System.out.print("Enter title: ");
                      String removeTitle = input.next();
                      articleManager.removeArticle(removeTitle);
                      break;
                  case 3:
                      System.out.print("Enter title: ");
                      String editTitle = input.next();
                      System.out.print("Enter new title: ");
                      String newTitle = input.next();
                      System.out.print("Enter new content: ");
                      String newContent = input.next();
                      System.out.print("Enter new views: ");
                      int newViews = input.nextInt();
                      System.out.print("Enter new additional property: ");
                      String newAdditionalProperty = input.next();

                      articleManager.editArticle(editTitle, newTitle, newContent, newViews, newAdditionalProperty);
                      break;
                  case 4:
                      Article highestViewedArticle = articleManager.getArticleWithHighestViews();
                      if (highestViewedArticle != null) {
                          System.out.println("Article with highest views: " + highestViewedArticle.getTitle());
                      } else {
                          System.out.println("No articles found.");
                      }
                      break;
                  case 5:
                      articleManager.displayArticles();
                      break;
                  case 6:
                      exit = true;
                      break;
                  default:
                      System.out.println("Invalid choice.");
              }
          } while (!exit);

          input.close();
    }
}