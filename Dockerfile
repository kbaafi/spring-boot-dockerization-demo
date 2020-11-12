FROM openjdk
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
COPY kube-post-install.* textfile.txt
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]