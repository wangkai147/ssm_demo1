### <center>SSM框架脚手架</center>
#### 一、基于 Maven 构建的 SSM 框架脚手架
##### 文件目录
```
|-- Scaffolding
    |-- src
        |-- main
            |-- java
                |-- com.lcc
                    |-- controller  # 控制层
                    |-- dao         # Dao层
                    |-- entity      # 持久化类
                    |-- service     # 业务层
            |-- resources
                |-- mapper          # mybatis映射文件
                |-- mybatis         # mybatis配置文件
                |-- properties      # 数据库连接属性和log配置 
                |-- spring          # spring和springmvc配置
            |-- webapp
                |-- pages
                |-- static          # 静态文件
                |-- WEB-INF
                    |-- web.xml
        |-- test                    # 测试
    |-- .gitignore                  # Git的提交规则
    |-- pom.xml                     # Maven的依赖坐标
```
#### 二、规划
#### 后续将会把shiro集成到脚手架，分别添加EasyUI和LayUI版本的分支