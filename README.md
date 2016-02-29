# Tuleap Java API Wrapper

[![GitHub Release](https://img.shields.io/github/release/vicenteneto/tuleap-java-api.svg)](https://github.com/vicenteneto/tuleap-java-api/latest)
[![Build Status](https://travis-ci.org/vicenteneto/tuleap-java-api.svg?branch=master)](https://travis-ci.org/vicenteneto/tuleap-java-api)
[![License](http://img.shields.io/:license-mit-blue.svg)](https://github.com/vicenteneto/tuleap-java-api/blob/master/LICENSE)
[![](https://jitpack.io/v/vicenteneto/tuleap-java-api.svg)](https://jitpack.io/#vicenteneto/tuleap-java-api)

This project is a Java library for communicating with [Tuleap](https://www.tuleap.org/) REST API. Tuleap is a free and Open Source Suite to improve management of software projects and connect with team members. With a single web-based solution, CTO, project managers, developers, quality managers and other users can easily build, deploy smart and quality projects ([see more](https://tuleap.net/doc/en/)).

## Table of contents

* [Getting started](#getting-started)
* [Contributing](#contributing)
* [Creator](#creator)
* [Copyright and license](#copyright-and-license)

## Getting started

#### Maven
To use it in your Maven build add it to your **pom.xml** file:
```xml
  <repositories>
    <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
    </repository>
  </repositories>
```
and:
```xml
  <dependencies>
    <dependency>
      <groupId>com.github.vicenteneto</groupId>
      <artifactId>tuleap-java-api</artifactId>
      <version>v0.2.29</version>
    </dependency>
  </dependencies>
```

#### Gradle
To use it in your Gradle build add it to your **gradle.build** file:
```gradle
repositories {
    maven { url "https://jitpack.io" }
}
```
and:
```gradle
dependencies {
    compile 'com.github.vicenteneto:tuleap-java-api:v0.2.29'
}
```

[Check out our examples](https://github.com/vicenteneto/tuleap-java-api/blob/master/docs/examples.md)

Take note that our master branch is our active, unstable development branch and that if you're looking to download a stable copy of the repo, check the [tagged downloads](https://github.com/vicenteneto/tuleap-java-api/tags).

## Contributing

Have a bug or a feature request? [Please, open a GitHub issue](https://github.com/vicenteneto/tuleap-java-api/issues/new).

## Creator

**Vicente Neto**

* <https://github.com/vicenteneto>

## Copyright and license

Copyright 2016-, Vicente Neto. This project is licensed under the [MIT License](https://github.com/vicenteneto/tuleap-java-api/blob/master/LICENSE).
