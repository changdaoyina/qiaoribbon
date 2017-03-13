package com.qiao.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qiao.service.ComputeService;

@RestController
public class ConsumerController {
	
	@Autowired
    private ComputeService computeService;
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return computeService.addService();
    }
	
//	@Autowired
//    RestTemplate restTemplate;
//	
//	@RequestMapping(value = "/add", method = RequestMethod.GET)
//    public String add() {
//        return restTemplate.getForEntity("http://QIAO-SERVICE/add?a=10&b=20", String.class).getBody();
//    }
}
