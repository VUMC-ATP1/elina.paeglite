package homework.classHomework;

public class Trijstūris {

    public int malaA;
    public int malaB;
    public int malaC;
    public double trijstūralaukums;

    public Trijstūris() {
    }

    public Trijstūris(int malaA, int malaB, int malaC) {
        this.malaA = malaA;
        this.malaB = malaB;
        this.malaC = malaC;
        double s = (malaA + malaB + malaC) / 2;
        double laukums = Math.sqrt(s * (s - malaA) * (s - malaB) * (s - malaC));
        this.trijstūralaukums = laukums;
    }

    public boolean parbaudeVienadmalu(int malaA, int malaB, int malaC) {
        if (malaA == malaB && malaB == malaC)
            return true;
        else
            return false;
    }

    public boolean parbaudeVienadsanu(int malaA, int malaB, int malaC) {
        if (malaA == malaB || malaB == malaC || malaC == malaA)
            return true;
        else
            return false;
    }
}







