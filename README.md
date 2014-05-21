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
and add it and commit the files
```
  git add .gitignore
  git commit -m"adding gradle"
  git push
```

### Java
Unless otherwise stated, we will be using java8.
Ensure that it is the default java on your system.
```
  java -version
  java version "1.8.0_05"
  Java(TM) SE Runtime Environment (build 1.8.0_05-b13)
  Java HotSpot(TM) 64-Bit Server VM (build 25.5-b02, mixed mode)
```
Edit build.gradle and add the lines:
```
  sourceCompatibility=1.8
  targetCompatibility=1.8
```

### Java Style
Use the google java style: http://google-styleguide.googlecode.com/svn/trunk/javaguide.html

### Testing
Use junit4 with hamcrest and mockito.
```
    testCompile 'junit:junit:4.11'
    testCompile 'org.hamcrest:hamcrest-all:1.3'
    testCompile 'org.mockito:mockito-core:1.9.5'
```

AssertJ (fork of fest) also looks good for assertions.
http://joel-costigliola.github.io/assertj/assertj-core-quick-start.html
```
   testCompile 'org.assertj:assertj-core:1.5.0'
```
nicer style (fluid) than hamcrest.

## Coverage
I found that jacoco works great with java8.

Add the following to build.gradle.

```
    apply plugin: 'jacoco'
    jacoco {
        toolVersion = '0.7.1.201405082137'
    }
```
The version number is the stupid long id.

