package com.example.demo.client;

import com.example.demo.model.MathResult;
import org.springframework.stereotype.Component;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "${newton-client.name}" ,url = "${newton-client.domain-url}")
public interface NewtonClient {

    @GetMapping(path = "${newton-client.simplify.url}")
    MathResult getSimplifyMathResult(@PathVariable String expression);

}
