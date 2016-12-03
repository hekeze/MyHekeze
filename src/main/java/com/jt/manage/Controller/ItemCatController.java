package com.jt.manage.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jt.manage.service.ItemCatService;
import com.manager.pojo.ItemCat;

@Controller
public class ItemCatController {
@Autowired
private ItemCatService itemCatService;
@RequestMapping("/itemCat/query")
@ResponseBody
public List<ItemCat> queryAll(){
	return itemCatService.queryAll();
}
}
