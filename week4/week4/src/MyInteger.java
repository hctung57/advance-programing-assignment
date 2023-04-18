/*
+-----------------------+
|      MyInteger        |
+-----------------------+
| - value: int           |
+-----------------------+
| + MyInteger(value: int)|
| + getValue(): int      |
| + isEven(): boolean    |
| + isOdd(): boolean     |
| + isPrime(): boolean   |
| + equals(value: int): boolean|
| + equals(myInt: MyInteger): boolean|
| + parseInt(input: char[]): int|
| + parseInt(input: String): int|
| + isEven(value: int): boolean|
| + isOdd(value: int): boolean|
| + isPrime(value: int): boolean|
| + isEven(myInt: MyInteger): boolean|
| + isOdd(myInt: MyInteger): boolean|
| + isPrime(myInt: MyInteger): boolean|
+-----------------------+
 */
public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 == 1;
    }

    public boolean isPrime() {
        if (value == 2 || value == 3) {
            return true;
        }
        if (value == 1 || value % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= value; i += 2) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 == 1;
    }

    public static boolean isPrime(int value) {
        if (value == 2 || value == 3) {
            return true;
        }
        if (value == 1 || value % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= value; i += 2) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInt) {
        return myInt.isEven();
    }

    public static boolean isOdd(MyInteger myInt) {
        return myInt.isOdd();
    }

    public static boolean isPrime(MyInteger myInt) {
        return myInt.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInt) {
        return this.value == myInt.getValue();
    }

    public static int parseInt(char[] input) {
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            int digit = (int) input[i] - 48;
            result = result * 10 + digit;
        }
        return result;
    }

    public static int parseInt(String input) {
        return Integer.parseInt(input);
    }
    public static void main(String[] args) {
        MyInteger myInt = new MyInteger(5);

        System.out.println("Value: " + myInt.getValue());
        System.out.println("isEven: " + myInt.isEven());
        System.out.println("isOdd: " + myInt.isOdd());
        System.out.println("isPrime: " + myInt.isPrime());

        System.out.println("isEven(4): " + MyInteger.isEven(4));
        System.out.println("isOdd(4): " + MyInteger.isOdd(4));
        System.out.println("isPrime(4): " + MyInteger.isPrime(4));

        MyInteger anotherInt = new MyInteger(7);
        System.out.println("isEven(anotherInt): " + MyInteger.isEven(anotherInt));
        System.out.println("isOdd(anotherInt): " + MyInteger.isOdd(anotherInt));
        System.out.println("isPrime(anotherInt): " + MyInteger.isPrime(anotherInt));

        System.out.println("equals(5): " + myInt.equals(5));
        System.out.println("equals(anotherInt): " + myInt.equals(anotherInt));

        System.out.println("parseInt(\"123\"): " + MyInteger.parseInt("123"));
        System.out.println("parseInt(['1', '2', '3']): " + MyInteger.parseInt(new char[]{'1', '2', '3'}));
    }
}