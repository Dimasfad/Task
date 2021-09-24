import java.util.List;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.stream.Collectors;

public class RomanNum {
    private final static TreeMap<Integer, String> t = new TreeMap<Integer, String>();

    static {
        t.put(1000, "M");
        t.put(900, "CM");
        t.put(500, "D");
        t.put(400, "CD");
        t.put(100, "C");
        t.put(90, "XC");
        t.put(50, "L");
        t.put(40, "XL");
        t.put(10, "X");
        t.put(9, "IX");
        t.put(5, "V");
        t.put(4, "IV");
        t.put(1, "I");
    }
    public static String toRoman(int number) {
        int l =  t.floorKey(number);
        if ( number == l ) {
            return t.get(number);
        }
        return t.get(l) + toRoman(number-l);
    }
    public static String toRoman(String s) {
        return toRoman(Integer.valueOf(s));
    }
    public static int fromRoman(String input) {
        String romanNumeral = input.toUpperCase();
        int result = 0;

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;

        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
            RomanNumeral symbol = romanNumerals.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }

        if (romanNumeral.length() > 0) {
            throw new IllegalArgumentException();
        }

        return result;
    }
}

enum RomanNumeral {
    I(1), IV(4), V(5), IX(9), X(10),
    XL(40), L(50), XC(90), C(100),
    CD(400), D(500), CM(900), M(1000);

    private int value;

    RomanNumeral(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static List<RomanNumeral> getReverseSortedValues() {
        return Arrays.stream(values())
                .sorted(Comparator.comparing((RomanNumeral e) -> e.value).reversed())
                .collect(Collectors.toList());
    }
}