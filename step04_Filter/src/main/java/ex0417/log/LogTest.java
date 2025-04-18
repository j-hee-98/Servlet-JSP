package ex0417.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogTest {
	Log log = LogFactory.getLog(super.getClass());
	
	public static void main(String[] args) {
		System.out.println("***LogTest 시작합니다.***");
		
		new LogTest().test();
		
		System.out.println("***LogTest 끝입니다.***");
	}
	
	public void test() {
		log.trace("trace 관련 로그입니다.");
		log.debug("debug 관련 로그입니다.");
		log.info("info 관련 로그입니다.");
		log.warn("warn 관련 로그입니다.");
		log.error("error 관련 로그입니다.");
		log.fatal("fatal 관련 로그입니다.");
	}
}
