package com.company;

public class Skeleton extends Boss{
    private int stela;






    public Skeleton(int jizn, int uron, int stela) {
        super(jizn, uron);
        this.stela = stela;
    }

    public int getStela() {
        return stela;
    }

    public void setStela(int stela) {
        this.stela = stela;
    }
}
