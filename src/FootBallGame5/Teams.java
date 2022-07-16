package FootBallGame5;
import java.util.Scanner;
public class Teams {
   int teamIdentity; //whether the home team or visitor team.
    String team1;
    String team2;
    Quarter[] quarters = new Quarter[4];
    Scanner in = new Scanner(System.in);
    public void setTeam1() {
        System.out.println("Please enter the home's name: ");
        this.team1 = in.nextLine();
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam2()
    {
        System.out.println("Please enter the visit's name: ");
        this.team2 = in.nextLine();
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeamIdentity() {
        System.out.println("Please enter the team that scored. 1 for team 1 and 2 for team 2.");
        this.teamIdentity = in.nextInt();
    }
    public int getTeamIdentity() {
        return teamIdentity;
    }



}
