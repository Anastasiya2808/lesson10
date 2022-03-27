package Transport;

public class Train extends Vehicle{
    int numberOfRailwayCarriage;

    public Train(String color, String manufacturer, int condition, int numberOfRailwayCarriage) {
        super(color, manufacturer, condition);
        setNumberOfRailwayCarriage(numberOfRailwayCarriage);
    }

    public int getNumberOfRailwayCarriage() {
        return numberOfRailwayCarriage;
    }

    public void setNumberOfRailwayCarriage(int numberOfRailwayCarriage) {
        if (numberOfRailwayCarriage<1) throw new IllegalArgumentException("Минимум один вагон");
        this.numberOfRailwayCarriage = numberOfRailwayCarriage;
    }

    @Override
    public String toString() {
        return "Train{" +
                "numberOfRailwayCarriage=" + numberOfRailwayCarriage +
                "condition='" + getCondition() + '\'' +
                '}';
    }
}
