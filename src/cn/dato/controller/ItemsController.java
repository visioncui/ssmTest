package cn.dato.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.dato.pojo.Items;

@Controller
public class ItemsController {
    @RequestMapping("/list")
    public ModelAndView itemsList()throws Exception{
List<Items> itemList = new ArrayList<>();
	
		//商品列表
		Items items_1 = new Items();
		items_1.setName("联想笔记本_3");
		items_1.setPrice(6000f);
		items_1.setDetail("ThinkPad T430 联想笔记本电脑！");
		
		Items items_2 = new Items();
		items_2.setName("苹果手机");
		items_2.setPrice(5000f);
		items_2.setDetail("iphone6苹果手机！");
		
		itemList.add(items_1);
		itemList.add(items_2);
		
		ModelAndView modeAndView = new ModelAndView();
		modeAndView.addObject("itemList",itemList);
		modeAndView.setViewName("itemList");
		
		return modeAndView;   	
    }
}
