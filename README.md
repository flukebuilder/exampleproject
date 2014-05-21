# This is an example project

This contains a simple template for a project
with testing and coverage.


## Setting up

### Github

* create the repo in github
* clone the repo
```
   git clone git@github.com:flukebuilder/exampleproject
```

### Gradle
create a gradle project
```
  cd exampleproject
  gradle init --type java-library
```

add all the directories and files except .gradle
```
  git add build.gradle gradle gradlew gradlew.bat settings.gradle src
```
create a .gitignore file containing:
```
  classes/
  .idea/
  build/
  .gradle/
  *.iml
```
