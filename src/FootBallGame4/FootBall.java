package FootBallGame4;

import java.util.ArrayList;

public class FootBall {
  int total1;
    int total2;

    public int total1(ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c, ArrayList<Integer> d)
    {
        int sum1 = 0;
        for (int i = 0; i < a.size(); i++)
        {
            sum1 += a.get(i);
        }
        for (int i = 0; i < b.size(); i++)
        {
            sum1 += b.get(i);
        }
        for (int i = 0; i < c.size(); i++)
        {
            sum1 += c.get(i);
        }
        for (int i = 0; i < d.size(); i++)
        {
            sum1 += d.get(i);
        }
        return sum1;
    }

    public int total2(ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c, ArrayList<Integer> d)
    {
        int sum2 = 0;
        for (int i = 0; i < a.size(); i++)
        {
            sum2 += a.get(i);
        }
        for (int i = 0; i < b.size(); i++)
        {
            sum2 += b.get(i);
        }
        for (int i = 0; i < c.size(); i++)
        {
            sum2 += c.get(i);
        }
        for (int i = 0; i < d.size(); i++)
        {
            sum2 += d.get(i);
        }
        return sum2;
    }

    public void setTotal1(int sum1) {
        this.total1 = sum1;
    }

    public int getTotal1() {
        return total1;
    }

    public void setTotal2(int sum2) {
        this.total2 = sum2;
    }

    public int getTotal2() {
        return total2;
    }

    public String winner(String team1, String team2, int total1, int total2)
    {
        String winner = "";
        if (total1 > total2)
        {
            winner = team1 + " defeated " + team2 + " by a score of " + total1 + " to " + total2;
        }
        else if (total1 < total2)
        {
            winner = team2 + " defeated " + team1 + " by a score of " + total2 + " to " + total1;
        }
        return winner;
    }
}
