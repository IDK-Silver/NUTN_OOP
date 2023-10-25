package SecondPractice;
import SecondPractice.Role;
import SecondPractice.Witcher;
public class Warrior extends Role {

	public Warrior() {
		this("undefine");
	}

	public Warrior(String name) {
		this(name, 400, 100);
	};

	public Warrior(String Name, int Life, int Magic) {
		super(Name, Life, Magic, 10);
	}

	public void NewMoon(Warrior obj) {
		this.attack(obj, 40);
	};

	public void NewMoon(Witcher obj) {
		this.attack(obj, 60);
	};

}