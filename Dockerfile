FROM amazoncorretto:11
COPY target/Frontend-0.0.1.jar Frontend-0.0.1.jar
ENTRYPOINT ["java", "-jar", "/Frontend-0.0.1.jar"]