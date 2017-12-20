package cn.sinjinsong.reactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @author sinjinsong
 * @date 2017/12/20
 */
@RestController
@RequestMapping("/users")
public class UserController {
    
    @GetMapping("/ids")
    public Flux<Integer> findAllIds(){
        return Flux.just(1,2);    
    }
    
    
}
