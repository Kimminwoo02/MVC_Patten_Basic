package com.example.hellosevlet.web.frontcontroller.v3;

import com.example.hellosevlet.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {
    ModelView process(Map<String,String> paramMap);
}
