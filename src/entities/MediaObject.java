package entities;

public class MediaObject {
    //ATTRIBUTES LIST
    private String title;

    //CONSTRUCTORS LIST
    public MediaObject(String title) {
        this.title = title;
    }

    //GETTERS LIST
    public String getTitle() {
        return this.title;
    }

    //METHODS LIST
    public void read() {
        System.out.println("Reading: " + this.title);
    }

    ;
}
