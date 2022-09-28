package com.deepblue.controller;

import com.deepblue.service.MineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 */
@RestController
public class MineController {

    @Autowired
    private MineService mineService;

    @RequestMapping("/json")
    public String json() {

        Mine mine = new Mine("yangjianwei", "123456", 1);

        String json = mineService.obj2json(mine);

        return json;
    }
}
