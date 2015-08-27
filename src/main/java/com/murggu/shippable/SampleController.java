package com.murggu.shippable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aitor Murguzur
 */
@RestController
public class SampleController {

    @RequestMapping("/")
    public String index() {
        return "Shippable-aws example works!";
    }
}