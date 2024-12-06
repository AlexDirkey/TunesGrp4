public class Song // public, så det kan tale sammen med main-metoden
//Must contain song info. Needs getters and setters.
{
    private int id;
    private String title;
    private String genre;
    private String duration;
    private Album album;
    private Artist artist;

    public Song() {}

    public Song(int id, String title, String genre, String duration, Album album, Artist artist)

    {
    this.id = id;
    this.title = title;
    this.genre = genre;
    this.duration = duration;


}

//Getters and setters
public int getId() {return id;}
public void setId(int id) {this.id = id;}
public String getTitle() { return title; }
public void setTitle(String Title) { this.title = title }
public String setGengre(String Genre) { this.genre = genre }
