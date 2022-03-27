package Transport;

abstract public class Vehicle {
    private String color;
    private String manufacturer;
    private int condition;

    public Vehicle (String color, String manufacturer, int condition){

    }

    // геттер для цвета
    public String getColor() {
        return color;
    }

    //сеттер для цвета
    public void setColor(String color) {
        if (color == null){
            throw new IllegalArgumentException("Цвет не может быть null");
        }
        this.color = color;
    }

    //геттер для производителя
    public String getManufacturer() {
        return manufacturer;
    }

    //сеттер для производителя
    public void setManufacturer(String manufacturer) {
        if (manufacturer == null){
            throw new IllegalArgumentException("Производитель не может быть null");
        }
        this.manufacturer = manufacturer;
    }

    // геттер для состояния транспорта
    public int getCondition() {
        return condition;
    }

    // сеттер для состояния транспорта
    public void setCondition(int condition) {
        if (condition > 1 || condition < 10){
            throw new IllegalArgumentException("Состояние должно быть от 1 до 10");
        }
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", condition=" + condition +
                '}';
    }
}
