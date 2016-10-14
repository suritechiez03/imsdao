/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ims.dao.template;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author suri
 */
public interface IGenericDao<T extends Serializable> {

    T findOne(final String id);

    List<T> findAll();

    void create(final T entity);

    void update(final T entity);

    void delete(final T entity);

    void deleteById(final String entityId);
}
