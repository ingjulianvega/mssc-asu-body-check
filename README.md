[![CircleCI](https://circleci.com/gh/ingjulianvega/mssc-asu-system-check.svg?style=svg)](https://circleci.com/gh/ingjulianvega/mssc-asu-body-check)

# ASU body-check management microservice

### BOM

```
Bill Of Materials. A BOM is a special kind of POM that is used to control the versions of a project's dependencies and provide a central place to define and update those versions. 
BOM provides the flexibility to add a dependency to our module without worrying about the version that we should depend on
https://github.com/ingjulianvega/mssc-asu-bom
```

### OpenAPI

http://localhost:8103/asu/v1/body-check/swagger-ui.html

### H2

http://localhost:8103/asu/v1/body-check/h2-console

```
jdbc:h2:mem:testdb
```

### DockerHub

https://hub.docker.com/repository/docker/ingjulianvega/mssc-asu-body-check
