group = "hexlet.code"
version = "1.0-SNAPSHOT"

plugins {
    java
    application
    checkstyle
}

application {
    mainClassName = "hexlet.code.App"
}

repositories {
    mavenCentral()
}

checkstyle {
    toolVersion = "10.12.4"
}

dependencies {
    testCompile("junit", "junit", "4.12")
    checkstyle("com.puppycrawl.tools", "checkstyle","10.12.4")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}