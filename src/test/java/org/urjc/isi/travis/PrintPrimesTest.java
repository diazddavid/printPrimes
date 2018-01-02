package org.urjc.isi.travis;

import static org.junit.Assert.*;
import java.io.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrintPrimesTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

	@Test
	public void noPrimes() {
		PrintPrimes.main(new String[] {String.valueOf(0)});
	}
	
	@Test
	public void noArg(){
		String[] args = {};
        String string = "word\nword\nword\n";
		InputStream stringStream = new ByteArrayInputStream(string.getBytes());
        System.setIn(stringStream);
        
        PrintPrimes.main(args);
        assertEquals("Usage: java PrintPrimes v1 \n", outContent.toString());
        System.setIn(System.in);
	}

}
