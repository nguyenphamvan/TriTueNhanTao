/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class ChuanDoan {

    public static final String D[] = {"sốt virut", "sốt rét", "thương hàn", "bệnh dạ dày", "bệnh tim"};
    public static final String D2[] = {"Fever", "Malaria", "Typhoid", "Stomach", "Chest problem"};
    private PictureFuzzySet C[];
    private double X[];

    public ChuanDoan() {
        C = new PictureFuzzySet[5];
        X = new double[5];
    }

    public PictureFuzzySet[] getC() {
        return C;
    }

    public void setC(PictureFuzzySet[] C) {
        this.C = C;
    }

    public double[] getX() {
        return X;
    }

    public void setX(double[] X) {
        this.X = X;
    }


    public static double FindMax(ArrayList A) {
        double max = (double) A.get(0);
        for (int i = 1; i < A.size(); i++) {
            if ((double) A.get(i) > max) {
                max = (double) A.get(i);
            }
        }
        return max;
    }

    public static double FindMin(ArrayList A) {
        double min = (double) A.get(0);
        for (int i = 1; i < A.size(); i++) {
            if ((double) A.get(i) < min) {
                min = (double) A.get(i);
            }
        }
        return min;
    }

    public void QuanHe_BenhNhan_Benh(PictureFuzzySet A[], PictureFuzzySet B[][]) {
        for (int j = 0; j < 5; j++) {
            ArrayList<Double> arrList_x = new ArrayList<>();
            ArrayList<Double> arrList_y = new ArrayList<>();
            ArrayList<Double> arrList_z = new ArrayList<>();
            for (int k = 0; k < 5; k++) {
                double min_x = Math.min(A[k].getX(), B[j][k].getX());
                arrList_x.add(min_x);
                double min_y = Math.min(A[k].getY(), B[j][k].getY());
                arrList_y.add(min_y);
                double max_z = Math.max(A[k].getZ(), B[j][k].getZ());
                arrList_z.add(max_z);
            }
            C[j] = new PictureFuzzySet(FindMax(arrList_x), FindMin(arrList_y), FindMin(arrList_z));
            double pi = 1 - (C[j].getX() + C[j].getY() + C[j].getZ());
            X[j] = C[j].getX() - C[j].getZ() * pi;
        }
    }
    
    public ArrayList<String> ChuanDoanBenh() {
        ArrayList<String> chiTietBenh = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (X[i] >= 0.5) {
                chiTietBenh.add(D[i].toUpperCase());
            }
        }
        return chiTietBenh;
    }
    
    public ArrayList<String> ChuanDoanBenh2() {
        ArrayList<String> chiTietBenh = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (X[i] >= 0.5) {
            	NumberFormat numEN = NumberFormat.getPercentInstance();
            	String percent = numEN.format(X[i]);
            	String benh = D2[i]+"("+ percent+")";
                chiTietBenh.add(benh.toUpperCase());
            }
        }
        return chiTietBenh;
    }

}
