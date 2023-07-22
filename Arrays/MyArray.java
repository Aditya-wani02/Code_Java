public class MyArray {

    private int[] items;
    private int currentindex;

    public MyArray(int initialSize) {
        this.items = new int[initialSize];
    }

    public void insert(int value) {
        if (currentindex == items.length) {
            int[] temp = new int[2 * items.length];
            for (int i = 0; i < currentindex; i++) {
                temp[i] = items[i];
            }
            items = temp;
        }
        this.items[currentindex] = value;
        currentindex++;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < this.currentindex; i++) {
            str.append(this.items[i] + ", ");
        }
        str.append("\b").append("\b").append("]");
        return str.toString();
    }

    public int indexOf(int value) {
        // linear search
        for (int i = 0; i < this.currentindex; i++) {
            if (this.items[i] == value)
                return i;
        }
        return -1;
    }

    public void removeAt(int index) {
        if (index >= this.currentindex)
            throw new IllegalArgumentException();
        for (int i = index; i <= this.currentindex - 2; i++) {
            this.items[i] = this.items[i + 1];
        }
        currentindex--;
        this.items[currentindex] = 0;
    }

    public int max() {
        int max = this.items[0];
        for (int i = 0; i < this.currentindex; i++) {
            if (this.items[i] > max)
                max = this.items[i];
        }
        return max;

    }

    public int min() {
        int min = this.items[0];
        for (int i = 1; i < this.currentindex; i++) {
            if (this.items[i] < min)
                min = this.items[i];
        }
        return min;

    }

    public void reverse() {
        int i = 0;
        int j = this.currentindex - 1;

        while (i < j) {
            int temp = items[i];
            items[i] = items[j];
            items[j] = temp;
            i++;
            j--;
        }

    }
}
