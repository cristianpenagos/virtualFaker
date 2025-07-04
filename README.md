[![CI/CD Pipeline](https://github.com/cristianpenagos/virtualFaker/actions/workflows/build.yml/badge.svg)](https://github.com/cristianpenagos/virtualFaker/actions/workflows/build.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=cristianpenagos_virtualFaker&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=cristianpenagos_virtualFaker)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=cristianpenagos_virtualFaker&metric=bugs)](https://sonarcloud.io/summary/new_code?id=cristianpenagos_virtualFaker)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=cristianpenagos_virtualFaker&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=cristianpenagos_virtualFaker)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=cristianpenagos_virtualFaker&metric=coverage)](https://sonarcloud.io/summary/new_code?id=cristianpenagos_virtualFaker)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=cristianpenagos_virtualFaker&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=cristianpenagos_virtualFaker)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=cristianpenagos_virtualFaker&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=cristianpenagos_virtualFaker)




# virtualfake

Implementation of a Simple App with the next operations:

Methods:
Methods:
* Get random nations
* Get random currencies
* Get random Aircraft
* Get application version
* health check

Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk

### Folders Structure

In the folder `src` is located the main code of the app

In the folder `test` is located the unit tests

### How to install it

Execute:

```shell
$ mvnw spring-boot:run
```
to download the node dependencies

### How to test it

Execute:

```shell
$ mvnw clean install
```

### How to get coverage test

Execute:

```shell
$ mvwn -B package -DskipTests --file pom.xml
```