package demo.design.singleton.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import demo.design.singleton.SingletonDemo;

public class SingletonDemoTest {

	@Test
	public void test() {
		SingletonDemo s1 = SingletonDemo.getObject();
		SingletonDemo s2 = SingletonDemo.getObject();
		assertTrue(s1 == s2);
	}

}
