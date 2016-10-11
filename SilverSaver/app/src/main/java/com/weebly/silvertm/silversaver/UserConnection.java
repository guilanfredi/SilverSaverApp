package com.weebly.silvertm.silversaver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by LUCAS on 08/10/2016.
 */

public class UserConnection {

    private final ConnectionPost conpost = new ConnectionPost();

    public User buscaPorEmail(String email, String senha) {
        Connection connection = conpost.getConnection();
        User user = new User();
        PreparedStatement stmt;
        try {
            stmt = connection.prepareStatement("select * from Usuario where email=? and senha=?");
            stmt.setString(1, email);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                user.setNome(rs.getString("nome"));
                user.setEmail(rs.getString("email"));
                user.setSenha(rs.getString("senha"));
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            conpost.close(connection);
        }

        return user;
    }

}


