package com.shanghai.unicom.micro.smartcrud.domain;


import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class Account {
    private Integer id;
    private String accountId;
    private String status;
    private Date modifyDate;



}
