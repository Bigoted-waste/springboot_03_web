package com.cola.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pec { //策略执行组件
    //名称 ip地址 可用性 标记 问题 状态 最新数据 web检测
    private Integer id;
    private String name;
    private String ip;
    private String usability;
    private String sign;
    private String problem;
    private String state;
    private String data;
    private String web;

}
