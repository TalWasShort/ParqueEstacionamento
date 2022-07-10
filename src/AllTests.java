import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TesteDevolverLugar.class, TesteElectrico.class, TesteEnviarLugares.class, TesteFechoDiario.class,
		TesteHidrogenio.class, TestePedirLugar.class, TesteSimples.class })
public class AllTests {

}
