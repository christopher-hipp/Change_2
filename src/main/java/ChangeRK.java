import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.ArrayList;

public class ChangeRK {
    private ArrayList<Integer> array;
    private ArrayList<Integer> usedArray;

    public ChangeRK() {
        this.array = new ArrayList<>();
        this.usedArray = new ArrayList<>();
    }

    public void setInitialArray() {
        Integer[] initialArray = new Integer[] {6, 9, 19, 28, 22, 19, 35,
                                                15, 6, 28, 20, 17, 18, 22,
                                                4, 20, 8, 26, 19, 15, 29,
                                                5, 17, 11, 19, 9, 21, 60,
                                                31, 18, 22, 27, 5, 23, 0,
                                                8, 21, 15, 40, 12, 34, 11,
                                                19, 25, 13, 22, 17, 9, 51,
                                                33, 17, 20};

        Collections.addAll(this.array, initialArray);
    }

    public int selectValue() {
        Random random = new Random();
        int index = random.nextInt(this.array.size());
        int value = array.get(index);

        addToUsedArray(value);
        removeFromArray(index);

        return value;
    }

    public void addToUsedArray(int value) {
        this.usedArray.add(value);
    }

    public int usedValuesTotal() {
        Iterator<Integer> iter = this.usedArray.iterator();
        int total = 0;
        while (iter.hasNext()) {
            total += iter.next();
        }
        return total;
    }

    public int valuesTotal() {
        Iterator<Integer> iter = this.array.iterator();
        int total = 0;
        while (iter.hasNext()) {
            total += iter.next();
        }
        return total;
    }

    public void removeFromArray(int index) {
        this.array.remove(index);
    }

    public ArrayList<Integer> getArray() {
        return this.array;
    }

    public ArrayList<Integer> getUsedArray() {
        return this.usedArray;
    }
}
