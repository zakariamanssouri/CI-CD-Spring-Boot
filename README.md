<h3 align="center">a CI/CD pipeline for spring boot application , with SonarCloud for code analysis and heroku for deployment </h3>



---

## 📝 Table of Contents
- [About](#about)
- [App Dev](#getting_started)
- [Tests](#tests)
- [Workflow](#workflow)
- [Pipeline](#pipeline)

## 🧐 About <a name = "about"></a>
this project was built in order to automate the integration and the deployement process of a spring boot application using github workflow,
the app is used for generating random currencies and nations 

## 🏁 Getting Started <a name = "getting_started"></a>
These instructions will help you setup the CI/CD from the tests to deployment
Create a spring boot project with https://start.spring.io/ and add spring web as a dependency , download and extract the project into your IDE

![image](https://user-images.githubusercontent.com/80859231/199468481-f1f32863-8b6e-4c8d-9ac7-dd3b353fd0ff.png)


### App development
Creation of controller and definition of a set of routes - [CustomController](https://github.com/zakariamanssouri/CI-CD-Spring-Boot/blob/master/src/main/java/me/zakaria/CICDSpringBoot/CustomController.java) 
![image](https://user-images.githubusercontent.com/80859231/199468193-1cee8145-1213-4b47-8ff2-71b75898d4f9.png)



## 🔧 Tests for our controller <a name = "tests"></a>
we should write test for each route present in CustomController 

![image](https://user-images.githubusercontent.com/80859231/199471952-682c244b-ce4b-4ab1-b002-4e4a41151fa9.png)


### Run tests with Maven

```
mvn -B test
```

### Output
![image](https://user-images.githubusercontent.com/80859231/199473229-01924921-1bd2-4616-ae9b-8ffbd6aa53ab.png)


## Staring Workflow <a name = "workflow"></a>
create a workflow file under .github/workflows/ folder (you need to create it)
generally the workflow file contains a set of jobs to be executed when an event occurs
the worflow file is divided into 4 jobs 
### 1 - tests job
![image](https://user-images.githubusercontent.com/80859231/199473941-deb546d4-8250-4f81-bc9c-4005d9f2299f.png)


### 2 - Sonar job
SonarCloud is a platform used to analyse the quality of the code of your project  , detect bugs and more , check https://sonarcloud.io/
you should create an account create a new project ,and link your repository to that project 
![image](https://user-images.githubusercontent.com/80859231/199474736-b222093f-7c5a-4988-af21-dfa9a2c7c2fb.png)

 sonar job
![image](https://user-images.githubusercontent.com/80859231/199474549-1556475b-e8d1-40d7-8cd3-6765f802c08d.png)


### 3 - build job
![image](https://user-images.githubusercontent.com/80859231/199474879-1d9dc8b1-32a7-4d05-a04d-16bcb688cfb5.png)

### 4 - deplyoment to heroku
Heroku is a platform as a service (PaaS) that enables developers to build, run, and operate applications entirely in the cloud.
you should also create in account in Heroku , create new project for our application and setup secrets , check this : https://github.com/marketplace/actions/deploy-to-heroku

![image](https://user-images.githubusercontent.com/80859231/199475204-44047b7c-df90-4b4b-9af7-bf9d982bd132.png)


## Pipeline <a name = "pipeline"></a>
the CI/CD will be launched on every push in the repository
![image](https://user-images.githubusercontent.com/80859231/199476145-d8b30246-b213-4886-bf95-38cf3b2fa18b.png)


## ⛏️ Built Using <a name = "built_using"></a>
- [Spring boot](https://spring.io/projects/spring-boot) - App development
- [SonarCloud](https://sonarcloud.io/) - Code Quality
- [Github Actions](https://github.com/features/actions) - for Creating Workflow
- [Heroku](https://dashboard.heroku.com/) - Deployment

## ✍️ Authors <a name = "authors"></a>
- [@zakariamanssouri](https://github.com/zakariamanssouri) - Idea & Initial work
