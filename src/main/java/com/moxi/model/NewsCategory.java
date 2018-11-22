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
public class NewsCategory extends BaseObject {

	private long id;
	private String name;
	private String description;
	private String image;
	private Date addDate;
	private int state;

	@Override
	public String toString(){
		return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
	}
}
