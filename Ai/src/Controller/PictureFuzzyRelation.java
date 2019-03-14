
package Controller;

public class PictureFuzzyRelation {
    private int m,n;//kich thuc mang chua truong du lieu fuzzy set
    private PictureFuzzySet A[][];

    public PictureFuzzyRelation() {
    }

    public PictureFuzzyRelation(int m, int n, PictureFuzzySet[][] A) {
        this.m = m;
        this.n = n;
        this.A = A;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public PictureFuzzySet[][] getA() {
        return A;
    }

    public void setA(PictureFuzzySet[][] A) {
        this.A = A;
    }
    
}
