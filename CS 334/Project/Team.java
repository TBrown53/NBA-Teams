import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private String city;
    private List<Player> players;

    public Team(String name, String city) {
        this.name = name;
        this.city = city;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(String playerName) {
        players.removeIf(player -> player.getName().equalsIgnoreCase(playerName));
    }

    @Override
    public String toString() {
        return "Team{name='" + name + "', city='" + city + "', players=" + players + "}";
    }
}