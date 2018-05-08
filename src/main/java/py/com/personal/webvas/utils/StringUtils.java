package py.com.personal.webvas.utils;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class StringUtils {
    
    public static String formatMonto(Double monto) {
        NumberFormat formatter = NumberFormat.getIntegerInstance(new Locale("es", "PY"));
        String res = formatter.format(monto);
        res = res + "Gs.";
        return res;
    }
    
    public static String formatFecha(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fecha);
    }
    
}
