package homework.day4;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Runner {
    Random random = new Random();
    int[] myTestArray;

    public void showArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = this.random.nextInt(1, 12);
        }
        this.myTestArray = array;
        System.out.println(Arrays.toString(array));
    }

    public void main(String[] args) {

        LocalDate currentDate = LocalDate.now();

        ArrayMethods arrayMethods = new ArrayMethods();

        showArray();
        arrayMethods.showSumArrayN(myTestArray, 3);
        // -- написать метод, который принимает на вход целочисленном массив и
        // считает сумму каждого n-ого элемента в нем, где n - целое число, передаваемое в сигнатуру
        // этого метода

        showArray();
        arrayMethods.showRevertedArrayN(myTestArray, 6);
        System.out.printf(Arrays.toString(arrayMethods.showRevertedArrayN(myTestArray, 6)));
        // -- написать метод, который вернет целочисленный массив,
        // состоящий только из тех элементов исходного целочисленного массива (подается на вход этого
        // метода),
        // которые больше, чем число n, где n - целое число, передаваемое в сигнатуру этого метода,
        // элементы в результирующем массиве должны быть расположены в обратном порядке;

        showArray();
        arrayMethods.showMonthArrayN(myTestArray, currentDate.getMonthValue());
        // -- написать метод, который вернет сумму тех элементов целочисленного массива,
        // которые кратны числу текущего месяца (массив подается в сигнатуру метода)
    }
}
