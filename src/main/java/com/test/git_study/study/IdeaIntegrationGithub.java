package com.test.git_study.study;

//IDEA 集成 GitHub

//1.设置 GitHub 账号(01SetGitHubAccount.png)

//如果出现 401 等情况连接不上的，是因为网络原因，可以使用以下方式连接：

//然后去 GitHub 账户上设置 token。

//点击生成 token。

//复制红框中的字符串到 idea 中。

//点击登录。

//2.分享工程到 GitHub(02ShareTheProjectToGitHub01-02.png)

//来到 GitHub 中发现已经帮我们创建好了 gitTest 的远程仓库。

//步骤VCS/Git -> GitHub -> Share project on GitHub
//填写Repository name库名、Remote别名(建议与库名一致)、Description描述


//3.push 推送本地库到远程库(03PushPushesTheLocalLibraryToTheRemoteLibrary.png)

//push commit test

//右键点击项目，可以将当前分支的内容 push 到 GitHub 的远程仓库中。

//或者VCS/Git -> Push
//push默认用的是Https的链接，如果想使用SSH链接的话
//在push界面点击分支右侧一个可以点击的按钮 -> Define Remote ->设置别名和ssh地址确认即可
//要记得在设置完后通过那个按钮选择对应的别名后才是使用的ssh链接，不选择的话还是使用的默认的Https链接

//注意：push 是将本地库代码推送到远程库，如果本地库代码跟远程库代码版本不一致，
//push 的操作是会被拒绝的。也就是说，要想 push 成功，一定要保证本地库的版本要比远程
//库的版本高！因此一个成熟的程序员在动手改本地代码之前，一定会先检查下远程库跟本地
//代码的区别！如果本地的代码版本已经落后，切记要先 pull 拉取一下远程库的代码，将本地
//代码更新到最新以后，然后再修改，提交，推送！


//4. pull 拉取远程库到本地库(04PullTheRemoteLibraryToTheLocalLibrary01-02.png)

//pull test

//右键点击项目，可以将远程仓库的内容 pull 到本地仓库。

//注意：pull 是拉取远端仓库代码到本地，如果远程库代码和本地库代码不一致，会自动
//合并，如果自动合并失败，还会涉及到手动解决冲突的问题。


//5.clone 克隆远程库到本地(05CloneRemoteLibraryToLocal01-06.png)

//为 clone 下来的项目创建一个工程，然后点击 Next。

//步骤：
//idea初始界面 -> get from vcs -> 选择version control版本控制工具、url(项目https或者ssh地址)、剩下一个项目位置自动生成，不需要填写。
//之后点击clone即可把远程库项目拉倒本地上
public class IdeaIntegrationGithub {
}
