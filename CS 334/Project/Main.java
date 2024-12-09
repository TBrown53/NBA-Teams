public class Main {
    public static void main(String[] args) {
        NBALibrary nbaLibrary = new NBALibrary();

        // Create players
        Player lebron = new Player("LeBron James", "SF", 6);
        Player davis = new Player("Anthony Davis", "PF", 3);

        // Create a team and add players
        Team lakers = new Team("Lakers", "Los Angeles");
        lakers.addPlayer(lebron);
        lakers.addPlayer(davis);

        // Add team to the library
        nbaLibrary.addTeam(lakers);

        // Display teams
        nbaLibrary.listTeams();

        // Access a specific team
        Team team = nbaLibrary.getTeam("Lakers");
        System.out.println("Retrieved Team: " + team);

        // Remove a player and display updated team
        team.removePlayer("LeBron James");
        System.out.println("After removing a player: " + team);
    }
}