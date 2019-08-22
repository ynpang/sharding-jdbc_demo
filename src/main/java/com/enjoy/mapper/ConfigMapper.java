package com.enjoy.mapper;


import org.apache.ibatis.annotations.Insert;

public interface ConfigMapper {

    @Insert(" insert into t_config(id, status_code,status_value) values(101,101,'aaaaa') ")
    int insert();
}
