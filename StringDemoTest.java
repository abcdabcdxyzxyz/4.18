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
		assertEquals("һ����ĸ��Сд",str.smallString("A"),"a");
	}
	@Test
	public void testSmallString2() {
		assertEquals("һ����ĸ��Сд",str.smallString("B"),"b");
	}
	@Test
	public void testSmallString3() {
		assertEquals("һ����ĸ��Сд",str.smallString("C"),"c");
	}
	@Test
	public void testSmallString4() {
		assertEquals("һ����ĸ��Сд",str.smallString("AA"),"aa");
	}
	@Test
	public void testSmallString5() {
		assertEquals("һ����ĸ��Сд",str.smallString("AB"),"ab");
	}
	@Test
	public void testSmallString6() {
		assertEquals("һ����ĸ��Сд",str.smallString("AC"),"ac");
	}
	@Test
	public void testSmallString7() {
		assertEquals("һ����ĸ��Сд",str.smallString("ABC"),"abc");
	}
	@Test
	public void testSmallString8() {
		assertEquals("һ����ĸ��Сд",str.smallString("ABCD"),"abcd");
	}
	@Test
	public void testSmallString9() {
		assertEquals("һ����ĸ��Сд",str.smallString("a"),"a");
	}
	@Test
	public void testSmallString10() {
		assertEquals("һ����ĸ��Сд",str.smallString("aBc"),"abc");
	}
}