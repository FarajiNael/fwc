package process;

import java.util.ArrayList;
import java.util.Iterator;

import data.Team;

public class TeamList {
	
	private static ArrayList<Team> teams = new ArrayList<Team>();
	
	static Team france = new Team("France");
	static Team germany = new Team("Germany");
	static Team italy = new Team("Italy");
	static Team spain = new Team("Spain");
	static Team argentina = new Team("Argentina");
	static Team portugal = new Team("Portugal");
	static Team england = new Team("England");
	static Team morocco = new Team("Morocco");
	static Team algeria = new Team("Algeria");
	static Team netherlands = new Team("Netherlands");
	static Team brazil = new Team("Brazil");
	static Team usa = new Team("USA");
	static Team japan = new Team("Japan");
	static Team china = new Team("China");
	static Team cameroon = new Team("Cameroon");
	static Team colombia = new Team("Colombia");
	static Team egypt = new Team("Egypt");
	static Team wales = new Team("Wales");
	static Team uruguay = new Team("Uruguay");
	static Team tunisia = new Team("Tunisia");
	static Team poland = new Team("Poland");
	static Team senegal = new Team("Senegal");
	static Team mauritania = new Team("Mauritania");
	static Team ivoryCoast = new Team("IvoryCoast");
	static Team southAfrica = new Team("SouthAfrica");
	static Team peru = new Team("Peru");
	static Team australia = new Team("Australia");
	static Team mexico = new Team("Mexico");
	static Team canada = new Team("Canada");
	static Team swiss = new Team("Swiss");
	static Team belgium = new Team("Belgium");
	static Team russia = new Team("Russia");
	
	public static String Name (ArrayList list ) {
		String result = null;
		Iterator<Team> iterator = teams.iterator();
		while (iterator.hasNext()) {
			Team team= iterator.next();
			 result= team.getNameTeam()+ " " + result;
		}
		return result ;
	}
	
	public static void main(String a[]) {
	
		teams.add(france);
		teams.add(germany);
		teams.add(italy);
		teams.add(spain);
		teams.add(argentina);
		teams.add(portugal);
		teams.add(england);
		teams.add(morocco);
		teams.add(algeria);
		teams.add(netherlands);
		teams.add(brazil);
		teams.add(usa);
		teams.add(japan);
		teams.add(china);
		teams.add(cameroon);
		teams.add(colombia);
		teams.add(egypt);
		teams.add(wales);
		teams.add(uruguay);
		teams.add(tunisia);
		teams.add(poland);
		teams.add(swiss);
		teams.add(senegal);
		teams.add(mauritania);
		teams.add(ivoryCoast);
		teams.add(southAfrica);
		teams.add(peru);
		teams.add(australia);
		teams.add(mexico);
		teams.add(canada);
		teams.add(belgium);
		teams.add(russia);
		
		
		System.out.println(Name(teams));
	
	}
	

}
