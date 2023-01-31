package com.spartaglobal.weapons;

import com.spartaglobal.Hunter;
import com.spartaglobal.IShootable;

import java.util.ArrayList;

public class WeaponMain {
    public static void main(String[] args) {
        var theWeapons = new ArrayList<IShootable>();
        theWeapons.add(new BubbleBlaster("ToysRUs"));
        theWeapons.add(new WaterPistol("Supersoaker"));
        theWeapons.add(new LaserGun("ZippaZap"));
        theWeapons.add(new Hunter("Cathy", "French", 25, new LaserGun("BlastEmUp")));
        for (var w : theWeapons)
        {
            System.out.println(w.shoot());
        }
    }
}
