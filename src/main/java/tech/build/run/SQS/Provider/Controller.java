package tech.build.run.SQS.Provider;

import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.build.run.SQS.Consumer.MyMessage;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private SqsTemplate sqsTemplate;

    @PostMapping("/send")
    public void send(@RequestBody MyMessage message) {
        var SQS = "https://localhost.localstack.cloud:4566/000000000000/minha-fila";
        sqsTemplate.send(SQS, message);
    }
}
