package com.paperwork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by yuwhuawang on 17/7/4.
 */

@Controller
public class IndexController extends BaseController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @ResponseBody
    @RequestMapping("/greeting")
    public Map greeting(@RequestParam(value="name", defaultValue="World") String name) {
        Map result = new HashMap<String, String>();
        result.put("count", counter.incrementAndGet());
        result.put("name", String.format(template, name));
        return result;
    }
}
