public class Participant {
    private int id;
    private String name;
    private double record;

    public Participant(int id, String name, double record) {
        this.id = id;
        this.name = name;
        this.record = record;
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

    public double getRecord() {
        return record;
    }

    public void setRecord(double record) {
        this.record = record;
    }    
    
}
