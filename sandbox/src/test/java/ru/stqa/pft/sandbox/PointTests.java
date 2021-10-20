package ru.stqa.pft.sandbox;


import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class PointTests {
  //проверяем, что считает верно
  public void testDistance() {
    Point p1 = new Point(2, 5);
    Point p2 = new Point(4, 8);
    Assert.assertEquals(p1.distance(p2), 3.605551275463989);
  }

  @Test
  //проверям еще раз подставив другие значения
  public void testDistance1() {
    Point p1 = new Point(7, 11);
    Point p2 = new Point(18, 25);
    Assert.assertEquals(p1.distance(p2), 17.804493814764857);
  }
}
