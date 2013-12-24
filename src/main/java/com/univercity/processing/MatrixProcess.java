package com.univercity.processing;

/**
 * Этот интерфейс содержит методы для обработки матриц
 */
public interface MatrixProcess {

    /**
     * Этот метод находит среднее значение столбцов в
     * квадратной матрице
     * @param matrix - двумерная квадратная матрица, средние
     *               значения столбцов которой будут найдены
     * @return - массив средних значений столбцов
     */
    public double[] averageColumn(double[][] matrix);

    /**
     * Этот метод ищет максимальное значение на побочной
     * диагонали квадратной матрицы
     * @param matrix - двумерная квадратная матрица, наибольшее
     *               значение побочной диагонали которой будет найдено
     * @return - наибольшее значение на побочной диагонали
     */
    public double maxSideLine(double[][] matrix);
}