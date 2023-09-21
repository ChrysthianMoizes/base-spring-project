package com.colatina.app.service.dataprovider.entity;

import com.colatina.app.service.core.domain.AccountDomain;
import com.colatina.app.service.core.domain.enumeration.TransactionStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "transaction")
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_transaction")
    @SequenceGenerator(name = "seq_transaction", allocationSize = 1, sequenceName = "seq_transaction")
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_origin_id")
    private AccountEntity accountOrigin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_destination_id")
    private AccountEntity accountDestination;

    @Column(name = "value")
    private BigDecimal value;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "status")
    private String status;

    @Column(name = "type")
    private String type;

}
