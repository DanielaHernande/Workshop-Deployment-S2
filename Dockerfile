FROM openjdk:21-jdk-slim
ARG JAR_FILE=target/beauty_Salon-0.0.1.jar
COPY ${JAR_FILE} app_beautySalon.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "app_beautySalon.jar" ]