@echo off
javac -encoding GBK src/demo1/*.java
java -cp src demo1.Tetris
del src\demo1\*.class
pause

:: 运行需要Java环境
:: 条件具备可在idea上导入FK执行Tetris，bat文件实测有卡顿
:: 开发环境为idea/Java21
