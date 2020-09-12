# 咕泡学院学习笔记

# part_one: 架构师的内功

## 1.设计模式:  
### 工厂模式
### 原型模式
* **使用场景**: 类初始化消耗资源太多,循环体中生成大量的对象,new对象繁琐
### 代理模式
* **静态代理** :
* **动态代理** :
  * jdk代理:  读取接口的信息
  * cglib: 通过子类扫描父类的方法达到动态代理
  * jdk和cglib的比较: JDK是读取接口信息,cglib是生成子类,实现代码增强;JDK必须实现一个接口,cglib可以代理任何一个
        对象;cglib生成逻辑更复杂,效率更快,不需要反射调用,jdk生成简单,但是效率低;
  * 缺点: cglib不能代理final的方法 
* **spring中的代理** :
   - proxyfactorybean中的getObject() 
* UML: ![代理模式](https://whnoteimage.oss-cn-qingdao.aliyuncs.com/%E4%BB%A3%E7%90%86%E6%A8%A1%E5%BC%8FUML.png)   

### 单例模式

### 委派模式
* **用法**: 负责任务的调度和分配,代理模式注重过程,委派模式注重结果
* UML: ![委派模式](https://whnoteimage.oss-cn-qingdao.aliyuncs.com/%E5%A7%94%E6%B4%BE%E6%A8%A1%E5%BC%8FUML.png)   

### 策略模式
*   定义: 定义了算法家族,封装算法,让算法的变化 不影响用户,可以避免多重的if..else..和switch语句
*  适用场景: 
    * 系统中有很多类,而他们的区别仅仅在于他们的行为不同
    * 一个系统需要动态的在几种算法中选择一种 
* UML: ![策略模式](https://whnoteimage.oss-cn-qingdao.aliyuncs.com/%E7%AD%96%E7%95%A5%E6%A8%A1%E5%BC%8FUML.png)        
### 模板模式
* 场景: 一次性实现一个算法不变的部分,并将可变的行为留给子类来实现;各子类中公共的行为被提取出来并集中到一个公共的父类中,从而避免代码重复
* UML: ![模板模式](https://whnoteimage.oss-cn-qingdao.aliyuncs.com/%E6%A8%A1%E6%9D%BF%E6%A8%A1%E5%BC%8F.png)
* 优点: 提高代码的复用性,扩展性,符合开闭原则
* 缺点: 类的数目增加,复杂度提高,父类添加新的方法,子类需要改 一遍

### 适配器模式
* 定义:将一个类的接口 转化为客户期望的另一个接口,使原本的接口兼容现在的
* UML: ![适配器模式](https://whnoteimage.oss-cn-qingdao.aliyuncs.com/%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8FUML.png
)
### 装饰者模式
* 需求: 有重构项目的需求;swing开发
* 定义:再不改变原有对象的基础上,将功能附加到对象上,比继承更加有弹性的替代方案
* 优点:  对继承的有力补充,不改变原有对象的情况动态给一个对象扩展;完全符合开闭原则;通过对不同的装饰类的排列组合实现不同的效果
* 缺点: 会出现更多的代码,更多的类,增加程序的复杂性;多层装饰时会更加复杂




### 观察者模式
* 对象之间的一对多的依赖,让多个观察者对象同时监听一个主体对象,当主体对象发生变化时,他的所有依赖者,都会收到通知并更新


## 总结
```text


```

# part_two: 架构师的审美观
## spring

### spring mvc
```
DispatchServlet extend HttpServlet
    init() --> 初始化方法
    service()  --> 浏览器输入url的时候，会从web容器调用 doGet 或者 doPost方法
    destroy()  --> 销毁的方法


```


