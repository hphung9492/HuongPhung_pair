package FootBallGame3;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] t1 = new int[4];
        int[] t2 = new int[4];
        Main m = new Main();
        ArrayList<Integer> t1Q1 = new ArrayList<>();
        ArrayList<Integer> t1Q2 = new ArrayList<>();
        ArrayList<Integer> t1Q3 = new ArrayList<>();
        ArrayList<Integer> t1Q4 = new ArrayList<>();
        ArrayList<Integer> t2Q1 = new ArrayList<>();
        ArrayList<Integer> t2Q2 = new ArrayList<>();
        ArrayList<Integer> t2Q3 = new ArrayList<>();
        ArrayList<Integer> t2Q4 = new ArrayList<>();
        FootBall fb = new FootBall();
        System.out.println("Please enter the home's name: ");
        String team1 = in.nextLine();
        System.out.println("Please enter the visit's name: ");
        String team2 = in.nextLine();
        System.out.println("Please enter a quarter that the team scored. Enter 5 to exit.");
        int quarter = in.nextInt();
        fb.setQuarter(quarter);
        while (quarter >=1 && quarter <= 4) {
            System.out.println("Please enter the team scored (1 for team 1 and 2 for team 2): ");
            int t = in.nextInt();
            fb.getTeam(t);
            System.out.println(fb.toString());
            if (quarter == 1) {
                if (t == 1) {
                    t1Q1 = m.t1q1(in);
                } else {
                    t2Q1 = m.t2q1(in);
                }

            } else if (quarter == 2) {
                if (t == 1) {
                    t1Q2 = m.t1q2(in);
                } else {
                    t2Q2 = m.t2q2(in);
                }
            } else if (quarter == 3) {
                if (t == 1) {
                    t1Q3 = m.t1q3(in);
                } else {
                    t2Q3 = m.t2q3(in);
                }
            } else {
                if (t == 1) {
                    t1Q4 = m.t1q4(in);
                } else {
                    t2Q4 = m.t2q4(in);
                }
            }
            t1 = fb.t1(t1Q1, t1Q2, t1Q3, t1Q4);
            t2 = fb.t2(t2Q1, t2Q2, t2Q3, t2Q4);
            System.out.println("Please enter the quarter of the team scored. Enter 5 to exit. ");
            quarter = in.nextInt();
            fb.setQuarter(quarter);
        }
        System.out.println(fb.winner(team1,team2, t1, t2));

    }
    /**
     * method: t1q1
     * @param in
     * @return the scores of quarter 1 of team 1
     * description: this method takes the input from the user and stores it in an array list
     * as scores for the first quarter of team 1
     */
    public ArrayList<Integer> t1q1 (Scanner in)
    {
        ArrayList<Integer> t1q1 = new ArrayList<>();
        while(in.hasNextInt())
        {
            int i = 0;
            t1q1.add(in.nextInt());
            i++;
            if (t1q1.get(0) == 1) {
                System.out.println("Invalid score entered.");
                break;
            }
            else if (t1q1.size() > 2 && t1q1.get(i) == 1 && i > 0 && t1q1.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return t1q1;
    }

    /**
     * method: t1q2
     * @param in
     * @return the scores of quarter 2 of team 1
     * description: this method takes the input from the user and stores it in an array list
     * as scores for the second quarter of team 1
     */
    public ArrayList<Integer> t1q2 (Scanner in)
    {
        ArrayList<Integer> t1q2 = new ArrayList<>();
        while(in.hasNextInt())
        {
            int i = 0;
            t1q2.add(in.nextInt());
            i++;
            if (t1q2.get(0) == 1) {
                System.out.println("Invalid score entered.");
                break;
            }
            else if (t1q2.size() > 2 && t1q2.get(i) == 1 && i > 0 && t1q2.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return t1q2;
    }

    /**
     * method: t1q3
     * @param in
     * @return scores of quarter 3 of team 1
     * description: this method takes the input from the user and stores it in an array list
     * as scores for the third quarter of team 1
     */
    public ArrayList<Integer> t1q3 (Scanner in)
    {
        ArrayList<Integer> t1q3 = new ArrayList<>();
        while(in.hasNextInt())
        {
            int i = 0;
            t1q3.add(in.nextInt());
            i++;
            if (t1q3.get(0) == 1) {
                System.out.println("Invalid score entered.");
                break;
            }
            else if (t1q3.size() > 2 && t1q3.get(i) == 1 && i > 0 && t1q3.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return t1q3;
    }

    /**
     * method: t1q4
     * @param in
     * @return scores of quarter 4 of team 1
     * description: this method takes the input from the user and stores it in an array list
     * as scores for the fourth quarter of team 1
     */
    public ArrayList<Integer> t1q4 (Scanner in)
    {
        ArrayList<Integer> t1q4 = new ArrayList<>();
        while(in.hasNextInt())
        {
            int i = 0;
            t1q4.add(in.nextInt());
            i++;
            if (t1q4.get(0) == 1) {
                System.out.println("Invalid score entered.");
                break;
            }
            else if (t1q4.size() > 2 && t1q4.get(i) == 1 && i > 0 && t1q4.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return t1q4;
    }

    /**
     * method: t2q1
     * @param in
     * @return scores of quarter 1 of team 2
     * description: this method takes the input from the user and stores it in an array list
     * as scores for the first quarter of team 2
     */
    public ArrayList<Integer> t2q1 (Scanner in)
    {
        ArrayList<Integer> t2q1 = new ArrayList<>();
        while(in.hasNextInt())
        {
            int i = 0;
            t2q1.add(in.nextInt());
            i++;
            if (t2q1.get(0) == 1) {
                System.out.println("Invalid score entered.");
                break;
            }
            else if (t2q1.size() > 2 && t2q1.get(i) == 1 && i > 0 && t2q1.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return t2q1;
    }

    /**
     * method: t2q2
     * @param in
     * @return scores of quarter 2 of team 2
     * description: this method takes the input from the user and stores it in an array list
     * as scores for the second quarter of team 2
     */
    public ArrayList<Integer> t2q2 (Scanner in)
    {
        ArrayList<Integer> t2q2 = new ArrayList<>();
        while(in.hasNextInt())
        {
            int i = 0;
            t2q2.add(in.nextInt());
            i++;
            if (t2q2.get(0) == 1) {
                System.out.println("Invalid score entered.");
                break;
            }
            else if (t2q2.size() > 2 && t2q2.get(i) == 1 && i > 0 && t2q2.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return t2q2;
    }

    /**
     * method: t2q3
     * @param in
     * @return scores of quarter 3 of team 2
     * description: this method takes the input from the user and stores it in an array list
     * as scores for the third quarter of team 2
     */
    public ArrayList<Integer> t2q3 (Scanner in)
    {
        ArrayList<Integer> t2q3 = new ArrayList<>();
        while(in.hasNextInt())
        {
            int i = 0;
            t2q3.add(in.nextInt());
            i++;
            if (t2q3.get(0) == 1) {
                System.out.println("Invalid score entered.");
                break;
            }
            else if (t2q3.size() > 2 && t2q3.get(i) == 1 && i > 0 && t2q3.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return t2q3;
    }

    /**
     * method: t2q4
     * @param in
     * @return scores of the fourth quarter of team 2
     * description: this method takes the input from the user and stores it in an array list
     * as scores for the fourth quarter of team 2
     */
    public ArrayList<Integer> t2q4 (Scanner in)
    {
        ArrayList<Integer> t2q4 = new ArrayList<>();
        while(in.hasNextInt())
        {
            int i = 0;
            t2q4.add(in.nextInt());
            i++;
            if (t2q4.get(0) == 1) {
                System.out.println("Invalid score entered.");
                break;
            }
            else if (t2q4.size() > 2 && t2q4.get(i) == 1 && i > 0 && t2q4.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return t2q4;
    }
}
