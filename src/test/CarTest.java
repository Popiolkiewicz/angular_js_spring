package test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import pl.Car;
import pl.Engine;

/**
 * 
 * @author Hubert
 *
 */
public class CarTest {

	@Mock
	private Engine engine;

	@InjectMocks
	private Car car;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testWarning() {
		when(engine.getRpm()).thenReturn(6000);
		car.accelerate();
		assertEquals("Slow Down!", car.getWarningMessage());
	}
}
