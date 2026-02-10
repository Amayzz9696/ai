package com.gdhc.mcptest.service;

import org.springframework.stereotype.Service;



@Service
public class WeatherService {

     // 使用 @McpTool 暴露给 AI 客户端
    // @McpTool(description = "根据城市名称获取实时天气信息")
    // public String getWeather(@McpToolParam(description = "城市名称, 例如: 北京") String city) {
    //     // 实际开发中可对接心知天气、和风天气等 API
    //     if ("北京".equals(city)) {
    //         return "北京今日：晴，25°C，微风。";
    //     }
    //     return city + "的天气信息暂时无法获取。";
    // }
    

}
