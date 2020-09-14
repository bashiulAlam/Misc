import ch.qos.logback.classic.encoder.PatternLayoutEncoder 
import ch.qos.logback.core.FileAppender
import ch.qos.logback.core.rolling.RollingFileAppender
import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.classic.turbo.MDCFilter
import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy
import ch.qos.logback.core.rolling.TimeBasedRollingPolicy
import ch.qos.logback.core.util.FileSize

import static ch.qos.logback.classic.Level.DEBUG
import static ch.qos.logback.classic.Level.INFO
import static ch.qos.logback.classic.Level.WARN
import ch.qos.logback.classic.gaffer.ComponentDelegate


appender('console', ConsoleAppender) {
   encoder(PatternLayoutEncoder) {
	   pattern = "%d{yyyy-MM-dd HH:mm:ss.SSS} [%10thread] %cyan(%-40logger{36}) : %msg%n"
   }
}

appender('file', RollingFileAppender) {
	file = "./log/logback.log"
	append = true
	
	encoder(PatternLayoutEncoder) {
		pattern = "%d{yyyy-MM-dd HH:mm:ss.SSS} %level [%thread] %logger{36} : %msg%n"
	}
	
	rollingPolicy(ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy) {
		fileNamePatternStr = "./log/logback-%d{yyyy-MM-dd}.%i.log.gz"
		maxHistory = 60
		totalSizeCap = "100MB"
		maxFileSize = FileSize.valueOf("50MB")
	}
	
	triggeringPolicy(ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy) {
		maxFileSize = '100MB'
	}
//	timeBasedFileNamingAndTriggeringPolicy(SizeAndTimeBasedFNATP) {
//		maxFileSize = "100MB"
//	}
}



logger("com.konasl.log", INFO, ["console"])

root(INFO, ['console', 'file'])