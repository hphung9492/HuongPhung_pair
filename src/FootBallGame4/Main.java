package FootBallGame4;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Score sc = new Score();
        System.out.println("Please enter the home's name: ");
        String team1 = in.nextLine();
        System.out.println("Please enter the visit's name: ");
        String team2 = in.nextLine();
        Team t = new Team(team1, team2);
        System.out.println("Please enter the quarter the team scored. Enter 5 to exit.");
        Quarter q = new Quarter();
        q.setQuarter(in.nextInt());
        while (q.getQuarter() >= 1 && q.getQuarter() <= 4)
        {
            System.out.println(t.toString());
            t.setTeam(in.nextInt());
            t.team();
            if (q.getQuarter() == 1)
            {
                if (t.getTeam() == 1)
                {
                    sc.addScoret1q1(in.nextInt());
                }
                else {
                    sc.addScoret2q1(in.nextInt());
                }
            }
            else if (q.getQuarter() == 2)
            {
                if (t.getTeam() == 1)
                {
                    sc.addScoret1q2(in.nextInt());
                }
                else {
                    sc.addScoret2q2(in.nextInt());
                }
            }
            else if (q.getQuarter() == 3)
            {
                if (t.getTeam() == 1)
                {
                    sc.addScoret1q3(in.nextInt());
                }
                else {
                    sc.addScoret2q3(in.nextInt());
                }
            }
            else {
                if (t.getTeam() == 1)
                {
                    sc.addScoret1q4(in.nextInt());
                }
                else {
                    sc.addScoret2q4(in.nextInt());
                }
            }
            q.getQ();
            q.setQuarter(in.nextInt());
        }
        FootBall fb = new FootBall();
        fb.total1(sc.getT1Q1(), sc.getT1Q2(), sc.getT1Q3(), sc.getT1Q4());
        fb.total2(sc.getT2Q1(), sc.getT2Q2(),sc.getT2Q3(),sc.getT2Q4());
        System.out.println(fb.winner(t.getTeam1(),t.getTeam2(), fb.total1(sc.getT1Q1(), sc.getT1Q2(), sc.getT1Q3(), sc.getT1Q4()),fb.total2(sc.getT2Q1(), sc.getT2Q2(),sc.getT2Q3(),sc.getT2Q4())));
    }
}
