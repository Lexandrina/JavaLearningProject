package md.tekwillacademy.gitworkflow;

public class GitStepByStepGuide {
    public static void main(String[] args) {
        String step1 = "1.Perform - git stash command to store uncommitted changes";
        String step2 = "2.Perform - git checkout master - to save the the local master branch";
        String step3 = "3.Perform - git fetch command - to fetch the origin branches";
        String step4 = "4.Perform - git pull command - to  changes locally";
        String step5 = "5.Perform git checkout -b new_branch_name command - to create a ";
        String step6 = "6.Add you changes that related to the task";
        String step7 = "7.Review your changes and check your code before committing them";
        String step8 = "8.Execute git commit by using the Intellij interface, where you can select what changes you want to commit";
        String step9 = "9.Once all the changes, are committed, execute a git push command by using CTRL+ALT+K hot keys";
        String step10 = "10.Go to the GitHub repository, the committed changes are pushed to an origin branch with the same name";
        String step11 = "11.Create a new Pull Request into the origin master";
        String step12 = "12.Add the Pull Request details - name, description and request review from your colleagues";
        String step13 = "13.Merge the code if you have at least 2 approvals";
        String step14 = "14.If a change is required, then the last commit will be adjust by using git commit amend";
        String step15 = "15.In case of a commit amend then a git force should be performed in order to update the remote branch and exiting Pull Request";
        String step16= "16.After that, the origin/master contains the latest changes and the origin/new_branch_name can be delete";
        String step17 = "17.Go to intellij Idea, and checkout the master branch";
        String step18 = "18.Download the latest version of the origin/master";


        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);
        System.out.println(step16);
        System.out.println(step17);
        System.out.println(step18);


    }
}
