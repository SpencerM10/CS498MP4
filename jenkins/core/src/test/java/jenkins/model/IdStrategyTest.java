package jenkins.model;

import org.junit.*;

import static org.junit.Assert.assertEquals;


public class IdStrategyTest {
	
	@Test
	public void isValidFileName() {
		
		String filename = "test";
		
		final jenkins.model.IdStrategy.CaseSensitive cs;

		cs = new jenkins.model.IdStrategy.CaseSensitive();

		String fl = cs.idFromFilename(filename);
		
		assertEquals(fl, filename);
	}
	
	@Test
	public void isCrazyValidFileName() {
		
		String crazyFileName = "@tes@t";
		
		final jenkins.model.IdStrategy.CaseSensitive cs;

		cs = new jenkins.model.IdStrategy.CaseSensitive();

		String fl = cs.idFromFilename(crazyFileName);
		
		assertEquals(fl, crazyFileName);
	}
}