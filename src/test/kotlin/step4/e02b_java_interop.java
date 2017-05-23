package step4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.junit.Test;

/**
 *  Documentation associé : "Java Interop" dans kotlin-docs.pdf
 */
public class e02b_java_interop {

	@Test
	public void callKotlinObject() {
		String today = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);

		// TODO: appelez la méthode 'today' sur l'objet SingletonFromKotlin
		Assert.assertEquals(today, null);
	}


	@Test
	public void useDataClass() {
		DataClassFromKotlin dataclass = null; // TODO: créez une instance de la class DataClassFromKotlin directement depuis ce code Java


		Assert.assertEquals("name", dataclass.getName());
		Assert.assertEquals("otherName", dataclass.getOtherName());
	}
}
