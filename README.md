# task-manager-api

#Startup command
mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8081 (Change to whatever port you need want it on)

#HTTP through curl for taks endpoint
*GET*: curl http://localhost:8081/tasks
*POST*: curl -X POST http://localhost:8081/tasks -H 'Content-Type: application/json' -d '{"start_time": "2026-06-14T10:00:00","end_time": "2026-06-14T12:00:00" ""title": "funtask"}'
*PUT*:curl -X PUT http://localhost:8081/tasks/*(id no.)* -H 'Content-Type: application/json' -d '{"title": "funnytask"}'

#Run Tests
mvn -q test
