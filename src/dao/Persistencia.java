/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author Tegon Faria
 */
public interface Persistencia<T> {
    public boolean create(T obj);
    public List<T>read();
    public T find(String nome);
    public void delete(String cpf);
    public void update(T obj);
}
