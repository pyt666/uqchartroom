package com.uq.uqchartroom.utils;
import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;

import java.io.Serializable;
import java.util.Properties;

/**
 * @ClassName IdGenerator
 * @Description TODO
 * @Author pyt
 * @Date 2019/1/10 16:38
 * @Version
 */
public class IdGenerator implements Configurable, IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        return System.currentTimeMillis();
    }

    @Override
    public void configure(Type type, Properties properties, ServiceRegistry serviceRegistry) throws MappingException {

    }
}
