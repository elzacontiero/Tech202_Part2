package com.spartaglobal.weapons;

public class WaterPistol extends Weapon {
    public WaterPistol(String brand) {
        super(WeaponType.WaterPistol, brand);
    }

    @Override
    public String toString()
    {
        return "Bubbles... " + super.toString();
    }


}
