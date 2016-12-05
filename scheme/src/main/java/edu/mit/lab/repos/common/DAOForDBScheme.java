package edu.mit.lab.repos.common;

import edu.mit.lab.infts.idao.IDAOForDBScheme;

/**
 * <p>Title: MIT Lib Project</p>
 * <p>Description: edu.mit.lab.repos.common.DAOForDBScheme</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: MIT Lib Co., Ltd</p>
 *
 * @author <chao.deng@mit.edu>
 * @version 1.0
 * @since 12/5/2016
 */
public abstract class DAOForDBScheme implements IDAOForDBScheme {

    public String fkConstraint() {
        return null;
    }

    public String pkConstraint() {
        return null;
    }
}