package com.spartaglobal.weapons;

import com.spartaglobal.IShootable;

public abstract class Weapon implements IShootable {

    private WeaponType weaponType;
    protected String brand;
    public Weapon(WeaponType type, String brand)
    {
        this.weaponType = type;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "weaponType=" + weaponType +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String shoot()
    {
        return "Shooting a " + weaponType;
    }
}
