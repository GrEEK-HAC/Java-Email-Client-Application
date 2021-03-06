package jeep.test;

import static org.junit.Assert.*;
import jeep.data.configuration.ConfigurationController;

import org.junit.Test;

/**
 * This tests the ConfigurationController object class.
 * 
 * @author Natacha Gabbamonte 0932340
 * 
 */
public class ConfigurationControllerTest {

	/**
	 * This tests loading properties and writing properties with isGmail set to
	 * both true and false.
	 */
	@Test
	public void test1() {
		ConfigurationController confs = new ConfigurationController(null);
		assertTrue(confs.loadProperties());
		assertTrue(confs.writeProperties());
		System.out.println(confs.getMailConfig());
	}
}
