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
public class Fraction {

    private int fenzi;
    private int fenmu;

    public Fraction() {
        super();
    }

    public Fraction(int fenzi, int fenmu) {
        super();
        this.fenzi = fenzi;
        this.fenmu = fenmu;
        this.simplify(fenzi, fenmu); //在构造函数中直接化简分数（感觉此方法欠妥）
    }



    public void simplify(int fenzi, int fenmu) {
        int GCD = Dofrac.GCD(fenzi, fenmu);
        this.fenzi = fenzi / GCD;
        this.fenmu = fenmu / GCD;
    }//化简分数

    @Override
    public String toString() {
        if (fenzi == 0) {
            return 0 + "";
        } else if (fenzi % fenmu == 0) {
            return fenzi / fenmu + "";
        } else
            return fenzi + "/" + fenmu;
    }//改写toString，输出为分数形式

    public int getFenzi() {
        return fenzi;
    }

    public void setFenzi(int fenzi) {
        this.fenzi = fenzi;
    }

    public int getFenmu() {
        return fenmu;
    }

    public void setFenmu(int fenmu) {
        this.fenmu = fenmu;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + fenmu;
        result = prime * result + fenzi;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fraction other = (Fraction) obj;
        if (fenmu != other.fenmu)
            return false;
        if (fenzi != other.fenzi)
            return false;
        return true;
    }

}
