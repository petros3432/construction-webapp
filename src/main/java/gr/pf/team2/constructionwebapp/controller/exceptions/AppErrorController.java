package gr.pf.team2.constructionwebapp.controller.exceptions;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AppErrorController implements ErrorController {

    @RequestMapping("error")
    public String handleError(HttpServletRequest request) {

        if (SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
                .anyMatch(r -> r.getAuthority().contains("ADMIN"))) {
            return "pages/error";
        } else if (SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
                .anyMatch(r -> r.getAuthority().contains("USER"))) {
            return "pages/UserError";
        }else{
            return "pages/error";
        }
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}

