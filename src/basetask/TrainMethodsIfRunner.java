package basetask;

public class TrainMethodsIfRunner {
    //
    // - создать класс TrainMethodsIf и в нем
    // -- создать метод returnNewInt, который принимает на вход целое число (int) и если оно меньше 8,
    // то возвращает это число умноженное на 7, в противном случае деленное на 4
    // -- создать метод returnNewLong, который принимает на вход целое число (long) и если оно больше
    // 300, то возвращает это число минус 300, в противном случае плюс 20
    // -- создать метод returnNewChar, который принимает на вход символ (char) и если это 'g', то
    // возвращает строку "go", в противном случае строку из этого символа с префиксом "o"
    // -- создать метод returnNewFloat, который принимает на вход дробное число (float) и если оно
    // равно 0.67, то возвращает это число, в противном случае число умноженное на 2
    // -- создать метод returnNewDouble, который принимает на вход дробное число (double) и если оно
    // больше 30, но меньше 80, то  возвращает это число плюс 87, если оно больше 80, но меньше 400,
    // то возвращает это число минус 87, а если оно больше 400, то деленное на 4, в остальных случаях
    // возвращает само число
    // -- создать невозвратный метод returnNewBoolean, который принимает на вход булево значение
    // (boolean) и если оно true то печатает в консоль "Я получил на вход значение истины", в
    // противном случае печатает в консоль "Я получил на вход ложь"
    // -- создать класс TrainMethodsIfRunner с методом main, в котором создать обьект класса
    // TrainMethodsIf, и отпечатать в консоль значение, возвращаемое каждым из его методов в виде
    // "метод <название метода> вернул " и возвращаемое значение, последний метод просто вызвать

    // -- создать класс TrainMethodsIfRunner с методом main, в котором создать обьект класса
    // TrainMethodsIf, и отпечатать в консоль значение, возвращаемое каждым из его методов в виде
    // "метод <название метода> вернул " и возвращаемое значение, последний метод просто вызвать
    public static void main(String[] args){
        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();
        System.out.println("метод <returnNewInt> вернул " + trainMethodsIf.returnNewInt(100));
        System.out.println("метод <returnNewLong> вернул " + trainMethodsIf.returnNewLong((long) 291.6));
        System.out.println("метод <returnNewChar> вернул " + trainMethodsIf.returnNewChar('n'));
        System.out.println("метод <returnNewFloat> вернул " + trainMethodsIf.returnNewFloat(54.567F));
        System.out.println("метод <returnNewDouble> вернул " + trainMethodsIf.returnNewDouble(94.1));
        trainMethodsIf.returnNewBoolean(true);
    }
}
