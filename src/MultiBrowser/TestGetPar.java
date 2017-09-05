package MultiBrowser;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestGetPar {
  @Test
  @Parameters("browser")
  public void f(String browser) {

	  GetPar getpar= new GetPar ();
	  getpar.msg=browser;
	  getpar.print();
  }
}
