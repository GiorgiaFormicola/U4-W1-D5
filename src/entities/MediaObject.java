package entities;

public abstract class MediaObject {
    //ATTRIBUTES LIST
    protected String title;

    //CONSTRUCTORS LIST
    public MediaObject(String title) {
        this.title = title;
    }

    //GETTERS LIST
    public String getTitle() {
        return this.title;
    }

    //METHODS LIST
    public abstract void read();

    ;
}
