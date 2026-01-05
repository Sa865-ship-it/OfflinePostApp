public class Post {
    int id; String title, body;
    public Post(int id,String title,String body){
        this.id=id; this.title=title; this.body=body;
    }
    public int getId(){return id;}
    public String getTitle(){return title;}
    public String getBody(){return body;}
}