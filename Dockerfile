FROM java:8
ADD /src/main/java/com/example/demo/DemoApplication.java .
RUN javac DemoApplication.java
CMD ["java", "DemoApplication"]