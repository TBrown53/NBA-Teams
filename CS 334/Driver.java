import java.util.*;
public class Driver
{
	public static void main(String[] args)
	{
		Map<Integer, NBAPlayer> playerMap = new HashMap<>();
		
		//pick players to add to the map, add their records(look it up)
		playerMap.put(1, new NBAPlayer("Stephen Curry", "Golden Sate Warriors", 36, 14)); //yearsPro 14
		playerMap.put(2, new NBAPlayer("LeBron James", "Lakers", 39, 20)); //yearspro 20
		playerMap.put(3, new NBAPlayer("Jayson Tatum", "Boston Celtics", 26, 6)); //yearspro 6
		playerMap.put(4, new NBAPlayer("James Harden", "LA Clippers", 34, 14)); //years pro 14
		playerMap.put(5, new NBAPlayer("DeMar DeRozan", "Chicago Bulls", 34, 14));//YearsPro 14
		
		//Iterator lists the keys
		System.out.println("Listing keys using interator:");
		Iterator<Integer> keysIterator = playerMap.keySet().iterator();
		while(keysIterator.hasNext())
			{
				System.out.println(keysIterator.next());
			}
			
		System.out.println("\nListing all data records using indexed for loop:");
        for (Map.Entry<Integer, NBAPlayer> entry : playerMap.entrySet()) 
		{
            NBAPlayer player = entry.getValue();
            System.out.println("ID: " + entry.getKey() + ", Name: " + player.getName() + ", Age: " + player.getAge() + ", Team: " + player.getTeam() + ", Years Pro: " + player.getYearsPro());
        }

		System.out.println("\nListing data records using keys iterator:");
        keysIterator = playerMap.keySet().iterator();
        while (keysIterator.hasNext()) 
		{
            int key = keysIterator.next();
            NBAPlayer player = playerMap.get(key);
            System.out.println("ID: " + key + ", Name: " + player.getName() + ", Age: " + player.getAge() + ", Team: " + player.getTeam() + ", Years Pro: " + player.getYearsPro());
        }

		//this creates a map of the Int ID keys and Player Records
		Map<Integer, NBAPlayer> playerIDMap = new HashMap<>();
        int uniqueID = 1;
		
		//this will add the player records into the map id with different id's that arae uique
		for (NBAPlayer player : playerMap.values()) 
		{
            playerIDMap.put(uniqueID++, player);
        }

		System.out.println("\nRedoing 1, 2, & 3 with playerIDMap:");
		System.out.println("\nListing all data records using indexed for loop:");
			for (Map.Entry<Integer, NBAPlayer> entry : playerIDMap.entrySet()) 
			{
				NBAPlayer player = entry.getValue();
				System.out.println("ID: " + entry.getKey() + ", Name: " + player.getName() + ", Age: " + player.getAge() + ", Team: " + player.getTeam() + ", Years Pro: " + player.getYearsPro());
			}
		
			
		System.out.println("\nListing keys using iterator:");
        keysIterator = playerIDMap.keySet().iterator();
        while (keysIterator.hasNext())
		{
            System.out.println(keysIterator.next());
        }
		
		System.out.println("\nListing data records using keys iterator:");
        keysIterator = playerIDMap.keySet().iterator();
        while (keysIterator.hasNext()) 
		{
            int key = keysIterator.next();
            NBAPlayer player = playerIDMap.get(key);
            System.out.println("ID: " + key + ", Name: " + player.getName() + ", Age: " + player.getAge() + ", Team: " + player.getTeam() + ", Years Pro: " + player.getYearsPro());
        }
	}
}