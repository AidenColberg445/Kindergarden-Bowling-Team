import java.io.IOException;

public class BowlingTeamApp {

    public static void main(String[] args) {
        Team team = new Team();

        // Load players from the JSON file
        try {
            team.loadFromJSON("team.json");
            System.out.println("Team loaded from JSON:");
            team.displayPlayers();
        } catch (IOException e) {
            System.err.println("Error loading from JSON: " + e.getMessage());
        }

        // Add and remove players
        team.addPlayer("Derek", 15);
        team.removePlayer("Bob");

        System.out.println("\nUpdated Players:");
        team.displayPlayers();

        // Save the updated team to the JSON file
        try {
            team.saveToJSON("team.json");
            System.out.println("\nTeam saved to JSON.");
        } catch (IOException e) {
            System.err.println("Error saving to JSON: " + e.getMessage());
        }
    }
}
