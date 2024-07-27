package com.example.demo.service;

import lombok.AccessLevel;
import lombok.extern.slf4j.Slf4j;
import lombok.RequiredArgsConstructor;
import com.example.demo.model.MathResult;
import lombok.experimental.FieldDefaults;
import com.example.demo.client.NewtonClient;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MathService {

    NewtonClient newtonClient;

    public MathResult getSimplifyMathResult(String expression) {

        return newtonClient.getSimplifyMathResult(expression);

    }

}
