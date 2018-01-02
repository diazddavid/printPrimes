package org.urjc.isi.travis;

import static org.junit.Assert.*;
import java.io.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrintPrimesTest {

	@Test
	public void noPrimes() {
		PrintPrimes.main(new String[] {String.valueOf(0)});
	}

}
