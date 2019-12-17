package com.shanghai.unicom.micro.smartcrud.domain;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Customer {
    private Integer id;
    private String custId;
    private String custName;
    private String psptId;
    private String psptType;
    private String acctId;
    private String status;
    private String inDate;

}
