package Transport;

public class Car extends Vehicle implements Repair {
    int number;
    public Car(String color, String manufacturer, int condition,int number) {
        super(color, manufacturer, condition);
        setNumber(number);
    }

    public void setNumber(int number) {
        if (number<0) throw new IllegalArgumentException("number>0");
        this.number = number;
    }

    @Override
    public void repair() {
        this.setCondition(this.getCondition()+2);
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                "condition='" + getCondition() + '\'' +
                '}';
    }
}
}
