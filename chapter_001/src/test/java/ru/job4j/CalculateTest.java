package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Sergii Malanchenko (msn85@ukr.net)
 * @version $Id$
 * @since 21.12.2017
*/

public class CalculateTest {
/**
 * Test echo.
*/ @Test
	public void whenTakeNameThenTreeEchoPlusName() {
    	String input = "Sergii Malanchenko";
    	String expect = "Echo, echo, echo : Sergii Malanchenko"; 
    	Calculate calc = new Calculate();
    	String result = calc.echo(input);
    	assertThat(result, is(expect));
	}
 
}