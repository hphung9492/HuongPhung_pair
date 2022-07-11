package FootBall;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * class: FootBall2.java
 * author: Huong Phung
 * date : July 10, 2022
 * version: 2.0
 */


public class FootBall2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FootBall2 fb = new FootBall2();
        String team1 = fb.team1(in);
        String team2 = fb.team2(in);
        ArrayList<Integer> ggcQ1 = new ArrayList<>();
        ArrayList<Integer> ggcQ2 = new ArrayList<>();
        ArrayList<Integer> ggcQ3 = new ArrayList<>();
        ArrayList<Integer> ggcQ4 = new ArrayList<>();
        ArrayList<Integer> techQ1 = new ArrayList<>();
        ArrayList<Integer> techQ2 = new ArrayList<>();
        ArrayList<Integer> techQ3 = new ArrayList<>();
        ArrayList<Integer> techQ4 = new ArrayList<>();
        int quarter = fb.quarter(in);
        while (quarter >=1 && quarter <= 4) {
            int whichTeam = fb.whichTeam(in);
            String getScore = fb.getScore(in, whichTeam);
            System.out.println(getScore);
            if(quarter == 1)
            {
                if(whichTeam == 1)
                {
                    ggcQ1 = fb.ggcQ1(in);
                }
                else {
                    techQ1 = fb.techQ1(in);
                }
            }
            else if(quarter == 2)
            {
                if (whichTeam==1)
                {
                    ggcQ2 = fb.ggcQ2(in);
                }
                else {
                   techQ2 = fb.techQ2(in);
                }

            }
            else if(quarter == 3)
            {
                if(whichTeam == 1)
                {
                    ggcQ3 = fb.ggcQ3(in);
                }
                else {
                    techQ3 = fb.techQ3(in);
                }
            }
            else {
                if (whichTeam == 4)
                {
                    ggcQ4 = fb.ggcQ4(in);
                }
                else{
                    techQ4 = fb.techQ4(in);
                }
            }
            quarter = fb.quarter(in);
        }
        int[] total_ggc = fb.totalGGC(ggcQ1, ggcQ2, ggcQ3, ggcQ4);
        int[] total_gaTech = fb.totalGAtech(techQ1, techQ2, techQ3, techQ4);
        String winner = fb.winner(total_ggc, total_gaTech);
        System.out.println(winner);

    }
    public String team1(Scanner in)
    {
        System.out.println("Please enter the home's name: ");
        return in.nextLine();
    }
    public String team2(Scanner in)
    {
        System.out.println("Please enter the visit's name: ");
        return in.nextLine();
    }
    public int quarter(Scanner in)
    {
        System.out.println("Please enter the quarter the team scored. Enter 5 to exit. ");
        return in.nextInt();
    }

    public int whichTeam (Scanner in)
    {
        System.out.println("Please enter the team that scored (1 for GGC. 2 for Georgia Tech.)");
        return in.nextInt();
    }

    public String getScore (Scanner in, int whichTeam)
    {
        String team = "";
        String getScore = "Please enter the score for ";
        if (whichTeam == 1)
        {
            team = "GGC";
        }
        else if (whichTeam == 2) {
            team = "Georgia Tech";
        }
        else {
            System.out.println("Invalid number entered.");
        }
        return getScore + team;
    }
    public ArrayList<Integer> ggcQ1(Scanner in)
    {
        ArrayList<Integer> ggcQ1 = new ArrayList<>();
        while(in.hasNextInt())
        {
            int i = 0;
            ggcQ1.add(in.nextInt());
            i++;
            if (ggcQ1.get(0) == 1) {
                System.out.println("Invalid score entered.");
                break;
            }
            else if (ggcQ1.size() > 2 && ggcQ1.get(i) == 1 && i > 0 && ggcQ1.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return ggcQ1;
    }

    public ArrayList<Integer> ggcQ2(Scanner in)
    {
        ArrayList<Integer> ggcQ2 = new ArrayList<>();
        while(in.hasNextInt())
        {
            int i = 0;
            ggcQ2.add(in.nextInt());
            i++;
            if (ggcQ2.get(0) == 1) {
                System.out.println("Invalid score entered.");
                break;
            }
            else if (ggcQ2.size() > 2 && ggcQ2.get(i) == 1 && i > 0 && ggcQ2.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return ggcQ2;
    }

    public ArrayList<Integer> ggcQ3(Scanner in)
    {
        ArrayList<Integer> ggcQ3 = new ArrayList<>();
        while(in.hasNextInt())
        {
            int i = 0;
            ggcQ3.add(in.nextInt());
            i++;
            if (ggcQ3.get(0) == 1) {
                System.out.println("Invalid score entered.");
                break;
            }
            else if (ggcQ3.size() > 2 && ggcQ3.get(i) == 1 && i > 0 && ggcQ3.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return ggcQ3;
    }
    public ArrayList<Integer> ggcQ4(Scanner in)
    {
        ArrayList<Integer> ggcQ4 = new ArrayList<>();
        while(in.hasNextInt())
        {
            int i = 0;
            ggcQ4.add(in.nextInt());
            i++;
            if (ggcQ4.get(0) == 1) {
                System.out.println("Invalid score entered.");
                break;
            }
            else if (ggcQ4.size() > 2 && ggcQ4.get(i) == 1 && i > 0 && ggcQ4.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return ggcQ4;
    }

    public ArrayList<Integer> techQ1(Scanner in)
    {
        ArrayList<Integer> techQ1 = new ArrayList<>();
        while(in.hasNextInt())
        {
            int i = 0;
            techQ1.add(in.nextInt());
            i++;
            if (techQ1.get(0) == 1) {
                System.out.println("Invalid score entered.");
                break;
            }
            else if (techQ1.size() > 2 && techQ1.get(i) == 1 && i > 0 && techQ1.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return techQ1;
    }

    public ArrayList<Integer> techQ2(Scanner in)
    {
        ArrayList<Integer> techQ2 = new ArrayList<>();
        while(in.hasNextInt())
        {
            int i = 0;
            techQ2.add(in.nextInt());
            i++;
            if (techQ2.get(0) == 1) {
                System.out.println("Invalid score entered.");
                break;
            }
            else if (techQ2.size() > 2 && techQ2.get(i) == 1 && i > 0 && techQ2.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return techQ2;
    }

    public ArrayList<Integer> techQ3(Scanner in)
    {
        ArrayList<Integer> techQ3 = new ArrayList<>();
        while(in.hasNextInt())
        {
            int i = 0;
            techQ3.add(in.nextInt());
            i++;
            if (techQ3.get(0) == 1) {
                System.out.println("Invalid score entered.");
                break;
            }
            else if (techQ3.size() > 2 && techQ3.get(i) == 1 && i > 0 && techQ3.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return techQ3;
    }

    public ArrayList<Integer> techQ4(Scanner in)
    {
        ArrayList<Integer> techQ4 = new ArrayList<>();
        while(in.hasNextInt())
        {
            int i = 0;
            techQ4.add(in.nextInt());
            i++;
            if (techQ4.get(0) == 1) {
                System.out.println("Invalid score entered.");
                break;
            }
            else if (techQ4.size() > 2 && techQ4.get(i) == 1 && i > 0 && techQ4.get(i - 1) != 6) {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return techQ4;
    }

    public int[] totalGGC(ArrayList<Integer>ggcQ1, ArrayList<Integer>ggcQ2, ArrayList<Integer>ggcQ3, ArrayList<Integer>ggcQ4)
    {
        int[] total = new int[4];
        for (int i : ggcQ1)
        {
            total[0] += i;
        }
        for (int i : ggcQ2)
        {
            total[1] += i;
        }
        for (int i : ggcQ3)
        {
            total[2] += i;
        }
        for (int i : ggcQ4)
        {
            total[3] += i;
        }

        return total;
    }

    public int[] totalGAtech(ArrayList<Integer> techQ1, ArrayList<Integer> techQ2, ArrayList<Integer> techQ3, ArrayList<Integer> techQ4)
    {
        int[] total = new int[4];
        for (int i : techQ1)
        {
            total[0] += i;
        }
        for (int i : techQ2)
        {
            total[1] += i;
        }
        for (int i : techQ3)
        {
            total[2] += i;
        }
        for (int i : techQ4)
        {
            total[3] += i;
        }
        return total;
    }

    public String winner (int[] totalGGC, int[] totalGAtech)
    {
        int total_ggc = 0;
        for (int i = 0; i < totalGGC.length; i++)
        {
            total_ggc += totalGGC[i];
        }
        int total_gatech = 0;
        for (int i = 0; i < totalGAtech.length; i++)
        {
            total_gatech += totalGAtech[i];
        }
        String winner = "";
        if (total_ggc > total_gatech)
        {
            winner = "GGC defeated GA Tech by a score of " + total_ggc + " to " + total_gatech;
        }
        else {
            winner = "GA Tech defeated GGC by a score of " + total_gatech + " to " + total_ggc;
        }
        return winner;
    }
}


