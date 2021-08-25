package com.cola.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WarningMessage {
    private Integer id;
    private String name;
    private String condition;
    private String operation;
    private String state;
}
