package Exception;

public class MyArraySizeException extends RuntimeException {
    MyArraySizeException(String msg) {
        super("Ошибка размерности массива.\n" + " " + msg);
    }
}