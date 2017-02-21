package test.hero.stormwars;
import hero.stormwars.HeroLaertes;
import junit.framework.TestCase;
public class HeroLaertesTest extends TestCase
{
  HeroLaertes laertes;

  public void testHealthPoints()
  {
    assertEquals(26, laertes.getHealthPoints());
  }

  @Override
  public void setUp()
  {
      laertes = new HeroLaertes();
  }

}
