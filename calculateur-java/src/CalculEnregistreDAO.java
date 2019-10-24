import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CalculEnregistreDAO implements CalculSQL {

    private Connection connection = null;

    public CalculEnregistreDAO() {
            this.connection = ConnexionBDD.getInstance().getConnection();
    }

    public void modificationCompleteCalcul(CalculEnregistre calculEnregistre) {
        System.out.println("CalculEnregistreDAO.modificationCompleteCalcul()");
        try {
            PreparedStatement requetePourModifierCalcul = connection.prepareStatement(SQL_MISE_A_JOUR_COMPLETE_CALCUL);
            //requetePourModifierCalcul.setDate(1, calculEnregistre.getDateDebut());
            //requetePourModifierCalcul.setDate(2, calculEnregistre.getDateFin());
            requetePourModifierCalcul.setFloat(3, calculEnregistre.getFrequence());
            requetePourModifierCalcul.setFloat(4, calculEnregistre.getValeur());
            requetePourModifierCalcul.setInt(5, calculEnregistre.getIdTypeDonneeMesuree());
            requetePourModifierCalcul.setInt(6, calculEnregistre.getIdTypeCalcul());
            requetePourModifierCalcul.setBoolean(7, calculEnregistre.isPrevu());
            requetePourModifierCalcul.setString(8, calculEnregistre.getCheminFichierXML());
            requetePourModifierCalcul.setString(9, calculEnregistre.getEtiquette());
            requetePourModifierCalcul.setBoolean(10, calculEnregistre.isEnregistre());
            requetePourModifierCalcul.setLong(11, calculEnregistre.getIdCalculEnregistre()); //WHERE CLAUSE

            System.out.println("SQL : " + SQL_MISE_A_JOUR_COMPLETE_CALCUL);
            requetePourModifierCalcul.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void modifierValeurCalcul(CalculEnregistre calculEnregistre) {
        System.out.println("CalculEnregistreDAO.modifierValeurCalcul()");
        try {
            PreparedStatement requetePourModifierCalcul = connection.prepareStatement(SQL_MISE_A_JOUR_COMPLETE_CALCUL);
            requetePourModifierCalcul.setFloat(1, calculEnregistre.getValeur());
            requetePourModifierCalcul.setLong(2, calculEnregistre.getIdCalculEnregistre()); //WHERE CLAUSE

            System.out.println("SQL : " + SQL_MISE_A_JOUR_VALEUR_CALCUL);
            requetePourModifierCalcul.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
