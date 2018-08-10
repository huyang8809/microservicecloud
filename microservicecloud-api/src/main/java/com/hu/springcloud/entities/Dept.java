package com.hu.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable{
	
	private Long deptNo;	//主键
	
	private String deptName;	//部门名称
	
	private String db_source;	//来自哪个数据库

	public Dept(String deptName) {
		super();
		this.deptName = deptName;
	}
	
	
}
