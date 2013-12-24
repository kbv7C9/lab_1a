package com.univercity.processing;

import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertArrayEquals;

/**
 * Автор: Касьяненко Борис
 * Тесты для класса, который обрабатывает квадратные матрицы
 */
public class MatrixProcessTest extends TestCase{

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
    MatrixProcess matrixProcess = (MatrixProcess)applicationContext.getBean("matrixProcessImpl");

    public void testEmptyMatrixAverage(){
        double testMatrix[][] = {};
        double right[] = {};
        double actual[] = matrixProcess.averageColumn(testMatrix);
        assertArrayEquals("Ошибка проверки поиска средних значений столбцов в пустой матрице",right,actual,0);
    }

    public void testMatrix_2x2Average(){
        double testMatrix[][] = {{1,2},{3,4}};
        double right[] = {2.0,3.0};
        double actual[] = matrixProcess.averageColumn(testMatrix);
        assertArrayEquals("Ошибка проверки поиска средних значений столбцов в матрице 2х2",right,actual,0);
    }

    public void testMatrix_3x3Average(){
        double testMatrix[][] = {{3,2,10},{3,4,1},{5,6,7}};
        double right[] = {3.66,4.0,6.0};
        double actual[] = matrixProcess.averageColumn(testMatrix);
        assertArrayEquals("Ошибка проверки поиска средних значений столбцов в матрице 3х3",right,actual,0.1);
    }

    public void testEmptyMatrixMax(){
        double testMatrix[][] = {};
        double right=0;
        double actual = matrixProcess.maxSideLine(testMatrix);
        assertEquals("Ошибка проверки поиска максимума на побочной диагонали в пустой матрице",right,actual,0);
    }

    public void testMatrix_2x2Max(){
        double testMatrix[][] = {{1,2},{3,4}};
        double right = 3;
        double actual = matrixProcess.maxSideLine(testMatrix);
        assertEquals("Ошибка проверки поиска максимума на побочной диагонали в матрице 2х2",right,actual,0);
    }

    public void testMatrix_4x4Max(){
        double testMatrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        double right = 13;
        double actual = matrixProcess.maxSideLine(testMatrix);
        assertEquals("Ошибка проверки поиска максимума на побочной диагонали в матрице 4х4",right,actual,0);
    }
}


