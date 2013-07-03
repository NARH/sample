/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.nrt.sample.app.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author narita
 */
@Controller
@RequestMapping(value = "/")
public class SampleController {
    
    private Logger logger = LoggerFactory.getLogger(SampleController.class);
    
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index() {
        logger.info("===== first access =====");
        return "sample-index";
    }
}
