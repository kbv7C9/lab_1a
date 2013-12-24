package com.univercity.presentation;

import com.univercity.processing.MatrixProcess;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Acer
 * Date: 23.12.13
 * Time: 20:45
 */
public class Main {

    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        MatrixProcess matrixProcess = (MatrixProcess)applicationContext.getBean("matrixProcessImpl");
        double[] averageColumnResult = matrixProcess.averageColumn(new double[][]{{1,2,3},{4,5,6},{7,8,9}});
        double maxSideLineResult = matrixProcess.maxSideLine(new double[][]{{1,2,3},{4,5,6},{7,8,9}});
        System.out.print("\n Average values ​​in columns: \n");
        for (double anAverageColumnResult : averageColumnResult) {
            System.out.print(anAverageColumnResult);
            System.out.print("  ");
        }
        System.out.print("\n The maximum value of the secondary diagonal: \n");
        System.out.print(maxSideLineResult);
    }
}
