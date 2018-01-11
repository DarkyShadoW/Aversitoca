package aversitoca.aversitoca;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by josyt on 09/01/2018.
 */

public class DatabaseForm {
    public static final String DB_NAME = "timeline_db";
    public static final int DB_VERSION = 2;
    public static final String TABLE = "status";
    public static final String DEFAULT_SORT = Column.ID + " DESC";

    //Constantes del content provider
    public static final String AUTHORITY = "aversitoca.aversitoca.StatusProvider";
    public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/" + TABLE);
    public static final int STATUS_ITEM = 1;
    public static final int STATUS_DIR = 2;



    public class Column{
        public static final String ID = BaseColumns._ID;
        public static final String BOLETO = "boleto";
        public static final String PREMIO = "premio";
        public static final String SORTEO = "sorteo";
        // 0 si no se ha comprobado
        public static final String COMPROBADO = "comprobado";
        // Valor 0 el sorteo no ha comenzado aún
        // Valor 1 ha empezado (la lista se carga poco a poco)
        // Valor 2 el sorteo ha terminado y la lista de premios es correcta (pero no oficial)
        // Valor 3 ha terminado y existe lista oficial en PDF
        // Valor 4 (lista definitiva de premios basada en oficial)
        public static final String CELEBRADO = "celebrado";
    }
}

