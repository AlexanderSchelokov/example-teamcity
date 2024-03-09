package plaindoll;

public class Welcomer{
	public String sayWelcome() {
		return "Welcome home, good hunter. What is it your desire?";
	}
	public String sayFarewell() {
		return "Farewell, good hunter. May you find your worth in waking world.";
	}
	public String sayNeedGold(){
		return "Not enough gold";
	}
	public String saySome(){
		return "something in the way";
	}
	public String sayRandomHunter() {
		// Здесь вы можете добавить свои собственные фразы
		String[] phrases = {
			"Hunter, you're a sight for sore eyes.",
			"Stay safe, hunter.",
			"Hunter, may the good blood guide your way."
		};
		int randomIndex = (int) (Math.random() * phrases.length);
		return phrases[randomIndex];
	}
}

