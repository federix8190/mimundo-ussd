package py.com.personal.webvas.mimundoussd;

public class MiMundoConfiguration {
	public String _urlWs;

	public String _timezone;
	public String _timeGMT;
	// Gateway 1
	public String _ussdSystemId;
	public String _ussdPassword;
	public String _ussdHost;
	public Integer _ussdPort;
	// Gateway 1
	public String _ussdSystemId_1;
	public String _ussdPassword_1;
	public String _ussdHost_1;
	public Integer _ussdPort_1;
	// Gateway 2
	public String _ussdSystemId_2;
	public String _ussdPassword_2;
	public String _ussdHost_2;
	public Integer _ussdPort_2;
	// Gateway 2
	public String _ussdSystemId_3;
	public String _ussdPassword_3;
	public String _ussdHost_3;
	public Integer _ussdPort_3;

	public String _shortNumber;

	public String _logFile;
	public String _ussdPacketslogFile;

	public String _jdbcUrlOracle;
	public String _oracleUser;
	public String _oraclePassword;
	public Integer _jdbcOraclePoolCount;

	public String _jdbcUrlMsSql;
	public String _mssqlUser;
	public String _mssqlPassword;
	public Integer _jdbcMsSqlPoolCount;

	public Long _refreshCacheEvery_minutes;

	public String _tnsadminpath;
	public String _loggerUrl;
	public String _loggerAppName;
	public String _loggerNroApp;

	public String _userWs;
	public String _passWs;
	public String _appWs;

	// Parte de Menu.
	public String _menuTitleMiMundo;
	public String _menuPrincipal;
	public String _menuMiLinea;
	public String _menuClub;
	public String _menuClave;
	public String _menuSuspension;
	public String _menuTelefono;
	public String _menuRecarga;
	public String _menuServicios;

	public String _menuRbt;
	public String _menuDestinos;
	public String _menuFatel;

	// Parte mensajes.
	public String _msjCanje;
	public String _msjError;
	public String _msjErrorSuspencion;
	public String _msjErrorRestitucion;

	public String _msjConfigOK;
	public String _msjSuspExitosa;
	public String _msjParamIncorrecto;
	public String _msjTicketOK;
	public String _msjPuntosRecarga;
	public String _msjDesbloqueo;

	public String _msjrecargaConfirmacion;
	public String _msjCancelar;
	public String _msjExitosa;

	public String _msjMisRbt;
	public String _msjMisRbtComprar;

	public String _codigoPacks;
	public String _smsMusica;
	public String _smsVideo;
	public String _facturaServ;

	public String _menuIlimitado;

	public String _msjMusicaVideo;
	public String _msjUrlVideo;
	public String _msjUrlMusica;

	public String _msjMisDestinos;
	public String _msjSinFactura;

	public String _menuClubPuntos;

	public String _msjSaldoVencido;
	// Fatel
	public String _msjIngreseMail;
	public String _msjConfirmarMail;
	public String _msjFacturaFisica;
	public String _msjMailNoCoincide;
	public String _msjBajaConfirmacion;
	public String _msjSinServContraFac;

	public String _msjNoPuede;
	public String _msjNoPuedeDias;

	public String _contraFactServ;
	public String _p2pServ;
	public String _p2pServDes;
	public String _p2pTope;

	public String _p2pFullServ;
	public String _p2pFullServDes;
	public String _p2pFullTope;

	// Nuevos mensajes SOS
	public String _msjConfirmarPrestame;
	public String _msjConfirmarPrestameSinCosto;

	// Menu multiplicate.-
	public String _menuMultiplicate;

	public String _noMostrar;

	public static final MiMundoConfiguration instance = new MiMundoConfiguration();
}
