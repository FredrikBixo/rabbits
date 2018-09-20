import uchicago.src.sim.engine.SimModelImpl;
import uchicago.src.sim.engine.Schedule;

public class MyFirstRePastModel extends SimModelImpl {

  private Schedule schedule;
  private int numAgents;

  public String getName(){
    return "My First RePast Model";
  }

  public void setup(){
  }

  public void begin(){
    buildModel();
    buildSchedule();
    buildDisplay();
  }

  public void buildModel(){
  }

  public void buildSchedule(){
  }

  public void buildDisplay(){
  }

  public Schedule getSchedule(){
    return schedule;
  }

  public String[] getInitParam(){
    String[] initParams = { "NumAgents" };
    return initParams;
  }

  public int getNumAgents(){
    return numAgents;
  }

  public void setNumAgents(int na){
    numAgents = na;
  }

}