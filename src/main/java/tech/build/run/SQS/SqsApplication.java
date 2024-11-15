package tech.build.run.SQS;

import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tech.build.run.SQS.Consumer.MyMessage;

@SpringBootApplication
public class SqsApplication {

	public static void main(String[] args) {
		var SQS = "https://localhost.localstack.cloud:4566/000000000000/minha-fila";
		SpringApplication.run(SqsApplication.class, args);
	}
}
