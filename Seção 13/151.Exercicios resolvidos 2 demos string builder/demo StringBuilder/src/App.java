import java.text.SimpleDateFormat;

import entitites.Comment;
import entitites.Post;

public class App {
    public static void main(String[] args) throws Exception {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p1 = new Post(
            sdf.parse("21/06/2018 13:05:44"),
            "Traveling to New Zealand",
            "Im going to visit this wonderful country!",
            12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println();
        System.out.println(p1);
    }
}
