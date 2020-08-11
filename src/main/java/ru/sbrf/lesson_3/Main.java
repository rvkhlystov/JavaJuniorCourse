package ru.sbrf.lesson_3;

//3. Создать в этом проекте класс с методом main
// аналогичный тому который мы с вами создавали.
public class Main {
    public static void main(String[] args) {
    }

    //4. Написать публичный метод принимающий 2 параметра:
    //первый типа byte и второй типа short.
    // Метод должен возвращать сумму значений параметров.
    // Тип возвращаемого значения должен быть byte.
    public static byte paramByteShort(byte paramByte, short paramShort) {
        return (byte) (paramByte + paramShort);
    }

    //5. Написать публичный метод принимающий 2 параметра:
    // первый типа int и второй типа long.
    // Метод должен возвращать произведение значений параметров.
    // Тип возвращаемого значения int.
    public static int paramIntLong(int paramInt, long paramLong) {
        return (int) (paramInt * paramLong);
    }

    //6. Написать метод getMaxNumber принимающий 2 параметра:
    // int и int.
    // Метод должен сравнить переданные параметры между собой и вернуть максимальный.
    // Для решения необходимо использовать IF или тернарный оператор ?:
    public static int getMaxNumber(int paramFirst, int paramSecond) {
        return paramFirst > paramSecond ? paramFirst : paramSecond;
    }

    //7. Написать метод isCharA принимающий 1 параметр типа char.
    // Если передана буква 'А', то возвращать true, а в остальных случаях false
    public static boolean isCharA(char charA) {
        return charA == 'A' ? true : false;
    }

    //8. Написать метод isCharNumber принимающий 1 параметр типа char.
    // Если передано число, то вернуть true, а в остальных случаях false
    public static boolean isCharNumber(char charNumber) {
        return Character.isDigit(charNumber) ? true : false;
    }

    //9. Написать метод выводящий на экран в цикле бинарное представление чисел от 0 до 30.
    // Для вывода бинарного представления использовать Integer.toBinaryString().
    // Без входных параметров и не возвращающая ничего.
    public static void printBin() {
        for (int i = 0; i <= 30; i++) {
            System.out.println(Integer.toBinaryString(i));
        }
    }

    //10. Написать метод выводящий бинарное представление
    // Integer.MAX_VALUE и Integer.MAX_VALUE + 1.
    // Для вывода бинарного представления использовать Integer.toBinaryString().
    // Без входных параметров и не возвращающая ничего.
    // Покажет, что переполнение не вызывает ошибку и как это выглядет в памяти
    public static void printBinMax() {
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE + 1));
    }

    // 11. Написать метод принимающий 1 параметр типа char
    // и возвращающий его числовое представление.
    public static int paramCharToInt (char paramChar) {
        return (int) paramChar;
    }

    //12. Написать метод принимающий 1 параметр типа int
    // и возвращающий его представление в виде печатного символа
    public static char paramIntToChar (int paramInt) {
        return (char) paramInt;
    }

}
