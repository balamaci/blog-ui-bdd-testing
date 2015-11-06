# blog-ui-bdd-testing
BDD testing of [pippo](https://github.com/decebals/pippo) [demo angular-crud-app]() with [Cucumber](https://cucumber.io/docs/reference/jvm#java) and [Serenity](http://thucydides.info/docs/serenity-staging/)

Sources for the blog posts [Using docker for orchestrating a reusable BDD web testing setup with Selenium grid - Part I](http://balamaci.ro/using-docker-and-docker-compose-for-orchestrating-a-full-bdd/)
and [BDD web testing setup - Docker, Cucumber and Serenity - Part II](http://balamaci.ro/orchestrating-a-reusable-bdd-web-testing-setup-part-ii/)

## Prerequisites
1. Install Docker and [Docker-compose](http://docs.docker.com/compose/install/) 
2. Clone this repository
````bash
$ git clone git@github.com:balamaci/blog-ui-bdd-testing.git
````
3. Create the docker images locally
There is a one time run of 
````bash
$ ./docker-images-build.sh
```` 
which will create the docker images locally. Normally you'd have them pushed to a repository, but I wanted to show there are no "hidden tricks", or you can use them as example to build your own. So instead we use the script to build locally the required images.

## Code run
To run the bdd tests anytime just do
````bash
$ ./restart.sh
````

which basically does **docker-compose run uitests mvn clean verify**
 

This would execute the **Cucumber tests** and produce the **Serenity reports** which can be accessed at **./target/site/index.html**


[![BDD preview](http://balamaci.ro/content/images/2015/10/bdd_preview.png)](http://balamaci.ro/static/serenity/index.html)



We included **pippo-demo.war** -the application we run our tests against- on the repo to have a single command to run the job. Normally you'd have it provided by another build job that would trigger the testing job. 