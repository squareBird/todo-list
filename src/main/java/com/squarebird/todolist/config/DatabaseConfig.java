package com.squarebird.todolist.config;

import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

//@Configuration
//@EnableR2dbcRepositories
public class DatabaseConfig {

    /**
     * application.properties로 대체 가능
     * Configure 파일을 별도로 관리하는게 좋을지 application.properties로 관리하는게 좋을지 고려해보기
     * @return
     */
//    @Bean
    public PostgresqlConnectionFactory connectionFactory() {
        return new PostgresqlConnectionFactory(
                PostgresqlConnectionConfiguration.builder()
                        .host("127.0.0.1")
                        .database("todo")
                        .username("liam_squarebird")
                        .password("Sp123$here")
                        .build());
    }

}
