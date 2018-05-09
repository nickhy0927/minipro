<#include "../../core/baseTemplate.ftl"/>
<@htmlHead title="用户列表">
   <script type="text/javascript">
       console.log('freemarker 模板日志');
   </script>
</@htmlHead>
<@htmlBody>
    <#list users as user>
        <div>${user.lastLoginTime?string('yyyy-MM-dd HH:mm:ss')}</div>
    </#list>
</@htmlBody>