package com.company;


public class Main {

    public static void main(String[] args) {
        System.out.println("������� �������� 3�4");

        Matrix m1 = MatrixFactory.createMatrix(3,4);
        //String s = m1.toString();
        System.out.print(m1);
        System.out.println("�� ����:");
        Matrix m2 = MatrixFactory.createMatrix(3,4);
        System.out.print(m2.toString());
        System.out.println("�� ����");
        Matrix m = Summator.sum(m1,m2);
        System.out.print(m.toString());
    }
}
