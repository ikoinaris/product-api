FROM java:8
EXPOSE 8080
ADD target/product-api.jar product-api.jar
ENTRYPOINT ["java", "-jar", "product-api.jar"]
