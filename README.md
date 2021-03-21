### <center>SSM框架脚手架</center>
#### 一、基于 Maven 构建的 SSM 框架脚手架
##### 文件目录
```
|-- ssm_demo
    |-- src
        |-- com.wangkai
            |-- controller  # 控制层
            |-- dao         # Dao层
            |-- pojo        # 持久化类
            |-- service     # 业务层
            |-- test        # 测试
            |-- util        # 工具类
    |-- resources
            |-- mapper          # mybatis映射文件
            |-- mybatis         # mybatis配置文件
            |-- properties      # 数据库连接属性和log配置 
            |-- spring          # spring和springmvc配置
    |-- webapp
            |-- css
            |-- fonts
            |-- images
            |-- js
            |-- META-INF
            |-- WEB-INF
                |-- jsp
                    |-- selectUser.jsp
                    |-- showUser.jsp
                |-- web.xml
            |-- index.jsp
    |-- .gitignore                  # Git的提交规则
    |-- pom.xml                     # Maven的依赖坐标
```
#### 二、规划
#### 后续会继续优化和完善
