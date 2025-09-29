/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04003;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class PhanSo {

    private long tu;
    private long mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public long getTu() {
        return tu;
    }

    public long getMau() {
        return mau;
    }

    public long ucln() {
        long tu = this.tu;
        long mau = this.mau;
        while (mau != 0) {
            long tmp = tu % mau;
            tu = mau;
            mau = tmp;
        }
        return tu;
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo x = new PhanSo(sc.nextLong(), sc.nextLong());
        long uc = x.ucln();
        System.out.println(x.getTu() / uc + "/" + x.getMau() / uc);
    }
}
