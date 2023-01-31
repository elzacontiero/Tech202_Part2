package com.spartaglobal.weapons;

public class BubbleBlaster extends Weapon {


    public BubbleBlaster(String brand) {
        super(WeaponType.BubbleBlaster, brand);

    }

    @Override
    public String toString()
    {
        return "Bubbles... " + super.toString();
    }

}
