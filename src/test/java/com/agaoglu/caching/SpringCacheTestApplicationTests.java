package com.agaoglu.caching;

import com.agaoglu.caching.config.CacheConfiguration;
import com.agaoglu.caching.config.EmbeddedRedisConfig;
import com.agaoglu.caching.service.CacheHelper;
import com.agaoglu.caching.service.TestService;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@EnableCaching
@ContextConfiguration(classes = {TestService.class, CacheHelper.class, CacheConfiguration.class, EmbeddedRedisConfig.class})
@ActiveProfiles(profiles = "test")
class SpringCacheTestApplicationTests {

	@Autowired
	TestService testService;

	@Test
	void contextLoads() {
		testService.putToCache("fromTestKey", "fromTestValue");
		String value = testService.fromCache("fromTestKey");
		Assertions.assertEquals("fromTestValue", value);

	}

}
