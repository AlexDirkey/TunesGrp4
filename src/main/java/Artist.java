public class Artist
//Must contain artist info. Needs getters and setters.
{
private int id;
private String name;
private Album album;

    public Artist(int id, String name, Album album) {
        this.id = id;
        this.name = name;
        this.album = album;
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
    public Album getAlbum() {
        return album;
    }
    public void setAlbum(Album album) {
        this.album = album;
    }

}
