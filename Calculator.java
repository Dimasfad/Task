import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите операцию:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if(s.contains("+")) {
            String[] numbers = s.split("\\+");
            int a, b;
            if (s.contains("I") || s.contains("V") || s.contains("X")) {
                a = RomanNum.fromRoman(numbers[0]);
                b = RomanNum.fromRoman(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    System.out.println(RomanNum.toRoman(a + b));
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                a = Integer.valueOf(numbers[0]);
                b = Integer.valueOf(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    System.out.println(a + b);
                } else {
                    throw new IllegalArgumentException();
                }
            }

        }else if (s.contains("-")) {
            String[] numbers = s.split("\\-");
            int a, b;
            if (s.contains("I") || s.contains("V") || s.contains("X")) {
                a = RomanNum.fromRoman(numbers[0]);
                b = RomanNum.fromRoman(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10)  {
                    System.out.println(RomanNum.toRoman(a - b));
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                a = Integer.valueOf(numbers[0]);
                b = Integer.valueOf(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10)  {
                    System.out.println(a - b);
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }else if (s.contains("*")) {
            String[] numbers = s.split("\\*");
            int a, b;
            if (s.contains("I") || s.contains("V") || s.contains("X")) {
                a = RomanNum.fromRoman(numbers[0]);
                b = RomanNum.fromRoman(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10)  {
                    System.out.println(RomanNum.toRoman(a * b));
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                a = Integer.valueOf(numbers[0]);
                b = Integer.valueOf(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10)  {
                    System.out.println(a * b);
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }else if (s.contains("/")) {
            String[] numbers = s.split("\\/");
            int a, b;
            if (s.contains("I") || s.contains("V") || s.contains("X")) {
                a = RomanNum.fromRoman(numbers[0]);
                b = RomanNum.fromRoman(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10)  {
                    System.out.println(RomanNum.toRoman(a / b));
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                a = Integer.valueOf(numbers[0]);
                b = Integer.valueOf(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10)  {
                    System.out.println(a / b);
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
    }
}
