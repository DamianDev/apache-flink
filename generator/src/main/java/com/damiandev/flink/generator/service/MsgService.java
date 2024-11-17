package com.damiandev.flink.generator.service;

import com.damiandev.flink.generator.kafka.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MsgService {
    private final KafkaProducer producer;
    public void sendRandomMsg() {
        producer.send(RandomStringUtils.secure().nextAlphabetic(10));
    }
}
