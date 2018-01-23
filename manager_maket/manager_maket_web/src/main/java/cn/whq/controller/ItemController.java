package cn.whq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.whq.pojo.TbItem;
import cn.whq.service.ItemService;

@Controller
public class ItemController {
    @Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getById(@PathVariable long itemId){
		TbItem itemById = itemService.getItemById(itemId);
		
		return itemById;
		
	}
	
}
