package FootBall;

import java.util.Scanner;
public class FootBall {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FootBall fb = new FootBall();
        String team1 = fb.team1(in);
        String team2 = fb.team2(in);
        int quarter = fb.quarter(in);
        int[] ggcQ1 = new int[50];
        int[] ggcQ2 = new int[50];
        int[] ggcQ3 = new int[50];
        int[] ggcQ4 = new int[50];
        int[]gatechQ1 = new int[50];
        int[]gatechQ2 = new int[50];
        int[]gatechQ3 = new int[50];
        int[]gatechQ4 = new int[50];
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
                    gatechQ1 = fb.techQ1(in);
                }
            }
            else if(quarter == 2)
            {
                if (whichTeam==1)
                {
                    ggcQ2 = fb.ggcQ2(in);
                }
                else {
                    gatechQ2 = fb.techQ2(in);
                }

            }
            else if(quarter == 3)
            {
                if(whichTeam == 1)
                {
                    ggcQ3 = fb.ggcQ3(in);
                }
                else {
                    gatechQ3 = fb.techQ3(in);
                }
            }
            else {
                if (whichTeam == 4)
                {
                    ggcQ4 = fb.ggcQ4(in);
                }
                else{
                    gatechQ4 = fb.techQ4(in);
                }
            }
            quarter = fb.quarter(in);
        }
        int totalGGC =  fb.totalGGC(ggcQ1, ggcQ2, ggcQ3, ggcQ4);
        int totalGAtech = fb.totalGAtech(gatechQ1,gatechQ2, gatechQ3, gatechQ4);
        String winner = fb.winner(totalGGC, totalGAtech);
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

    public int[] ggcQ1(Scanner in)
    {
        int[] ggcQ1 = new int[50];
        while(in.hasNextInt())
        {
            int i = 0;
            ggcQ1[i] = in.nextInt();
            i++;
                if (ggcQ1[0] == 1) {
                    System.out.println("Invalid score entered.");
                    break;
                } else if (ggcQ1[i] == 1 && i > 0 && ggcQ1[i - 1] != 6) {
                    System.out.println("Invalid score entered.");
                    break;
                }
                break;
        }
        return ggcQ1;
    }

    public int[] ggcQ2(Scanner in)
    {
        int[] ggcQ2 = new int[50];
        while(in.hasNextInt())
        {
            int i = 0;
            ggcQ2[i] = in.nextInt();
            i++;
            if (ggcQ2[0] == 1)
            {
                System.out.println("Invalid score entered.");
                break;
            }
            else if(ggcQ2[i] == 1 && i>0 && ggcQ2[i-1] != 6)
            {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return ggcQ2;
    }

    public int[] ggcQ3(Scanner in)
    {
        int[] ggcQ3 = new int[50];
        while(in.hasNextInt())
        {
            int i = 0;
            ggcQ3[i] = in.nextInt();
            i++;
            if (ggcQ3[0] == 1)
            {
                System.out.println("Invalid score entered.");
                break;
            }
            else if(ggcQ3[i] == 1 && i>0 && ggcQ3[i-1] != 6)
            {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return ggcQ3;
    }

    public int[] ggcQ4(Scanner in)
    {
        int[] ggcQ4 = new int[50];
        while(in.hasNextInt())
        {
            int i = 0;
            ggcQ4[i] = in.nextInt();
            i++;
            if (ggcQ4[0] == 1)
            {
                System.out.println("Invalid score entered.");
                break;
            }
            else if(ggcQ4[i] == 1 && i>0 && ggcQ4[i-1] != 6)
            {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return ggcQ4;
    }

    public int[] techQ1(Scanner in)
    {
        int[] techQ1 = new int[50];
        while(in.hasNextInt())
        {
            int i = 0;
            techQ1[i] = in.nextInt();
            i++;
            if (techQ1[0] == 1)
            {
                System.out.println("Invalid score entered.");
                break;
            }
            else if(techQ1[i] == 1 && i>0 && techQ1[i-1] != 6)
            {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return techQ1;
    }

    public int[] techQ2(Scanner in)
    {
        int[] techQ2 = new int[50];
        while(in.hasNextInt())
        {
            int i = 0;
            techQ2[i] = in.nextInt();
            i++;
            if (techQ2[0] == 1)
            {
                System.out.println("Invalid score entered.");
                break;
            }
            else if(techQ2[i] == 1 && i>0 && techQ2[i-1] != 6)
            {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return techQ2;
    }

    public int[] techQ3(Scanner in)
    {
        int[] techQ3 = new int[50];
        while(in.hasNextInt())
        {
            int i = 0;
            techQ3[i] = in.nextInt();
            i++;
            if (techQ3[0] == 1)
            {
                System.out.println("Invalid score entered.");
                break;
            }
            else if(techQ3[i] == 1 && i>0 && techQ3[i-1] != 6)
            {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return techQ3;
    }

    public int[] techQ4(Scanner in)
    {
        int[] techQ4 = new int[50];
        while(in.hasNextInt())
        {
            int i = 0;
            techQ4[i] = in.nextInt();
            i++;
            if (techQ4[0] == 1)
            {
                System.out.println("Invalid score entered.");
                break;
            }
            else if(techQ4[i] == 1 && i>0 && techQ4[i-1] != 6)
            {
                System.out.println("Invalid score entered.");
                break;
            }
            break;
        }
        return techQ4;
    }

    public int totalGGC(int[] ggcQ1, int[] ggcQ2, int[] ggcQ3, int[] ggcQ4)
    {
        int sum = 0;
        for (int i = 0; i < 50; i++)
        {
           sum += ggcQ1[i] + ggcQ2[i] + ggcQ3[i] + ggcQ4[i];
        }
        return sum;
    }

    public int totalGAtech(int[] techQ1, int[] techQ2, int[] techQ3, int[] techQ4)
    {
        int sum = 0;
        for (int i = 0; i < 50; i++)
        {
            sum += techQ1[i] + techQ2[i] + techQ3[i] + techQ4[i];
        }
        return sum;
    }

    public String winner (int totalGGC, int totalGAtech)
    {
        String winner = "";
        if (totalGGC > totalGAtech)
        {
            winner = "The winner is GGC with " + totalGGC;
        }
        else {
            winner = "The winner is GA Tech with " + totalGAtech;
        }
        return winner;
    }
}
