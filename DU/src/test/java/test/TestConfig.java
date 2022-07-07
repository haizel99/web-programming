package test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"file:src/main/resources/egovframework/spring/context-aspect.xml",
	"file:src/main/resources/egovframework/spring/context-common.xml",
	"file:src/main/resources/egovframework/spring/context-transaction.xml",
	"file:src/main/resources/egovframework/spring/context-datasource.xml",
	"file:src/main/resources/egovframework/spring/context-mapper.xml",
	"file:src/main/webapp/WEB-INF/config/egovframework/springmvc/dispatcher-servlet.xml"
})

public class TestConfig {}
