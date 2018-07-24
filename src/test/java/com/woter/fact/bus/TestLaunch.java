package com.woter.fact.bus;

import com.woter.fact.bus.facede.EventBusFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:/spring.xml")
public class TestLaunch {

	@Test
	public void testExecute() {

		EventBusFacade.execute(new TestEvent()); //发布事件

	}

}