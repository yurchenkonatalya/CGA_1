package by.bsuir;

public class Transformation {
    public double[][] getTranslationMatrix(double x, double y, double z) {
        double[][] matrix = {
                {1, 0, 0, x},
                {0, 1, 0, y},
                {0, 0, 1, z},
                {0, 0, 0, 1}
        };
        return matrix;
    }

    public double[][] getScaleMatrix(double x, double y, double z) {
        double[][] matrix = {
                {x, 0, 0, 0},
                {0, y, 0, 0},
                {0, 0, z, 0},
                {0, 0, 0, 1}
        };
        return matrix;
    }

    public double[][] getRotateXMatrix(double rotate){
        double radians = Math.toRadians(rotate);
        double[][] result = {
                {1, 0, 0, 0},
                {0, Math.cos(radians), Math.sin(radians)*(-1), 0},
                {0, Math.sin(radians), Math.cos(radians), 0},
                {0, 0, 0, 1}};
        return result;
    }

    public double[][] getRotateYMatrix(double rotate){
        double radians = Math.toRadians(rotate);
        double[][] result = {
                {Math.cos(radians), 0, Math.sin(radians), 0},
                {0, 1, 0, 0},
                {Math.sin(radians) * (-1), 0, Math.cos(radians), 0},
                {0, 0, 0, 1}};
        return result;
    }

    public double[][] getRotateZMatrix(double rotate){
        double radians = Math.toRadians(rotate);
        double[][] result = {
                {Math.cos(radians), Math.sin(radians) * (-1), 0, 0},
                {Math.sin(radians), Math.cos(radians),0, 0},
                {0,0,1, 0},
                {0, 0, 0, 1}};
        return result;
    }



    public double[][] matrixMulting(double[][] firstMatrix, double[][] secondMatrix){
        int row = firstMatrix.length;
        int col = secondMatrix[0].length;
        double[][] resultMatrix = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                resultMatrix[i][j] = calculateOneNumber(firstMatrix, secondMatrix, i, j);
            }
        }
        return resultMatrix;
    }

    private double calculateOneNumber (double[][] matrixFirst, double[][] matrixSecond, int i, int j){
        int length = matrixSecond.length;
        double sum = 0;
            for (int k = 0; k < length; k++) {
                sum += matrixFirst[i][k] * matrixSecond[k][j];
            }
        return sum;
    }
}
