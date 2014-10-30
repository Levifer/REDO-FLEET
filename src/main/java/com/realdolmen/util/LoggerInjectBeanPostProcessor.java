package com.realdolmen.util;

import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

/**
 * Created by BPTAT47 on 30/10/2014.
 */
    public class LoggerInjectBeanPostProcessor implements BeanPostProcessor {
        public org.slf4j.Logger produceLogger(Class klass) {
            // get known WHAT bean/component invoked this producer
            //Class<?> clazz =
            return  LoggerFactory.getLogger(klass);
        }


        @Override
        public Object postProcessBeforeInitialization(final Object bean,
                                                      final String beanName) throws BeansException {
            return bean;
        }

        @Override
        public Object postProcessAfterInitialization(final Object bean,
                                                     final String beanName) throws BeansException {

            ReflectionUtils.doWithFields(bean.getClass(),
                    new ReflectionUtils.FieldCallback() {
                        @Override
                        public void doWith(final Field field) throws IllegalArgumentException, IllegalAccessException {
                            field.set(bean, produceLogger(bean.getClass()));
                        }
                    },
                    new ReflectionUtils.FieldFilter() {
                        @Override
                        public boolean matches(final Field field) {
                            return field.getAnnotation(LoggerProducer.class) != null;
                        }
                    });

            return bean;
        }
}
