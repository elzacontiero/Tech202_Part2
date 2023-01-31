package com.spartaglobal.weapons;

import com.spartaglobal.IShootable;

public abstract class Weapon implements IShootable {

    protected String brand;
    public Weapon(String brand)
    {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                ", brand='" + brand + '\'' +
                '}';
    }
 
}
