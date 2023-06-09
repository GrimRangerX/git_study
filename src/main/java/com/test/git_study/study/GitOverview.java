package com.test.git_study.study;

//Git概述(01GitOverview.png)

//Git 是一个免费的、开源的分布式版本控制系统，可以快速高效地处理从小型到大型的各种项目。

//Git 易于学习，占地面积小，性能极快。 它具有廉价的本地库，方便的暂存区域和多个工作流分支等特性。
//其性能优于 Subversion、CVS、Perforce 和 ClearCase 等版本控制工具。


//1.何为版本控制(02WhatIsVersionControl.png)

//版本控制是一种记录文件内容变化，以便将来查阅特定版本修订情况的系统。
//版本控制其实最重要的是可以记录文件修改历史记录，从而让用户能够查看历史版本，方便版本切换。




//2.为什么需要版本控制(03WhyDoYouNeedVersionControl.png)

//个人开发过渡到团队协作。


//3.版本控制工具(04VersionControlTool01-04.png)

//集中式版本控制工具

//CVS、SVN(Subversion)、VSS……

//集中化的版本控制系统诸如 CVS、SVN 等，都有一个单一的集中管理的服务器，保存所有文件的修订版本，
//而协同工作的人们都通过客户端连到这台服务器，取出最新的文件或者提交更新。多年以来，这已成为版本控制系统的标准做法。

//这种做法带来了许多好处，每个人都可以在一定程度上看到项目中的其他人正在做些什么。
//而管理员也可以轻松掌控每个开发者的权限，并且管理一个集中化的版本控制系统，要远比在各个客户端上维护本地数据库来得轻松容易。

//事分两面，有好有坏。这么做显而易见的缺点是中央服务器的单点故障。
//如果服务器宕机一小时，那么在这一小时内，谁都无法提交更新，也就无法协同工作。

//简单来说，集中式版本控制工具就是让所有人对中央服务器中的同份源码进行修改
//也就是所有人对服务器上的同一套源码做一个版本控制（记录源码修改记录变化）
//如果服务器出现故障，就会出现比较大的问题，这个上面有提到

//分布式版本控制工具

//Git、Mercurial、Bazaar、Darcs……

//像 Git 这种分布式版本控制工具，客户端提取的不是最新版本的文件快照，而是把代码仓库完整地镜像下来（本地库）。
//这样任何一处协同工作用的文件发生故障，事后都可以用其他客户端的本地仓库进行恢复。
//因为每个客户端的每一次文件提取操作，实际上都是一次对整个文件仓库的完整备份。

//分布式的版本控制系统出现之后,解决了集中式版本控制系统的缺陷:
//1. 服务器断网的情况下也可以进行开发（因为版本控制是在本地进行的）
//2. 每个客户端保存的也都是整个完整的项目（包含历史记录，更加安全）

//简单来说就是每个客户端都是都是自己的代码库，简单来说就不需要对服务器上的同份源码做版本控制
//只需要在自己的电脑里面做版本控制即可，修改完就可以推送到指定的服务器上即可
//当其他客户端需要最新的版本则只需要从指定的服务器上进行克隆源码下来即可
//然后就可以在本地继续进行版本控制了


//对上面两种版本控制工具的区别分析
//git比SVN多了个本地仓库。
//SVN中央库损坏，历史版本都会没。
//git中央库损坏，本地库还有历史版本


//4. Git 简史(05ABriefHistoryOfGit.png)


//5.Git工作机制(06GitWorkingMechanism.png)

//工作区就是写代码的地方

//写好代码之后先提交到暂存区让Git去追踪需要提交的代码
//添加到暂存区中的代码或者在工作区的可以删除的，但这是没有历史版本的
//只有提交到本地库中才会有对应的历史版本

//提交到本地库的代码是删不掉的，因为已经生产了历史版本，不管后面做了什么改动，切换回该版本的时候还是能看到相应代码的


//6.Git和代码托管中心(07GitAndCodeHostingCenter.png)

//代码托管中心是基于网络服务器的远程代码仓库，一般我们简单称为远程库。
//➢ 局域网
//  ✓ GitLab
//➢ 互联网
//  ✓ GitHub（外网）
//  ✓ Gitee 码云（国内网站）

public class GitOverview {
}
