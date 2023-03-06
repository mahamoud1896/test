FROM openjdk:8
EXPOSE 8082
ADD target/chiffragetest.jar chiffragetest.jar
ENTRYPOINT ["java","-jar","chiffragetest.jar"]