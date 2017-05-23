package step4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.junit.Test;

public class e02_java_interop {

	@Test
	public void callKotlinObject() {
		String today = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);

		Assert.assertEquals(today, SingletonFromKotlin.INSTANCE.today());
	}


	@Test
	public void useDataClass() {
		DataClassFromKotlin dataclass = new DataClassFromKotlin("name", "otherName");

		Assert.assertEquals("name", dataclass.getName());
		Assert.assertEquals("otherName", dataclass.getOtherName());
	}
}
