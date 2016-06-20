package com.company;

/**
 * Created by Vitalii on 23.02.2016.
 */
public class MatrixFactory {
    public static Matrix createMatrix(int x,int y)
    {
        Matrix m = new Matrix(x,y);
        for(int i=0;i<m.getVertical();i++)
            for(int j=0;j<m.getHorizontal();j++)
            {
                m.setElement(i,j,(int)(Math.random()*9));
            }
        return m;
    }
}
