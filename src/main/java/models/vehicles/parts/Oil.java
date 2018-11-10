package models.vehicles.parts;

import interfaces.Changeable;
import interfaces.Deprecateable;
import interfaces.Upgradeable;

public class Oil extends AbstractUpgradeablePart implements Changeable, Deprecateable {
    public void change() {

    }

    public void Upgrade() {

    }


    @Override
    public void deprecate(double distance) {
        health -= distance ;
    }
}
