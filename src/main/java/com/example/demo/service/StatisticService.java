package com.example.demo.service;

import java.util.HashMap;

public interface StatisticService {
    public HashMap<String,Object> yearloginNum (String year);
    public HashMap<String,Object> yearMonthloginNum (String yearMonth);
    public HashMap<String,Object> yearMonthDepartloginNum (String yearMonth, String depart);
    public HashMap<String,Object> yearMonthDayloginNum (String yearMonthDay);
}