package tech.build.run.SQS.Consumer;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class MyConsumer {

    @SqsListener("minha-fila")
    public void listen(MyMessage message) {
        System.out.println("Received message: " + message.getContent());
    }
}
