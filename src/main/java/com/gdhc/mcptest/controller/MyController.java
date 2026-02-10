package com.gdhc.mcptest.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.stringtemplate.v4.compiler.CodeGenerator.region_return;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class MyController {

    private final ChatClient chatClient;

    public MyController(ChatClient.Builder builder) {
        // 这里的 builder 会自动读取 yml 中的配置
        this.chatClient = builder.build();
    }

    @RequestMapping("/ai")
    public String generation(String param) {
        String message = chatClient.prompt()
        .user("今天武汉气温多少度你告诉我一下")
        .call()
        .content();
        System.out.println(message);
        return message;
    }
    



}
