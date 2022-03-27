package Transport;

import java.util.Arrays;
import java.util.Scanner;

public class Workshop {
    private Vehicle[] garage;

    public  Workshop (Vehicle[] garage){
        setGarage(garage);
    }
    public void repairAll() {
        if (garage == null) throw new IllegalArgumentException("garage null");
        System.out.println(Arrays.toString(garage));
        for (Vehicle vehicle : garage) {
            if (vehicle == null) continue;
            if (vehicle instanceof Repair) ((Repair) vehicle).repair();
        }
        System.out.println(Arrays.toString(garage));
    }

    // сеттер для гаража
    private void setGarage(Vehicle[] garage) {
        if (garage == null) throw new IllegalArgumentException("garage null");
        this.garage = garage;
    }

    public void paint() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(garage));
        System.out.println("Выберете транспортное средство для покраски");
        int i = scanner.nextInt();
        if (i < 0 || i > garage.length) throw new IllegalArgumentException("Введите число в пределах массива");
        scanner.nextLine();
        System.out.println("Выберете цвет");
        String color = scanner.nextLine();
        if (color == null) throw new IllegalArgumentException("color null");
        garage[i].setColor(color);
        System.out.println("Стало: " + garage[i] + " " + garage[i].getColor());
    }
}
