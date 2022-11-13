public class Main {
    public static final int SIZE = 15;

    public static void main(String[] args) {

        System.out.println("Работа волшебной коробки без сообщения RuntimeException.");
        workMagicBox(SIZE + 4);
        System.out.println("Работа волшебной коробки c сообщением RuntimeException.");
        workMagicBox(SIZE - 3);
    }

    public static void workMagicBox(int size) {
        MagicBox<String> magicBoxItem = new MagicBox<>(SIZE);
        MagicBox<Integer> magicBoxNumber = new MagicBox<>(SIZE);
        for (int i = 0; i < size; i++) {
            System.out.println(magicBoxItem.add(("item " + i)));
            System.out.println(magicBoxNumber.add(i));
            System.out.println(magicBoxItem.pick());
        }
        System.out.println("   ");
    }
}