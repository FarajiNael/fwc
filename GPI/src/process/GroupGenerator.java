package process;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import data.Group;
import data.Team;

public class GroupGenerator {
	
	public GroupGenerator() {
		
	}
	
	public void shuffle(ArrayList<Team> arraylist) {
		Collections.shuffle(arraylist);
	}

	public void generatorGroup (ArrayList<Team> arraylist) {
		
		List<Team> groupA = arraylist.subList(1, 4);
		List<Team> groupB = arraylist.subList(4, 8);
		List<Team> groupC = arraylist.subList(8, 12);
		List<Team> groupD = arraylist.subList(12, 16);

		List<Team> groupE = arraylist.subList(16, 20);
		List<Team> groupF = arraylist.subList(20, 24);
		List<Team> groupG = arraylist.subList(24, 28);
		List<Team> groupH = arraylist.subList(28, 32);
		
		Iterator<Team> iterator = groupA.iterator();
		while(iterator.hasNext()) {
			Team team = iterator.next();
			Group.getGroupA().add(team);
		}
		
		Iterator<Team> iterator1 = groupB.iterator();
		while(iterator1.hasNext()) {
			Team team = iterator1.next();
			Group.getGroupB().add(team);
		}
		
		Iterator<Team> iterator2 = groupC.iterator();
		while(iterator2.hasNext()) {
			Team team = iterator2.next();
			Group.getGroupC().add(team);
		}
		
		Iterator<Team> iterator3 = groupD.iterator();
		while(iterator3.hasNext()) {
			Team team = iterator3.next();
			Group.getGroupD().add(team);
		}
		
		Iterator<Team> iterator4 = groupE.iterator();
		while(iterator4.hasNext()) {
			Team team = iterator4.next();
			Group.getGroupE().add(team);
		}
		
		Iterator<Team> iterator5 = groupF.iterator();
		while(iterator5.hasNext()) {
			Team team = iterator5.next();
			Group.getGroupF().add(team);
		}
		
		Iterator<Team> iterator6 = groupG.iterator();
		while(iterator6.hasNext()) {
			Team team = iterator6.next();
			Group.getGroupG().add(team);
		}
		
		Iterator<Team> iterator7 = groupH.iterator();
		while(iterator7.hasNext()) {
			Team team = iterator7.next();
			Group.getGroupH().add(team);
		}

	}
}
