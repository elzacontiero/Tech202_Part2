package com.spartaglobal;

enum WeaponType
{
    Waterpistol,
    LaserGun,
    BubbleBlaster
}
public class Weapon implements IShootable{

    private WeaponType weaponType;
    private String brand;
    public Weapon(WeaponType type, String brand)
    {
        this.weaponType = type;
        this.brand = brand;
    }
    @Override
    public String toString()
    {
        String result = super.toString() + " - " + brand;
        switch (weaponType)
        {
            case Waterpistol:
                result = "Splash!! " + result;
                break;
            case BubbleBlaster:
                result = "Bubbles... " + result;
                break;
            case LaserGun:
                result = "Zing!! " + result;
                break;
        }
        return result;
    }

    public String shoot()
    {
        return "Shooting a " + weaponType;
    }
}
