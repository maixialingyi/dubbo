/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.config.spring.context.annotation;

import org.apache.dubbo.config.AbstractConfig;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

import static com.alibaba.spring.util.AnnotatedBeanDefinitionRegistryUtils.registerBeans;
import static org.apache.dubbo.config.spring.util.DubboBeanUtils.registerCommonBeans;

/**
 * Dubbo {@link AbstractConfig Config} {@link ImportBeanDefinitionRegistrar register}, which order can be configured
 *
 * @see EnableDubboConfig
 * @see DubboConfigConfiguration
 * @see Ordered
 * @since 2.5.8
 * @Import(DubboConfigConfigurationRegistrar.class)           implements ImportBeanDefinitionRegistrar
 * 调用registerBeanDefinitions
 */
public class DubboConfigConfigurationRegistrar implements ImportBeanDefinitionRegistrar {

    //
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        System.out.println("@EnableDubboConfig -- 配置类注入spring");

        //获取配置类中@EnableDubboConfig这个注解对象
        AnnotationAttributes attributes = AnnotationAttributes.fromMap(
                importingClassMetadata.getAnnotationAttributes(EnableDubboConfig.class.getName()));

        boolean multiple = attributes.getBoolean("multiple");

        /**
         * 读取配置，Single中配置类注入spring  BeanDefinition
         *
         * 一个配置单个属性   如：dubbo.protocol.name=dubbo
         * DubboConfigConfiguration 定义注入spring容器中的配置类
          */
        registerBeans(registry, DubboConfigConfiguration.Single.class);

        // 一配置多属性   如: dubbo.protcols.rest.name = rest
        if (multiple) { // Since 2.6.6 https://github.com/apache/dubbo/issues/3193
            registerBeans(registry, DubboConfigConfiguration.Multiple.class);
        }

        // Since 2.7.6
        /**
         * 向spring中注册
         * ReferenceAnnotationBeanPostProcessor.class
         * DubboConfigAliasPostProcessor.class
         * DubboLifecycleComponentApplicationListener.class
         * DubboBootstrapApplicationListener.class
         * DubboConfigDefaultPropertyValueBeanPostProcessor.class
         */
        registerCommonBeans(registry);
    }
}
