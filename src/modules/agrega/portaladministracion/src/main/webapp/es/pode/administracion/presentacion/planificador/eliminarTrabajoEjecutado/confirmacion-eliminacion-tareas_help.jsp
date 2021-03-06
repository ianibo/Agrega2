<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="eliminar.trabajo.confirmacion.eliminacion.tareas"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="eliminar.trabajo.confirmacion.eliminacion.tareas"/></h1>
        <p>
            <bean:message key="eliminar.trabajo.confirmacion.eliminacion.tareas.online.help"/>
        </p>
        <h2><bean:message key="eliminar.trabajo.confirmacion.eliminacion.tareas.cancelar"/></h2>
        <p>
            <bean:message key="eliminar.trabajo.confirmacion.eliminacion.tareas.cancelar.online.help"/>
        </p>
        <br/>
        <h2><bean:message key="eliminar.trabajo.confirmacion.eliminacion.tareas.aceptar"/></h2>
        <p>
            <bean:message key="eliminar.trabajo.confirmacion.eliminacion.tareas.aceptar.online.help"/>
        </p>
        <br/>
            <table>
                <tr class="even">
                    <th><bean:message key="online.help.inputfield"/></th>
                    <th><bean:message key="online.help.description"/></th>
                </tr>
                <tr class="odd">
                    <td><bean:message key="eliminar.trabajo.confirmacion.eliminacion.tareas.aceptar.param.lista.ids"/></td>
                    <td><bean:message key="eliminar.trabajo.confirmacion.eliminacion.tareas.aceptar.param.lista.ids.online.help"/></td>
                </tr>
            </table>
    </tiles:put>

</tiles:insert>

