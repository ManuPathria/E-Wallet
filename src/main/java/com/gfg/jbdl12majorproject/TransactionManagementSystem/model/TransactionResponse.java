package com.gfg.jbdl12majorproject.TransactionManagementSystem.model;

import lombok.*;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TransactionResponse {
    private String transactionId;
    private String transactionStatus;
}
