public class Album
//must contain Album info. Needs getters and setters.
{
private int id;
private String name;
private String author;
private int year;
private String genre;
private String playlist;

    public Album(int id, String name, String author, int year, String genre, String playlist) {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getPlaylist() {
        return playlist;
    }
    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

}
