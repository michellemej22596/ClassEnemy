public class EnemyFactoryA implements IEnemy{

	public static void main(String[] args) {

	}
	
	public IEnemy getNextEnemy(String type) {
		switch(type) {
		case "Enemy":
			return new Enemy();
		}
		return null;

}

	@Override
	public void attack() {
		
	}
}

