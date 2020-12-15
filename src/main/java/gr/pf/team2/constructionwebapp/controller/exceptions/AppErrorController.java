package gr.pf.team2.constructionwebapp.controller.exceptions;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class AppErrorController implements ErrorController {

    @RequestMapping("error")
    @ResponseBody
    public String handleError(HttpServletRequest request) {

        return "pages/error";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
