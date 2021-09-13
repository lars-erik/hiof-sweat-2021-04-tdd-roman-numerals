public class Numerals {

    public static String toRoman(int number) {
        String result = "";

        if (number >= 1) {
            result += "I";
            number -= 1;
        }

        if (number >= 1) {
            result += "I";
            number -= 1;
        }

        if (number >= 1) {
            result += "I";
            number -= 1;
        }

        return result;
    }

}