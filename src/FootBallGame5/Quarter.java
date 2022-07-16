package FootBallGame5;
import java.util.Scanner;
/**
 * this class will take care of quarters of each team
 * this class also need to create a method to compute the score and add the score.
 * to each quarter.
 */
public class Quarter {

    ArrayList<Integer> t1Q1;
    ArrayList<Integer> t1Q2;
    ArrayList<Integer> t1Q3;
    ArrayList<Integer> t1Q4;
    ArrayList<Integer> t2Q1;
    ArrayList<Integer> t2Q2;
    ArrayList<Integer> t2Q3;
    ArrayList<Integer> t2Q4;
    Scanner in = new Scanner(System.in);
    int score;
    int sum1;
    int sum2;
    Teams t = new Teams();
    public Quarter()
    {
        this.t1Q1 = new ArrayList<Integer>();
        this.t1Q2 = new ArrayList<Integer>();
        this.t1Q3 = new ArrayList<Integer>();
        this.t1Q4 = new ArrayList<Integer>();
        this.t2Q1 = new ArrayList<Integer>();
        this.t2Q2 = new ArrayList<Integer>();
        this.t2Q3 = new ArrayList<Integer>();
        this.t2Q4 = new ArrayList<Integer>();
    }
    public void setScore() {
        this.score = in.nextInt();
    }

    public int getScore() {
        return score;
    }

    public void addScoret1q1()
    {
        int i = 0;
        while (i <= t1Q1.size()) {
            t1Q1.add(score);
            if (t1Q1.get(0) == 1) {
                System.out.println("Invalid score entered.");
                t1Q1.remove(0);
            }
            i++;
            if (t1Q1.size() >= 2 && t1Q1.get(i) == 1 && t1Q1.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                t1Q1.remove(i);
            }
            break;
        }
    }
    public void addScoret2q1()
    {
        int i = 0;
        while (i <= t2Q1.size()) {
            t2Q1.add(score);
            if (t2Q1.get(0) == 1) {
                System.out.println("Invalid score entered.");
                t2Q1.remove(0);
            }
            i++;
            if (t2Q1.size() >= 2 && t2Q1.get(i) == 1 && t2Q1.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                t2Q1.remove(i);
            }
            break;
        }
    }
    public void addScoret1q2()
    {
        int i = 0;
        while (i <= t1Q2.size()) {
            t1Q2.add(score);
            if (t1Q2.get(0) == 1) {
                System.out.println("Invalid score entered.");
                t1Q2.remove(0);
            }
            i++;
            if (t1Q2.size() >= 2 && t1Q2.get(i) == 1 && t1Q2.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                t1Q2.remove(i);
            }
            break;
        }
    }
    public void addScoret2q2()
    {
        int i = 0;
        while (i <= t2Q2.size()) {
            t2Q2.add(score);
            if (t2Q2.get(0) == 1) {
                System.out.println("Invalid score entered.");
                t2Q2.remove(0);
            }
            i++;
            if (t2Q2.size() >= 2 && t2Q2.get(i) == 1 && t2Q2.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                t2Q2.remove(i);
            }
            break;
        }
    }
    public void addScoret1q3()
    {
        int i = 0;
        while (i <= t1Q3.size()) {
            t1Q3.add(score);
            if (t1Q3.get(0) == 1) {
                System.out.println("Invalid score entered.");
                t1Q3.remove(0);
            }
            i++;
            if (t1Q3.size() >= 2 && t1Q3.get(i) == 1 && t1Q3.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                t1Q3.remove(i);
            }
            break;
        }

    }
    public void addScoret2q3()
    {
        int i = 0;
        while (i <= t2Q3.size()) {
            t2Q3.add(score);
            if (t2Q3.get(0) == 1) {
                System.out.println("Invalid score entered.");
                t2Q3.remove(0);
            }
            i++;
            if (t2Q3.size() >= 2 && t2Q3.get(i) == 1 && t2Q3.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                t2Q3.remove(i);
            }
            break;
        }
    }
    public void addScoret1q4()
    {
        int i = 0;
        while (i <= t1Q4.size()) {
            t1Q4.add(score);
            if (t1Q4.get(0) == 1) {
                System.out.println("Invalid score entered.");
                t1Q4.remove(0);
            }
            i++;
            if (t1Q4.size() >= 2 && t1Q4.get(i) == 1 && t1Q4.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                t1Q4.remove(i);
            }
            break;
        }
    }
    public void addScoret2q4()
    {
        int i = 0;
        while (i <= t2Q4.size()) {
            t2Q4.add(score);
            if (t2Q4.get(0) == 1) {
                System.out.println("Invalid score entered.");
                t2Q4.remove(0);
            }
            i++;
            if (t2Q4.size() >= 2 && t2Q4.get(i) == 1 && t2Q4.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                t2Q4.remove(i);
            }
            break;
        }
    }

    public void q ()
    {
        System.out.println("Please enter the quarter the team score. Enter 5 to exit.");
        int q = in.nextInt();
        while (q >= 1 && q <= 4)
        {
            t.setTeamIdentity();
            int s = t.getTeamIdentity();
            System.out.println("Please enter the score: ");
            setScore();
            if (q == 1)
            {
                if (s == 1)
                {
                    addScoret1q1();
                }
                else {
                    addScoret2q1();
                }
            }
            else if (q == 2)
            {
                if (s == 1)
                {
                    addScoret1q2();
                }
                else {
                    addScoret2q2();
                }
            }
            else if (q == 3)
            {
                if (s == 1)
                {
                    addScoret1q3();
                }
                else{
                    addScoret2q3();
                }
            }
            else {
                if (s == 1)
                {
                    addScoret1q4();
                }
                else{
                    addScoret2q4();
                }
            }
            System.out.println("Please enter the quarter the team score. Enter 5 to exit.");
            q = in.nextInt();
        }
        quarter();
    }
    public void quarter() {

        int[] quarterst1 = new int[4];//each element will update the score.
        int[] quarterst2 = new int[4];
        for (int i = 0; i < t1Q1.size(); i++)
        {
            quarterst1[0] += t1Q1.get(i);
        }
        for (int i = 0; i < t1Q2.size(); i++)
        {
            quarterst1[1] += t1Q2.get(i);
        }
        for (int i = 0; i < t1Q3.size(); i++)
        {
            quarterst1[2] += t1Q3.get(i);
        }
        for (int i = 0; i < t1Q4.size(); i++)
        {
            quarterst1[3] += t1Q4.get(i);
        }
        for (int i = 0; i < t2Q1.size(); i++)
        {
            quarterst2[0] += t2Q1.get(i);
        }
        for (int i = 0; i < t2Q2.size(); i++)
        {
            quarterst2[1] += t2Q2.get(i);
        }
        for (int i = 0; i < t2Q3.size(); i++)
        {
            quarterst2[2] += t2Q3.get(i);
        }
        for (int i = 0; i < t2Q4.size(); i++)
        {
            quarterst2[3] += t2Q4.get(i);
        }
        for (int i = 0; i < quarterst1.length; i++)
        {
            sum1 += quarterst1[i];
        }
        for (int i = 0; i < quarterst2.length; i++)
        {
            sum2 += quarterst2[i];
        }

    }

    public String winner(String team1, String team2)
    {
        String winner = "";
        if (sum1 > sum2)
        {
            winner = team1 + " defeated " + team2 + " by a score of " + sum1 + " to " + sum2;
        }
        else if (sum1 < sum2)
        {
            winner = team2 + " defeated " + team1 + " by a score of " + sum2 + " to " + sum2;
        }
        return winner;
    }



}
