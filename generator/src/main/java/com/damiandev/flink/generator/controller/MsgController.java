package com.damiandev.flink.generator.controller;

import com.damiandev.flink.generator.kafka.KafkaProducer;
import com.damiandev.flink.generator.service.MsgService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MsgController {

    private final MsgService service;

    @GetMapping("/msg")
    public ResponseEntity<Void> msg() {
        service.sendRandomMsg();
        return ResponseEntity.ok().build();
    }
}
