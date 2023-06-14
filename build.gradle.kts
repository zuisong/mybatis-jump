plugins {
    idea apply true
    java
    id("org.jetbrains.intellij") version "1.14.1"
    kotlin("jvm") version "1.8.22"
}

group = "com.liuzhihang'"
version = "1.0.1"

repositories {
    mavenLocal()
//    maven { url ( "https://maven.aliyun.com/repository/public") }
    mavenCentral()

}

dependencies {
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
//    version.set("2023.1")
    pluginName.set("AceJump")
    updateSinceUntilBuild.set(false)
    sameSinceUntilBuild.set(false)
    plugins.set(listOf("java"))
    localPath.set("/Users/chen/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-1/232.7295.16/IntelliJ IDEA 2023.2 EAP.app/Contents")
    type.set("IC")
}


//patchPluginXml {
//
//    pluginDescription(file(descriptionFile).text)
//    changeNotes(file(changesFile).text)
//}
java {
    toolchain {
        run {
            languageVersion.set(JavaLanguageVersion.of(17))
        }
    }
}

kotlin {
    jvmToolchain {
        run {
            languageVersion.set(JavaLanguageVersion.of(17))
        }
    }
    sourceSets.all {
        languageSettings.apply {
            languageVersion = "2.0"
        }
    }
}
