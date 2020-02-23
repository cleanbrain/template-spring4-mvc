package kr.co.cleanbrain.ctrl;

import kr.co.cleanbrain.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * Company: NANDSOFT
 * User: 노상현
 * Date: 2020-02-14
 * Time: 오후 4:18
 */
@Controller
public class MainController {
    @Autowired
    private MainService service;

    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("testString", service.getTestMessage());
        model.addAttribute("testString2", service.getTestBizURL());
        model.addAttribute("testString3", "test message");
        return "/index";
    }
}