package FootBallGame3;
import java.util.ArrayList;
public class FootBall {
    //attributes such as teamName, quarters, score.
    //you can create Quarter class and include Quarter type object for example
    //Quarter q1;
    //you can create Team class and include Team type object for example
    //Team hTeam or vTeam or Team tm ;

    //constructors

    //getters, setters, and toString method

    //other methods to store scores
    private int quarter;
    private int team;
    private String getTeam;

    public FootBall(){

    }
    public FootBall (int quarter)
    {
        this.quarter = quarter;
    }
    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public int q()
    {
        return quarter;
    }

    public int getTeam(int team){
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public String getGetTeam() {
        return getTeam;
    }

    public void setGetTeam(String getTeam) {
        this.getTeam = getTeam;
    }

    public String toString()

    {
        return "Please enter the score ";
    }

    /**
     * method: t1
     * @param a
     * @param b
     * @param c
     * @param d
     * @return score of each quarter for the team 1.
     * description:
     */
    public int[] t1 (ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c, ArrayList<Integer> d)
    {
        int[] t1 = new int[4];
        for (int i = 0; i < a.size(); i++)
        {
           t1[0] += a.get(i);
        }
        for (int i = 0; i < b.size(); i++)
        {
            t1[1] += b.get(i);
        }
        for (int i = 0; i < c.size(); i++)
        {
            t1[2] += b.get(i);
        }
        for (int i = 0; i < d.size(); i++)
        {
            t1[3] += b.get(i);
        }
        return t1;
    }
    public int[] t2 (ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c, ArrayList<Integer> d)
    {
        int[] t2 = new int[4];
        for (int i = 0; i < a.size(); i++)
        {
            t2[0] += a.get(i);
        }
        for (int i = 0; i < b.size(); i++)
        {
            t2[1] += b.get(i);
        }
        for (int i = 0; i < c.size(); i++)
        {
            t2[2] += b.get(i);
        }
        for (int i = 0; i < d.size(); i++)
        {
            t2[3] += b.get(i);
        }
        return t2;
    }
    public String winner (String team1, String team2, int[] nums1, int[] nums2)
    {
        String winner = "";
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums1.length; i++)
        {
           sum1 += nums1[i];
        }
        for (int i = 0; i < nums2.length; i++)
        {
            sum2 += nums2[i];
        }
        if (sum1 > sum2){
            winner = team1 + " defeated " + team2 + " by a score of " + sum1 + " to " + sum2;
        }
        else if (sum1 < sum2)
        {
            winner = team2 + " defeated " + team1 + " by a score of " + sum2 + " to " + sum2;
        }
        return winner;
    }

}
