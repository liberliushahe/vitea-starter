package com.vitea.starter.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Dictionary {
    @ApiModelProperty(value = "唯一标识，主键")
	private int id;
    @ApiModelProperty(value = "字典名称")

	private String name;
    @ApiModelProperty(value = "字典值")

	private String value;

}
