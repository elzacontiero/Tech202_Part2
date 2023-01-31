package com.spartaglobal;

import java.util.ArrayList;

public class SafariApp {
    public static void main(String[] args) {

        BaseClass p = new BaseClass("Katie", "King");

        var theWeapons = new ArrayList<IShootable>();
        theWeapons.add(new Weapon(WeaponType.LaserGun, "ToysRUs"));
        theWeapons.add(new Weapon(WeaponType.Waterpistol, "Supersoaker"));
        theWeapons.add(new Weapon(WeaponType.LaserGun, "ZippaZap"));
        theWeapons.add(new Hunter("Cathy", "French", 25, new Weapon(WeaponType.LaserGun, "BlastEmUp")));
        for (var w : theWeapons)
        {
            System.out.println(w.shoot());
        }
    }
}
