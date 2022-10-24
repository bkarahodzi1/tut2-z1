package org.example;

public class Mate {
    public static int fakt(int x){
        int pr=1;
        for(int i=1;i<=x;i++)pr*=i;
        return pr;
    }
    public static double sin(double x){
        x*=Math.PI/180;
        double suma=0;
        for(int i=0;i<10;i++){
            suma+=Math.pow(-1,i)*Math.pow(x,2*i+1)/fakt(2*i+1);
        }
        return suma;
    }
}
