
# Project README.md

[![Build Status](https://cloud.drone.io/api/badges/jorgeacf/project-templates/status.svg)](https://cloud.drone.io/jorgeacf/project-templates)

Project commands:

### Compile project
```
sbt compile
```

### Run project tests
```
sbt test
```

### Build jar
```
sbt package
```

### Build jar with all dependencies
```
sbt assembly
```

### Run main class/object
```
sbt "run-main CLASS_NAME"
```

### Run tests with coverage
```
sbt clean coverage test
```

### Create coverage report
```
sbt coverageReport
```