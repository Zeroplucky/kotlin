import org.jetbrains.kotlin.gradle.dsl.Coroutines

plugins {
    kotlin("jvm")
    id("jps-compatible")
}

jvmTarget = "1.6"

dependencies {
    compile(projectDist(":kotlin-stdlib"))
    compileOnly(project(":kotlin-reflect-api"))
    compile(commonDep("org.jetbrains.kotlinx", "kotlinx-coroutines-core")) { isTransitive = false }
}

sourceSets {
    "main" { projectDefault() }
    "test" {}
}

kotlin.experimental.coroutines = Coroutines.ENABLE

val jar = runtimeJar()
val sourcesJar = sourcesJar()
val javadocJar = javadocJar()

dist()

ideaPlugin {
    from(jar, sourcesJar)
}

publish()
