<%--
  Created by IntelliJ IDEA.
  User: z00498ta
  Date: 3/2/2022
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://s3.pstatp.com/cdn/expire-1-M/jquery/3.3.1/jquery.min.js"></script>
    <script type="text/javascript">
        $(function () {
            var user = {
                "id":1,
                "name":"shaowenhao"
            };
                $.ajax({
                    url:"data/json",
                    data:JSON.stringify(user),
                    type:"POST",
                    contentType:"applocation/json;charset=UTF-8",
                    dataType:"JSON",
                    success:function (data) {
                        alert(data.id+"--"+data.name)
                    }
                })
        }
        );

    </script>
</head>
<body>

</body>
</html>
