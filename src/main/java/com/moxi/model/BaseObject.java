package com.moxi.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseObject {

	private int start;
	private int end;
	private int pageCurrent;
	private int pageSize;
	private int pageCount;
	private String orderBy;

	@Override
	public String toString(){
		return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
	}
}
