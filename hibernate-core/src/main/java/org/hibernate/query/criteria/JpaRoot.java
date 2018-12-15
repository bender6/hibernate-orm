/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.query.criteria;

import javax.persistence.criteria.Root;

import org.hibernate.metamodel.model.domain.EntityDomainType;

/**
 * @author Steve Ebersole
 */
public interface JpaRoot<T> extends JpaFrom<T,T>, JpaPathSource<T>, Root<T> {
	@Override
	EntityDomainType<T> getModel();

	@Override
	EntityDomainType<T> getManagedType();
}
