public class Article {
          private String title;
          private String author;
          private String content;
          private int views;
          private String additionalProperty;

          public Article(){

          }

          public Article(String title, String author, String content, int views, String additionalProperty){
                    this.title = title;
                    this.author = author;
                    this.content = content;
                    this.views = views;
                    this.additionalProperty = additionalProperty;
          }

          public String getTitle(){
                    return title;
          }

          public void setTitle(String title){
                    this.title = title;
          }

          public String getAuthor(){
                    return author;
          }

          public void setAuthor(String author){
                    this.author = author;
          }

          public String getContent(){
                    return content;
          }

          public void setContent(String content){
                    this.content = content;
          }

          public int getViews(){
                    return views;
          }

          public void setViews(int views){
                    this.views = views;
          }

          public String getAdditionalProperty(){
                    return additionalProperty;
          }

          public void setAdditionalProperty(String additionalProperty){
                    this.additionalProperty = additionalProperty;
          }

          @Override
          public String toString(){
                    return "Title: " + title + "\nAuthor: " + author + "\nContent: " + content + "\nViews: " + views + "\nAdditional Property: " + additionalProperty;
          }
}
