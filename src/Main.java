import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int initialCapacity = 1000000;
        List<String> strings = new ArrayList<>(initialCapacity);

        String subString = "someteststringvalue";
        StringBuilder stringBuilder = new StringBuilder(subString);

        for (int i = 0; i < initialCapacity; i++) {
            stringBuilder.setLength(subString.length());
            stringBuilder.append(i);
            strings.add(stringBuilder.toString());
        }
    }
}