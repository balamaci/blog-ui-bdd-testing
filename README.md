# blog-ui-bdd-testing
BDD testing of pippo demo with Cucumber and Serenity

Sources for the blog posts [Orchestrating a reusable BDD web testing setup with Selenium grid using docker](http://balamaci.ro/using-docker-and-docker-compose-for-orchestrating-a-full-bdd/)
and [Orchestrating a reusable BDD web testing setup with Selenium grid using docker](http://balamaci.ro/using-docker-and-docker-compose-for-orchestrating-a-full-bdd/)

To run the tests just run **./restart.sh** after the checkout which basically just does

```
docker-compose run uitests mvn clean verify
```

this would starts the tests and produce the Serenity reports which can be accessed at **./target/site/index.html**

*There is a one time run of **./build-images.sh** which will create the docker images. 
Normally you'd have them pushed to a repository, but since I've based my images on **oracle-jdk** 
there might be some legal issues with . So you need to build them with the script.*

We already included **pippo-demo.war** on the repo to have a single command to run the job. Normally you'd have it provided by another build job that would trigger the testing job. 