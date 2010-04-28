<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="inicio.catalogador.error.jsp"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="inicio.catalogador.error.jsp"/></h1>
        <p>
            <bean:message key="inicio.catalogador.error.jsp.online.help"/>
        </p>
        <h2><bean:message key="inicio.catalogador.error.jsp.salida"/></h2>
        <p>
            <bean:message key="inicio.catalogador.error.jsp.salida.online.help"/>
        </p>
        <br/>
    </tiles:put>

</tiles:insert>

