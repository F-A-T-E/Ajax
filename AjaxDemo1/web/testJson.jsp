<%--
  Created by IntelliJ IDEA.
  User: lpf18
  Date: 2021/8/31
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        /*
         *JSON格式创建对象
         * {"属性名"：”属性值“，”属性名“：”属性值“}
         *
         */
 /*       var person={"name":"zhangsan","age":10}
        alert(person.name)
        alert(person.age)*/

 /*       var persons = [{"name":"zhangsan","age":10},{"name":"zhangsan","age":10},{"name":"zhangsan","age":10}];

        for(var i = 0; i < persons.length; i++){
            var person = persons[i];
            console.log(person.name);
            console.log(person.age);
        }*/
        var personStr = '{"name":"zahngsan","age":10}';// 是一个字符串
    //    可以直接把上面这种格式的字符串直接转换成对象
        var p = JSON.parse(personStr);
        console.log(p.name)
        console.log(p.age)
    </script>
</head>
<body>

</body>
</html>
