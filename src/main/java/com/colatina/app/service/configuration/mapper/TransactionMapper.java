package com.colatina.app.service.configuration.mapper;

import com.colatina.app.service.core.domain.TransactionDomain;
import com.colatina.app.service.dataprovider.entity.TransactionEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {AccountInfoMapper.class})
public interface TransactionMapper extends EntityMapper<TransactionDomain, TransactionEntity> {
}
