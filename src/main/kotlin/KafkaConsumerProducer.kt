package main.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContext
import org.springframework.scheduling.annotation.EnableScheduling


@SpringBootApplication
@EnableScheduling
class KafkaConsumerProducer
fun main(args: Array<String>) {
    val app = SpringApplication(KafkaConsumerProducer::class.java)
    app.webApplicationType = WebApplicationType.REACTIVE
    app.run(*args)
}
