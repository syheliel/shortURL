package com.syheliel.shortURL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    MyService service;

    @RequestMapping(value = "/api/addURL",method = RequestMethod.POST, params = {"url"})
    public String addURL(@RequestParam String url){
        myURL myurl = new myURL();
        myurl.setName(url);
        service.save(myurl);
        return "success";
    }

    @RequestMapping(value = "/api/getURL",method = RequestMethod.POST, params = {"id"})
    public String getUrl(@RequestParam String id){
        myURL url = service.getURLByID(Long.parseLong(id));
        return url.getName();
    }
}
