package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import lombok.RequiredArgsConstructor;
import com.example.demo.model.MathResult;
import org.springframework.http.MediaType;
import com.example.demo.service.MathService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "rest/v1/math")
public class MathController {

    private final MathService mathService;

    @GetMapping(path = "/simplify/{expression}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public MathResult getSimplifyMathResult(@PathVariable("expression") String expression) {

        return mathService.getSimplifyMathResult(expression);

    }

}
