import java.util.ArrayList;

public class ChangeCustom {
    private int total;
    private ArrayList<Integer> values;

    public ChangeCustom(int value) {
        this.total = value;
        this.values = new ArrayList<>();
    }

    public int getTotal() {
        return this.total;
    }

    public int totalSplitter(int count) {
        int split = this.total / count;
        addValuesIntoArray(split, count);
        return split;
    }

    public void addValuesIntoArray(int split, int count) {
            for (int i = 0; i < count; i++) {
                this.values.add(split);
            }
    }

    public ArrayList<Integer> getValues() {
        return this.values;
    }

    public int arraySize() {
        return this.values.size();
    }
}
