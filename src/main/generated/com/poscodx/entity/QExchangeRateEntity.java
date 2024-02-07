package com.poscodx.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QExchangeRateEntity is a Querydsl query type for ExchangeRateEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QExchangeRateEntity extends EntityPathBase<ExchangeRateEntity> {

    private static final long serialVersionUID = 1654788906L;

    public static final QExchangeRateEntity exchangeRateEntity = new QExchangeRateEntity("exchangeRateEntity");

    public final NumberPath<Float> exchangeRate = createNumber("exchangeRate", Float.class);

    public final StringPath fromCurr = createString("fromCurr");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath rateDate = createString("rateDate");

    public final StringPath rateType = createString("rateType");

    public final StringPath toCurr = createString("toCurr");

    public QExchangeRateEntity(String variable) {
        super(ExchangeRateEntity.class, forVariable(variable));
    }

    public QExchangeRateEntity(Path<? extends ExchangeRateEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QExchangeRateEntity(PathMetadata metadata) {
        super(ExchangeRateEntity.class, metadata);
    }

}

