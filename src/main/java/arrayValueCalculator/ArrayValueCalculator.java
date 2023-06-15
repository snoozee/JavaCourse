package arrayValueCalculator;

public class ArrayValueCalculator {
    public int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        int rows = array.length;
        int columns = array[0].length;

        // Check if the array size is 4x4
        if (rows != 4 || columns != 4) {
            throw new ArraySizeException("Invalid array size. Expected 4x4, but got " + rows + "x" + columns);
        }

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                try {
                    int value = Integer.parseInt(array[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data at row " + (i + 1) + ", column " + (j + 1));
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "invalid", "16"}
        };

        ArrayValueCalculator calculator = new ArrayValueCalculator();

        try {
            int result = calculator.doCalc(validArray);
            System.out.println("Calculated successfully. Result: " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        try {
            int result = calculator.doCalc(invalidArray);
            System.out.println("Calculated successfully. Result: " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
