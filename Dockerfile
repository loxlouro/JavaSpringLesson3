FROM wuleds/jdk21-tomcat10-ubuntu22:1.0

COPY out/artifacts/lesson3_jar /home/app/lesson3_jar


EXPOSE 8080
ENTRYPOINT ["java","-jar","/home/app/lesson3_jar/lesson3.jar"]
