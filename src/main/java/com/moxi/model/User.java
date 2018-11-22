package com.moxi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private long id;
	private String userName;
	private String password;
	private String realName;
	private int age;
	private String phoneNumber;
	private String headPicture;
	private Date addDate;
	private Date updateDate;
	private int state;


	@Override
	public String toString(){
		return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
	}

}
