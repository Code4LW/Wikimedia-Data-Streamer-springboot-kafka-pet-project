# springboot-kafka-pet-project - Wikimedia data streamer 
Java SpringBoot application using Apache Kafka and PostgreSQL.
Пет-приложение разработанное на Java с использованием SpringBoot и Apache Kafka, отправляющий данные из потокового сервиса stream.wikimedia.org передающий все изменения, происходящие на всех общедоступных вики управляемых Фондом Викимедиа, и сохраняющий данные в PostgreSQL.
Мультисервисное приложение, в котором есть:
1) ProducerAPI: получение данных с event source(stream.wikimedia.org) и отправка в виде сообщения в сервер-брокер
2) ConsumerAPI: получение сообщения и сохранение данных в PostgreSQL
