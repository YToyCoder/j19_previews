## Java-Virtual-Thread

[官方介绍](https://docs.oracle.com/en/java/javase/19/core/virtual-threads.html#GUID-DC4306FC-D6C1-4BCC-AECE-48C32C1A8DAA)

Java虚拟线程是源自Loom项目,尽可能地降低最大可能利用硬件高吞吐量并发程序的编写，维护和观测等工作。

Java虚拟线程，将原有的线程模式分为: 虚拟线程和平台线程。

平台线程可以对应于Java以前的线程，每个平台线程对应于OS的一个线程。对于平台线程，虽然相对于进程来说，其进行上下文切换成本相对较小，但是相对于虚拟线程由于与OS的线程相对应，其其切换成本依然很大。

虚拟线程是一种用户态的线程，其线程切换是通过用户代码，进行操作不存在OS线程的上下文切换。对于虚拟线程来说，一个OS线程可能包含多个虚拟线程。

### 1 使用VirtualThread
