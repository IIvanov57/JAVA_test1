package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
  @Test
  public void testPoint(){
    Point d = new Point(4,8,2,4);
    Assert.assertEquals(d.distance(), 4.47213595499958);
  }
  @Test
  public void testPoint1(){
    Point d = new Point(10,17,15,27);
    Assert.assertEquals(d.distance(), 13.892443989449804);

  }
}
