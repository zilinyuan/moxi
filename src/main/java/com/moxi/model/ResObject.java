package com.moxi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResObject<T> {

	private String resCode;
	private String resMessage;
	private Object resObject;
	private List<T> resList;


	@Override
	public String toString(){
		return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
	}

}
