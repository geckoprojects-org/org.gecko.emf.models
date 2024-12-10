/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package ee.jakarta.xml.ns.persistence.orm.impl;

import ee.jakarta.xml.ns.persistence.orm.ColumnResult;
import ee.jakarta.xml.ns.persistence.orm.ConstructorResult;
import ee.jakarta.xml.ns.persistence.orm.EntityResult;
import ee.jakarta.xml.ns.persistence.orm.NamedNativeQuery;
import ee.jakarta.xml.ns.persistence.orm.OrmPackage;
import ee.jakarta.xml.ns.persistence.orm.QueryHint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Native Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.impl.NamedNativeQueryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.impl.NamedNativeQueryImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.impl.NamedNativeQueryImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.impl.NamedNativeQueryImpl#getEntityResult <em>Entity Result</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.impl.NamedNativeQueryImpl#getConstructorResult <em>Constructor Result</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.impl.NamedNativeQueryImpl#getColumnResult <em>Column Result</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.impl.NamedNativeQueryImpl#getName <em>Name</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.impl.NamedNativeQueryImpl#getResultClass <em>Result Class</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.orm.impl.NamedNativeQueryImpl#getResultSetMapping <em>Result Set Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedNativeQueryImpl extends MinimalEObjectImpl.Container implements NamedNativeQuery {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected String query = QUERY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHint() <em>Hint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHint()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryHint> hint;

	/**
	 * The cached value of the '{@link #getEntityResult() <em>Entity Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityResult()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityResult> entityResult;

	/**
	 * The cached value of the '{@link #getConstructorResult() <em>Constructor Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructorResult()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstructorResult> constructorResult;

	/**
	 * The cached value of the '{@link #getColumnResult() <em>Column Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnResult()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnResult> columnResult;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultClass() <em>Result Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultClass()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultClass() <em>Result Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultClass()
	 * @generated
	 * @ordered
	 */
	protected String resultClass = RESULT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultSetMapping() <em>Result Set Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultSetMapping()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_SET_MAPPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultSetMapping() <em>Result Set Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultSetMapping()
	 * @generated
	 * @ordered
	 */
	protected String resultSetMapping = RESULT_SET_MAPPING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedNativeQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrmPackage.eINSTANCE.getNamedNativeQuery();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_NATIVE_QUERY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuery(String newQuery) {
		String oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_NATIVE_QUERY__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QueryHint> getHint() {
		if (hint == null) {
			hint = new EObjectContainmentEList<QueryHint>(QueryHint.class, this, OrmPackage.NAMED_NATIVE_QUERY__HINT);
		}
		return hint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EntityResult> getEntityResult() {
		if (entityResult == null) {
			entityResult = new EObjectContainmentEList<EntityResult>(EntityResult.class, this, OrmPackage.NAMED_NATIVE_QUERY__ENTITY_RESULT);
		}
		return entityResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstructorResult> getConstructorResult() {
		if (constructorResult == null) {
			constructorResult = new EObjectContainmentEList<ConstructorResult>(ConstructorResult.class, this, OrmPackage.NAMED_NATIVE_QUERY__CONSTRUCTOR_RESULT);
		}
		return constructorResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ColumnResult> getColumnResult() {
		if (columnResult == null) {
			columnResult = new EObjectContainmentEList<ColumnResult>(ColumnResult.class, this, OrmPackage.NAMED_NATIVE_QUERY__COLUMN_RESULT);
		}
		return columnResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_NATIVE_QUERY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResultClass() {
		return resultClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultClass(String newResultClass) {
		String oldResultClass = resultClass;
		resultClass = newResultClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_NATIVE_QUERY__RESULT_CLASS, oldResultClass, resultClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResultSetMapping() {
		return resultSetMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultSetMapping(String newResultSetMapping) {
		String oldResultSetMapping = resultSetMapping;
		resultSetMapping = newResultSetMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_NATIVE_QUERY__RESULT_SET_MAPPING, oldResultSetMapping, resultSetMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrmPackage.NAMED_NATIVE_QUERY__HINT:
				return ((InternalEList<?>)getHint()).basicRemove(otherEnd, msgs);
			case OrmPackage.NAMED_NATIVE_QUERY__ENTITY_RESULT:
				return ((InternalEList<?>)getEntityResult()).basicRemove(otherEnd, msgs);
			case OrmPackage.NAMED_NATIVE_QUERY__CONSTRUCTOR_RESULT:
				return ((InternalEList<?>)getConstructorResult()).basicRemove(otherEnd, msgs);
			case OrmPackage.NAMED_NATIVE_QUERY__COLUMN_RESULT:
				return ((InternalEList<?>)getColumnResult()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrmPackage.NAMED_NATIVE_QUERY__DESCRIPTION:
				return getDescription();
			case OrmPackage.NAMED_NATIVE_QUERY__QUERY:
				return getQuery();
			case OrmPackage.NAMED_NATIVE_QUERY__HINT:
				return getHint();
			case OrmPackage.NAMED_NATIVE_QUERY__ENTITY_RESULT:
				return getEntityResult();
			case OrmPackage.NAMED_NATIVE_QUERY__CONSTRUCTOR_RESULT:
				return getConstructorResult();
			case OrmPackage.NAMED_NATIVE_QUERY__COLUMN_RESULT:
				return getColumnResult();
			case OrmPackage.NAMED_NATIVE_QUERY__NAME:
				return getName();
			case OrmPackage.NAMED_NATIVE_QUERY__RESULT_CLASS:
				return getResultClass();
			case OrmPackage.NAMED_NATIVE_QUERY__RESULT_SET_MAPPING:
				return getResultSetMapping();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrmPackage.NAMED_NATIVE_QUERY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OrmPackage.NAMED_NATIVE_QUERY__QUERY:
				setQuery((String)newValue);
				return;
			case OrmPackage.NAMED_NATIVE_QUERY__HINT:
				getHint().clear();
				getHint().addAll((Collection<? extends QueryHint>)newValue);
				return;
			case OrmPackage.NAMED_NATIVE_QUERY__ENTITY_RESULT:
				getEntityResult().clear();
				getEntityResult().addAll((Collection<? extends EntityResult>)newValue);
				return;
			case OrmPackage.NAMED_NATIVE_QUERY__CONSTRUCTOR_RESULT:
				getConstructorResult().clear();
				getConstructorResult().addAll((Collection<? extends ConstructorResult>)newValue);
				return;
			case OrmPackage.NAMED_NATIVE_QUERY__COLUMN_RESULT:
				getColumnResult().clear();
				getColumnResult().addAll((Collection<? extends ColumnResult>)newValue);
				return;
			case OrmPackage.NAMED_NATIVE_QUERY__NAME:
				setName((String)newValue);
				return;
			case OrmPackage.NAMED_NATIVE_QUERY__RESULT_CLASS:
				setResultClass((String)newValue);
				return;
			case OrmPackage.NAMED_NATIVE_QUERY__RESULT_SET_MAPPING:
				setResultSetMapping((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OrmPackage.NAMED_NATIVE_QUERY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OrmPackage.NAMED_NATIVE_QUERY__QUERY:
				setQuery(QUERY_EDEFAULT);
				return;
			case OrmPackage.NAMED_NATIVE_QUERY__HINT:
				getHint().clear();
				return;
			case OrmPackage.NAMED_NATIVE_QUERY__ENTITY_RESULT:
				getEntityResult().clear();
				return;
			case OrmPackage.NAMED_NATIVE_QUERY__CONSTRUCTOR_RESULT:
				getConstructorResult().clear();
				return;
			case OrmPackage.NAMED_NATIVE_QUERY__COLUMN_RESULT:
				getColumnResult().clear();
				return;
			case OrmPackage.NAMED_NATIVE_QUERY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OrmPackage.NAMED_NATIVE_QUERY__RESULT_CLASS:
				setResultClass(RESULT_CLASS_EDEFAULT);
				return;
			case OrmPackage.NAMED_NATIVE_QUERY__RESULT_SET_MAPPING:
				setResultSetMapping(RESULT_SET_MAPPING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OrmPackage.NAMED_NATIVE_QUERY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OrmPackage.NAMED_NATIVE_QUERY__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
			case OrmPackage.NAMED_NATIVE_QUERY__HINT:
				return hint != null && !hint.isEmpty();
			case OrmPackage.NAMED_NATIVE_QUERY__ENTITY_RESULT:
				return entityResult != null && !entityResult.isEmpty();
			case OrmPackage.NAMED_NATIVE_QUERY__CONSTRUCTOR_RESULT:
				return constructorResult != null && !constructorResult.isEmpty();
			case OrmPackage.NAMED_NATIVE_QUERY__COLUMN_RESULT:
				return columnResult != null && !columnResult.isEmpty();
			case OrmPackage.NAMED_NATIVE_QUERY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OrmPackage.NAMED_NATIVE_QUERY__RESULT_CLASS:
				return RESULT_CLASS_EDEFAULT == null ? resultClass != null : !RESULT_CLASS_EDEFAULT.equals(resultClass);
			case OrmPackage.NAMED_NATIVE_QUERY__RESULT_SET_MAPPING:
				return RESULT_SET_MAPPING_EDEFAULT == null ? resultSetMapping != null : !RESULT_SET_MAPPING_EDEFAULT.equals(resultSetMapping);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", query: ");
		result.append(query);
		result.append(", name: ");
		result.append(name);
		result.append(", resultClass: ");
		result.append(resultClass);
		result.append(", resultSetMapping: ");
		result.append(resultSetMapping);
		result.append(')');
		return result.toString();
	}

} //NamedNativeQueryImpl
