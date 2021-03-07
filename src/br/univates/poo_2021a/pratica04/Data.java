package br.univates.poo_2021a.pratica04;

import lombok.Getter;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author NandoFilter
 * @date 03/07/2021
 */

@Getter
@Setter
public class Data {

    SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy"); // Formato Data
    SimpleDateFormat timeFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // Formato Data com Hora

    Calendar calendar = Calendar.getInstance();
    Date date = calendar.getTime(); // Data Atual

    public String getCustomData(int dia, int mes, int ano) {
        Calendar customCalendar = Calendar.getInstance();
        customCalendar.set(ano, mes, dia);

        Date data = customCalendar.getTime(); // Pegar info do Calendar
        return simpleFormat.format(data); // Convertendo Formato
    }

    public String getDataAtualHora(){
        return timeFormat.format(date);
    }

    public String getDataAtual() {
        return simpleFormat.format(date);
    }
}