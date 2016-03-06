Stop Gradle Now!
================

Plugin for Android Studio to stop gradle.

I wrote this plugin in response [this reddit post](https://www.reddit.com/r/androiddev/comments/48x000/literally_the_only_dev_environment_incapable_of/). Also, I was curious how to write plugins to intellij. I've written extensions for Visual Studio for previous jobs, but never Android Studio (and never in Java).

As a matter of fact, this is the first time I've downloaded intellij.

After developing and verifying the plugin worked in Android Studio, I realized I never did my due diligence in searching to see if anyone else had actually done something similar.

Looks like I'm not the first to come up with this plugin.
GradleKillerIdeaPlugin - ([JetBrains link](https://plugins.jetbrains.com/plugin/7794?pr=idea)) ([Github](https://github.com/KanbanApps/GradleKillerIdeaPlugin))

Our solutions are different (killing the gradle process vs executing the `gradle --stop` command), but I won't be posting mine to JetBrains unless someone wants me to. I'll leave the repo up as a learning experience.

### How to write plugins for intellij
http://www.jetbrains.org/intellij/sdk/docs/basics.html
http://www.jetbrains.org/intellij/sdk/docs/faq.html
https://intellij-support.jetbrains.com/hc/en-us/community/posts/206756455-Question-about-Actions
