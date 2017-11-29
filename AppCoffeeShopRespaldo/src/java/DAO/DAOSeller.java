package DAO;

import java.sql.PreparedStatement;
import DAO.Cliente;
//Hace el CRUD

public class DAOSeller extends DAOConexion {

    DAOConexion c = new DAOConexion();

    public void Insert(Seller objSeller) {
        try {
            String strSQL = "INSERT INTO Seller(idSeller,Name,LastName,phoneNumber)"
                    + "VALUES (?,?,?,?)";

            PreparedStatement pst = this.AbrirConexion().prepareStatement(strSQL);
            pst.setString(1, objSeller.getIdCliente());
            pst.setString(2, objSeller.getName());
            pst.setString(3, objSeller.getLastName());
            pst.setString(4, objSeller.getPhoneNumbre());
            pst.executeUpdate();
            pst.close();
            this.CerrarConexion();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void Update(String id, String name, String lastname, String phone) {

        try {
            String strSQL = "UPDATE Seller SET  Name=?,LastName=?,phoneNumber=?"
                    + " WHERE idSeller = " + id;

            PreparedStatement pst = this.AbrirConexion().prepareStatement(strSQL);
            pst.setString(1, name);
            pst.setString(2, lastname);
            pst.setString(3, phone);
            pst.executeUpdate();
            pst.close();
            this.CerrarConexion();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }

    public boolean Delete(String intEliminar) {
        PreparedStatement st = null;

        try {

            st = AbrirConexion().prepareStatement("DELETE FROM Seller WHERE idSeller = ?");
            st.setString(1, intEliminar);
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
