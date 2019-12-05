public class Car {
  //The attributes of a car (instance variables)
  private String make;
  private String model;
  private double mpg;       //miles per gallon
  private double tankSize;  //in gallons
  private double amtFuel;   //in gallons

  //Constructor for the car. Initializes the instance variables for the car
  public Car(String carMake, String carModel, double carMpg, double carTankSize) {
    make = carMake;
    model = carModel;
    mpg = carMpg;
    tankSize = carTankSize;
    amtFuel = carTankSize;
  }

  //getters
  public String getMake() {
    return make;
  }
  public String getModel() {
    return model;
  }
  public double getMpg() {
    return mpg;
  }
  public double getTankSize() {
    return tankSize;
  }
  public double getAmtFuel() {
    return amtFuel;
  }

  //Methods
  public void fillTank(){
    amtFuel = tankSize;
  }

  public void drive(double distanceDrove){
    amtFuel = amtFuel - (distanceDrove/mpg);
    if (amtFuel <= 0){
      System.out.println("You're out of gas!");
    }
  }

  public void addFuel(double fuelAdded){
    if ((amtFuel + fuelAdded) <= tankSize){
      amtFuel =  amtFuel + fuelAdded;
    }
  }

  public String toString(){
    String result = "";
    result += "Make: " + make + ", Model: " + model + "\n";
    result += "MPG: " + mpg + ", Tank Size: " + tankSize + "\n";
    result += "Current Amount of Fuel: " + amtFuel;
    return result;
  }


}
