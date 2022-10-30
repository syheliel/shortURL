package com.syheliel.shortURL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Autowired
    private URLRepository repo;

    public myURL getURLByID(Long id){
        return repo.findById(id).get();
    }

    public myURL save(myURL u){
        return repo.save(u);
    }

}

