package py.personal.webvas.packs.core.ussd.consultas;

import org.x2jb.bind.Binding;

interface ConsultaPacksModel {
	
	@Binding(nodeName="pack", isNodeUnique=false)
	Pack[] getPacks();
	
	interface Pack {
		
		@Binding(nodeName="codigo", isElementNode=false)
		String getCodigo();
		
		@Binding(nodeName="clasificador", isElementNode=false)
		String getClasificador();
		
		@Binding(nodeName="descripcion", isElementNode=false, isNodeMandatory=false)
		String getDescripcion();
		
		@Binding(nodeName="servicioTasable", isNodeUnique=false)
		public ServicioTasable[] getServiciosTasables();
	}

	interface ServicioTasable {

		@Binding(nodeName="agrupador", isElementNode=false)
		String getAgrupador();
		
		@Binding(nodeName="contador", isNodeUnique=false, isNodeMandatory=false)
		Contador[] getContadores();

		@Binding(nodeName="actualizacion")
		FechaHora getElementoActualizacion();
		
		@Binding(nodeName="vencimiento", isNodeMandatory=false)
		FechaHora getElementoVencimiento();


		interface Contador {

			@Binding(nodeName="cantidad")
			long getCantidad();

			@Binding(nodeName="cantidad")
			Cantidad getElementoCantidad();

			@Binding(nodeName="reinicio", isNodeMandatory=false)
			FechaHora getReinicio();
			
			
			interface Cantidad {

				@Binding(nodeName="limite", isElementNode=false)
				long getLimite();
				
				@Binding(nodeName="tipo_limite", isElementNode=false)
				String getTipoLimite();
				
				@Binding(nodeName="unidad", isElementNode=false)
				String getUnidad();
			}
		}
	}

	interface FechaHora {

		@Binding(nodeName="fecha", isElementNode=false)
		String getFecha();

		@Binding(nodeName="hora", isElementNode=false)
		String getHora();
	}
}