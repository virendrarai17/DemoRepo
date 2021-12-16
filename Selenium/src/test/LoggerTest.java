package test;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class LoggerTest {
	 // get a logger instance
		public static Logger logger = Logger.getLogger(LoggerTest.class);

		public void testLoggerDebug() {
			logger.debug("Hello.. im in Debug method");
		}

		public void testLoggerInfo() {
			logger.info("Hello.. im in Info method");
		}

		public void testLoggerWarn() {
			logger.warn("Hello.. im in Warn method");
		}

		public void testLoggerError() {
			logger.error("Hello.. im in Error method");
		}

		public void testLoggerFatal() {
			logger.fatal("Hello.. im in Fatal method");
		}

		public static void main(String[] args) {
			LoggerTest example = new LoggerTest();
			example.testLoggerDebug();
			example.testLoggerInfo();
			example.testLoggerWarn();
			example.testLoggerError();
			example.testLoggerFatal();
		}
	
  }

