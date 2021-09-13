import java.util.LinkedHashMap;
import java.util.Map;

public class Numerals {

    public static String toRoman(int number) {
        String result = "";

        for(Map.Entry<Integer, String> numeral: numerals.entrySet()) {
            while (number >= numeral.getKey()) {
                result += numeral.getValue();
                number -= numeral.getKey();
            }
        }

        return result;
    }

    public static Map<Integer, String> numerals = new LinkedHashMap<>() {{
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};
}