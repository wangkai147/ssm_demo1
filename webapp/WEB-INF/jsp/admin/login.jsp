<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="x-admin-sm">
<head>
    <meta charset="utf-8">
    <title>后台登录-X-admin2.2</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"
          name="viewport"/>
    <meta content="no-siteapp"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/font.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/login.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/xadmin.css">
    <script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/lib/layui/layui.js" charset="utf-8"></script>
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body class="login-bg">

<div class="login layui-anim layui-anim-up">
    <div class="message">乔治的专属小站</div>
    <div id="darkbannerwrap"></div>

    <form class="layui-form" method="post">
        <label>
            <input name="username" placeholder="用户名" type="text" lay-verify="required" class="layui-input">
        </label>
        <hr class="hr15">
        <label>
            <input name="password" lay-verify="required" placeholder="密码" type="password" class="layui-input">
        </label>
        <hr class="hr15">
        <input value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit">
        <hr class="hr20">
    </form>
</div>

<script>
    $(function () {
        layui.use('form', function () {
            const form = layui.form;
            // layer.msg('玩命卖萌中', function(){
            //   //关闭后的操作
            //   });
            //监听提交
            form.on('submit(login)', function (data) {
                // alert(888) -- 弹框
                //data.field代表整个表单的值
                //JSON.stringify(data.field) -- 转换为json串
                ///selectUser
                layer.msg('登录中，请稍后', function () {
                    $.ajax({
                        url: "<%=request.getContextPath()%>/user/login",
                        type: "post",
                        data: ({
                            "username": data.field.username,
                            "password": data.field.password
                        }),
                        dataType: "json",
                        async: true,
                        beforeSend: beforeSend,
                        success: success,
                        error: error
                    })

                    function beforeSend() {
                    }

                    function success(data) {
                        //解析data
                        if (data.code === "2000"){
                            //登录成功
                            layer.msg('登录成功')
                            // window.location.href = 'http://www.baidu.com/';
                            window.location.href="<%=request.getContextPath()%>/page/index";

                        } else if(data.code === "2001") {
                            //密码错误
                            layer.msg('密码错误')

                        } else if(data.code === "2002") {
                            //用户不存在
                            layer.msg('用户不存在')
                        }
                    }
                    function error() {
                        layer.msg('请求错误')
                    }
                });
                return false;
            });
        });
    })
</script>
<!-- 底部结束 -->
<script>
    //百度统计可去掉
    var _hmt = _hmt || [];
    (function () {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    })();
</script>
</body>
</html>