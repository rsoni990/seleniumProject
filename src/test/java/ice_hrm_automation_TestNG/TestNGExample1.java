package ice_hrm_automation_TestNG;

import org.testng.annotations.Test;

public class TestNGExample1 {
  @Test
  public void add() {
	  int a=10;int b=200;
	  System.out.println(a+b);
  }
  @Test
  public void mult() {
	  int a=10; int b=20;
	  System.out.println(a*b);
  }
  @Test
  public void sub()
  {
	  int a=200;int b=300;
	  System.out.println(a-b);
  }
  @Test
  public void div()
  {
	  int a=2000;int b=400;
	  System.out.println(a/b);
  }
  @Test
  public void modulus()
  {
	  int a=200;int b=400;
	  System.out.println(a%b);
  }
}
