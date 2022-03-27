import Transport.*;

public class Application {
    public static void main(String[] args) {

    Bicycle bicycle1 = new Bicycle("красный", "Россия", 9, "зоря");
    Bicycle bicycle2 = new Bicycle("желтый", "Россия", 6, "стелс");

    Car car1 = new Car("белый", "Россия", 7, 998);
    Car car2 = new Car("черный", "Россия", 8, 015);

    Train train1 = new Train("красный", "Россия", 3, 2);
    Train train2 = new Train("серый", "Россия", 7, 8);

    Vehicle[] vehicles = {bicycle1, bicycle2, car1, car2, train1, train2};
    Workshop workshop1 = new Workshop(vehicles);

    workshop1.repairAll();
}
}
