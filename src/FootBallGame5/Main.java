package FootBallGame5;

public class Main {
    public static void main(String[] args) {

        Teams[] teams = new Teams[2];
        Teams t = new Teams();
        t.setTeam1();
        t.setTeam2();
        Quarter q = new Quarter();
        q.q();
        System.out.println(q.winner(t.getTeam1(), t.getTeam2()));
    }
}
