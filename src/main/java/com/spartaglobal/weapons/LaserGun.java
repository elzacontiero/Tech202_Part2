package com.spartaglobal.weapons;

public class LaserGun extends Weapon {
    public LaserGun(String brand) {
        super(WeaponType.LaserGun, brand);
    }

    @Override
    public String toString()
    {
        return "Splash!! " + super.toString();
    }

}
