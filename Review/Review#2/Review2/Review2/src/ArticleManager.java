public class ArticleManager {
          private Article[] articles;
          private int count;
      
          public ArticleManager(int capacity) {
              articles = new Article[capacity];
              count = 0;
          }
      
          public void addArticle(Article article) {
              if (count < articles.length) {
                  articles[count++] = article;
              } else {
                  System.out.println("Article list is full.");
              }
          }
      
          public void removeArticle(String title) {
              for (int i = 0; i < count; i++) {
                  if (articles[i].getTitle().equalsIgnoreCase(title)) {
                      articles[i] = articles[count - 1];
                      articles[count - 1] = null;
                      count--;
                      break;
                  }
              }
          }
      
          public void editArticle(String title, String newTitle, String newContent, int newViews, String newAdditionalProperty) {
              for (int i = 0; i < count; i++) {
                  if (articles[i].getTitle().equalsIgnoreCase(title)) {
                      articles[i].setTitle(newTitle);
                      articles[i].setContent(newContent);
                      articles[i].setViews(newViews);
                      articles[i].setAdditionalProperty(newAdditionalProperty);
                      break;
                  }
              }
          }
      
          public Article getArticleWithHighestViews() {
              if (count == 0) {
                  return null;
              }
              Article highestViewedArticle = articles[0];
              for (int i = 1; i < count; i++) {
                  if (articles[i].getViews() > highestViewedArticle.getViews()) {
                      highestViewedArticle = articles[i];
                  }
              }
              return highestViewedArticle;
          }
      
          public void displayArticles() {
              for (int i = 0; i < count; i++) {
                  System.out.println(articles[i]);
                  System.out.println();
              }
          }
      }