# build Dockerfile 

docker build -t image_name -f docker/Dockerfile.dev .

# gradle init
```
root@0f10e60ddacf:/usr/src/http# gradle init --type=kotlin-application

Welcome to Gradle 6.5.1!

Here are the highlights of this release:
 - Experimental file-system watching
 - Improved version ordering
 - New samples

For more details see https://docs.gradle.org/6.5.1/release-notes.html

Starting a Gradle Daemon (subsequent builds will be faster)

Select build script DSL:
  1: Groovy
  2: Kotlin
Enter selection (default: Kotlin) [1..2] 1

Project name (default: http): 
Source package (default: http): 

BUILD SUCCESSFUL in 2m 23s
2 actionable tasks: 2 executed
```

# gradle run

```
$ docker-compose build
$ docker-compose up -d
$ docker-compose exec gradle /bin/bash

(in gradle container)
# root@container_id:/usr/src/template# /bin/bash build
```

# fork own repo

```
git clone https://github.com/azul915/kt_template.git New_Repo
cd New_Repo
git remote set-url origin https://github.com/azul915/New_Repo
git remote add upstream https://github.com/azul915/New_Repo
git push origin main
git push --all
```
