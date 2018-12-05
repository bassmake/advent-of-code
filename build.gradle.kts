import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "sk.bsmk"
version = "1.0-SNAPSHOT"

plugins {
  kotlin("jvm") version "1.3.10"
}

allprojects {
  repositories {
    mavenCentral()
  }
}

subprojects {

  apply(plugin = "kotlin")

  dependencies {
    compile(kotlin("stdlib-jdk8"))
  }

}

tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = "1.8"
}

tasks.withType<Wrapper> {
  gradleVersion = "5.0"
}
