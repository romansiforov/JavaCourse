package lesson3HW4;

public class WorkWithArray {

    public int[][] arrayFilling(int sizeX, int sizeY, int numberForArrayFilling) {
        int[][] array;
            if (sizeX == 0) {
                sizeX++;
                System.out.println("Size X = 0. Increasing to 1");
            }
            if (sizeY == 0) {
                sizeY++;
                System.out.println("Size Y = 0. Increasing to 1");
            }
            if (sizeX < 0) {
                System.out.println("Size X < 0. Fetching the absolute value");
                sizeX = Math.abs(sizeX);
            }
            if (sizeY < 0) {
                System.out.println("Size Y < 0. Fetching the absolute value");
                sizeY = Math.abs(sizeY);
            }
        System.out.println("Creating array with " + sizeX + " x " + sizeY + " size");
        array = new int[sizeX][sizeY];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = numberForArrayFilling;
            }
        }
        return array;
    }

    private boolean checkMatrix(int[][] array) {
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array.length == array[i].length) {
                flag = true;
            } else {
                System.out.println("Square matrix is not detected.");
                return false;
            }
        }
        System.out.println("Square matrix DETECTED");
        return flag;
    }

    private boolean checkValidMatrixLength(int sizeX, int sizeY) {
        boolean flag = false;
        if (sizeX > 0 && sizeY > 0) {
            flag = true;
        }
        return flag;
    }


    private boolean checkMatrixItemVsValueForDiagonal(int[][] array, int valueForDiagonal) {
        boolean flag = true;
        try {
            if (array[0][1] == valueForDiagonal) {
                flag = false;
                System.out.println("The Value for Diagonal is the same as Matrix values. No need to fill diagonal");
            }
        } catch (IndexOutOfBoundsException e) {
            flag = false;
            System.out.println("The matrix is too small and there is no element array[0][1]");
        }
        return flag;
    }

    public void getMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
    }

    private int[][] defineAndFillLeftDiagonal(int[][] array, int valueForDiagonal) {
        if (checkMatrixItemVsValueForDiagonal(array, valueForDiagonal)) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i == j)
                        array[i][j] = valueForDiagonal;
                }
            }
            return array;
        }
        return array;
    }

    private int[][] defineAndFillRightDiagonal(int[][] array, int valueForDiagonal) {
        if (checkMatrixItemVsValueForDiagonal(array, valueForDiagonal)) {
            int tmp = array.length - 1;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (j == tmp) {
                        array[i][j] = valueForDiagonal;
                        tmp--;
                    }
                }
            }
            return array;
        }
        return array;
    }

    public int[][] fillingOfLeftDiagonal(int[][] array, int valueForDiagonal) {
        if (checkMatrix(array)) {
            array = this.defineAndFillLeftDiagonal(array, valueForDiagonal);
        }
        getMatrix(array);
        return array;
    }

    public int[][] fillingOfRightDiagonal(int[][] array, int valueForDiagonal) {
        if (checkMatrix(array)) {
            array = this.defineAndFillRightDiagonal(array, valueForDiagonal);
        }
        getMatrix(array);
        return array;
    }

    public int[][] fillingBothDiagonals(int[][] array, int valueForDiagonal) {
        if (checkMatrix(array) && checkMatrixItemVsValueForDiagonal(array, valueForDiagonal)) {
            array = this.defineAndFillLeftDiagonal(array, valueForDiagonal);
            array = this.defineAndFillRightDiagonal(array, valueForDiagonal);
        }
        getMatrix(array);
        return array;
    }
}


