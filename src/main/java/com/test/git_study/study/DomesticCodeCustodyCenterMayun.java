package com.test.git_study.study;
@SuppressWarnings({"all"})

//gitee push test

//国内代码托管中心-码云

//1.简介(01Introduce.png)

//众所周知，GitHub 服务器在国外，使用 GitHub 作为项目托管网站，如果网速不好的话，
//严重影响使用体验，甚至会出现登录不上的情况。针对这个情况，大家也可以使用国内的项
//目托管网站-码云。
//码云是开源中国推出的基于 Git 的代码托管服务中心，网址是 https://gitee.com/ ，使用
//方式跟 GitHub 一样，而且它还是一个中文网站，如果你英文不是很好它是最好的选择。


//2.码云帐号注册和登录(02GiteeAccountRegistrationAndLogin.png)

//进入码云官网地址：https://gitee.com/，点击注册 Gitee

//输入个人信息，进行注册即可。

//帐号注册成功以后，直接登录。

//登录以后，就可以看到码云官网首页了。


//3.码云创建远程库(03GiteeCreatesRemoteLibrary.png)

//点击首页右上角的加号，选择下面的新建仓库

//填写仓库名称，路径和选择是否开源（共开库或私有库）

//最后根据需求选择分支模型，然后点击创建按钮。

//远程库创建好以后，就可以看到 HTTPS 和 SSH 的链接。


//4.IDEA 集成码云(04IDEAIntegratedCodeCloud.png)

//(1)IDEA 安装码云插件

//Idea 默认不带码云插件，我们第一步要安装 Gitee 插件。
//如图所示，在 Idea 插件商店搜索 Gitee，然后点击右侧的 Install 按钮。

//Idea 链接码云和链接 GitHub 几乎一样，安装成功后，重启 Idea。

//Idea 重启以后在 Version Control 设置里面看到 Gitee，说明码云插件安装成功。

//然后在码云插件里面添加码云帐号，我们就可以用 Idea 连接码云了。

//(2)IDEA 连接码云

//Idea 连接码云和连接 GitHub 几乎一样，首先在 Idea 里面创建一个工程，
//初始化 git 工程，然后将代码添加到暂存区，提交到本地库，这些步骤上面已经讲过，此处不再赘述。

//将本地代码 push 到码云远程库

//自定义远程库链接。

//给远程库链接定义个 name，然后再 URL 里面填入码云远程库的 HTTPS 链接即可。
//码云服务器在国内，用 HTTPS 链接即可，没必要用 SSH 免密链接。

//然后选择定义好的远程链接，点击 Push 即可。

//看到提示就说明 Push 远程库成功。

//去码云远程库查看代码。

//只要码云远程库链接定义好以后，对码云远程库进行 pull 和 clone 的操作和 Github 一致，此处不再赘述。


//5.码云复制 GitHub 项目(05CopyingGitHubProjectWithGitee.png)

//码云提供了直接复制 GitHub 项目的功能，方便我们做项目的迁移和下载。
//具体操作如下：

//将 GitHub 的远程库 HTTPS 链接复制过来，点击创建按钮即可。

//如果 GitHub 项目更新了以后，在码云项目端可以手动重新同步，进行更新！


public class DomesticCodeCustodyCenterMayun {
}
