package com.company;

public enum WeaponType {
    PISTOLET("Makar",5000,"Russian"),
    DROBOVIK("Karabin",6000,"Russian"),
    PULEMET("Kalashnikova",10000,"Russian"),
    ;

  private String name;
    private int price;
    private String madein;


    WeaponType(String name, int price, String madein) {
        this.name = name;
        this.price = price;
        this.madein = madein;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMadein() {
        return madein;
    }

    public void setMadein(String madein) {
        this.madein = madein;
    }
}
