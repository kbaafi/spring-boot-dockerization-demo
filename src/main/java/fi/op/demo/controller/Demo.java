package fi.op.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/demo")
public class Demo {
    @GetMapping(value="/data")
    public String getDemoData() {
        return "Demo Data";
    }
}
