package com.test.git_study.study;

//IDEA 集成 Git

//1.配置 Git 忽略文件(01ConfigureGitIgnoreFile01-06.png)

//(1)Eclipse 特定文件

//(2)IDEA 特定文件

//(3)Maven 工程的 target 目录

//问题 1:为什么要忽略他们？

//答：与项目的实际功能无关，不参与服务器上部署运行。把它们忽略掉能够屏蔽 IDE 工具之间的差异。

//问题 2：怎么忽略？

//①创建忽略规则文件 xxxx.ignore（前缀名随便起，建议是 git.ignore）
//这个文件的存放位置原则上在哪里都可以，为了便于让~/.gitconfig 文件引用，建议也放在用户家目录下

//git.ignore 文件模版内容如下：
//# Compiled class file
//*.class
//
//# Log file
//*.log
//
//# BlueJ files
//*.ctxt
//
//# Mobile Tools for Java (J2ME)
//.mtj.tmp/
//
//# Package Files #
//*.jar
//*.war
//*.nar
//*.ear
//*.zip
//*.tar.gz
//*.rar
//
//# virtual machine crash logs, see
//http://www.java.com/en/download/help/error_hotspot.xml
//hs_err_pid*
//
//.classpath
//.project
//.settings
//target
//.idea
//*.iml

//②在.gitconfig 文件中引用忽略配置文件（此文件在 Windows 的家目录中）

//[user]
//  name = Layne
//  email = Layne@atguigu.com
//[core]
//  excludesfile = C:/Users/asus/git.ignore
//注意：这里要使用“正斜线（/）”，不要使用“反斜线（\）”


//2.定位 Git 程序(02LocatingGitProgram.png)

//Settings -> Version Control -> Git -> Path to Git executable -> 配置安装git的路径（找到git.exe）

//3.初始化本地库(03InitializeLocalLibrary01-02.png)

//选择要创建 Git 本地仓库的工程

//从最上面的工具栏看到VCS -> Create Git Repository

//4.添加到暂存区(04AddToScratchPad01-02.png)

//初始化本地库后看到文件名是红色的，就代表文件未被追踪，那么就需要Git去追踪文件

//两种方法

//①右键文件 -> Git -> Add

//②右键点击项目选择 Git -> Add 将项目添加到暂存区。（推荐）

//当追踪文件过后，那么文件名就变成绿色(代表还没有提交到本地库中)的了

//当然，配置了忽略的配置文件过后，被忽略的文件是不会被追踪的（使用第二个方法的时候）
//这时候这些被忽略的文件的颜色的棕黄色的



//5.提交到本地库(05SubmitToLocalLibrary01-02.png)

//通过右键文件夹或者文件 -> Git -> Commit后，文件名就是白色的了

//当修改文件之后，那么文件名就变成了浅蓝色，代表文件被追踪过，然后又修改了
//那么此时又需要把文件添加到暂存区追踪，然后进行提交
//也可以直接提交，不进行添加暂存区的步骤

//可以在左下角Git按钮这种看到具体提交了那些版本，还有分支等等信息
//在这里可以看到黄色和绿色指针，分别代表Head指针和当前分支的指针
//如果想要切换版本的话，那么就可以直接右键想要跳转的版本然后 checkout revision '版本号'进行跳转
//此时就会通过Head指针指向之前的版本，那么修改的信息都会回退到之前的版本

//如果想查看某个版本都改了什么东西，那么可以左键点击某个版本，然后在右侧可以看到具体修改了那些文件，
//双击那些文件就可以看到那个版本较上个版本都改了什么东西。

//6.切换版本(06SwitchVersions.png)

//在 IDEA 的左下角，点击 Version Control，然后点击 Log 查看版本

//右键选择要切换的版本，然后在菜单里点击 Checkout Revision。


//7.创建分支(07CreateABranch01-02.png)

//①
//选择 Git，在 Repository 里面，点击 Branches 按钮。

//在弹出的 Git Branches 框里，点击 New Branch 按钮。

//填写分支名称，创建 hot-fix 分支。

//然后再 IDEA 的右下角看到 hot-fix，说明分支创建成功，并且当前已经切换成 hot-fix 分支

//②
//或者右下角可以看到当前分支，然后左键New branch新建分支

//8.切换分支(08SwitchingBranch01-02.png)

//在 IDEA 窗口的右下角，切换到 master 分支。

//然后在 IDEA 窗口的右下角看到了 master，说明 master 分支切换成功。

//具体步骤：
//右下角可以看到当前分支，左键点击，然后选中要跳转的分支，然后点击checkout即可跳转

//9.合并分支(09MergeBranch.png)

//在 IDEA 窗口的右下角，将 hot-fix 分支合并到当前 master 分支。

//如果代码没有冲突，分支直接合并成功，分支合并成功以后，代码自动提交，无需手动提交本地库。

//注意：想要正常合并分支的话，需要切换到没被修改的分支上，然后再去与修改过内容的分支进行合并，而不是在修改过内容的分支进行合并

//10.解决冲突(10ResolveTheConflict.png)

//如图所示，如果 master 分支和 hot-fix 分支都修改了代码，在合并分支的时候就会发生冲突。

//我们现在站在 master 分支上合并 hot-fix 分支，就会发生代码冲突。

//点击 Conflicts 框里的 Merge 按钮，进行手动合并代码。

//手动合并完代码以后，点击右下角的 Apply 按钮。

//代码冲突解决，自动提交本地库。
public class IDEAIntegrationGit {
}
