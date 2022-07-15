package FootBallGame4;

public class Team {
  String team1;
    String team2;
    int team;

    public Team()
    {

    }
    public Team (String team1, String team2)
    {
        this.team1 = team1;
        this.team2 = team2;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }
    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }
    public String toString()
    {
        return "Please enter the team scored. (1 for team 1 and 2 for team 2).";
    }


    public void team()
    {
        String getTeam = "Please enter the score for ";
        if (team == 1)
        {
            System.out.println(getTeam + team1+ ":");
        }
        else if (team == 2)
        {
            System.out.println(getTeam + team2 + ":");
        }
    }
}
