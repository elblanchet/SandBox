package characters;

import characters.components.Arms;
import characters.components.Chest;
import characters.components.Feet;
import characters.components.Head;
import characters.components.Legs;
import characters.components.Waist;
import characters.components.Wrist;

public abstract class Character {
	
	private String _name;
	private Arms _arms;
	private Chest _chest;
	private Feet _feet;
	private Head _head;
	private Legs _legs;
	private Waist _waist;
	private Wrist _wrist;
	
	public Character(String name, Arms arms, Chest chest, Feet feet, Head head, Legs legs, Waist waist, Wrist wrist) {
		setName(name);
		setArms(arms);
		setChest(chest);
		setFeet(feet);
		setHead(head);
		setLegs(legs);
		setWaist(waist);
		setWrist(wrist);
	}
	
	public String getName() {
		return _name;
	}
	
	public void setName(String name) {
		_name = name;
	}
	
	public Arms getArms() {
		return _arms;
	}
	
	public void setArms(Arms arms) {
		_arms = arms;
	}
	
	public Chest getChest() {
		return _chest;
	}
	
	public void setChest(Chest chest) {
		_chest = chest;
	}
	
	public Feet getFeet() {
		return _feet;
	}
	
	public void setFeet(Feet feet) {
		_feet = feet;
	}
	
	public Head getHead() {
		return _head;
	}
	
	public void setHead(Head head) {
		_head = head;
	}
	
	public Legs getLegs() {
		return _legs;
	}
	
	public void setLegs(Legs legs) {
		_legs = legs;
	}
	
	public Waist getWaist() {
		return _waist;
	}
	
	public void setWaist(Waist waist) {
		_waist = waist;
	}
	
	public Wrist getWrist() {
		return _wrist;
	}
	
	public void setWrist(Wrist wrist) {
		_wrist = wrist;
	}
}
