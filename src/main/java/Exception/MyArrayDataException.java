package Exception;

public class MyArrayDataException extends RuntimeException {
    MyArrayDataException(String msg) {
        super("Ошибка ввода данных.\n" + " " + msg);
    }
}