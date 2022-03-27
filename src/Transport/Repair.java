package Transport;

public class Repair {
    private int maxRepairC = 10;
    private int minRepairC = 1;
    private int condition;

    //ремонтируют транспорт до максимального состояния
    public void repairC (int repairC ){
        if (!condition()) return;
        this.condition = Math.min(this.minRepairC + minRepairC,maxRepairC);
    }

    public boolean condition (){
        return condition > 0;
    }
}
