package DAO;

import java.sql.PreparedStatement;
import Modelo.Product;
//Hace el CRUD

public class DAOProduct extends DAOConexion {

    DAOConexion c = new DAOConexion();

    public void Insert(Product objProduct) {
        try {
            String strSQL = "INSERT INTO Product(NameProduct,Units_Available,Price,Description) "
                    + "VALUES (?,?,?,?)";

            PreparedStatement pst = this.AbrirConexion().prepareStatement(strSQL);
            pst.setString(1, objProduct.getNameProduct());
            pst.setString(2, objProduct.getUnits_Availables());
            pst.setDouble(3, objProduct.getPrice());
            pst.setString(4, objProduct.getDescription());
            pst.executeUpdate();
            pst.close();
            this.CerrarConexion();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void Update(int id, String Nombre, String units, double price, String Description) {

        try {
            String strSQL = "UPDATE Product SET  NameProduct=?,Units_Available=?,Price=?,Description=?"
                    + " WHERE idProduct = " + id;

            PreparedStatement pst = this.AbrirConexion().prepareStatement(strSQL);
            pst.setString(1, Nombre);
            pst.setString(2, units);
            pst.setDouble(3, price);
            pst.setString(4, Description);
            pst.executeUpdate();
            pst.close();
            this.CerrarConexion();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }

    public boolean Delete(int intEliminar) {
        PreparedStatement st = null;

        try {

            st = AbrirConexion().prepareStatement("DELETE FROM Product WHERE idProduct = ?");
            st.setInt(1, intEliminar);
            st.executeUpdate();
            st.close();
            return true;
        } catch (Exception ex) {
            String msn = ex.getMessage();
        }
        return false;
    }

    /*public ResultSet ConsultarExistente(String strIdentifacion) throws ClassNotFoundException, SQLException {

        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT count(*) Total FROM Client WHERE idClient = " + strIdentifacion;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }*/
}
