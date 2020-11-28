package connect4;

public class Player {

    private String name;
    private String type;

    public Player(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String string) {
        this.type = string;
    }

    public String toString() {
        return getClass().getName()+" Name:"+getName()+" Type:"+getType();
    }

}
