package ru.hh.school;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.hh.school.resource.FrontendResource;
import ru.hh.school.resource.TodoResource;

@Configuration
@Import({FrontendResource.class, TodoResource.class})
public class ApplicationJerseyConfig {
}
