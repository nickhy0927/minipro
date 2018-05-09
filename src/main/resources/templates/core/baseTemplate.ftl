<#assign basePath = req.contextPath />
<#macro htmlHead title charset="utf-8" lang="zh-CN">
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>${title}</title>
        <link rel="stylesheet" type="text/css" href="${basePath}/lib/css/style.css">
        <#nested>
    </head>
</#macro>
<#macro htmlBody>
    <body>
        <#nested>
    </body>
</html>
</#macro>