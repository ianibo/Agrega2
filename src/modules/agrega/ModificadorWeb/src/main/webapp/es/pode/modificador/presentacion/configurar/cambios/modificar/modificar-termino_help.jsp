<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="modificar.termino.modificar.termino"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="modificar.termino.modificar.termino"/></h1>
        <p>
            <bean:message key="modificar.termino.modificar.termino.online.help"/>
        </p>
        <h2><bean:message key="modificar.termino.modificar.termino.select.action"/></h2>
        <p>
            <bean:message key="modificar.termino.modificar.termino.select.action.online.help"/>
        </p>
        <br/>
            <table>
                <tr class="even">
                    <th><bean:message key="online.help.inputfield"/></th>
                    <th><bean:message key="online.help.description"/></th>
                </tr>
                <tr class="odd">
                    <td><bean:message key="modificar.termino.modificar.termino.select.action.param.alcance.termino"/></td>
                    <td><bean:message key="modificar.termino.modificar.termino.select.action.param.alcance.termino.online.help"/></td>
                </tr>
                <tr class="even">
                    <td><bean:message key="modificar.termino.modificar.termino.select.action.param.alcance.metadatos"/></td>
                    <td><bean:message key="modificar.termino.modificar.termino.select.action.param.alcance.metadatos.online.help"/></td>
                </tr>
                <tr class="odd">
                    <td><bean:message key="modificar.termino.modificar.termino.select.action.param.action"/></td>
                    <td><bean:message key="modificar.termino.modificar.termino.select.action.param.action.online.help"/></td>
                </tr>
                <tr class="even">
                    <td><bean:message key="modificar.termino.modificar.termino.select.action.param.expr.reg"/></td>
                    <td><bean:message key="modificar.termino.modificar.termino.select.action.param.expr.reg.online.help"/></td>
                </tr>
                <tr class="odd">
                    <td><bean:message key="modificar.termino.modificar.termino.select.action.param.valor.viejo"/></td>
                    <td><bean:message key="modificar.termino.modificar.termino.select.action.param.valor.viejo.online.help"/></td>
                </tr>
                <tr class="even">
                    <td><bean:message key="modificar.termino.modificar.termino.select.action.param.valor.nuevo"/></td>
                    <td><bean:message key="modificar.termino.modificar.termino.select.action.param.valor.nuevo.online.help"/></td>
                </tr>
                <tr class="odd">
                    <td><bean:message key="modificar.termino.modificar.termino.select.action.param.idioma"/></td>
                    <td><bean:message key="modificar.termino.modificar.termino.select.action.param.idioma.online.help"/></td>
                </tr>
            </table>
        <h2><bean:message key="modificar.termino.modificar.termino.buscar"/></h2>
        <p>
            <bean:message key="modificar.termino.modificar.termino.buscar.online.help"/>
        </p>
        <br/>
            <table>
                <tr class="even">
                    <th><bean:message key="online.help.inputfield"/></th>
                    <th><bean:message key="online.help.description"/></th>
                </tr>
                <tr class="odd">
                    <td><bean:message key="modificar.termino.modificar.termino.buscar.param.idioma.buscador"/></td>
                    <td><bean:message key="modificar.termino.modificar.termino.buscar.param.idioma.buscador.online.help"/></td>
                </tr>
                <tr class="even">
                    <td><bean:message key="modificar.termino.modificar.termino.buscar.param.tipo.busqueda"/></td>
                    <td><bean:message key="modificar.termino.modificar.termino.buscar.param.tipo.busqueda.online.help"/></td>
                </tr>
            </table>
    </tiles:put>

</tiles:insert>
