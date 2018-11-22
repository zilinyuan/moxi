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
public class News extends BaseObject {

	private long id;
	private String title;
	private String description;
	private long category;
	private String categoryName;
	private String categoryImage;
	private String image;
	private String content;
	private Date addDate;
	private Date updateDate;
	private int state;
	private int commendState;

	private int browses;
	private int likes;
	private int comments;
	private int score;

	@Override
	public String toString(){
		return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
	}
}
