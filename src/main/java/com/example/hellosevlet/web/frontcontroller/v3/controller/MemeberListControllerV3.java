package com.example.hellosevlet.web.frontcontroller.v3.controller;

import com.example.hellosevlet.domain.member.Member;
import com.example.hellosevlet.domain.member.MemberRepository;
import com.example.hellosevlet.web.frontcontroller.ModelView;
import com.example.hellosevlet.web.frontcontroller.v3.ControllerV3;
import java.util.List;

import java.util.Map;

public class MemeberListControllerV3 implements ControllerV3 {
    MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        List<Member> members = memberRepository.findAll();
        ModelView mv = new ModelView("members");
        mv.getModel().put("members",members);
        return mv;
    }
}
