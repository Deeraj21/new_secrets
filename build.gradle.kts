plugins {
    kotlin("jvm") version "1.3.50"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.3.50") // Vulnerable Kotlin stdlib
    implementation("com.google.guava:guava:27.0.1-jre")         // CVE-2020-8908
    implementation("org.springframework:spring-core:5.2.8.RELEASE") // CVE-2020-5421
}
