package DAO;

import java.sql.PreparedStatement;
import DAO.Cliente;
import DAO.DAOConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//Hace el CRUD

public class DAOCliente extends DAOConexion {

    DAOConexion c = new DAOConexion();

    public ResultSet Select() throws SQLException, ClassNotFoundException {
        // Abre la conexion
        Statement consulta = this.AbrirConexion().createStatement();
        // cadena que al macen la consulta que se quiere hacer en la base
        String sentencia = "SELECT idClient,Name,LastName,Email,phoneNumber,Address FROM Client";
        // se retorna sentencia para ejecutar la consulta: return consulta.executeQuery(sentencia);

        return consulta.executeQuery(sentencia);
    }

    public void Insert(Cliente objCliente) {
        try {
            String strSQL = "INSERT INTO Client(idClient,Name,LastName,Email,phoneNumber,Address)"
                    + "VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = this.AbrirConexion().prepareStatement(strSQL);
            pst.setString(1, objCliente.getIdCliente());
            pst.setString(2, objCliente.getName());
            pst.setString(3, objCliente.getLastName());
            pst.setString(4, objCliente.getEmail());
            pst.setString(5, objCliente.getPhoneNumbre());
            pst.setString(6, objCliente.getAddress());
            pst.executeUpdate();
            pst.close();
            this.CerrarConexion();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void Update(String id, String name, String lastname, String email, String phone, String address) {

        try {
            String strSQL = "UPDATE Client SET  Name=?,LastName=?,Email=?,phoneNumber=?,Address=?"
                    + " WHERE idClient = " + id;
            PreparedStatement pst = this.AbrirConexion().prepareStatement(strSQL);
            pst.setString(1, name);
            pst.setString(2, lastname);
            pst.setString(3, email);
            pst.setString(4, phone);
            pst.setString(5, address);
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

            st = AbrirConexion().prepareStatement("DELETE FROM Client WHERE idClient = ?");
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
