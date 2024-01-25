plugins {
    id("java")
}

group = "com.lukegjpotter.playwright"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("com.microsoft.playwright:playwright:1.41.0")
}

tasks.test {
    useJUnitPlatform()
}