group = "hexlet.code"
version = "1.0-SNAPSHOT"

plugins {
    application
    checkstyle
}

application {
    mainClass = "hexlet.code.App"
}

repositories {
    mavenCentral()
}

checkstyle {
    toolVersion = "10.12.4"
}

dependencies {
    checkstyle("com.puppycrawl.tools", "checkstyle","10.12.4")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}