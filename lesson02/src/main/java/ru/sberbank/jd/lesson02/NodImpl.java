package ru.sberbank.jd.lesson02;

/**
 * Класс для поиска НОД.
 */
public class NodImpl implements Nod {

    /**
     * Вычисляет наибольший общий делитель двух целых чисел.
     *
     * @param first  первое число
     * @param second второе число
     * @return наибольший общий делитель
     */
    @Override
    public int calculate(int first, int second) {
        first = Math.abs(first);
        second = Math.abs(second);
        if (first == 0 || second == 0) {
            throw new IllegalArgumentException("Введите числа отличные от нуля");
        } else {
            while (first != 0 & second != 0) {
                if (first > second) {
                    first = first % second;
                } else {
                    second = second % first;
                }
            }
        }

        return first + second;
    }
}
