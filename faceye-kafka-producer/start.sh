#Start Project script
#Author:haipenge
#Date:2017.05.03
#Start project with mvn cmd.
mvn clean spring-boot:run -D maven.test.skip=true
#Start project from jar after run build.sh
#java -jar target/faceye-kafka-0.0.1-SNAPSHOT.jar