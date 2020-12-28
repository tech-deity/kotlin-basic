You need to integrate Kotlin Android Extensions in your project in order to you have your views recognized like that. Just add the following lines in your build.gradle:

apply plugin: 'com.android.application'
apply plugin: 'kotlin-android'
apply plugin: 'kotlin-android-extensions'
More info in this article: https://antonioleiva.com/kotlin-android-extensions/

BUT
synthetic will be deprecated in Kotlin 1.4.20, https://youtrack.jetbrains.com/issue/KT-42121 due to not being null-safe. If you are going to maintain the project you are building for a awhile it will be batter not to use Kotlin Android Extensions.

Suggested alternatives in the link above are:

ViewBinding
FindViewById
Kotterknife (deprecated)
AndroidAnnotations
FindViewById is the 'official' method and it's easy to use, Kotlin suggests ViewBinding which has some boilerplate as I read (I haven't used it yet).

edit the theme to AppCompact to change the color of button
