package demo.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import demo.StringDemo;
import junit.framework.TestCase;

public class StringDemoTest extends TestCase {
	private StringDemo str;
	@Before
	protected void setUp(){
		str = new StringDemo();
	}
	@Test
	public void testSmallString1() {
		assertEquals("一个字母变小写",str.smallString("A"),"a");
	}
	@Test
	public void testSmallString2() {
		assertEquals("一个字母变小写",str.smallString("B"),"b");
	}
	@Test
	public void testSmallString3() {
		assertEquals("一个字母变小写",str.smallString("C"),"c");
	}
	@Test
	public void testSmallString4() {
		assertEquals("一个字母变小写",str.smallString("AA"),"aa");
	}
	@Test
	public void testSmallString5() {
		assertEquals("一个字母变小写",str.smallString("AB"),"ab");
	}
	@Test
	public void testSmallString6() {
		assertEquals("一个字母变小写",str.smallString("AC"),"ac");
	}
	@Test
	public void testSmallString7() {
		assertEquals("一个字母变小写",str.smallString("ABC"),"abc");
	}
	@Test
	public void testSmallString8() {
		assertEquals("一个字母变小写",str.smallString("ABCD"),"abcd");
	}
	@Test
	public void testSmallString9() {
		assertEquals("一个字母变小写",str.smallString("a"),"a");
	}
	@Test
	public void testSmallString10() {
		assertEquals("一个字母变小写",str.smallString("aBc"),"abc");
	}
}