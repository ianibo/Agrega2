<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
 

<tiles:insert definition="layout-administrador">

<tiles:put name="title" type="string">
      <bean:message key="title.Comun"/>
</tiles:put>

<tiles:put name="body" type="string">

<%@ include file="/taglib-imports.jspf" %>
<%@ include file="/es/pode/administracion/presentacion/planificador/descripcionTarea/mostrar-informe-fecha-vars.jspf" %>


<!-- ***************************** Inicio CONTENIDO  ****************************** -->
<div class="plantilla_contenido">

	<!-- ## Para que los mensajes de error vayan bien en IE6 ## -->
	<jsp:include page="/layout/messages.jsp" flush="true" />

	<!-- *********************      Cabecera Informe     ************************************ -->

	<h2>
		${form.trabajo}
	</h2>
	
	<!-- ***************************      Inicio del formulario    ************************************ -->

	<html:form styleId="descripcionTareaMostrarInformeFechaVolverForm" action="/DescripcionTarea/MostrarInformeFechaVolver" method="post" >
        
        <!--  INICIO GLOBO GRIS   -->
		<div class="globo_gris" >
			<div class="globo_gris_01">
				<div class="globo_gris_02">
					<div class="globo_gris_03">
						
						<!-- **********************       Inicio caja del formulario        ***********************  -->
						<div id="formulario">
            				
            				<!--  *********************       Caja de Texto de Nombre de Tarea     *******************  -->
            				<div class="fila_de_tabla">
								<div class="contenedor_izquierda">
									<div class="text">
										<label for="nombreTrabajo"><bean:message key="crearTarea.nombreTarea"/></label>
									</div>
								</div>
								<div class="contenedor_derecha">
									<div class="text">
										<input DISABLED name="trabajo" value="${form.trabajo}" id="nombreTrabajo" type="text" style="background-color:white"/>
									</div>
								</div>
								<div class="linea_separadora"></div>
								<br class="oculto" />
							</div>
							
							
							<!--  *********************       Caja de Texto de Grupo de Tarea     *******************  -->
							<div class="fila_de_tabla">
								<div class="contenedor_izquierda">
									<div class="text">
										<label for="grupoTrabajo"><bean:message key="crearTarea.nombreGrupoTrabajo"/></label>
									</div>
								</div>
								<div class="contenedor_derecha">
									<div class="text">
										<input DISABLED name="grupoTrabajo" value="${form.grupoTrabajo}" id="grupoTrabajo" type="text" style="background-color:white"/>
									</div>
								</div>
								<div class="linea_separadora"></div>
								<br class="oculto" />
							</div>
							
					
							<!--  *********************        Tipo de Tarea     *******************  -->
							<div class="fila_de_tabla">
								<div class="contenedor_izquierda">
									<div class="text">
										<label for="tipoTarea"><bean:message key="crearTarea.tipoTarea"/></label>
									</div>
								</div>
								<div class="contenedor_derecha">
									<div class="text">
										<input DISABLED name="tipoTarea" value="<bean:message key="informes.nombre.cabecera"/>" id="tipoTarea" type="text" style="background-color:white"/>
									</div>
								</div>
								<div class="linea_separadora"></div>
								<br class="oculto" />
							</div>
							
							
							<!--  *********************        Tipo de Informe     *******************  -->
							<div class="fila_de_tabla">
								<div class="contenedor_izquierda">
									<div class="text">
										<label for="informe"><bean:message key="informes.nombreInforme"/></label>
									</div>
								</div>
								<div class="contenedor_derecha">
									<div class="text">
										<bean:define id="informeValue"><bean:message key="informes.${form.informe}"/></bean:define>
										<input DISABLED name="informe" value="${informeValue}" id="informe" type="text" style="background-color:white"/>
									</div>
								</div>
								<div class="linea_separadora"></div>
								<br class="oculto" />
							</div>
							
							
							<!--  *********************        Formato     *******************  -->
							<div class="fila_de_tabla">
								<div class="contenedor_izquierda">
									<div class="text">
										<label for="formato"><bean:message key="informes.crearInforme.formato"/></label>
									</div>
								</div>
								<div class="contenedor_derecha">
									<div class="text">
										<bean:define id="formatoValue"><bean:message key="informes.crearInforme.formato.${form.formato}"/></bean:define>
										<input DISABLED name="formato" value="${formatoValue}" id="formato" type="text" style="background-color:white"/>
									</div>
								</div>
								<div class="linea_separadora"></div>
								<br class="oculto" />
							</div>
							
							
							<!--  *********************       Cajas de Texto de Fecha     *******************  -->
							<div class="fila_de_tabla">
								<div class="contenedor_izquierda">
									<div class="text">
										<label for="fecha_inicio"><bean:message key="crearTarea.fechaInicio"/></label>
									</div>
								</div>
								<div class="contenedor_derecha">
									<div class="text">
									
										<label class="oculto" for="fecha_inicio"><bean:message key="crearTarea.fechaDia"/></label>
										<fmt:formatNumber var="dia_format" value="${form.dia}" minIntegerDigits="2" maxIntegerDigits="2" />
										<input DISABLED name="dia" value="${dia_format}"  class="fecha_dia" id="fecha_inicio" type="text" style="background-color:white"/>
										
										<label class="oculto" for="fecha_mes"><bean:message key="crearTarea.fechaMes"/></label>
										<fmt:formatNumber var="mes_format" value="${form.mes}" minIntegerDigits="2" maxIntegerDigits="2" />
										<input DISABLED name="mes" value="${mes_format}" class="fecha_mes" id="fecha_mes" type="text" style="background-color:white"/>
										
										<label class="oculto" for="fecha_anio"><bean:message key="crearTarea.fechaAnio"/></label>	
										<input DISABLED name="anio" value="${form.anio}" class="fecha_anio" id="fecha_anio" type="text" style="background-color:white"/>
										
										<span class="vert"><bean:message key="crearTarea.aLas"/></span>
										
										<label class="oculto" for="fecha_hora"><bean:message key="crearTarea.fechaHora"/></label>
										<fmt:formatNumber var="hora_format" value="${form.hora}" minIntegerDigits="2" maxIntegerDigits="2" />
										<input DISABLED name="hora"  value="${hora_format}" class="fecha_horas" id="fecha_hora" type="text" style="background-color:white"/>
										
										<label class="oculto"  for="fecha_minutos"><bean:message key="crearTarea.fechaMinuto"/></label>
										<fmt:formatNumber var="minutos_format" value="${form.minutos}" minIntegerDigits="2" maxIntegerDigits="2" />
										<input DISABLED name="minutos" value="${minutos_format}" class="fecha_minutos" id="fecha_minutos" type="text" style="background-color:white"/>
										
									</div>
								</div>
								<div class="linea_separadora"></div>
								<br class="oculto" />
							</div>
							
							
							<!--  *********************       Periodicidad     *******************  -->
							<div class="fila_de_tabla">
								<div class="contenedor_izquierda">
									<div class="text">
										<label for="repetir_tipoTarea"><bean:message key="crearTarea.repetir"/></label>
									</div>
								</div>
								<div class="contenedor_derecha">
									<div class="text">
										<bean:define id="periodicidadValue"><bean:message key="crearTarea.${form.periodicidad}"/></bean:define>
					                    <input DISABLED type="text" value="${periodicidadValue}" name="periodicidad" id="repetir_tipoTarea" style="background-color:white"/>
									</div>
								</div>
								<div class="linea_separadora"></div>
								
								<br class="oculto" />
							</div>
							
						
							
							<!--  SI LA TAREA NO TIENE PERIODICIDAD SE MUESTRAN LAS FECHAS DESDE Y HASTA, EN CASO CONTRARIO NO SE MUESTRA  -->
							<c:if test="${form.periodicidad == 'N'}" >
							
							<!--  *********************       Cajas de Texto de Fecha Desde    *******************  -->
							<div class="fila_de_tabla">
								<div class="contenedor_izquierda">
									<div class="text">
										<label for="fecha_inicio"><bean:message key="informes.crearInforme.fechaDesde"/></label>
									</div>
								</div>
								<div class="contenedor_derecha">
									<div class="text">
									
										<label class="oculto" for="fechaDiaDesde"><bean:message key="crearTarea.fechaDia"/></label>
										<input DISABLED name="diaDesde" value="${form.diaDesde}"  class="fecha_dia" maxlength="2" id="fechaDiaDesde" type="text" style="background-color:white" title="<bean:message key="crearTarea.introduzcaDia"/> "  />
										
										<label class="oculto" for="fechaMesDesde"><bean:message key="crearTarea.fechaMes"/></label>
										<input DISABLED name="mesDesde" value="${form.mesDesde}" maxlength="2" class="fecha_mes" id="fechaMesDesde" type="text" style="background-color:white" title="<bean:message key="crearTarea.introduzcaMes"/> "  />
										
										<label class="oculto" for="fechaAnioDesde"><bean:message key="crearTarea.fechaAnio"/></label>	
										<input DISABLED name="anioDesde" value="${form.anioDesde}" maxlength="4" class="fecha_anio" id="fechaAnioDesde" type="text" style="background-color:white" title="<bean:message key="crearTarea.introduzcaAnio"/> "  />
										
									</div>
								</div>
								<div class="linea_separadora"></div>
								<br class="oculto" />
							</div>
							
							
							<!--  *********************       Cajas de Texto de Fecha Hasta     *******************  -->
							<div class="fila_de_tabla">
								<div class="contenedor_izquierda">
									<div class="text">
										<label for="fecha_inicio"><bean:message key="informes.crearInforme.fechaHasta"/></label>
									</div>
								</div>
								<div class="contenedor_derecha">
									<div class="text">
									
										<label class="oculto" for="fechaDiaHasta"><bean:message key="crearTarea.fechaDia"/></label>
										<input DISABLED name="diaHasta" value="${form.diaHasta}"  class="fecha_dia" maxlength="2" id="fechaDiaHasta" type="text" style="background-color:white" title="<bean:message key="crearTarea.introduzcaDia"/> "  />
										
										<label class="oculto" for="fechaMesHasta"><bean:message key="crearTarea.fechaMes"/></label>
										<input DISABLED name="mesHasta" value="${form.mesHasta}" maxlength="2" class="fecha_mes" id="fechaMesHasta" type="text" style="background-color:white" title="<bean:message key="crearTarea.introduzcaMes"/> "  />
										
										<label class="oculto" for="fechaAnioHasta"><bean:message key="crearTarea.fechaAnio"/></label>	
										<input DISABLED name="anioHasta" value="${form.anioHasta}" maxlength="4" class="fecha_anio" id="fechaAnioHasta" type="text" style="background-color:white" title="<bean:message key="crearTarea.introduzcaAnio"/> "  />
										
									</div>
								</div>
								<div class="linea_separadora"></div>
								<br class="oculto" />
							</div>
							
							</c:if>
							
						</div>
						
						<!-- ******************************      Fin caja de formulario     ************************************ -->
						
					</div>
				</div>
			</div>
		</div>
		<!--  FIN GLOBO GRIS   -->
		
		<!-- ******************************      Boton Volver    ********************************** -->
		
		<html:submit titleKey="informeTrabajo.volver" styleClass="boton_125 tipo"   styleId="form_submit" >
			<bean:message key='informeTrabajo.volver'/>
		</html:submit>	
            
            
   	</html:form>
       
       
</div>
<!-- ***************************** FIN  CONTENIDO  ****************************** -->


</tiles:put>
</tiles:insert>  