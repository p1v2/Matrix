package com.company;

/**
 * Created by Vitalii on 23.02.2016.
 */
public class Summator {
    public static Matrix sum(Matrix m1, Matrix m2)
    {
        if((m1.getHorizontal()!=m2.getHorizontal())||(m1.getVertical()!=m2.getVertical()))
        {
            System.out.println("Розмірності не співпадають");
            return null;
        }
        Matrix m = new Matrix(m1.getVertical(),m1.getHorizontal());
        for(int i=0;i<m1.getVertical();i++)
        for(int j=0;j<m1.getHorizontal();j++)
        {
            m.setElement(i,j,m1.getElement(i,j)+m2.getElement(i,j));
        }
        return m;
    }
}
