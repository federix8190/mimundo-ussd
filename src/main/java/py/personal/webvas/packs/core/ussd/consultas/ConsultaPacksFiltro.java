package py.personal.webvas.packs.core.ussd.consultas;

import java.util.ArrayList;
import java.util.List;

import py.personal.webvas.packs.core.ussd.consultas.ConsultaPacksModel.Pack;
import py.personal.webvas.packs.core.ussd.consultas.ConsultaPacksModel.ServicioTasable;

public class ConsultaPacksFiltro {

	private ConsultaPacksModel.Pack[] packs;

	private String[] agrupadores;
	
	private String codigoPack;

	public ConsultaPacksFiltro(ConsultaPacksModel.Pack[] packs, String agrupadores[]) {
		this.packs = packs;
		this.agrupadores = agrupadores;
	}
	
	public ConsultaPacksFiltro(ConsultaPacksModel.Pack[] packs, String codigoPack, String agrupadores[]) {
		this.packs = packs;
		this.agrupadores = agrupadores;
		this.codigoPack = codigoPack;
	}

	/**
	 * filtra los packs en base codigo y/o los agrupadores de los servicios tasables.
	 * @return lista de packs filtrados.
	 */
	public ConsultaPacksModel.Pack[] filtrar() {
		List<Pack> listaPacks = new ArrayList<Pack>();
		for(final ConsultaPacksModel.Pack pack : this.packs) {
			
			/**
			 * filtro por codigo de pack.
			 */
			if(this.codigoPack != null) {
				if(!this.codigoPack.equals(pack.getCodigo()))
					continue;
			}

			final ServicioTasable[] stFiltrados = filtrar(pack.getServiciosTasables());
			
			if(stFiltrados.length == 0)
				continue;
			
			listaPacks.add(new Pack() {
				
				public ServicioTasable[] getServiciosTasables() {
					return stFiltrados;
				}
				
				public String getDescripcion() {
					return pack.getDescripcion();
				}
				
				public String getCodigo() {
					return pack.getCodigo();
				}
				
				public String getClasificador() {
					return pack.getClasificador();
				}
			});
		}
		return listaPacks.toArray(new Pack[listaPacks.size()]);
	}

	/**
	 * filtra los servicios tasables.
	 * @param servicioTasables servicios tasables del pack.
	 * @return servicios tasables habilitados.
	 */
	private ConsultaPacksModel.ServicioTasable[] filtrar(ServicioTasable[] servicioTasables) {
		List<ServicioTasable> listaServiciosTasables = new ArrayList<ServicioTasable>();
		for(ServicioTasable st : servicioTasables) {
			if(excluir(st.getAgrupador()))
				continue;
			listaServiciosTasables.add(st);
		}
		return listaServiciosTasables.toArray(new ServicioTasable[listaServiciosTasables.size()]);
	}

	/**
	 * verifica si el agrupador del servicio tasable es candidado a exclusion.
	 * @param agrupador agrupador del servicio tasable
	 * @return true para exclusion o false.
	 */
	private boolean excluir(String agrupador) {
		for(String agr : this.agrupadores) {
			if(agr.equals(agrupador))
				return true;
		}
		return false;
	}
}