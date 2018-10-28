package models;

import interfaces.EngineDriven;
import interfaces.FuelDriven;
import interfaces.Oily;
import interfaces.WheelDriven;

public class Car extends Vehicle implements EngineDriven, FuelDriven, Oily, WheelDriven {

}
