<%@ include file="/taglib-imports.jspf" %>

<tiles:insert definition="help.layout">

    <tiles:put name="title" type="string">
        <bean:message key="online.help.title"/>
        <bean:message key="agrega.slider.filtro.keywords"/>
    </tiles:put>

    <tiles:put name="body" type="string">
        <h1><bean:message key="agrega.slider.filtro.keywords"/></h1>
        <p>
            <bean:message key="agrega.slider.filtro.keywords.online.help"/>
        </p>
        <h2><bean:message key="agrega.slider.filtro.keywords.siguiente"/></h2>
        <p>
            <bean:message key="agrega.slider.filtro.keywords.siguiente.online.help"/>
        </p>
        <br/>
            <table>
                <tr class="even">
                    <th><bean:message key="online.help.inputfield"/></th>
                    <th><bean:message key="online.help.description"/></th>
                </tr>
                <tr class="odd">
                    <td><bean:message key="agrega.slider.filtro.keywords.siguiente.param.idiomas.combo"/></td>
                    <td><bean:message key="agrega.slider.filtro.keywords.siguiente.param.idiomas.combo.online.help"/></td>
                </tr>
                <tr class="even">
                    <td><bean:message key="agrega.slider.filtro.keywords.siguiente.param.keywords"/></td>
                    <td><bean:message key="agrega.slider.filtro.keywords.siguiente.param.keywords.online.help"/></td>
                </tr>
            </table>
    </tiles:put>

</tiles:insert>

