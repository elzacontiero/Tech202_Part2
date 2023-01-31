package com.spartaglobal.weapons;

public class WaterPistol extends Weapon {
    public WaterPistol(String brand) {
        super(brand);
    }

    @Override
    public String toString()
    {
        return "Splash!! " + super.toString();
    }
    @Override
    public String shoot() {
        return "Shooting a WaterPistol";
    }

}
