package zadaci;

public class Player1 extends GameObject {

	public Player1(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

	protected String name;
	protected int health;
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		  if (name == null || name.trim().isEmpty()) {
	            this.name = "nepoznato ";
	            return;
		  }
	
    }
  
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
			 if (health < 0) {
		            this.health = 0;   
		        } else if (health > 100) {
		            this.health = 100; 
		        } else {
		this.health = health;
	}
	}

	@Override
	public String toString() {
		return "Player1 [name=" + name + ", health=" + health + "]";
	}

	

	

	
	}

	

	

	

	
	

	
	
	
	
	
}
