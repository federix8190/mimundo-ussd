package py.personal.webvas.packs.core.utils;


import java.text.Normalizer;

public class EsmeTextConverter {

    public String convert(String input) {
        return Normalizer.normalize(input, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}
