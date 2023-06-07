import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FirstHW {

    public static void main(String[] args) {
        //divisonByZero(3, 0);
        int[] arrayForWork = {7, 2, 4, 5, 1, 0};
        //valueOfIndex(7,arrayForWork);
        //String myStr = "IAmSterdam";
        //strException(3, myStr);
        int [] arrayForDiff = {1, 1, 1, 1, 1, 1, 1};
        diffOfValues(arrayForWork,arrayForDiff);
    }

    //1 Реализуйте 3 метода, чтобы в каждом из них получить разные стандартные для Java исключения;
    public static void divisonByZero(double firstArg, double secondArg) {
        if (secondArg == 0) throw new ArithmeticException("Memento mori! На ноль делить нельзя!");
        else {
            double res = firstArg / secondArg;
            System.out.printf("%f / %f = %f", firstArg, secondArg, res);
        }
    }

    public static void valueOfIndex(int index, int[] array) {
        if (index >= array.length || index < 0)
            throw new ArrayIndexOutOfBoundsException("Элемента с таким индексом нет!");
        else System.out.println(array[index]);
    }

    public static void strException(int index, String str) {
        if (index >= str.length() || index < 0)
            throw new StringIndexOutOfBoundsException("Нет элемента с таким индексом!");
        else System.out.println(str.charAt(index));
    }

    /*public static void fileException (String fileName) throws FileNotFoundException {
        File ourFile = new File(fileName);
        if (!ourFile.exists()) throw new FileNotFoundException("Такого файла нет!");
        else {}
    }*/

    //2 Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
//        public static int sum2d(String[][] arr) {
//            int sum = 0;
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = 0; j < 5; j++) {
//                    int val = Integer.parseInt(arr[i][j]);
//                    sum += val;
//                }
//            }
//            return sum;
//        }
    /* Первое исключение это выход за границы массива т.к. j у нас принимает значения от 0 до 4, а длинна подмассива
    может быть меньше.
    Далее может выйти исключение NumberFormatException потому что в массиве строк могут быть строки с "буквами",
    и их неполучится преобразовать в int*/

    //3 Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращает новый массив,
    // каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
    // Если длины массивов не равны, необходимо как-то оповестить пользователя.

    public static void diffOfValues (int[] firstArr, int [] secondArr){
        int[]resultArr = new int[firstArr.length];

        if (firstArr.length != secondArr.length) throw new ArrayIndexOutOfBoundsException("массивы разной размерности!");
        else {
            for (int i = 0; i < firstArr.length; i++) {
                resultArr[i] = secondArr[i]-firstArr[i];
                System.out.print(resultArr[i] + " ");
            }
        }
    }


}




