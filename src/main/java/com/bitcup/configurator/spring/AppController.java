package com.bitcup.configurator.spring;

import com.bitcup.configurator.FileConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: omar
 */
@Controller
public class AppController {

    @Autowired
    private AppBean appBean;

    @Autowired
    @Qualifier("someConfigs")
    private FileConfig config;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String getHome(final Model model) {
        model.addAttribute("appBean", appBean);
        return "index";
    }

    public void setConfig(FileConfig config) {
        this.config = config;
    }
}
