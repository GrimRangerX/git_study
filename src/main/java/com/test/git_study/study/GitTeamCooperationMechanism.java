package com.test.gitstudy.study;

//Git 团队协作机制(GitTeamCooperationMechanism.png)

//1.团队内协作

//比如说（这里出现的单词都是关键命令，用得很多的）
//团队的架构师先把软件架构弄出来push到远程库（例如github、码云等等）中
//然后团队的其他成员可以从远程库中把完整的代码给clone下来
//然后可以在本地做自己的版本控制。。。
//然后开发完功能之后可以push到远程库中，当然，这需要团队负责人给予相应的权限才可以push
//也就是要把开发人员给纳入到团队成员当中
//然后团队的负责人在团队成员push代码到远程库之后可以把最新版本的代码给pull拉取下来
//记住，pull不是完整的把代码拉下来，而是更新自己的本地库的代码

//简单来说就是
//push(推送代码到远程库) - clone(从远程库中克隆完整代码下来) - pull(从远程库中拉取代码对本地库代码进行更新本地库代码)


//2.跨团队协作

//比如说
//两个团队一起做一个项目，然后其中一个团队已经在自己的远程库中把项目框架搭起来了，
//那么这个团队就可以通过fork把项目给叉给另一个团队的远程库中
//然后另一个团队就可以通过clone把项目给克隆下来进行开发
//开发完成之后先给那个团队发起一个pull request请求，让那个团队进行拉取，不过先得审核
//通过审核之后，就可以通过merge进行合并代码


public class GitTeamCooperationMechanism {
}