package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import recursion.RestoreIPAddresses;

public class RestoreIPAddressesTest {

	@Test
	public void test() {
		RestoreIPAddresses re= new RestoreIPAddresses();
		ArrayList<String> ret= new ArrayList<String>();
		ret.add("0.0.0.0");
		assertEquals(ret,re.restoreIpAddresses("0000"));
	}

}
