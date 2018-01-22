package sk.akademiasovy.point;

import java.util.Random;

public class Point3D extends Point {
    private int z;

    public int getZ() {
        return z;
    }

    public Point3D ()
    {
        z=0;
    }

    public Point3D (int x, int y, int z)
    {
        super (x, y);
        this.z=z;
    }

    @Override
    public double getDistance() {
        return Math.sqrt(getX()*getX()+getY()*getY()+z*z);
    }

    @Override
    public void generateRandomCoords() {
        Random random= new Random();
        this.z= random.nextInt(41)-20;
        super.generateRandomCord();
    }

    public double getDistanceFromPoint(Point3D other){
        return Math.sqrt(Math.pow((double)getX()-(double)other.getX(),2)+
                Math.pow((double)getY()-(double)other.getY(),2)+Math.pow((double)z-other.z,2));
    }

    @Override
    public void printPointInfo() {
        System.out.println("X: "+getX());
        System.out.println("Y: "+getY());
        System.out.println("Z: "+z);

    }



}
