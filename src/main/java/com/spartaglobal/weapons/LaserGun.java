package com.spartaglobal.weapons;

public class LaserGun extends Weapon {
    public LaserGun(String brand) {
        super(brand);
    }

    @Override
    public String toString()
    {
        return "Zing!! " + super.toString();
    }

    @Override
    public String shoot() {
        return "Shooting a LaserGun";
    }

}
