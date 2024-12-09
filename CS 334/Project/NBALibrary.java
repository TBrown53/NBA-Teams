import java.util.HashMap;
import java.util.Map;

public class NBALibrary {
    private Map<String, Team> teams;

    public NBALibrary() {
        this.teams = new HashMap<>();
    }

    public void addTeam(Team team) {
        teams.put(team.getName(), team);
    }

    public Team getTeam(String teamName) {
        return teams.get(teamName);
    }

    public void removeTeam(String teamName) {
        teams.remove(teamName);
    }

    public void listTeams() {
        teams.values().forEach(System.out::println);
    }
}