public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private int[] numbers;
    private int index = 0;

    public MyArrayList() {
        this.numbers = new int[DEFAULT_CAPACITY];
    }

    public MyArrayList(int size) {
        this.numbers = new int[size];
    }

    public boolean add(int number) {
        if (numbers.length * 0.75 <= index) {
            int[] temp = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                temp[i] = numbers[i];
            }
            int newSize = (int) (numbers.length * 1.5);
            numbers = new int[newSize];

            for (int i = 0; i < temp.length; i++) {
                numbers[i] = temp[i];
            }
        }
        numbers[index++] = number;
        return true;
    }

    public void print() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < index; i++) {
            s.append(numbers[i]);
            s.append(",");
        }
        String s1 = s.toString();
        s1 = s.substring(0, numbers.length - 2);
        System.out.println(s1 + "]");
    }
    public int size() {
        return index;
    }
}
