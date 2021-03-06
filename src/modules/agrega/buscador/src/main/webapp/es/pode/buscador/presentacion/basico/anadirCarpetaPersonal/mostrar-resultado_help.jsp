<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="anadir.carpeta.personal.cu.mostrar.resultado"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="anadir.carpeta.personal.cu.mostrar.resultado"/></h1>
        <p>
            <bean:message key="anadir.carpeta.personal.cu.mostrar.resultado.online.help"/>
        </p>
        <h2><bean:message key="anadir.carpeta.personal.cu.mostrar.resultado.resultado"/></h2>
        <p>
            <bean:message key="anadir.carpeta.personal.cu.mostrar.resultado.resultado.online.help"/>
        </p>
        <br/>
            <table>
                <tr class="even">
                    <th><bean:message key="online.help.inputfield"/></th>
                    <th><bean:message key="online.help.description"/></th>
                </tr>
                <tr class="odd">
                    <td><bean:message key="anadir.carpeta.personal.cu.mostrar.resultado.resultado.param.identificador.ode"/></td>
                    <td><bean:message key="anadir.carpeta.personal.cu.mostrar.resultado.resultado.param.identificador.ode.online.help"/></td>
                </tr>
                <tr class="even">
                    <td><bean:message key="anadir.carpeta.personal.cu.mostrar.resultado.resultado.param.idioma.ode"/></td>
                    <td><bean:message key="anadir.carpeta.personal.cu.mostrar.resultado.resultado.param.idioma.ode.online.help"/></td>
                </tr>
            </table>
    </tiles:put>

</tiles:insert>

