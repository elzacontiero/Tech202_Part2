package com.spartaglobal;

public class Hunter extends BaseClass implements IShootable  {
    private IShootable shootable;

    public Hunter(String firstName, String lastName, int age, IShootable shootable) {
        super(firstName, lastName, age);
        this.shootable = shootable;
    }

    public Hunter() {
    }

    public void setShootable(IShootable iShootable)
    {
        this.shootable = iShootable;
    }

    public String shoot() {
        return getFullName() + " is " + shootable.shoot();
    }

    @Override
    public String toString() {
        return super.toString() + " is a Hunter with a " + shootable;
    }
}
