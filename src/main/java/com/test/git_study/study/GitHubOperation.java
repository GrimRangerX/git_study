package com.test.git_study.study;

//GitHub 操作(01GitHubOperation.png)

//GitHub 网址：https://github.com/

//Ps:全球最大同性交友网站，技术宅男的天堂，新世界的大门，你还在等什么?

//账号                    姓名          验证邮箱
//atguiguyueyue          岳不群         atguiguyueyue@aliyun.com
//atguigulinghuchong     令狐冲         atguigulinghuchong@163.com
//atguigudongfang1       东方不败       atguigudongfang@163.com

//注:此三个账号为讲师使用账号，同学请自行注册，然后三个同学为一组进行团队协作！


//1.创建远程仓库(02CreateARemoteWarehouse01-02.png)

//建议远程库名字和本地库名字对应上
//比如说本地库名字叫git-demo，那么远程库名字也叫git-demo
//也就是说在Repository name的文本框中填上git-demo

//填写完名字之后可以选择远程库的分类
//public 或者 private
//公共库  或者 私有库

//选择完之后可以直接点击 create repository创建库

//2.远程仓库操作(03RemoteWarehouseOperation01.png) *代表重要

//命令名称                          作用
//git remote -v                    查看当前所有远程地址别名
//git remote add 别名 远程地址       起别名
//*git push 别名 分支               推送本地分支上的内容到远程仓库
//*git clone 远程地址               将远程仓库的内容克隆到本地
//*git pull 远程库地址别名 远程分支名  将远程仓库对于分支最新内容拉下来后与当前本地分支直接合并

//(1)创建远程仓库别名(03RemoteWarehouseOperation02-03.png)

//①基本语法

//git remote -v 查看当前所有远程地址别名

//git remote add 别名 远程地址

//②案例实操

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git remote -v
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git remote add ori https://github.com/atguiguyueyue/git-shTest.git
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git remote -v //这里出现两个别名代表，即可以拉取，也可以推送
//ori https://github.com/atguiguyueyue/git-shTest.git (fetch)
//ori https://github.com/atguiguyueyue/git-shTest.git (push)


//https://github.com/atguiguyueyue/git-shTest.git
//这个地址在创建完远程仓库后生成的连接，如图所示红框中

//建议：别名与库名保持一致

//(2)推送本地分支到远程仓库(03RemoteWarehouseOperation04.png)

//①基本语法

//git push 别名 分支

//②案例实操

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git push ori master
//Logon failed, use ctrl+c to cancel basic credential prompt.
//Username for 'https://github.com': atguiguyueyue
//Counting objects: 3, done.
//Delta compression using up to 12 threads.
//Compressing objects: 100% (2/2), done.
//Writing objects: 100% (3/3), 276 bytes | 276.00 KiB/s, done.
//Total 3 (delta 0), reused 0 (delta 0)
//To https://github.com/atguiguyueyue/git-shTest.git
//  * [new branch] master -> master

//此时发现已将我们 master 分支上的内容推送到 GitHub 创建的远程仓库。

//在第一次推送的时候要与账号进行绑定或者拿到token进行验证才能进行推送

//(3)克隆远程仓库到本地(03RemoteWarehouseOperation05.png)

//①基本语法

//git clone 远程地址

//②案例实操

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/pro-linghuchong
//$ git clone https://github.com/atguiguyueyue/git-shTest.git
//Cloning into 'git-shTest'...
//remote: Enumerating objects: 3, done.
//remote: Counting objects: 100% (3/3), done.
//remote: Compressing objects: 100% (2/2), done.
//remote: Total 3 (delta 0), reused 3 (delta 0), pack-reused 0
//Unpacking objects: 100% (3/3), done.

//https://github.com/atguiguyueyue/git-shTest.git
//这个地址为远程仓库地址，克隆结果：初始化本地仓库

//--创建远程仓库别名
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/pro-linghuchong/git-shTest
//(master)
//$ git remote -v
//origin https://github.com/atguiguyueyue/git-shTest.git (fetch)
//origin https://github.com/atguiguyueyue/git-shTest.git (push)

//小结：clone 会做如下操作。1、拉取代码。2、初始化本地仓库。3、创建别名

//记住：公共库是不需要权限进行克隆的，也就是说谁都可以进行克隆，不需要登录之类的进行验证身份

//(4)邀请加入团队(03RemoteWarehouseOperation06-13.png)

//步骤:
//到对应的GitHub远程库中
//点击Settings
//点击Collaborators
//找到Manage access
//点击add people
//输入name或者email找到对应用户进行添加
//然后可以在要邀请的用户中看到一个Pending Invite，旁边有个按钮，点击复制链接
//然后该用户点击进去这个链接，然后点击Accept invitation进行接受邀请

//①选择邀请合作者

//②填入想要合作的人

//③复制地址并通过微信钉钉等方式发送给该用户， 复 制 内 容 如 下 ：https://github.com/atguiguyueyue/git-shTest/invitations

//④在 atguigulinghuchong 这个账号中的地址栏复制收到邀请的链接，点击接受邀请。

//⑤成功之后可以在 atguigulinghuchong 这个账号上看到 git-Test 的远程仓库。

//⑥令狐冲可以修改内容并 push 到远程仓库。

//--编辑 clone 下来的文件
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/pro-linghuchong/git-shTest
//(master)
//$ vim hello.txt
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/pro-linghuchong/git-shTest
//(master)
//$ cat hello.txt
//hello git! hello atguigu! 2222222222222
//hello git! hello atguigu! 33333333333333
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu! 我是最帅的，比岳不群还帅
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu! master test
//hello git! hello atguigu! hot-fix test
//--将编辑好的文件添加到暂存区
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/pro-linghuchong/git-shTest
//(master)
//$ git add hello.txt
//--将暂存区的文件上传到本地库
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/pro-linghuchong/git-shTest
//(master)
//$ git commit -m "lhc commit" hello.txt
//[master 5dabe6b] lhc commit
//1 file changed, 1 insertion(+), 1 deletion(-)
//--将本地库的内容 push 到远程仓库
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/pro-linghuchong/git-shTest
//(master)
//$ git push origin master
//Logon failed, use ctrl+c to cancel basic credential prompt.
//Username for 'https://github.com': atguigulinghuchong
//Counting objects: 3, done.
//Delta compression using up to 12 threads.
//Compressing objects: 100% (2/2), done.
//Writing objects: 100% (3/3), 309 bytes | 309.00 KiB/s, done.
//Total 3 (delta 1), reused 0 (delta 0)
//remote: Resolving deltas: 100% (1/1), completed with 1 local object.
//To https://github.com/atguiguyueyue/git-shTest.git
// 7cb4d02..5dabe6b master -> master

//⑦回到 atguiguyueyue 的 GitHub 远程仓库中可以看到，最后一次是 lhc 提交的。

//(5)拉取远程库内容(03RemoteWarehouseOperation14.png)

//①基本语法

//git pull 远程库地址别名 远程分支名

//②案例实操

//--将远程仓库对于分支最新内容拉下来后与当前本地分支直接合并
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git pull ori master
//remote: Enumerating objects: 5, done.
//remote: Counting objects: 100% (5/5), done.
//remote: Compressing objects: 100% (1/1), done.
//remote: Total 3 (delta 1), reused 3 (delta 1), pack-reused 0
//Unpacking objects: 100% (3/3), done.
//From https://github.com/atguiguyueyue/git-shTest
//* branch master -> FETCH_HEAD
// 7cb4d02..5dabe6b master -> ori/master
//Updating 7cb4d02..5dabe6b
//Fast-forward
//hello.txt | 2 +-
//1 file changed, 1 insertion(+), 1 deletion(-)
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ cat hello.txt
//hello git! hello atguigu! 2222222222222
//hello git! hello atguigu! 33333333333333
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu! 我是最帅的，比岳不群还帅
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu! master test
//hello git! hello atguigu! hot-fix test


//3.跨团队合作(04Cross-teamCooperation01-11.png)

//如果想让其他人快速找到自己在GitHub上的项目的话，那么就直接把Https的地址复制给他即可

//(1)将远程仓库的地址复制发给邀请跨团队协作的人，比如东方不败。

//(2)在东方不败的 GitHub 账号里的地址栏复制收到的链接，然后点击 Fork 将项目叉到自己的本地仓库。
//点击fork后可以再github首页的左边看到这个项目，点进去项目也能在左上角看到fork from xxx得知这个项目是在哪里fork过来的

//(3)东方不败就可以在线编辑叉取过来的文件。

//(4)编辑完毕后，填写描述信息并点击左下角绿色按钮提交。
//提交之后，暂时只是在自己账号下提交成功的，在另外一边是看不到提交的内容的

//(5)接下来点击上方的 Pull request请求，并创建一个新的请求。
//在创建请求的时候还可以看到自己修改了什么代码，给展示出来

//(6)回到岳岳 GitHub 账号可以看到有一个 Pull request 请求。

//进入到聊天室，可以讨论代码相关内容。

//点击对应的pull request请求进去
//再点击链接进去查看代码具体修改了什么内容
//绿色高亮部分就是修改的内容

//(7)如果代码没有问题，可以点击 Merge pull request 合并代码。


//4.SSH 免密登录(05SshPassword-freeLogin.png)

//我们可以看到远程仓库中还有一个 SSH 的地址，因此我们也可以使用 SSH 进行访问。

//具体操作如下：

//--进入当前用户的家目录
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ cd
//--删除.ssh 目录
//Layne@LAPTOP-Layne MINGW64 ~
//$ rm -rvf .ssh
//removed '.ssh/known_hosts'
//removed directory '.ssh'
//--运行命令生成.ssh 秘钥目录[注意：这里-C 这个参数是大写的 C]
//Layne@LAPTOP-Layne MINGW64 ~
//$ ssh-keygen -t rsa -C atguiguyueyue@aliyun.com
//之后敲三次回车
//Generating public/private rsa key pair.
//Enter file in which to save the key (/c/Users/Layne/.ssh/id_rsa):
//Created directory '/c/Users/Layne/.ssh'.
//Enter passphrase (empty for no passphrase):
//Enter same passphrase again:
//Your identification has been saved in /c/Users/Layne/.ssh/id_rsa.
//Your public key has been saved in /c/Users/Layne/.ssh/id_rsa.pub.
//The key fingerprint is:
//SHA256:7CPfRLITKcYDhaqpEDeok7Atvwh2reRmpxxOC6dkY44
//atguiguyueyue@aliyun.com
//The key's randomart image is:
//+---[RSA 2048]----+
//| .. |
//| .. |
//| . .. |
//|+ + o . . |
//|oO . = S . |
//|X . .. + = |
//|+@ * .. = . |
//|X.&o+. o = |
//|Eo+Oo . . |
//+----[SHA256]-----+
//--进入.ssh 目录查看文件列表
//Layne@LAPTOP-Layne MINGW64 ~
//$ cd .ssh
//Layne@LAPTOP-Layne MINGW64 ~/.ssh
//$ ll -a
//total 21
//drwxr-xr-x 1 Layne 197609 0 11 月 25 19:27 ./
//drwxr-xr-x 1 Layne 197609 0 11 月 25 19:27 ../
//-rw-r--r-- 1 Layne 197609 1679 11 月 25 19:27 id_rsa
//-rw-r--r-- 1 Layne 197609 406 11 月 25 19:27 id_rsa.pub
//--查看 id_rsa.pub 文件内容
//Layne@LAPTOP-Layne MINGW64 ~/.ssh
//$ cat id_rsa.pub
//ssh-rsa
//AAAAB3NzaC1yc2EAAAADAQABAAABAQDRXRsk9Ohtg1AXLltsuNRAGBsx3ypE1O1Rkdzpm
//l1woa6y6G62lZri3XtCH0F7GQvnMvQtPISJFXXWo+jFHZmqYQa/6kOIMv2sszcoj2Qtwl
//lGXTPn/4T2h/cHjSHfc+ks8OYP7OWOOefpOCbYY/7DWYrl89k7nQlfd+A1FV/vQmcsa1L
//P5ihqjpjms2CoUUen8kZHbjwHBAHQHWRE+Vc371MG/dwINvCi8n7ibI86o2k0dW0+8SL+
//svPV/Y0G9m+RAqgec8b9U6DcSSAMH5uq4UWfnAcUNagb/aJQLytrH0pLa8nMv3XdSGNNo
//AGBFeW2+K81XrmkP27FrLI6lDef atguiguyueyue@aliyun.com

//复制 id_rsa.pub 文件内容，登录 GitHub，点击用户头像→Settings→SSH and GPG keys

//接下来再往远程仓库 push 东西的时候使用 SSH 连接就不需要登录了。
public class GitHubOperation {
}
