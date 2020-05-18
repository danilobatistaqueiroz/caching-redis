package com.example.cachingredis;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	@Cacheable("work")
	public @ResponseBody String greeting() {
	    System.out.println("metodo sem o cache");
		return "Caching-Redis Works";
	}
	
    @RequestMapping("/limpa")
    @CacheEvict("work")
    public @ResponseBody String limpa() {
        System.out.println("limpando");
        return "Caching-Redis Limpo";
    }

}
