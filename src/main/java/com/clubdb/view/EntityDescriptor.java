
package com.clubdb.view;

import com.clubdb.dao.CrudDao;
import com.clubdb.util.ColumnMeta;

import java.util.List;

public record EntityDescriptor<T>(String displayName, CrudDao<T> dao, Class<T> modelClass, List<ColumnMeta> columns) {
}
