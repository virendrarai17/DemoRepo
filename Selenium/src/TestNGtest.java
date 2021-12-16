
//Parametrization through TestNG
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class TestNGtest {
@Parameters({"browser"})
@Test
public void testCaseOne(String browser){
	System.out.println("browser passed as"+ browser);
	
}
@Parameters({"userName", "passWord"})
 public void login(String userName, String passWord){
	 System.out.println("userName"+ userName +"passWord"+ passWord);
 }
/*
 * Pass the value through testNG.XML
 * <suit name="Parameterization Suit">
<test name="Testing parameterization">
<parameter name="browser" value="fireFox"/>
<parameter name="userName" value="admin"/>
<parameter name="passWord" value="password"/>
<classes>
<class name="pac1.class/>
</classes>
</test>
</suit>
 */
}

