package HomeWork1;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int[] arr = eratosfen(1000);
        System.out.println("Таблица простых чисел  : ");
        for (int i=0; i < arr.length; i++)
          System.out.printf(" %d ",arr[i]);

    }

    private static int[] eratosfen(int n) {
        // массив заполняется значениями от 0 до n
        int[] myArray = new int[n+1];
        for (int i = 0; i <= n; i++)
            myArray[i] = i;
        // на место составных чисел будем ставить 0
        // Вторым элементом является единица, которую не считают простым числом
        myArray[1] = 0;
        // начинаем с 3-го элемента
        int i = 2;
        while (i <= n) {
            // Если значение ячейки до этого не было обнулено,
            // в этой ячейке содержится простое число.
            if (myArray[i] != 0) {
                // первое кратное ему будет в два раза больше
                int j = i + i;
                while (j <= n) {
                    // это число составное, поэтому заменяем его нулем
                    myArray[j] = 0;
                    // переходим к следующему числу, которое кратно i
                    // (оно на i больше)
                    j = j + i;
                }
            }
            i += 1;
        }

        // Избавляемся от всех 0
        Arrays.sort(myArray);
        i = 0;
        while (myArray[i++] == 0)
            ;
        int count0 = i - 1;
        int[] returnArray = new int[myArray.length - count0];
        for (i = 0; i < myArray.length - count0; i++)
            returnArray[i] = myArray[i + count0];
        return returnArray;
    }
}
