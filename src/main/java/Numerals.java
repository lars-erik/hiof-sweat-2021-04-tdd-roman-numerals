public class Numerals {

    public static String toRoman(int number) {
        String result = "";

        while (number >= 5) {
            result += "V";
            number -= 5;
        }

        while (number >= 4) {
            result += "IV";
            number -= 4;
        }

        while (number >= 1) {
            result += "I";
            number -= 1;
        }

        return result;
    }

}