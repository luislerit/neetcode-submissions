class DynamicArray {
    private int capacity;
    private int size;
    private int[] myArray;

    public DynamicArray(int capacity) {
        if(capacity > 0 ) {
            this.capacity = capacity;
            myArray = new int[capacity];
        } else {
            myArray = new int[0];
        }
        this.size = 0;
    }

    public int get(int i) {
        if(capacity > i) {
            return myArray[i];
        }
        return 0;
    }

    public void set(int i, int n) {
        if(i < capacity) {
            if(i >= size) {
                size++;
            }
            myArray[i] = n;
        }
    }

    public void pushback(int n) {
        if(size == capacity) {
            this.resize();
        }
        myArray[size] = n;
        size++;
    }

     public int popback() {
        return myArray[--size];
    }

    private void resize() {
        capacity = capacity * 2;
        int[] newArr = new int[capacity];
        for(int i = 0; i < size; i++) {
            newArr[i] = myArray[i];
        }
        myArray = newArr;

    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
