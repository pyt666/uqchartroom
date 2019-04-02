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
import java.util.UUID;

/**
 * @ClassName UUIDGenerator
 * @Description TODO
 * @Author pyt
 * @Date 2019/1/10 16:42
 * @Version
 */
public class UUIDGenerator implements Configurable, IdentifierGenerator {
    @Override
    public void configure(Type type, Properties properties, ServiceRegistry serviceRegistry) throws MappingException {

    }

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        return UUID.randomUUID();
    }
}
