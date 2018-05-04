package py.com.personal.webvas.utils;

import py.com.personal.webvas.utils.MyEnum.OpType;

public class TransactionEvent {

	public String fecha = "";
	public OpType opType = OpType.INFORMACION;
	public String srcLine = "";
	public String mensajeIn = "";
	public String mensajeOut = "";
	public String msgRsp = "";
	public String responseTime = "";
	public String responseTimePool = "";

	public void clear() {
		opType = null;
		srcLine = null;
		mensajeIn = null;
		mensajeOut = null;
		msgRsp = null;
		responseTime = null;
		responseTimePool = null;
	}
}
