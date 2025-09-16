/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package park3interface;

/**
 *
 * @author imadw
 */
interface Sports {
    public void setHomeTeam(String name);
    public void setVisitingTeam(String name);
}

interface Football extends Sports {
    public void homeTeamScored(int points);
    public void visitingTeamScored(int points);
    public void endOfQuarter(int quarter);
}

interface Hockey extends Sports {
    public void homeGoalScored();
    public void visitingGoalScored();
    public void endOfPeriod(int period);
    public void overtimePeriod(int ot);
}

interface Event {
    public void organize();
}
public class HockeyDemo implements Hockey, Event {
    
    public void setHomeTeam(String name){
        System.out.println("Home team: " + name);
    }
    
    public void setVisitingTeam(String name){}
    
    public void homeGoalScored (){}
    
    public void visitingGoalScored() {}
    
    public void endOfPeriod(int period) {}
    
    public void overtimePeriod(int ot) {}
    
    public static void main(String[] args) { 
        HockeyDemo hockeyDemo = new HockeyDemo();
        hockeyDemo.setHomeTeam("India");
        hockeyDemo.organize();
    }
    
    public void organize() {
        System.out.println("Match organized. ");
    }
    
}

