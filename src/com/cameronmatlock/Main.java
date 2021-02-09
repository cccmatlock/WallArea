package com.cameronmatlock;

public class Main {

    public static void main(String[] args){

        Wall newWallObj = new Wall();

        newWallObj.setWidth(1.125);
        newWallObj.setWidth(1.444);

        Wall wallObj2 = new Wall(4.0, 2.0);

        System.out.println(wallObj2.getHeight());
        System.out.println(wallObj2.getWidth());
        System.out.println(wallObj2.getArea());
        System.out.println("");
        wallObj2.setWidth(3.0);
        System.out.println(wallObj2.getHeight());
        System.out.println(wallObj2.getWidth());
        System.out.println(wallObj2.getArea());



    }
}
