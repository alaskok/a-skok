// Exception for situations with incorrect array size
class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

// Exception for situations with incorrect data in the array
class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

public class Main {

    // Method for summing elements of a 4x4 two-dimensional string array
    public static int sumElements(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        // Check the size of the array
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException("Array should be of size 4x4");
        }

        int sum = 0;

        // Loop through all elements of the array and their summing
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Incorrect data in cell: [" + i + "][" + j + "]");
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // Example of correct usage of the method
        String[][] correctArr = {
                {"1",  "2",  "3",  "4"},
                {"5",  "6",  "7",  "8"},
                {"9",  "10",  "11",  "12"},
                {"13",  "14",  "15",  "16"}
        };

        // Example of an incorrect array (size)
        String[][] incorrectSizeArr = {
                {"1",  "2",  "3"},
                {"5",  "6",  "7"}
        };

        // Example of an incorrect array (data)
        String[][] incorrectDataArr = {
                {"1",  "2",  "three",  "4"},
                {"5",  "6",  "7",  "8"},
                {"9",  "10",  "11",  "12"},
                {"13",  "14",  "15",  "16"}
        };

        // Handling exceptions
        try {
            int result = sumElements(correctArr);
            System.out.println("Sum of elements: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            int result = sumElements(incorrectSizeArr);
            System.out.println("Sum of elements: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            int result = sumElements(incorrectDataArr);
            System.out.println("Sum of elements: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
