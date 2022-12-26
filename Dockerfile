FROM openjdk:19

WORKDIR /app

COPY . .

CMD ["java", "-jar", "VueJsLearning.jar"]