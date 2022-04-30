package com.azeem.aop;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Account {
    private String accountID;
    private String firstName;
    private String lastName;
    private double balance;
}
