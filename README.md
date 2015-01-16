[![Build Status](https://travis-ci.org/SaumilP/yasc.svg)](https://travis-ci.org/SaumilP/yasc)
<a href="https://scan.coverity.com/projects/3934">
  <img alt="Coverity Scan Build Status"
       src="https://scan.coverity.com/projects/3934/badge.svg"/>
</a>

YASC - Yet Another SOAP Client
==============================

### STATUS
Initial phase

### DESCRIPTION

Yet Another SOAP Client - provides a thin web client to generate SOAP requests after interogating provided web service URL.
> Idea would be not to use thick clients like SOAPUI and be able to host portable web application.

### REQUIREMENTS

Platform : Java 7 or Java 8
Tools : Maven 3+, NodeJS, Bower, Grunt
Technology Stack : Dropwizard, AngularJS, NGINX

### INSTALATION

- Install [Bower](http://bower.io/)
```
npm install -g bower
```
- Download Project Dependencies
```
cd yasc-client
bower install
```

- Install [grunt-bower-task](http://bower.io/docs/tools/)
```
npm install grunt-bower
```
