package com.programming.techie.springredditclone;

//import org.testcontainers.containers.MySQLContaineriner;
import org.testcontainers.containers.PostgreSQLContainer;

public abstract class BaseTest {
    // TODO use TestContainer
//    static MySQLContainer mySQLContainer = (MySQLContainer) new MySQLContainer("mysql:latest")
    static PostgreSQLContainer mySQLContainer = (PostgreSQLContainer) new PostgreSQLContainer("postgres:latest")
            .withDatabaseName("spring-reddit-test-db")
            .withUsername("testuser")
            .withPassword("pass")
            .withReuse(true);

    static {
        mySQLContainer.start();
    }
}
