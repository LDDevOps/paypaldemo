gGit and SCM 
============
Landmark-SS -                 Paypal:
===========                   =======
    Develops, Tests, Builds, deploys & monitors applications 
    Applications are the output from Softwares  

paypal:
  Releases:
   Releasing an application is taking/deploying it to the client
   In realtime we have multiple Releases.     

release1 = version1   = 1000lines of code  
   echo 'Welcome to LandmarkTech'

release2 = version2  = 2000lines of code  
   echo 'Welcome to Paypal'
   echo "Your convenient payment gateway"

Release3  = version3  = 1000 lines of code  
echo "Paypal the best payment gateway"

Rollout   --> version1 --> version2 ---> version3  
RollBack  --> version3 --> version2

The client is not happy with the latest version of the application.   
What can be done??? RollBack

Versioning in Software Development:
===================================
Version control systems = VCS:
  Local = version1, 
          version2,[5000LINES ] 
          version3 [2000LINES ] 
   cons: Single point of failure
         lacks collaboration
         in-efficient use of resources including time  
         can't RollBack

   cons: 1. Single point of failure
         2. lacks collaboration
         3. in-efficient use of resources including time  
         4. can't RollBack
  pros:  
  
  Centralised:
    cons: can't RollBack
          The central server can fail 

Distributed VCS:
===============
GIT: DVCs 
  Distributed Version Control system 
  - Git manage data as snapshots. 0 / 10 / 20 / 30 / 40 / 50 / 60 / 
  - It takes a picture of what all your files look like 
     at that moment and stores 
    a reference to that snapshot.

  Benefits: Nearly every operation is local
            git has data intergrity
            Git generally only adds data
            Rollout and RollBack  
other DVCs:
SVN --> Sub Version
CVS --> Concurrent Version system
TFS --> Team Foundation Server
Git --> 95% plus of companies are using GIT   

Git is a Distributed Version Control systems. DVCS
In our environments (Landmark) we use Git for Versioning.  

SCM = Source Code management
=======================-====  
SCM service plaforms :
  GitHub - MS
  GitLab
  BitBucket (Stash) - A
  awsCodeCommit 

IQ: As a DevOps Engineer, what are your roles & responsilities
    in Versioning with Git?
Answer:
  1. We ensure that Developers environments are configured and secured 
     We create an enabling environment for Developers to code/Develop
       DevelopmentServers are created in AWS/GCP.  
       share login details with Developers/Team [ userName/password ]  
       Ensure that git package/Software is installed 

2. Project Onboarding: 
   1. create a github account for your organisation or self  
   2. Create organisations where applicable in a SCM ['GitHub']  
       url =  https://github.com/landmarkss
   3. Create teams in SCM/github and assign members[Developers, etc.] 
       Team url = https://github.com/orgs/landmarkss/teams/paypalteam
        assigning members to teams using GitHub account userName/email
           oogunbiyi22
           amambua
           pride22
           Anyong87
           Ngohtez
           angeltemmy
       Grant permissions/roles to team members and collaborators:
           read  -- you can view codes   
           write -- you can view codes and make changes  
           admin/maintainer - ownership  
   4. Create repositories in SCM [GitHub] 
      repo url = https://github.com/landmarkss/paypal

   5. login into github
       website = https://github.com/
            name      = Amambua Ivoline Nkimih
            email     = amamivoy@gmail.com
            userName  = amambua
            password  = Admin@123.. 
            https://github.com/landmarka  

       website = https://github.com/
       login url = https://github.com/login
            userName  = amambua
            password  = Admin@123.. 


login url = https://github.com/login
url =  https://github.com/landmarkss
Team url = https://github.com/orgs/landmarkss/teams/paypalteam
repo url = https://github.com/landmarkss/paypal

  6. Ensure that Git and relevant IDEs are installed by Developers 


Git Installations
-----------------
Git Installations differs depending on your operating system:
Pre Requisite Software Download/ Registration :
Install git in Windows   :  
  Install gitbash @ https://git-scm.com/downloads [git.exe]
  $  git -v
     git version 2.41.0.windows.3


Install in RedHAT Linux servers:
    sudo yum install git  -y 

   ipaddress:  52.10.100.198  
   username:   ec2-user  
   password:   admin123  



Install in ubuntu Linux servers:
    sudo apt install git  -y 
=============================
remote repository in github 
https://github.com/landmarkss/paypal
mkdir paypal && cd paypal

Assume the role of a Developer
We are developing for our paypal FinTech client. 
1. create a directory for Development   
   mkdir paypal && cd paypal  
2. Initialise this directory to keep track of 
   any change or changes in the files/codes  

[obim@demo22 paypal]$ git --version
   git version 2.39.2

Git Commands:
  git status 
  git init 
    create a Local repository [.git]  
    initialises the git repository
  git add 
  git init  

 touch list  
 echo simon >> list 

 workingArea  stagingArea LocalRepo RemoteRepo  :
   git add *   
              git commit  
                           git push 

  git add fileName  
  git add .   
  git add *  

[obim@demo22 paypal]$ 
 git config --global user.email "legah2000@gmail.com"
 git config --global user.name "Simon Legah"

with THE "git commit command -m " a version is created with a version number[commitID]  

git init          = to initialised a git empty repository
                    create the default branch[master, main]
git status        = to track files location
git log           = list all commits  
git add           = move files to staging area from working area
git commit -m     = move files to the local repository FROM STAGING AREA
                    good commit message for tracking changes created by authors are recommended

remote repository in github 
https://github.com/landmarkss/paypal

  git remote -v 
  git remote add aliasName repoURL  
  git remote add paypal https://github.com/landmarkss/paypal

  git push aliasName branchName  
  git push paypal master  
  [obim@demo22 paypal]$ git push paypal master
Username for 'https://github.com': legah2045
Password for 'https://\legah2045@github.com': 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

Class32Teams:
Project:
  1a. Create your GitHub account 
  1b. Onboard a new project for a FinTech Client
        organisation / teams / repository
  2. Managers and assistant
       Create a Team in your created organisation for paypal and add members of your 
       your group with write access 


https://github.com/LandmakTechnology/paypal.git

git status  -- File appears in red [in the workingArea]
git add fileName  
git add .  
git add * 
git add list.txt    


 git config --global user.email "legah2000@gmail.com"
 git config --global user.name "Legah"

  git remote -v 
  git remote add aliasName repoURL  
  git remote add pp https://github.com/LandmakTechnology/paypal.git  

  git push aliasName branchName  
  git push pp master  

  User@LandmarkTech MINGW64 ~/Documents/paypal (master)
$ git remote add pp https://github.com/LandmakTechnology/paypal.git

User@LandmarkTech MINGW64 ~/Documents/paypal (master)
$ git remote -v
pp      https://github.com/LandmakTechnology/paypal.git (fetch)
pp      https://github.com/LandmakTechnology/paypal.git (push)


  working area        staging     localRepo     RemoteRepo[GitHub]    :
  -----------        -------      ---------     ------------------  
  Untracked files     git add     git commit    git push 
    red                green     

  git push aliasName branchName  
  git push pp master  


 repoURL = https://github.com/LandmakTechnology/paypal
 git clone https://github.com/LandmakTechnology/paypal  

git config --global user.email "mary@gmail.com"
git config --global user.name "Mary"

[ec2-user@demo33 paypal]$ git remote -v
origin  https://github.com/LandmakTechnology/paypal (fetch)
origin  https://github.com/LandmakTechnology/paypal (push)

  git push aliasName branchName  
  git push origin master 

[ec2-user@demo33 paypal]$  git push origin master
Username for 'https://github.com': legah2045
Password for 'https://legah2045@github.com': [Admin@123] PersonalAccessToken   
Password for 'https://legah2045@github.com': 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


 
with THE "git commit command -m " a version is created with a version number[commitID]  

git init          = to initialised a git empty repository
                    create the default branch[master, main]
git status        = to track files location    
git add           = move files to staging area from working area
git commit -m     = move files to the local repository FROM STAGING AREA
                    Creates a new version of the application
                    good commit message for tracking changes created by authors are recommended

Legah 
Mary  
  paypal-01 = Legah = git commit -m "First commit"    
  paypal-02 = Mary  = git commit -m ""    
  paypal-03 = Mary  = git commit -m    
  paypal-04 = Legah = git commit -m  


git show commitID  
Git commands:
  git init/show/add/commit/status/log/clone/pull/push/remote -v/ remote add/config/version  

Git Branch :
  In git a branch is a line of Development  
    development branch
    stage branch 
    master branch

        dev    [ rich / list.txt / deploy.sh  ] 
        stage  [ rich / list.txt / deploy.sh  ] 
        master branch [ rich / list.txt / deploy.sh  ] 

        dev   branch   ---> development environment  
        stage branch   ---> testing/UAT/QA environment  
        master branch  ---> production environment  

Ticket01:
  Create a dev branch from the master branch  
  Switch to the dev branch and create the app.java file  
  Commit the changes and Switch to the master branch  
  Review the changes in dev and merge with the master branch  

  The master branch is the upstreamBranch for the dev Branch  
  The dev branch is the downstream of the master branch   

Ticket01 answer:
  git branch branchName  
  git branch dev  
  git switch dev  
  git diff dev   
  git merge b0f7fcf     

git branch -help  
==================

git branch branchName   = creates a new branch
git branch development  = created the development branch 

master branch is the upstream of the Development branch  

upstream branch = development :
  development branch =  usermgt.java  = 10,000 lines  
downstream branch = stage :
  git branch stage   =  usermgt.java  = 10,000 lines    


git switch master
git diff development 
git merge development

git push aliasName --all  = push changes to all branches 
git push pp --all 


IQ: How many branches are you supporting in your projects?
    Branches are used to create lines of development in git. 
    A branch is a line of development 
 In our environment We maintain a minimun of 3 branches:
        development branch  
           app.java     
        staging branch  
           app.java
        master branch  
           app.java

  git branch  = list all the branches [lines of development]
  git branch branchName   = create a new branch     
  git checkout branchName = switch branches 
  git switch branchName = switch branches 

  git fetch --> It brings changes in the code to the LocalRepo
  git pull --> It brings changes in the code to the localRepoand & Working area 
  git clone --> It brings the entire code to the working area 

Pull Request- PR:
  PR is use to review changes in one branch before merging in another branch. 
  This is recommended for any merge in the master/release branch 
    Legah 
    Mary  
    Landmark 
    Amaka 
    chidi 
    Anna 
    Obi  

Email=registrar@landmarkmetropolitanuniversity.com

Password=Mercy@2012


===============================================================================
=========================================================================================
git branch:
  dev 
  stage 
  master 
    feature 
    bug_fixed 

git commit -a -m "app ready for production deployment"
    or 
git add .  && git commit -m "app.java modified"

git diff stage  
git merge stage  

we resolve merge conflict by merging manually.
Avoid merge conflict for best git practices  

git commit -a -m "merge conflict resolved"    

git commit -a -m "deployment is ready in uat"  
git commit -a -m "qa testing"  
git commit -a -m "performance testing"  

commit 2a803c04ea7ff15f8813358cebc743e21ca7a86b (HEAD -> stage)
Author: Legah <legah2000@gmail.com>
Date:   Sat Aug 19 19:34:26 2023 -0400

    performance testing

commit ce63fce02b67617b89c79aedd374a99fa94dae15
Author: Legah <legah2000@gmail.com>
Date:   Sat Aug 19 19:32:12 2023 -0400

    qa testing

commit 518110edf475bd43b4a1f12da84a56593d0354fb
Author: Legah <legah2000@gmail.com>
Date:   Sat Aug 19 19:30:49 2023 -0400

    deployment is ready in uat

How can we merge a particular commit among many commits in git??
By using the;

   git cherry-pick commitID   
How to determine what happened in a commit
  git show commitID
  git cherry-pick 518110e  
  git commit -a -m "CONFLICT fixed"

How to merge changes in git:
  git merge
     sc1 [version1] -->sc2 [version2] --->sc3 [version3] 
                   = mc1 [master version1]  
  git rebase
     sc1 [version1] -->sc2 [version2] --->sc3 [version3] 
                   = mc1 [version1] -->mc2 [version2] --->mc3 [version3]               
  git cherry-pick   = merging specific commits

Resloving issues:  debugging:

  working area        staging     localRepo               RemoteRepo    :
  -----------        -------      ---------              ---------  
  Untracked files     git add     git commit              git push 
    red                green     

  git clean -n   
  git clean -f       git reset    git revert commitID          


app.java [java project]  
app.py [python] 
  git clean -n  = Indicates files to deleted in the working area   
  git clean -f  = Delete files in the working area

app.py = print('Welcome to paypal')
app.sh = echo 'Welcome to paypal'

git reset   = Moves files from staging back to working area
      echo 'Application is Ready for deployment' >> deploy.sh 

git revert Cid = Delete the latest committed files 
                 in the LocalRepo for a specific commit

git show 3c0541aeb 

git revert 3c0541aeb 

difference b/w tags and branches :
=== Tags                       ==Branch
immutable                      mutable
unmodifiable                   modifiable
After Production               development-WIP 
Master Recommended             any branch 
git tag TagName                 git branch BN
git push an --tags              git push an --all           
git push AliasName tag TN       git push an BM              
git tag -d TN                   git branch -d BN

Tags 

git tag paypal-1.0.2  
   1. = higher version  
   0. = lower version 
   2  = patch  

git push pp --tags

git branch:
  dev branch    ---> develoment Environment
  stage branch  ---> Testing/QA/UAT Environment
  master branch ---> PRODUCTION 
    feature 
    bug_fixed 

What is the difference between Git & Github:
Git is an open source Distributed Version Control System(DVCS) which records
changes made to files (codes) laying emphasis on speed, data integrity in a
distributed non-linear workflows.  
GitHub is a source code management[SCM] tool

Explain your branching strategy in LandmakTechnology ?? 
Explain your branching strategy in Dominion systems ??
Explain your branching strategy in your Environment ?? 

1. Number of branches = WE maintain 3 branches
  dev branch    ---> develoment Environment
  stage branch  ---> Testing/QA/UAT Environment
  master branch ---> PRODUCTION 
    feature 
    bug_fixed 

2. Branch security = 
   All commits in the master branch must go through PR 

3. Switching branches =  working tree should be clean 
    DevOps Engineer [dev branch / master--bugfixed]
    If neccesary backup incomplete tasks before switching  
      git stash command  
4. git rebase over git merge
5. review changes [git diff] before merging
6. Use PR before committing to the master branch 
7. avoid merge conflicts  


git stash       =     to take backup
git stash  list

  commit 

stash@{0}
stash@{1}
stash@{2}
stash@{3}

git stash apply            = resume wip for the most recent backup
git stash apply stash@{0}  = resume wip for the 1st backup
git stash apply stash@{5}  = resume wip for 6th backup
git stash drop stash@{0}   = will delete backup
git stash pop stash@{1}    = It apply & drop backup 1.
git stash pop


connecting to scm/github using ssh
   ssh-keygen   
 
 ssh-url   = git@github.com:LandmakTechnology/paypal.git
 git remote add psh git@github.com:LandmakTechnology/paypal.git  
 
 https-url = https://github.com/LandmakTechnology/paypal.git
 git remote add pp https://github.com/LandmakTechnology/paypal.git

Github-webhook --- Jenkins  

.gitinore file  
  Developers use IDE to write code   
   IDEs include = vscode, esclipes, atom, etc.  
     .classpath modules  


Git Best Practices:
    Use branching strategy and pull requests
    Commit once you finish your task. 
    Avoid merge Conflicts.
    Don’t Commit Half-Done code - backup with git stash
    Test your code before committing.
    Write Good Commit Messages before committing 
    Try to use git commands rather than GUI tools.
    use ssh url and PAT over https url  
    use rebase over git merge
    use branch protection strategy  
    use best branching strategy

IDEs = Integrated development environment
 are software that eases code writing  

[ec2-user@demo33 paypal]$ ls /home/ec2-user/.ssh/
authorized_keys  
id_rsa       = ssh-private-key
id_rsa.pub   = ssh-public-key  
known_hosts  
known_hosts.old



Maven / Tomcat / apache Webserver / SonarQube / Nexus / Jenkins :
=================================================================


ne: Create the file/ write Code in a file  #we are in the working area, files are red
			vi or touch etc


git status = shows the location of files 


Step two: initialize an empty git repository    #we are in the working area, files are red
        
        git init = initialises an empty git repository and creates a default branch[master, main



Step three: Add the file to the staging area     #we are in the staging are, files are green   
        git add fileName = adds a single file  
        git add . = adds all the files   
        git add *  



Step four:  Add files to the local repository => a verison of the app has been created
        git commit -m 

#you might need to configure. You should also add a good commit message.
            
            git log           = list all previous commits/(versions of the app) 




Step five:  Connect to the remote repository
         git remote -v = lists all the aliases I have Eg, 

         git remote add aliasName repoURL = nicknames your repository 
git 

Step six: Push to the remote repository
          git push aliasName(#name of repository) branchName  Eg; git push paypal master 



