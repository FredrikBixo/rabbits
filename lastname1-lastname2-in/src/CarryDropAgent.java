// CarryDropAgent


import java.awt.Color;

import uchicago.src.sim.gui.Drawable;
import uchicago.src.sim.gui.SimGraphics;

public class CarryDropAgent implements Drawable{
  private int x;
  private int y;
  private int money;
  private int stepsToLive;
  private static int IDNumber = 0;
  private int ID;

  public CarryDropAgent(int minLifespan, int maxLifespan){
    x = -1;
    y = -1;
    money = 0;
    stepsToLive = 
        (int)((Math.random() * (maxLifespan - minLifespan)) + minLifespan);
    IDNumber++;
    ID = IDNumber;
  }

  public void setXY(int newX, int newY){
    x = newX;
    y = newY;
  }

  public String getID(){
    return "A-" + ID;
  }

  public int getMoney(){
    return money;
  }

  public int getStepsToLive(){
    return stepsToLive;
  }

  public void report(){
    System.out.println(getID() + 
                       " at " + 
                       x + ", " + y + 
                       " has " + 
                       getMoney() + " dollars" + 
                       " and " + 
                       getStepsToLive() + " steps to live.");
  }

  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }

  public void draw(SimGraphics G){
    if(stepsToLive > 10)
      G.drawFastRoundRect(Color.green);
    else
      G.drawFastRoundRect(Color.blue);
  }

  public void step(){
    stepsToLive--;
  }
}