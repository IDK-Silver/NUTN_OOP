package SecondPractice;
import SecondPractice.Role;
import SecondPractice.Warrior;

public class Witcher extends Role {

	public Witcher() {
		this("undefine");
	}

	public Witcher(String name) {
		this(name, 400, 100);
	};

	public Witcher(String Name, int Life, int Magic) {
		super(Name, Life, Magic, 10);
	}

	
	public void SmallFire(Witcher obj) {
		this.attack(obj, 80);
	};

	public void SmallFire(Warrior obj) {
		this.attack(obj, 40);
	};

}