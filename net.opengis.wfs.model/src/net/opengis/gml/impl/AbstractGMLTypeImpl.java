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
package net.opengis.gml.impl;

import java.util.Collection;

import net.opengis.gml.AbstractGMLType;
import net.opengis.gml.CodeType;
import net.opengis.gml.GMLPackage;
import net.opengis.gml.MetaDataPropertyType;
import net.opengis.gml.StringOrRefType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract GML Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.AbstractGMLTypeImpl#getMetaDataProperty <em>Meta Data Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.AbstractGMLTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.opengis.gml.impl.AbstractGMLTypeImpl#getNameGroup <em>Name Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.AbstractGMLTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.gml.impl.AbstractGMLTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractGMLTypeImpl extends MinimalEObjectImpl.Container implements AbstractGMLType {
	/**
	 * The cached value of the '{@link #getMetaDataProperty() <em>Meta Data Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaDataProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaDataPropertyType> metaDataProperty;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected StringOrRefType description;

	/**
	 * The cached value of the '{@link #getNameGroup() <em>Name Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap nameGroup;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractGMLTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getAbstractGMLType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaDataPropertyType> getMetaDataProperty() {
		if (metaDataProperty == null) {
			metaDataProperty = new EObjectContainmentEList<MetaDataPropertyType>(MetaDataPropertyType.class, this, GMLPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY);
		}
		return metaDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOrRefType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(StringOrRefType newDescription, NotificationChain msgs) {
		StringOrRefType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(StringOrRefType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getNameGroup() {
		if (nameGroup == null) {
			nameGroup = new BasicFeatureMap(this, GMLPackage.ABSTRACT_GML_TYPE__NAME_GROUP);
		}
		return nameGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeType> getName() {
		return getNameGroup().list(GMLPackage.eINSTANCE.getAbstractGMLType_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_GML_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY:
				return ((InternalEList<?>)getMetaDataProperty()).basicRemove(otherEnd, msgs);
			case GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case GMLPackage.ABSTRACT_GML_TYPE__NAME_GROUP:
				return ((InternalEList<?>)getNameGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.ABSTRACT_GML_TYPE__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY:
				return getMetaDataProperty();
			case GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION:
				return getDescription();
			case GMLPackage.ABSTRACT_GML_TYPE__NAME_GROUP:
				if (coreType) return getNameGroup();
				return ((FeatureMap.Internal)getNameGroup()).getWrapper();
			case GMLPackage.ABSTRACT_GML_TYPE__NAME:
				return getName();
			case GMLPackage.ABSTRACT_GML_TYPE__ID:
				return getId();
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
			case GMLPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY:
				getMetaDataProperty().clear();
				getMetaDataProperty().addAll((Collection<? extends MetaDataPropertyType>)newValue);
				return;
			case GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION:
				setDescription((StringOrRefType)newValue);
				return;
			case GMLPackage.ABSTRACT_GML_TYPE__NAME_GROUP:
				((FeatureMap.Internal)getNameGroup()).set(newValue);
				return;
			case GMLPackage.ABSTRACT_GML_TYPE__NAME:
				getName().clear();
				getName().addAll((Collection<? extends CodeType>)newValue);
				return;
			case GMLPackage.ABSTRACT_GML_TYPE__ID:
				setId((String)newValue);
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
			case GMLPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY:
				getMetaDataProperty().clear();
				return;
			case GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION:
				setDescription((StringOrRefType)null);
				return;
			case GMLPackage.ABSTRACT_GML_TYPE__NAME_GROUP:
				getNameGroup().clear();
				return;
			case GMLPackage.ABSTRACT_GML_TYPE__NAME:
				getName().clear();
				return;
			case GMLPackage.ABSTRACT_GML_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case GMLPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY:
				return metaDataProperty != null && !metaDataProperty.isEmpty();
			case GMLPackage.ABSTRACT_GML_TYPE__DESCRIPTION:
				return description != null;
			case GMLPackage.ABSTRACT_GML_TYPE__NAME_GROUP:
				return nameGroup != null && !nameGroup.isEmpty();
			case GMLPackage.ABSTRACT_GML_TYPE__NAME:
				return !getName().isEmpty();
			case GMLPackage.ABSTRACT_GML_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (nameGroup: ");
		result.append(nameGroup);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //AbstractGMLTypeImpl
