// package com.hb.lolpago;

// import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
// import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

// import com.mongodb.ConnectionString;
// import com.mongodb.MongoClientSettings;
// import com.mongodb.client.MongoClient;
// import com.mongodb.client.MongoClients;

// import org.bson.codecs.configuration.CodecRegistry;
// import org.bson.codecs.pojo.PojoCodecProvider;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

// @Configuration
// public class SpringConfiguration extends AbstractMongoClientConfiguration{

//     @Value("${spring.data.mongodb.uri}")
//     private String connectionString;
    
//     @Value("${spring.data.mongodb.database}")
//     private String database;

//     @Override
//     protected String getDatabaseName() {
//         return database;
//     }

//     @Override
//     public MongoClient mongoClient() {
//         CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
//         CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
//         return MongoClients.create(MongoClientSettings.builder()
//                                                       .applyConnectionString(new ConnectionString(connectionString))
//                                                       .codecRegistry(codecRegistry)
//                                                       .build());
//     }
// }