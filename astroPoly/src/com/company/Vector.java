package com.company;

public class Vector {

    public double angle, magnitude, xcom, ycom;

    public Vector(double pAngle, double pMagnitude){
        angle = pAngle;
        magnitude = pMagnitude;
        ycom = Math.sin(Math.toRadians(angle)) * magnitude;
        xcom = Math.cos(Math.toRadians(angle)) * magnitude;
    }

    public Vector(double pxcom, double pycom, boolean placeholder){
        double mag = Math.sqrt(Math.pow(pxcom,2)+Math.pow(pycom,2));
        angle = Math.asin(pycom/mag);
    }

    public void reorient(double delta){

    }

    public static double[] angleToVector (double angle, double magnitude){
        double ymag = Math.sin(Math.toRadians(angle)) * magnitude;
        double xmag = Math.cos(Math.toRadians(angle)) * magnitude;
        return new double[] {xmag, ymag};
    }

    public static double vectorToAngle(double xmag, double ymag){
        double returnedangle = Math.asin(ymag/Math.sqrt(Math.pow(xmag,2)+Math.pow(ymag,2)));
        return returnedangle;
    }

    public static double[] vectorToAngleAndMagnitude(double xmag, double ymag){
        double mag = Math.sqrt(Math.pow(xmag,2)+Math.pow(ymag,2));
        double returnedangle = Math.asin(ymag/mag);
        return new double[] {returnedangle,mag};
    }

}