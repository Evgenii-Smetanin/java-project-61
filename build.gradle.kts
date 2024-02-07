plugins {
    java
    application
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

application {
    mainClassName = "hexlet.code.App"
}

repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}