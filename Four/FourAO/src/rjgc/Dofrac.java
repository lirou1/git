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
public class Dofrac {

    public static Fraction CreatFrac() {
        int fz, fm;
        fz = (int) (0 + Math.random() * (100 - 0 + 1));//分子取0--100的随机数
        fm = (int) (1 + Math.random() * (10 - 1 + 1));//分母取1--100的随机数
        Fraction frac = new Fraction(fz, fm);
        return frac;
    }//创建随机分数

    public static boolean check(String input) {
        if (input.matches("[0-9]+")||input.matches("[0-9]+/[0-9]+")) {
            return true;
        } else
            return false;
    }//利用正则表达式处理用户输入的答案

    public static int GCD(int m, int n) {
        while (true) {
            if ((m = m % n) == 0)
                return n;
            if ((n = n % m) == 0)
                return m;
        }
    }//计算最大公约数


    public static Fraction MakeFor(Fraction f1, Fraction f2, int op, int i) {
        Fraction result = new Fraction();
        switch (op) {
            case 1: {
                result = Calculate.add(f1, f2);
                System.out.println("第" + i + "题：" + f1.toString() + "+" + f2.toString());
                break;

            }
            case 2: {
                if (!Calculate.compare(f1, f2)) {
                    Fraction temp = f1;
                    f1 = f2;
                    f2 = temp;
                }//比较两分数的大小，若减数小于被减数，则将两个数交换
                result = Calculate.sub(f1, f2);
                System.out.println("第" + i + "题：" + f1.toString() + "-" + f2.toString());
                break;
            }
            case 3: {
                result = Calculate.mul(f1, f2);
                System.out.println("第" + i + "题：" + f1.toString() + "*" + f2.toString());
                break;
            }
            case 4: {
                if (f2.getFenzi() == 0) {
                    f2.setFenzi((int) (1 + Math.random() * (10 - 1 + 1)));
                }//若除数分子为0，则分子重新取一个1——100的随机数
                result = Calculate.div(f1, f2);
                System.out.println("第" + i + "题：" + f1.toString() + "÷" + f2.toString());
                break;
            }
        }
        return result;

    }


}
