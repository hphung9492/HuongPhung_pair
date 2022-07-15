package FootBallGame4;

import java.util.ArrayList;

public class Score {
    ArrayList<Integer> t1Q1;
    ArrayList<Integer> t1Q2;
    ArrayList<Integer> t1Q3;
    ArrayList<Integer> t1Q4;
    ArrayList<Integer> t2Q1;
    ArrayList<Integer> t2Q2;
    ArrayList<Integer> t2Q3;
    ArrayList<Integer> t2Q4;

    public Score()
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

    public void addScoret1q1(int score)
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
    public void addScoret2q1(int score)
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
    public void addScoret1q2(int score)
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
    public void addScoret2q2(int score)
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
    public void addScoret1q3(int score)
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
    public void addScoret2q3(int score)
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
    public void addScoret1q4(int score)
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
    public void addScoret2q4(int score)
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



    public ArrayList<Integer> getT1Q1() {
        return t1Q1;
    }

    public ArrayList<Integer> getT1Q2() {
        return t1Q2;
    }

    public ArrayList<Integer> getT1Q3() {
        return t1Q3;
    }

    public ArrayList<Integer> getT1Q4() {
        return t1Q4;
    }

    public ArrayList<Integer> getT2Q1() {
        return t2Q1;
    }

    public ArrayList<Integer> getT2Q2() {
        return t2Q2;
    }

    public ArrayList<Integer> getT2Q3() {
        return t2Q3;
    }

    public ArrayList<Integer> getT2Q4() {
        return t2Q4;
    }
}
