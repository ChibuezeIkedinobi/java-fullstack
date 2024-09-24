package classExercise.methods;

public class GettersAndSetters {

    private int id;
    private String name;

    public GettersAndSetters(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "GettersAndSetters{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        GettersAndSetters gettersAndSetters = new GettersAndSetters(1, "ikedi");
        gettersAndSetters.toString();
    }
}
