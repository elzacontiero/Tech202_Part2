package com.spartaglobal.weapons;

public class BubbleBlaster extends Weapon {

    public BubbleBlaster(String brand) {
        super(brand);
    }

    @Override
    public String toString()
    {
        return "Bubbles... " + super.toString();
    }

    @Override
    public String shoot() {
        return "Shooting a BubbleBlaster";
    }
}
