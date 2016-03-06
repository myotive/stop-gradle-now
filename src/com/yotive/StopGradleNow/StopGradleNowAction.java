package com.yotive.StopGradleNow;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * Created by michaelyotive_hr on 3/6/16.
 */
public class StopGradleNowAction extends AnAction {
    public void actionPerformed(AnActionEvent e) {

        Project project = e.getProject();
        String stopGradleCommand = project.getBaseDir().getPath() + "/gradlew --stop";
        Runtime r = Runtime.getRuntime();
        Process p;

        boolean result = false;

        try{

            // run gradle stop command
            p = r.exec(stopGradleCommand);
            p.waitFor();

            result = p.exitValue() == 0;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        if(!result){
            Messages.showMessageDialog("There was an error or Gradle is not running", "Stop Gradle Now", Messages.getInformationIcon());
        }
    }
}
