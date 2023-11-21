package net.kafka.springboot.kafka;

import lombok.AllArgsConstructor;
import net.kafka.springboot.model.WikiData;
import net.kafka.springboot.repo.WikiDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    private WikiDataRepository wikiDataRepository;

    @KafkaListener(topics = "wikimedia_change", groupId = "myGroup")
    public void consume(String eventMessage){
        LOGGER.info(String.format("Event message received ->%s", eventMessage));
        WikiData wikiData = new WikiData();
        wikiData.setWikiEventData(eventMessage);
        wikiDataRepository.save(wikiData);
    }
}
