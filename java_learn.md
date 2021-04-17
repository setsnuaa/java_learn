# javaSE

## 第一章 入门

javac:java源程序=>java字节码

命名规范：

包名：小写

类名：首字母大写驼峰

变量、方法名：首字母小写驼峰

## 第二章 IDEA

### 2.1 项目结构

![](D:\code\java_learn\项目结构.png)

项目

​	|——模块

​				|——包

## 第三章 语法

### 3.1 数组

```java
//动态初始化
//每个元素都有默认值
//int=>0;float=>0.0;char=>'\u0000';boolean=>false;引用=>null
int[] arrayA=new int[10];

//静态初始化
int[] arrayB=new int[]{1,2,3};

//省略格式
int[] arrayC={1,2,3};
```

数组作为返回值，返回的是数组的地址，数组本身在堆中不复制。

### 3.2 java内存划分

1.栈（stack）

2.堆（heap）

3.方法区（method area）：存储.class相关信息，包含方法的信息。

4.本地方法栈（native method stack）：与操作系统有关，c语言代码也放这

5.寄存器（pc register）

### 3.3 类

导包：只有java.lang下的内容不需要import，其他包都需要import。

#### 3.3.1 Scanner类

 java.util.Scanner用于输入

```java
public static void main(String[] args) {
        //从键盘输入
        Scanner sc=new Scanner(System.in);
        //输入数字
        int num=sc.nextInt();
        System.out.println("输入的数字是"+num);
    }
```

#### 3.3.2 匿名对象

```java
public static void main(String[] args) {
    //无参构造
    Student stu1=new Student();
    stu1.setName("Stark");
    stu1.setAge(25);
    //含参构造
    Student stu2=new Student("Tony",22);
    System.out.println(stu2);
    //匿名对象
    System.out.println(new Student("Thor",28));
}
```

#### 3.3.3 Random类

```java
public static void main(String[] args) {
    //创建一个Random类
    Random rd=new Random();
    int num1= rd.nextInt();
    //随机数0~9
    int num2= rd.nextInt(10);
    System.out.println("newInt():"+num1);
    System.out.println("netInt(10):"+num2);
}
```

#### 3.3.4 ArrayList类

ArrayList长度可变

`ArrayList<int>`不行，如果要往集合ArrayList当中存储基本类型数据，必须使用基本类型对应的”包装类“。

```java
/*
基本类		  包装类
byte		Byte
short		Short
int			Integer
long		Long
float		Float
double		Double
char		Character
boolean		Boolean
*/
```

#### 3.3.5 String类

常见3+1种：

```java
//三种构造：
public String();
public String(char[] array);
public String(byte[] array);

//一种直接创建
String str4="hello world";
```

