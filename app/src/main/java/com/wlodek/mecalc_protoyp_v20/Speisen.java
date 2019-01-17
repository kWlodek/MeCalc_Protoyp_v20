package com.wlodek.mecalc_protoyp_v20;

public class Speisen {

    private String id;
    private String name;
    private String kcal;

    public Speisen(String id, String name, String kcal){
        this.id = id;
        this.name = name;
        this.kcal = kcal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKcal() {
        return kcal;
    }

    public void setKcal(String kcal) {
        this.kcal = kcal;
    }
}
