package com.univercity.processing;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Автор: Касьяненко Борис
 * Этот класс реализует интерфейс MatrixProcess, в часности его
 * методы для нахождения средних значений столбцов матрицы и
 * максимального значения на побочной диагонали
 */

@Service
@Scope("singleton")
public class MatrixProcessImpl implements MatrixProcess{

    /**
     * Этот метод находит среднее значение столбцов в
     * квадратной матрице
     * @param matrix - двумерная квадратная матрица, средние
     *               значения столбцов которой будут найдены
     * @return - массив средних значений столбцов
     */
    public double[] averageColumn(double[][] matrix){
        double tmpSum=0;
        int length=matrix.length;
        double columnAverageArr[] = new double[length];
        for (int i=0; i<length; i++){
            for (double[] aMatrix : matrix) {
                tmpSum = tmpSum + aMatrix[i];
            }
            columnAverageArr[i]=tmpSum/length;
            tmpSum=0;
        }
        return columnAverageArr;
    }

    /**
     * Этот метод ищет максимальное значение на побочной
     * диагонали квадратной матрицы
     * @param matrix - двумерная квадратная матрица, наибольшее
     *               значение побочной диагонали которой будет найдено
     * @return - наибольшее значение на побочной диагонали
     */
    public double maxSideLine(double[][] matrix){
        double maxNumSideLine=0;
        int length=matrix.length;
        if (length!=0){
            maxNumSideLine=matrix[0][length-1];
        }
        for (int i=0; i<length; i++){
            if(matrix[i][length-i-1]>maxNumSideLine){
                maxNumSideLine=matrix[i][length-i-1];
            }
        }
        return maxNumSideLine;
    }
}

