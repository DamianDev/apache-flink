# apache-flink

It is a very besic "application" that uses Apache Flink. It takes data from Kafka topic called tSource1 (source) and puts it into another Kafka topic called tSink1 (sink). It performs simple mapping - it adds "Hello, " string to each message.

There is also another simple Spring boot application that receives a message onto /msg endpoint that sends message (random string) to Kafka source topic.

Ports:

- Spring boot application / **8080** (not included into docker-compose)
- KafkaUI / **3333**
- Apache Flink Web Dashboard / **8081**

**Important note:
It was meant to create a simple app to try out Apache Flink. It was the main focus. I do not follow good coding practices in these application as it was not necessary.**

