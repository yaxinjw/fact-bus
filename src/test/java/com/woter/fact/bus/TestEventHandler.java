package com.woter.fact.bus;

import com.woter.fact.bus.adpter.EventAdapter;
import com.woter.fact.bus.facede.EventBusFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TestEventHandler extends EventAdapter<TestEvent> {

	private static final Logger logger = LoggerFactory.getLogger(EventBusFacade.class);

	@Override
	public boolean process(TestEvent e) {

		logger.error("==================== 收到测试事件 ===================");

		return true;
	}

}