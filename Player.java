public class Player {
    
    private String name = "";
    private int score;

    public Player (String n) {
        name = n;
        score = 0;
    }

    public void setPlayerScore(int s) {
        score = s;
    }
}
