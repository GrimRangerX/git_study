package com.test.git_study.study;
@SuppressWarnings({"all"})
//Git 常用命令(01GitCommonCommands.png)

//命令名称                               作用
//git config --global user.name 用户名  设置用户签名(用户名)
//git config --global user.email 邮箱   设置用户签名(用户邮箱)
//git init                             初始化本地库
//git status                           查看本地库状态
//git add 文件名                        添加到暂存区
//git commit -m "日志信息" 文件名        提交到本地库
//git reflog                          查看历史记录
//git reset --hard 版本号              版本穿梭


//1.设置用户签名(02SetUserSignature01-02.png)

//(1)基本语法

//git config --global user.name 用户名
//git config --global user.email 邮箱

//可以在当前用户的home目录里面找到一个.gitconfig文件，在这里面可以看到设置的用户签名
//例:C:\Users\15474\.gitconfig

//(2)案例实操

//全局范围的签名设置：
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)

//设置用户名
//$ git config --global user.name Layne
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)

//设置邮箱
//$ git config --global user.email Layne@atguigu.com
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)

//查看配置
//$ cat ~/.gitconfig
//[user]
//  name = Layne
//  email = Layne@atguigu.com

//说明：

//签名的作用是区分不同操作者身份。用户的签名信息在每一个版本的提交信息中能够看到，
//以此确认本次提交是谁做的。Git 首次安装必须设置一下用户签名，否则无法提交代码。

//※注意：这里设置用户签名和将来登录 GitHub（或其他代码托管中心）的账号没有任何关系。


//2.初始化本地库(03InitializeLocalLibrary.png)

//(1)基本语法

//git init

//(2)案例实操

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720

//要注意需要在工作目录中执行这个命令(也就是说要先切换到工作目录)，执行完后会在当前工作目录下生成一个.git文件夹

//初始化本地库
//$ git init
//Initialized empty Git repository in D:/Git-Space/SH0720/.git/
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)

//查看当前文件夹信息
//$ ll -a
//total 4
//drwxr-xr-x 1 Layne 197609 0 11 月 25 14:07 ./
//drwxr-xr-x 1 Layne 197609 0 11 月 25 14:07 ../
//drwxr-xr-x 1 Layne 197609 0 11 月 25 14:07 .git/ （.git 初始化的效果，生成 git）

//(3)结果查看


//3.查看本地库状态(04ViewLocalLibraryStatus01-03.png)

//(1)基本语法

//git status

//(2)案例实操

//①首次查看（工作区没有任何文件）

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git status
//On branch master //提示当前在哪个分支中

//No commits yet //目前没有提交东西

//nothing to commit (create/copy files and use "git add" to track) //目前没有东西需要提交

//②新增文件（hello.txt）

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ vim hello.txt
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!

//③再次查看（检测到未追踪的文件）

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git status
//On branch master //当前分支

//No commits yet //还没有提交任何东西

//Untracked files: //发现未被追踪的文件
// (use "git add <file>..." to include in what will be committed)
//      hello.txt //这个文件名是红色的，代表这个文件只是存在工作区但是并没有给git进行追踪
//nothing added to commit but untracked files present (use "git add"
//to track)


//4.添加暂存区(05AddTemporaryStorageArea.png)

//(1)将工作区的文件添加到暂存区

//①基本语法

//git add 文件名

//②案例实操

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git add hello.txt
//warning: LF will be replaced by CRLF in hello.txt. //在该文件中LF(Liunx是LF换行)换行会被替换成CRLF(windows是CRLF换行)换行，这个在之前安装Git的时候说过
//The file will have its original line endings in your working directory.

//(2)查看状态(检测到暂存区有新文件)

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git status
//On branch master //当前分支

//No commits yet //还没有提交过任何东西

//Changes to be committed: //
// (use "git rm --cached <file>..." to unstage) //使用该命令删除该文件（只是把暂存区中的这个文件删了，并没有物理删除，只是让git取消了对该文件的追踪）
//      new file: hello.txt //检测到了新文件，当前该文件名是绿色的，代表git追踪倒了这个文件，但是因为还没有提交的关系，所以该文件只是在暂存区中

//要记住，提交到暂存区中不代表就生成了历史版本，也就是说得通过提交命令提交之后才会生成对应的历史版本，下面就会讲到

//删除暂存区中的文件(取消追踪)
//例:git rm --cached hello.txt

//5.提交本地库(06SubmitLocalLibrary.png)

//(1)将暂存区的文件提交到本地库

//①基本语法

//git commit -m "日志信息" 文件名

//②案例实操

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git commit -m "my first commit" hello.txt
//warning: LF will be replaced by CRLF in hello.txt. //转换行末换行符
//The file will have its original line endings in your working directory.
//[master(分支) (root-commit) 86366fa(版本号)] my first commit //master分支有了一个历史版本
// 1 file changed, 16 insertions(+) //一个文件被改变 16行被插入
// create mode 100644 hello.txt

//(2)查看状态(没有文件需要提交)

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git status
//On branch master //当前分支master
//nothing to commit, working tree clean //没有东西需要提交，工作树干净，因为已经提交过东西了，所以no commits yet提示就没有了


//6.修改文件(hello.txt)(07AlterFile.png)

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ vim hello.txt
//hello git! hello atguigu! 2222222222222
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!

//(1)查看状态(检测到工作区有文件被修改)

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/S H0720 (master)
//$ git status
//On branch master //当前分支
//Changes not staged for commit: //某文件已被修改并且没有被追踪
// (use "git add <file>..." to update what will be committed)
// (use "git checkout -- <file>..." to discard changes in working
//directory)
//      modified: hello.txt //检测到的修改的文件，而且是红色的，代表被修改的文件没有添加到暂存区，也就是没有被追踪
//no changes added to commit (use "git add" and/or "git commit -a")

//(2)将修改的文件再次添加暂存区

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git add hello.txt
//warning: LF will be replaced by CRLF in hello.txt.
//The file will have its original line endings in your working directory.

//(3)查看状态(工作区的修改添加到了暂存区)

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git status
//On branch master //当前分支
//Changes to be committed:
// (use "git reset HEAD <file>..." to unstage)
//  modified: hello.txt //追踪被修改的文件

//(4)提交

//$ git commit -m "second commit" hello.txt
//warning: LF will be replaced by CRLF in hello.txt.
//The file will have its original line endings in your working directory
//[master aa33677] second commit
// 1 file changed, 1 insertion(+), 1 deletion(-) //这里代表一个文件修改，一行新增，一行删除
//git是通过行来维护文件的，所以修改时，先把修改之前的行给删除，然后把修改之后行添加进来

//(5)查看状态

//$ git status
//On branch master //当前分支
//nothing to commit, working tree clean //没有东西需要提交，工作树干净

//(6)查看版本信息

//$ git reflog
//下面就有两个版本了，当前分支是master，指针指向的当前版本是second commit版本
//aa33677 (HEAD -> master) HEAD@{0}: commit: second commit
//fcaa5d5 HEAD@{1}: commit (initial): first commit



//7.历史版本(08VersionHistory01-03.png)

//(1)查看历史版本

//①基本语法

//git reflog 查看版本信息
//git log 查看版本详细信息

//②案例实操

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git reflog
//087a1a7(精简版本号) (HEAD -> master)(当前指针指向master这个分支) HEAD@{0}: commit: my third commit(当前版本名字)
//ca8ded6 HEAD@{1}: commit: my second commit
//86366fa HEAD@{2}: commit (initial): my first commit

//$ git log
//commit fcaa5d5001d470824b166caaab88ddfa35e632ed(完整版本号) (HEAD -> master)(当前分支)
//Author: xie <1547450685@qq.com> //谁提交的
//Date:   Tue Mar 28 19:48:36 2023 +0800 //提交日期
//
//    first commit //版本名

//(2)版本穿梭

//①基本语法

//git reset --hard 版本号

//git不是使用文件副本来进行版本控制的（也就是不是修改一次文件就通过复制文件副本的方式来进行版本控制）
//而是在底层使用指针的方式来进行版本控制，如果要回退到之前某个版本只需要把指针指向该版本

//②案例实操

//--首先查看当前的历史记录，可以看到当前是在 087a1a7 这个版本
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git reflog
//087a1a7 (HEAD -> master) HEAD@{0}: commit: my third commit
//ca8ded6 HEAD@{1}: commit: my second commit
//86366fa HEAD@{2}: commit (initial): my first commit

//--切换到 86366fa 版本，也就是我们第一次提交的版本
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git reset --hard 86366fa
//HEAD is now at 86366fa my first commit

//--切换完毕之后再查看历史记录，当前成功切换到了 86366fa 版本
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git reflog
//86366fa (HEAD -> master) HEAD@{0}: reset: moving to 86366fa //日志会记录版本穿梭的这一条操作
//087a1a7 HEAD@{1}: commit: my third commit
//ca8ded6 HEAD@{2}: commit: my second commit
//86366fa (HEAD -> master) HEAD@{3}: commit (initial): my first commit

//--然后查看文件 hello.txt，发现文件内容已经变化
//$ cat hello.txt
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!
//hello git! hello atguigu!

//从.git\HEAD文件中可以看到当前是在哪个分支中(这里显示的是在.git的哪个文件夹下的哪个文件)
//然后从对应的文件夹下的文件可以看到当前分支正在哪个版本中

//例：
//HEAD文件中显示
//ref: refs/heads/master
//代表当前是master分支

//去到.git文件夹下的这个refs/heads/目录里面查看master文件中显示
//aa3367750f247c260c3c57d3c65156a5e18faac4
//显示的是当前分支在哪个版本上，这里显示的是完整的版本号


//Git 切换版本，底层其实是移动的 HEAD 指针，具体原理如下图所示。
//简单来说就是切换哪个版本时，指针就会指向对应版本

//只获得版本号的话 git rev-parse HEAD就行
public class GitCommonCommands {
}
