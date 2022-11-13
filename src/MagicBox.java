import java.util.Random;

public class MagicBox<T> {
    protected T items[];

    public MagicBox(int size) {
        T[] items = (T[]) new Object[size];
        this.items = items;
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    Random random = new Random();
    int randomInt = random.nextInt(7);

    public T pick() throws RuntimeException {
        int randomInt = random.nextInt(items.length);
        try {
            for (int i = 0; i < items.length; i++) {
                if (items[i] == null) {
                    throw new RuntimeException("Коробка не заполнена. Осталось " + (items.length - i) + " свободных ячеек!");
                }
            }
        } catch (RuntimeException e) {
            System.out.println(e);
        }
        return items[randomInt];
    }
}
