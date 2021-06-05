package org.apache.dubbo.demo.provider;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.demo.OneWayProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DubboService
public class OneWayProviderImpl implements OneWayProvider {

    private static final Logger logger = LoggerFactory.getLogger(OneWayProviderImpl.class);


    @Override
    public void oneWayTest(int age) {
        logger.info("----->>>>>>>oneWayTest");
    }
}
