package Polymorphism;

public class Operation{
  public double multiply(double number, double multiplier){
    return number * multiplier;
  }

  public double multiply(double number){
    return multiply(number, 2);
  }
}
