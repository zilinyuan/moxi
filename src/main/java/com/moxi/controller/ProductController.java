package com.moxi.controller;

import com.moxi.model.News;
import com.moxi.model.NewsCategory;
import com.moxi.model.ResObject;
import com.moxi.service.NewsCategoryService;
import com.moxi.service.NewsService;
import com.moxi.util.Constant;
import com.moxi.util.PageUtil;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Controller
public class ProductController {

	@Autowired
	private NewsService newsService;

	@Autowired
	private NewsCategoryService newsCategoryService;


	@RequestMapping("/admin/productManage_{pageCurrent}_{pageSize}_{pageCount}")
	public String newsManage(News news,@PathVariable Integer pageCurrent,@PathVariable Integer pageSize,@PathVariable Integer pageCount, Model model) {

		//判断
		if(pageSize == 0) pageSize = 10;
		if(pageCurrent == 0) pageCurrent = 1;
		int rows = newsService.count(news);
		if(pageCount == 0) pageCount = rows%pageSize == 0 ? (rows/pageSize) : (rows/pageSize) + 1;

		//查询
		news.setStart((pageCurrent - 1)*pageSize);
		news.setEnd(pageSize);
		if(news.getOrderBy()==null){news.setOrderBy(Constant.OrderByAddDateDesc);}
		List<News> newsList = newsService.list(news);

		//文章分类
		NewsCategory newsCategory = new NewsCategory();
		newsCategory.setStart(0);
		newsCategory.setEnd(Integer.MAX_VALUE);
		List<NewsCategory> newsCategoryList = newsCategoryService.list(newsCategory);

		//输出
		model.addAttribute("newsCategoryList", newsCategoryList);
		model.addAttribute("newsList", newsList);
		String pageHTML = PageUtil.getPageContent("newsManage_{pageCurrent}_{pageSize}_{pageCount}?title="+news.getTitle()+"&category="+news.getCategory()+"&commendState="+news.getCommendState()+"&orderBy="+news.getOrderBy(), pageCurrent, pageSize, pageCount);
		model.addAttribute("pageHTML",pageHTML);
		model.addAttribute("news",news);

		return "product/productManage";
	}


}
