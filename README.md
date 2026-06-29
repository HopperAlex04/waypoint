# task-manager-api

Monorepo layout: backend lives in `backend/`, frontend in `frontend/`. Run the Maven commands below from the `backend/` directory (or pass `-f backend/pom.xml`).

#Startup command
cd backend && mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8081 (Change to whatever port you need want it on)

#HTTP through curl for taks endpoint
*GET*: curl http://localhost:8081/api/tasks/1

*Note: Modyfying operations require authorization in the environment variable ADMIN_KEY, for testing I use 0*
curl -X POST http://localhost:8081/api/tasks \
  -H "Content-Type: application/json" \
  -H "Authorization: Bearer 0" \
  -d '{"start_time":"2026-06-14T10:00:00","end_time":"2026-06-14T12:00:00","title":"funtask"}'
*PUT*:curl -X PUT http://localhost:8081/api/tasks/*(id no.)* -H 'Content-Type: application/json' -d '{"title": "funnytask"}'

#Run Tests
cd backend && mvn -q test
