package schemaregistry;

import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Collections;
import java.util.Properties;

public class Consumer {
    public static void main(String[] args) {

        /*Setting properties*/

        Properties properties = new Properties();
        properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.setProperty("auto.register.schemas","false");

        /*Using KafkaAvroDeSerializer*/
        properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class.getName());

        properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "groupID6");
        properties.setProperty(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "false");
        properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

       /*The Actual Schema Registry Server URL*/

        properties.setProperty("schema.registry.url", "http://127.0.0.1:8081");

        KafkaConsumer<String, GeneratedClass> kafkaConsumer = new KafkaConsumer<>(properties);

        kafkaConsumer.subscribe(Collections.singleton("schema-topic5"));


        while (true) {
            ConsumerRecords<String, GeneratedClass> records = kafkaConsumer.poll(1000);

            for (ConsumerRecord<String, GeneratedClass> record : records) {
                System.out.println(record.toString());
            }

            kafkaConsumer.commitSync();
        }
    }

}
