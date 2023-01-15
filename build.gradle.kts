import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
    `maven-publish`
    id("org.jetbrains.dokka")
}

group = "dev.sublab"
version = "1.0.0"

val dokkaVersion: String by project

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    dokkaGfmPlugin("org.jetbrains.dokka:kotlin-as-java-plugin:$dokkaVersion")
}

tasks.dokkaGfm.configure {
    outputDirectory.set(projectDir.resolve("wiki/reference"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allSource)
}

publishing {
    publications {
        register("mavenJava", MavenPublication::class) {
            from(components["java"])
            artifact(sourcesJar.get())
        }
    }
}