import java.util.ArrayList;
import java.util.List;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
}

class Post {
    private User author;
    private String content;

    public Post(User author, String content) {
        this.author = author;
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
}

class Feed {
    private List<Post> posts;

    public Feed() {
        this.posts = new ArrayList<>();
    }

    public void addPost(Post post) {
        this.posts.add(post);
    }

    public List<Post> getPosts() {
        return posts;
    }
}

public class Main {
    public static void main(String[] args) {
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        Post post1 = new Post(user1, "This is my first post!");
        Post post2 = new Post(user2, "Hello world!");

        Feed feed = new Feed();
        feed.addPost(post1);
        feed.addPost(post2);

        // Display feed
        for (Post post : feed.getPosts()) {
            System.out.println(post.getAuthor().getUsername() + ": " + post.getContent());
        }
    }
}
