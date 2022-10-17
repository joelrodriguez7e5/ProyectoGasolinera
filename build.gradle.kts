import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.20"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven( "https://jitpack.io")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
    implementation("io.ktor:ktor-client-core:2.1.0")
    implementation("io.ktor:ktor-client-cio:2.1.0")
    implementation("io.ktor:ktor-client-content-negotiation:2.1.0")
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.1.0")
    implementation("io.github.pdvrieze.xmlutil:core-jvm:0.84.2")
    implementation("io.github.pdvrieze.xmlutil:serialization-jvm:0.84.2")
    implementation("app.softwork:kotlinx-serialization-csv:0.0.6")
    implementation("app.softwork:kotlinx-serialization-flf:0.0.6")
    implementation ("io.github.kotlin-telegram-bot.kotlin-telegram-bot:telegram:6.0.7")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}