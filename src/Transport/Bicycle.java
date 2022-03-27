package Transport;

public class Bicycle extends Vehicle implements Repair{
    private String type;
    public Bicycle(String color, String manufacturer, int condition, String  type) {
        super(color, manufacturer, condition);
        setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type==null) throw new IllegalArgumentException("type null");
        this.type = type;
    }

    @Override
    public void repair() {
        this.setCondition(this.getCondition()+1);
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "type='" + type + '\'' +
                "condition='" + getCondition() + '\'' +
                '}';
    }
}
