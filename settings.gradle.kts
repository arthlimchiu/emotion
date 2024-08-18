pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "emotion"
include(":app")
include(":core:data")
include(":core:common")
include(":core:model")
include(":core:local")
include(":core:network")
include(":core:work")
include(":core:ui")
include(":feature:levels")
include(":core:utils")
