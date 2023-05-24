
package ModeloDAO;

import Config.Conexion;
import Intefaces.CRUDrol;
import Modelo.Rol;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RolDAO implements CRUDrol{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Rol r=new Rol();
    
    @Override
    public List listar() {
        ArrayList<Rol>list=new ArrayList<>();
        String sql="select * from rol";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Rol rol=new Rol();
                rol.setId_rol(rs.getString("id_rol"));
                rol.setDesc_rol(rs.getString("desc_rol"));
                list.add(rol);
            }
        } catch (Exception e) {
        }
        return list;
    }

    
    @Override
    public Rol list(int id) {
        String sql="select * from rol where Id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                r.setId_rol(rs.getString("id_rol"));
                r.setDesc_rol(rs.getString("desc_rol"));
                
            }
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public boolean add(Rol rol) {
       String sql="insert into rol(id_rol, desc_rol)values('"+rol.getId_rol()+"','"+rol.getDesc_rol()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Rol rol) {
        String sql="update persona set id_rol='"+rol.getId_rol()+"',desc_rol='"+rol.getDesc_rol()+"'where id_rol="+rol.getId_rol();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql="delete from rol where Id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}

