package com.alan.frame.controller;    
    
import java.util.List;    
    
import javax.annotation.Resource;    
import javax.servlet.http.HttpServletRequest;    
    
import org.springframework.stereotype.Controller;    
import org.springframework.ui.Model;    
import org.springframework.web.bind.annotation.RequestMapping;

import com.alan.frame.entities.BookType;
import com.alan.frame.service.IBookTypeService;    
    

    
@Controller    
@RequestMapping("/BookType")    
public class BookTypeController {    
    @Resource    
    private IBookTypeService BookTypeService;    
        
    @RequestMapping("/BookTypeList")    
    public String BookTypeList(HttpServletRequest request,Model model){    
        List<BookType> uList = BookTypeService.getAllBookType();    
        model.addAttribute("uList", uList);    
        return "BookTypeList";
    }    
        
/*    @RequestMapping("/showBookType")    
    public String showBookType(HttpServletRequest request,Model model){    
        int BookTypeId = Integer.parseInt(request.getParameter("id"));    
        BookType BookType = BookTypeService.getBookTypeById(BookTypeId);    
        model.addAttribute("BookType", BookType);    
        return "showBookType";    
    }    
        
    @RequestMapping("/addBookTypeUI")    
    public String addBookTypeUI(){    
        return "addBookType";    
    }    
        
    @RequestMapping("/addBookType")    
    public String addBookType(HttpServletRequest request,Model model){    
        BookType BookType = new BookType();    
        BookType.setName(String.valueOf(request.getParameter("name")));    
        BookType.setPassword(String.valueOf(request.getParameter("password")));    
        BookType.setAge(Integer.parseInt(String.valueOf(request.getParameter("age"))));    
        BookTypeService.addBookType(BookType);    
        return "redirect:/BookType/BookTypeList";    
    }    */
} 