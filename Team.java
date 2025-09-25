import java.util.ArrayList;

public class Team {
    // 1.c, 1.d, 1.e – private attributter
    private String teamName;               // holdets navn
    private int rank;                      // holdets rang
    private ArrayList<String> players;     // spillernavne

    // 1.f – constructor med parameter (teamName)
    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>(); // starter med tom liste
    }

    // 1.h – setter til rank
    public void setRank(int rank) {
        this.rank = rank;
    }

    // 1.l – metode til at tilføje spiller til listen
    public void addPlayer(String playerName) {
        players.add(playerName);
    }

    // 1.j + 1.m – toString returnerer navn, rang og spillere
    @Override
    public String toString() {
        String result = "Hold: " + teamName + " Rang: " + rank;
        for (String player : players) {
            result += "\n" + player; // hver spiller på ny linje
        }
        return result;
    }
}