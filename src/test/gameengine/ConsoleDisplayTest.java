package test.gameengine;
import gameengine.ConsoleDisplay;
import junit.framework.TestCase;
public class ConsoleDisplayTest extends TestCase{
  BloodfenRaptor bloodfenRaptor;
  Romulo romulo;
  ConsoleDisplay display = new ConsoleDisplay();


  public void testAttackCard(){
    assertEquals("Romulo attacked Bloodfen Raptor for 4 damage.\n", display.attackDisplay(romulo, bloodfenRaptor));
  }

  public void setUp()
  {
      bloodfenRaptor = new BloodfenRaptor();
      romulo = new Romulo();
  }

}
