package entities;

public class Calculo {
    private int A;
    private int B;
    private int C;

    public Calculo(int A, int B, int C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public int Soma(){
        return A + B;
    }
}
