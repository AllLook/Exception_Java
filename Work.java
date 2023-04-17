import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.management.RuntimeErrorException;

public class Work {
    static Integer[] array1 = { 10, 10, 10, 10, 5 };
    static Integer[] array2 = { 5, 5, 5, 5, 5 };

    public static void main(String[] args) throws IllegalAccessException, IOException {
        File file = new File("C:/Users/Lex/Desktop/exception_java/file.txt");
        // System.out.println(devision(5, 0));
        // System.out.println(fileLength(file));
        // fileRead(file);
        divArray(array1, array2);

    }

    public static Integer devision(int a, int b) {
        if (b == 0) {
            throw new RuntimeErrorException(null, "division by zero is prohibited!");
        }
        return a / b;
    }

    public static long fileLength(File file) {
        if (!file.exists()) {// если файл не существует
            return -1;// длинна файла не можето быть отрицательной
        }
        return file.length();// возвращаем длинну если файл есть
    }

    public static void fileRead(File file) throws IOException, IllegalAccessException {
        if (file == null || file.length() == 0) {
            throw new IllegalAccessException("No file!");// передан некорректный аргумент

        } else {
            BufferedReader br = new BufferedReader(new FileReader(file));
            br.close();
        }

    }

    public static Integer[] divArray(Integer[] array1, Integer[] array2) {
        if (array1.length == array2.length) {
            Integer[] resArr = new Integer[array1.length];// если первый меньше второго
            for (int i = 0; i < array1.length; i++) {
                // for (int j = 0; j < array2.length; j++) {
                int result = array1[i] - array2[i];
                resArr[i] = result;
            }
            for (int i = 0; i < resArr.length; i++) {
                System.out.println(resArr[i]);
            }
        }

        else {
            System.out.println("arrays are not equal!");

        }
        return null;
    }
}
