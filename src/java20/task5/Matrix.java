package java20.task5;

public class Matrix<T extends Number> {
    public T[][] numbers;
    public int linesCount;
    public int columnsCount;

    public Matrix(T[][] numbers, int linesCount, int columnsCount) {
        this.numbers = numbers;
        this.linesCount = linesCount;
        this.columnsCount = columnsCount;
    }

    // вывод матрицы
    public void printMatrix() {
        for (T[] columns : numbers) {
            for (T number : columns) {
                System.out.printf("%25s", number);
            }
            System.out.println();
        }
    }

    // суммирование матриц
    public static<T extends Number, N extends Number> Matrix<Double> sum(Matrix<T> matrix1, Matrix<N> matrix2) {

        if (matrix1.linesCount != matrix2.linesCount | matrix1.columnsCount != matrix2.columnsCount) return null;

        Matrix<Double> ans = new Matrix<>(new Double[matrix1.linesCount][matrix1.columnsCount],matrix1.linesCount, matrix1.columnsCount);

        for (int i = 0; i < matrix1.linesCount; i++)
            for (int j = 0; j < matrix1.columnsCount; j++)
                ans.numbers[i][j] = matrix1.numbers[i][j].doubleValue() + matrix2.numbers[i][j].doubleValue();

        return ans;

    }

    // умножение на число
    public<N extends Number> Matrix<Double> multiplication(N number) {
        Matrix<Double> ans = new Matrix<>(new Double[linesCount][columnsCount], linesCount, columnsCount);
        for (int i = 0; i < linesCount; i++)
            for (int j = 0; j < columnsCount; j++)
                ans.numbers[i][j] = numbers[i][j].doubleValue() * number.doubleValue();
        return ans;
    }

    public static void main(String[] args) {

        Matrix<Integer> integerMatrix = new Matrix<>(new Integer[][]{new Integer[]{1, 2}, new Integer[]{2, 1}}, 2, 2);
        Matrix<Double> doubleMatrix = new Matrix<>(new Double[][]{new Double[]{1.43124, 2.1342}, new Double[]{2.512, 8.8888}}, 2, 2);

        sum(integerMatrix, doubleMatrix).printMatrix();
        System.out.println();
        doubleMatrix.multiplication(8.888F).printMatrix();
    }
}

