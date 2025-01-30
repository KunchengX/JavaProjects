package FreeResponseQuestions2021;

public class SingleTable {

    public static void main(String[] args) {
        SingleTable t1 = new SingleTable(4, 60.0, 74);
        SingleTable t2 = new SingleTable(8, 70.0, 74);
        SingleTable t3 = new SingleTable(12, 75.0, 76);
    
        CombinedTable c1 = new CombinedTable(t1, t2);
        System.out.println(c1.canSeat(9));
        System.out.println(c1.canSeat(11));
        System.out.println(c1.getDesirability());

        CombinedTable c2 = new CombinedTable(t2, t3);
        System.out.println(c2.canSeat(18));
        System.out.println(c2.getDesirability());
        t2.setViewQuality(80.0);
        System.out.println(c2.getDesirability());
    }

    private int numSeats;
    private int height;
    private double viewQuality;

    public SingleTable(int numSeats, double viewQuality, int height) {
        this.numSeats = numSeats;
        this.height = height;
        this.viewQuality = viewQuality;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public int getHeight() {
        return height;
    }

    public double getViewQuality() {
        return viewQuality;
    }

    public void setViewQuality(double viewQuality) {
        this.viewQuality = viewQuality;
    }

    public boolean canSeat(int numPeople) {
        return numPeople <= numSeats;
    }
}

class CombinedTable {
    private SingleTable table1;
    private SingleTable table2;

    public CombinedTable(SingleTable table1, SingleTable table2) {
        this.table1 = table1;
        this.table2 = table2;
    }

    public double getDesirability() {
        if (table1.getHeight() == table2.getHeight()) {
            return (table1.getViewQuality() + table2.getViewQuality()) / 2;
        } else {
            return ((table1.getViewQuality() + table2.getViewQuality()) / 2) - 10;
        }
    }

    public boolean canSeat(int numPeople) {
        return numPeople <= table1.getNumSeats() + table2.getNumSeats() - 2;
    }
}
