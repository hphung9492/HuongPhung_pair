package FootBallGame4;

public class Quarter {
  int q1;
    int q2;
    int q3;
    int q4;
    int quarter;

    public Quarter ()
    {
        this.q1 = 1;
        this.q2 = 2;
        this.q3 = 3;
        this.q4 = 4;
    }
    public Quarter(int quarter)
    {
        this.quarter = quarter;
    }
    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }
    public int getQuarter()
    {
        return this.quarter;
    }

    public int getQ1() {
        return q1;
    }

    public int getQ2() {
        return q2;
    }

    public int getQ3() {
        return q3;
    }

    public int getQ4() {
        return q4;
    }

    public void setQ1(int q1) {
        this.q1 = q1;
    }

    public void setQ2(int q2) {
        this.q2 = q2;
    }

    public void setQ3(int q3) {
        this.q3 = q3;
    }

    public void setQ4(int q4) {
        this.q4 = q4;
    }
    public void getQ()
    {
            System.out.println("Please enter the quarter the team score. Enter 5 to exit.");
    }
}
