package Exception;

public class Main {
    public static void main(String[] args) {

        String[][] stringArray0 = new String[][] {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] stringArray1 = new String[][] {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "D", "15", "16"}
        };
        String[][] stringArray2 = new String[][] {
                {"1", "2", "3"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] stringArray3 = new String[][] {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };

        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray0));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
    }

    private static int transformAndSum (String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length != 4) {
            throw new MyArraySizeException("Размерность массива должна быть 4х4.");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Размерность массива должна быть 4х4.");
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В позиции [" + i + "][" + j + "] исходного массива находится не целое число: " + array[i][j]);
                }
            }
        }
        return sum;
    }
}
