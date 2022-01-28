package schemaregistry;

import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class Producer {
    public static void main(String[] args) {

        /*Setting properties*/

        Properties properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        /*Using KafkaAvroSerializer*/

        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class.getName());

        /*Specifying the url of schemaregistry*/

        properties.setProperty("schema.registry.url", "http://localhost:8081");

        /*Creating object for generatedclass*/

       GeneratedClass generatedClass = new GeneratedClass ("shivani","green","xyz");

        KafkaProducer<String, GeneratedClass> producer = new KafkaProducer<String, GeneratedClass>(properties);

        ProducerRecord<String, GeneratedClass> producerRecord = new ProducerRecord<String,GeneratedClass>(
                "schema-topic2", generatedClass
        );

        System.out.println(generatedClass);

        /*Sending to broker*/

        producer.send(producerRecord, new Callback(){
            @Override
            public void onCompletion(RecordMetadata metadata, Exception exception) {
                if (exception == null) {
                    System.out.println(metadata);
                } else {
                    exception.printStackTrace();
                }
            }
        });

        producer.flush();
        producer.close();

    }
}
