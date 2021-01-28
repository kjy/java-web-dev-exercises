package exercises.technology.main;

// use keyword abstract
public abstract class AbstractEntity {

    private int id;
    private static int nextId = 1;

    public AbstractEntity() {
        this.id = nextId;  // will be 1
        nextId++; // increment to assign Id
    }

    // Methods, getter

    public int getId() { return this.id; }


}
