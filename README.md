# 简单绘图语言的解释器
Project of Compile Principle in XDU, a interpreter for a simple draw language

支持语句：

```php
size is 10 * 0.5; // 设置 dot 大小
color is 1; // 设置颜色
origin is (20, 30); // 设置原点
scale is (5, 5); // 设置 x 轴 y 轴 缩放比例
for t from 0 to 80 step 1 draw(t, sin(t)); // for 绘制语句，画出正弦函数
```

运行程序：`python3 draw.py ./test_file/fn.txt`

运行结果（源代码见 `./test_file/fn.txt`）：

![Functions](/Users/tobiaslee/GitHub/Draw-Language-Interpreter/img/function.png)

文件组成：

`lexer.py`：词法分析器

`parser.py`：语法分析器，在产生语法树的同时执行相应的语义动作。

