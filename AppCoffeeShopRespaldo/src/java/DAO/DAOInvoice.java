package DAO;

import java.sql.PreparedStatement;
//Hace el CRUD

public class DAOInvoice extends DAOConexion {

    DAOConexion c = new DAOConexion();

    public void Insert(int idInvoice, String Date_of_issue, double SubTotal, double IVA, double Total, String idClient, String idSeller) {
        try {
            /*
            INSERT INTO `Invoice`(`idInvoice`, `Date_of_issue`, `SubTotal`, `IVA`, `Total`, `Client_idClient`, `Seller_idSeller`)
             */
            String strSQL = "INSERT INTO Invoice(idInvoice,Date_of_issue,SubTotal,IVA,Total,Client_idClient,Seller_idSeller)"
                    + "VALUES (?,?,?,?,?,?,?)";

            PreparedStatement pst = this.AbrirConexion().prepareStatement(strSQL);
            pst.setInt(1, idInvoice);
            pst.setString(2, Date_of_issue);
            pst.setDouble(3, SubTotal);
            pst.setDouble(4, IVA);
            pst.setDouble(5, Total);
            pst.setString(6, idClient);
            pst.setString(7, idSeller);
            pst.executeUpdate();
            pst.close();
            this.CerrarConexion();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void Update(int idInvoice, String Date_of_issue, double SubTotal, double IVA, double Total, String idClient, String idSeller) {

        try {
            String strSQL = "UPDATE  Invoice SET Date_of_issue=?,SubTotal=?,IVA=?,Total=?,Client_idClient=?,Seller_idSeller=?"
                    + " WHERE  idInvoice = " + idInvoice;

            PreparedStatement pst = this.AbrirConexion().prepareStatement(strSQL);
            pst.setString(1, Date_of_issue);
            pst.setDouble(2, SubTotal);
            pst.setDouble(3, IVA);
            pst.setDouble(4, Total);
            pst.setString(5, idClient);
            pst.setString(6, idSeller);
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
            /*
            DELETE FROM `Invoice` WHERE 0
            */
            st = AbrirConexion().prepareStatement("DELETE FROM Invoice WHERE idInvoice = ?");
            st.setInt(1, intEliminar);
            st.executeUpdate();
            st.close();
            return true;
        } catch (Exception ex) {
            String msn = ex.getMessage();
        }
        return false;
    }
    
    /////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////
    
    public void MaMIPInsert(int idInvoice,int idProduct) {
        try {
            
            String strSQL = "INSERT INTO Invoice_has_Product(Invoice_idInvoice,Product_idProduct)"
                    + "VALUES (?,?)";

            PreparedStatement pst = this.AbrirConexion().prepareStatement(strSQL);
            pst.setInt(1, idInvoice);
            pst.setInt(2, idProduct);
            pst.executeUpdate();
            pst.close();
            this.CerrarConexion();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void MaMIPUpdate(int idInvoice,int idProduct) {

        try {
            String strSQL = "UPDATE  Invoice_has_Product SET Product_idProduct=?"
                    + " WHERE  Invoice_idInvoice = " + idInvoice;

            PreparedStatement pst = this.AbrirConexion().prepareStatement(strSQL);
            pst.setInt(1, idInvoice);
            pst.setInt(2, idProduct);
            pst.executeUpdate();
            pst.close();
            this.CerrarConexion();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }

    public boolean MaMIPDelete(int intEliminar) {
        PreparedStatement st = null;

        try {
            /*
            DELETE FROM `Invoice` WHERE 0
            */
            st = AbrirConexion().prepareStatement("DELETE FROM Invoice_has_Product WHERE Invoice_idInvoice = ?");
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
