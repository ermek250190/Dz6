package com.company;

public class GameEntity {
  private  int jizn;
  private  int uron;

    public GameEntity(int jizn, int uron) {
        this.jizn = jizn;
        this.uron = uron;
    }

    public int getJizn() {
        return jizn;
    }

    public void setJizn(int jizn) {
        this.jizn = jizn;
    }

    public int getUron() {
        return uron;
    }

    public void setUron(int uron) {
        this.uron = uron;
    }
}
