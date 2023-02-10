package com.example.demo.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
 
import com.example.demo.dao.StatisticMapper;
import com.example.demo.service.StatisticService;
 
 
 
@RestController
public class demoTest {
    
 
    @Autowired
    private StatisticService service;
    
    @ResponseBody 
    @RequestMapping("/sqlyearStatistic")
    public Map<String, Object> sqltest(String year) throws Exception{ 
        
        return service.yearloginNum(year);
    }
    
    @RequestMapping("/demo")
    public Map<String, Object> sqltest2(String yearMonth) throws Exception{ 
        
        return service.yearMonthloginNum(yearMonth);
    }
    
    @RequestMapping("/demo2")
    public Map<String, Object> sqltest3(String yearMonth, String depart) throws Exception{ 
        
        return service.yearMonthDepartloginNum(yearMonth, depart);
    }
    
    @RequestMapping("/demo3")
    public Map<String, Object> sqltest4(String yearMonthDay) throws Exception{ 
        
        return service.yearMonthDayloginNum(yearMonthDay);
    }
}