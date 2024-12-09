//Homework8
public class Team
	{
		private String name;
		private String city;
		//add city,State
		private int championships;

		public Team(String name)
		{
			this.name = name;
		}
		
		public Team(String name, String city)
		{
			this.name = name;;
			this.city = city;
		}
		
		public Team(String name, String city, int championships)
		{
			this.name = name;
			this.city = city;
			this.championships = championships;
		}
		public String getName()
		{
			return name;
		}
		public String getCity()
		{
			return city;
		}
		public int getChampionships()
		{
			return championships;
		}
		
	}

