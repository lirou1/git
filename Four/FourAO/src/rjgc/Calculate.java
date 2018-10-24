/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rjgc;

/**
 *
 * @author ylx
 */
public class Calculate {
    public static Fraction add(Fraction f1, Fraction f2) {

        int fz1 = f1.getFenzi();
        int fz2 = f2.getFenzi();
        int fm1 = f1.getFenmu();
        int fm2 = f2.getFenmu();
        Fraction f = new Fraction(fz1 * fm2 + fm1 * fz2, fm1 * fm2);
        return f;

    }//加法运算

    public static Fraction sub(Fraction f1, Fraction f2) {
        int fz1 = f1.getFenzi();
        int fz2 = f2.getFenzi();
        int fm1 = f1.getFenmu();
        int fm2 = f2.getFenmu();
        Fraction f = new Fraction(fz1 * fm2 - fm1 * fz2, fm1 * fm2);
        return f;
    }//减法运算

    public static Fraction mul(Fraction f1, Fraction f2) {
        int fz1 = f1.getFenzi();
        int fz2 = f2.getFenzi();
        int fm1 = f1.getFenmu();
        int fm2 = f2.getFenmu();
        Fraction f = new Fraction(fz1 * fz2, fm1 * fm2);
        return f;
    }//乘法运算

    public static Fraction div(Fraction f1, Fraction f2) {
        int fz1 = f1.getFenzi();
        int fz2 = f2.getFenzi();
        int fm1 = f1.getFenmu();
        int fm2 = f2.getFenmu();
        Fraction f = new Fraction(fz1 * fm2, fm1 * fz2);
        return f;
    }//除法运算

    public static boolean compare(Fraction f1, Fraction f2) {
        int fz1 = f1.getFenzi();
        int fz2 = f2.getFenzi();
        int fm1 = f1.getFenmu();
        int fm2 = f2.getFenmu();
        if (fz1 * fm2 >= fz2 * fm1) {
            return true;
        } else
            return false;
    }//比较两分数的大小

}
