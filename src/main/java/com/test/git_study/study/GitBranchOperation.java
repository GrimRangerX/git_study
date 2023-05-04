package com.test.git_study.study;

//Git 分支操作(01GitBranchOperation.png)

//1.什么是分支(02WhatIsABranch.png)

//在版本控制过程中，同时推进多个任务，为每个任务，我们就可以创建每个任务的单独分支。
//使用分支意味着程序员可以把自己的工作从开发主线上分离开来，开发自己分支的时候，不会影响主线分支的运行。
//对于初学者而言，分支可以简单理解为副本，一个分支就是一个单独的副本。（分支底层其实也是指针的引用）

//从01GitBranchOperation.png图中可以理解，用户使用的是线上环境所在的服务器分支
//开发人员使用的是生产环境所在的分支，当进行开发更新维护之后，会把生产环境所在的分支与线上服务器分支进行一个合并完成一个更相信操作

//从02WhatIsABranch.png图中可以理解，当需要开发新功能时，会新建分支进行开发当开发好时就会与master分支进行合并操作


//2.分支的好处(03BenefitsOfBranching.png)

//同时并行推进多个功能开发，提高开发效率。
//各个分支在开发过程中，如果某一个分支开发失败，不会对其他分支有任何影响。失败的分支删除重新开始即可。


//3.分支的操作(04BranchOperation.png)

//命令名称              作用
//git branch 分支名     创建分支
//git branch -v        查看分支
//git checkout 分支名   切换分支
//git merge 分支名      把指定的分支合并到当前分支上

//(1)查看分支

//①基本语法

//git branch -v

//②案例实操

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git branch -v
//*(代表当前在这个分支中) master(分支名) 087a1a7(版本号) my third commit(版本名) （*代表当前所在的分区）

//(2)创建分支

//①基本语法

//git branch 分支名

//②案例实操

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git branch hot-fix
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git branch -v
//  hot-fix 087a1a7 my third commit （刚创建的新的分支，并将主分支 master的内容复制了一份）
//* master 087a1a7 my third commit

//(3)修改分支

//--在 master 分支上做修改
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ vim hello.txt
//--添加暂存区
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git add hello.txt
//--提交本地库
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git commit -m "my forth commit" hello.txt
//[master f363b4c] my forth commit
//1 file changed, 1 insertion(+), 1 deletion(-)
//--查看分支
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git branch -v
// hot-fix 087a1a7 my third commit （hot-fix 分支并未做任何改变）
//* master f363b4c my forth commit （当前 master 分支已更新为最新一次提交的版本）
//--查看 master 分支上的文件内容
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ cat hello.txt
//hello git! hello atguigu! 2222222222222
//hello git! hello atguigu! 3333333333333
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
//hello git! hello atguigu! master test
//hello git! hello atguigu!

//(4)切换分支

//①基本语法

//git checkout 分支名

//当切换分支之后，在.git目录下的HEAD文件中可以看到当前分支
//然后去到对应的文件夹下可以看出当前分支所在的版本是哪一个

//②案例实操

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)(此时还是master分支)
//$ git checkout hot-fix
//Switched to branch 'hot-fix'
//--发现当先分支已由 master 改为 hot-fix
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (hot-fix)(从这就能看出来当前分支已经改成hot-fix了)
//$
//--查看 hot-fix 分支上的文件内容发现与 master 分支上的内容不同
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (hot-fix)
//$ cat hello.txt
//hello git! hello atguigu! 2222222222222
//hello git! hello atguigu! 3333333333333
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
//--在 hot-fix 分支上做修改
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (hot-fix)
//$ cat hello.txt
//hello git! hello atguigu! 2222222222222
//hello git! hello atguigu! 3333333333333
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
//hello git! hello atguigu! hot-fix test
//--添加暂存区
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (hot-fix)
//$ git add hello.txt
//--提交本地库
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (hot-fix)
//$ git commit -m "hot-fix commit" hello.txt

//(5)合并分支(把指定的分支合并到当前分支上，简单来说，就是把指定的分支上的内容覆盖当前分支上的内容)
//

//①基本语法

//git merge 分支名

//②案例实操 在 master 分支上合并 hot-fix 分支

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$ git merge hot-fix
//Auto-merging hello.txt //自动合并
//CONFLICT (content): Merge conflict in hello.txt //冲突：合并冲突
//Automatic merge failed; fix conflicts and then commit the result. //自动合并失败，修复冲突并提交结果

//(6)产生冲突

//冲突产生的表现：后面状态为 MERGING

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master|MERGING) //小括号里面有了MERGING代表正在合并中，但是还没有合并成功
//$ cat hello.txt
//hello git! hello atguigu! 2222222222222
//hello git! hello atguigu! 3333333333333
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
//<<<<<<< HEAD //HEAD代表当前分支
//hello git! hello atguigu! master test
//hello git! hello atguigu!
//======= //<<<<<<<到等号中间内容代表着当前分支的内容
//hello git! hello atguigu!
//hello git! hello atguigu! hot-fix test
//>>>>>>> hot-fix //等号到下面的>>>>>>>内容代表指定分支上的内容

//冲突产生的原因：
//合并分支时，两个分支在同一个文件的同一个位置（同一行）有两套完全不同的修改。Git 无法替我们决定使用哪一个。必须人为决定新代码内容。
//Git是通过按行来进行记录内容的（这个需要记住）

//简单来说，比如说两个不同分支的同个版本的文件，然后这两个分支都对这个文件进行了修改，那么在其中一个分支在对另外一个分支做合并的时候就需要决定需要如何合并这些内容
//例如：当前游戏版本为1.0，此时需要进行新功能扩展，所以启动了newPower分支，正常情况下，原游戏版本不能做出修改，等待newPower功能实现完毕，实现合并，合并冲突类似于在newPower开发

//查看状态（检测到有文件有两处修改）

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master|MERGING)
//$ git status
//On branch master
//You have unmerged paths. //你有一个未合并的路径
// (fix conflicts and run "git commit") //修复冲突并进行提交
// (use "git merge --abort" to abort the merge) //或者使用命令进行中止合并
//Unmerged paths: //未合并的路径
// (use "git add <file>..." to mark resolution) //使用命令去标记解决方案
// both modified: hello.txt //both modified代表两处都对该文件进行了修改
//no changes added to commit (use "git add" and/or "git commit -a")

//(7)解决冲突

//①编辑有冲突的文件，删除特殊符号，决定要使用的内容

//特殊符号：<<<<<<< HEAD 当前分支的代码 ======= 合并过来的代码 >>>>>>> hot-fix

//hello git! hello atguigu! 2222222222222
//hello git! hello atguigu! 3333333333333
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
//hello git! hello atguigu! master test
//hello git! hello atguigu! hot-fix test

//②添加到暂存区

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master|MERGING)
//$ git add hello.txt

//③执行提交（注意：此时使用 git commit 命令时不能带文件名，因为此时还没有完成合并，那么此时就不知道提交的是哪个文件）
//如果带了文件名，那么就会报错误

//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master|MERGING)
//$ git commit -m "merge hot-fix"
//[master 69ff88d] merge hot-fix
//--发现后面 MERGING 消失，变为正常
//Layne@LAPTOP-Layne MINGW64 /d/Git-Space/SH0720 (master)
//$

//合并完成之后，当前分支的文件内容就会被修改为合并完成后的文件内容，但是指定分支上的文件内容还是合并前的文件内容，并不是合并完成后的文件内容

//4.创建分支和切换分支图解(05CreateBranchAndSwitchBranchDiagram.png)

//master、hot-fix 其实都是指向具体版本记录的指针。当前所在的分支，其实是由 HEAD决定的。所以创建分支的本质就是多创建一个指针。
//HEAD 如果指向 master，那么我们现在就在 master 分支上。
//HEAD 如果执行 hotfix，那么我们现在就在 hotfix 分支上。
//所以切换分支的本质就是移动 HEAD 指针。


public class GitBranchOperation {
}
