package com.shanghai.unicom.micro.smartcrud.domain;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ThirdAccountInfo {
    private User user;
    private Customer customer;
    private Account account;
}
