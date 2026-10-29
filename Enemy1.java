package zadaci;

public class Enemy1 extends GameObject {

	private String type;
	private int damage;
	private int health;
	
	public Enemy1(int x, int y, int width, int height, String type, int damage, int health) {
		super(x, y, width, height);
		this.type = type;
		this.damage = damage;
		this.health = health;
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public boolean search(String text) {
        return type.toLowerCase().contains(text.toLowerCase());
    }

	@Override
	public String toString() {
		return "Enemy1 [type=" + type + ", damage=" + damage + ", health=" + health + "]";
	}

	
	

	
	
	
	
	

}
