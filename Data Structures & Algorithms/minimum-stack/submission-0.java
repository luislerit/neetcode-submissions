class MinStack {

    List<Integer> array;
  

    public MinStack() {
        array = new ArrayList<>();
    }

    public void push(int val) {
        array.add(val);
    }

    public void pop() {
        if (!array.isEmpty()) {
            array.remove(array.size()-1);
        }
    }

    public int top() {
        if (!array.isEmpty()) {
            return array.get(array.size()-1);
        }
        return 0;
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            min = Math.min(min, i);
        }
        return min;
    }
}