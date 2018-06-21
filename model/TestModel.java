package game.model;


import game.model.character.Bowman;
import game.model.character.Link;
import game.model.teardrop.Teardrop;
import game.model.character.Character;
import junit.framework.TestCase;

public class TestModel extends TestCase {
	
	private Teardrop sword = new Teardrop("sword", 5);
	private Link link = new Link("Link",3,3,sword);
	Character bokoblinsword = new Bowman();
	
		public final void testattack() {
			link.attack(bokoblinsword, sword);
			assertEquals("cas 10 coeurs après attaque de 5 coeurs",10.0, bokoblinsword.getHeart());
		}
		
		public final void testheart() {
			link.getHeart();
			assertEquals("cas 3 coeurs max", 3.0, link.getHeart());
			link.setHeart(2);
			assertEquals("cas 2 coeurs", 2.0, link.getHeart());
		}
		
		
		public final void testalive() {
			bokoblinsword.setHeart(-2);
			assertFalse("cas où l'ennemi est mort", false);
			bokoblinsword.setHeart(2);
			assertTrue("cas où l'ennemi est vivant", true);
			
		}

}
