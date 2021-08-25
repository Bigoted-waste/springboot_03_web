package com.cola.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataLog {
    private Integer id;
    private String ip;
    private String date;
    private String seriousness;
    private String message;
}
