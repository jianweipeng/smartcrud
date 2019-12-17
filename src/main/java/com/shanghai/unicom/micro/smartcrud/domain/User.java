package com.shanghai.unicom.micro.smartcrud.domain;



import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;


@Data
@Component
public class User {
    private Integer id;
    private String userId;
    private String custId;
    private String accountId;
    private String userName;
    private String userPasswd;
    private Integer status;
    private Date inDate;

}
