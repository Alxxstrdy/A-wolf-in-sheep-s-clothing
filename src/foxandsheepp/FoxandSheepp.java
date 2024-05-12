package foxandsheepp;
public class FoxandSheepp {
    private static final String WOLF = "wolf";
    private static final String PESAN_SERIGALA = "Pls go away and stop eating my sheep";
    private static final String MESSAGE_WEDHUS = "Oi! Sheep number %s! You are about to be eaten by a wolf!";

    public static String warnTheSheep(String[] array) {
        int pos = poserigala(array);

        if (pos == array.length - 1) {
            return PESAN_SERIGALA;
        } else {
            return String.format(MESSAGE_WEDHUS, array.length - pos - 1);
        }
    }

    public static int poserigala(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(WOLF)) {
                return i;
            }
        }
        return -1;
    }
}