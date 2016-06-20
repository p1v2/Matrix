package com.company;

/**
 * Created by Vitalii on 23.02.2016.
 */
public class Matrix {
    int a[][];

    public Matrix(int height, int width) {
        a = new int[height][width];
    }

    public int getHorizontal() {
        return a[0].length;
    }

    public int getVertical() {
        return a.length;
    }

    public int getElement(int x, int y)
    {
        try {
            return a[x][y];
        }
        catch (IndexOutOfBoundsException i)
        {
            System.out.println(i.getMessage());
            return 0;
        }
    }

    public void setElement(int x,int y,int elem)
    {
        try
        {
            a[x][y]=elem;
        }
        catch (IndexOutOfBoundsException i)
        {
            System.out.println(i.getMessage());
        }
    }

    @Override
    public String toString()
    {
        String matrix="";
        for(int i=0;i<a.length;i++) {
            for (int j=0;j<a[i].length;j++)
                matrix+=a[i][j]+"; ";
            matrix+="\n";
        }
        return matrix;
    }
}
