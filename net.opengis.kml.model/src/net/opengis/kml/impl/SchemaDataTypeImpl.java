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
package net.opengis.kml.impl;

import java.util.Collection;

import net.opengis.kml.KMLPackage;
import net.opengis.kml.SchemaDataType;
import net.opengis.kml.SimpleDataType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.SchemaDataTypeImpl#getSimpleData <em>Simple Data</em>}</li>
 *   <li>{@link net.opengis.kml.impl.SchemaDataTypeImpl#getSchemaDataExtensionGroup <em>Schema Data Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.SchemaDataTypeImpl#getSchemaDataExtension <em>Schema Data Extension</em>}</li>
 *   <li>{@link net.opengis.kml.impl.SchemaDataTypeImpl#getSchemaUrl <em>Schema Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaDataTypeImpl extends AbstractObjectTypeImpl implements SchemaDataType {
	/**
	 * The cached value of the '{@link #getSimpleData() <em>Simple Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleData()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleDataType> simpleData;

	/**
	 * The cached value of the '{@link #getSchemaDataExtensionGroup() <em>Schema Data Extension Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaDataExtensionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap schemaDataExtensionGroup;

	/**
	 * The default value of the '{@link #getSchemaUrl() <em>Schema Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaUrl() <em>Schema Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaUrl()
	 * @generated
	 * @ordered
	 */
	protected String schemaUrl = SCHEMA_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getSchemaDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleDataType> getSimpleData() {
		if (simpleData == null) {
			simpleData = new EObjectContainmentEList<SimpleDataType>(SimpleDataType.class, this, KMLPackage.SCHEMA_DATA_TYPE__SIMPLE_DATA);
		}
		return simpleData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSchemaDataExtensionGroup() {
		if (schemaDataExtensionGroup == null) {
			schemaDataExtensionGroup = new BasicFeatureMap(this, KMLPackage.SCHEMA_DATA_TYPE__SCHEMA_DATA_EXTENSION_GROUP);
		}
		return schemaDataExtensionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getSchemaDataExtension() {
		return getSchemaDataExtensionGroup().list(KMLPackage.eINSTANCE.getSchemaDataType_SchemaDataExtension());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchemaUrl() {
		return schemaUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaUrl(String newSchemaUrl) {
		String oldSchemaUrl = schemaUrl;
		schemaUrl = newSchemaUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.SCHEMA_DATA_TYPE__SCHEMA_URL, oldSchemaUrl, schemaUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.SCHEMA_DATA_TYPE__SIMPLE_DATA:
				return ((InternalEList<?>)getSimpleData()).basicRemove(otherEnd, msgs);
			case KMLPackage.SCHEMA_DATA_TYPE__SCHEMA_DATA_EXTENSION_GROUP:
				return ((InternalEList<?>)getSchemaDataExtensionGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.SCHEMA_DATA_TYPE__SCHEMA_DATA_EXTENSION:
				return ((InternalEList<?>)getSchemaDataExtension()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.SCHEMA_DATA_TYPE__SIMPLE_DATA:
				return getSimpleData();
			case KMLPackage.SCHEMA_DATA_TYPE__SCHEMA_DATA_EXTENSION_GROUP:
				if (coreType) return getSchemaDataExtensionGroup();
				return ((FeatureMap.Internal)getSchemaDataExtensionGroup()).getWrapper();
			case KMLPackage.SCHEMA_DATA_TYPE__SCHEMA_DATA_EXTENSION:
				return getSchemaDataExtension();
			case KMLPackage.SCHEMA_DATA_TYPE__SCHEMA_URL:
				return getSchemaUrl();
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
			case KMLPackage.SCHEMA_DATA_TYPE__SIMPLE_DATA:
				getSimpleData().clear();
				getSimpleData().addAll((Collection<? extends SimpleDataType>)newValue);
				return;
			case KMLPackage.SCHEMA_DATA_TYPE__SCHEMA_DATA_EXTENSION_GROUP:
				((FeatureMap.Internal)getSchemaDataExtensionGroup()).set(newValue);
				return;
			case KMLPackage.SCHEMA_DATA_TYPE__SCHEMA_URL:
				setSchemaUrl((String)newValue);
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
			case KMLPackage.SCHEMA_DATA_TYPE__SIMPLE_DATA:
				getSimpleData().clear();
				return;
			case KMLPackage.SCHEMA_DATA_TYPE__SCHEMA_DATA_EXTENSION_GROUP:
				getSchemaDataExtensionGroup().clear();
				return;
			case KMLPackage.SCHEMA_DATA_TYPE__SCHEMA_URL:
				setSchemaUrl(SCHEMA_URL_EDEFAULT);
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
			case KMLPackage.SCHEMA_DATA_TYPE__SIMPLE_DATA:
				return simpleData != null && !simpleData.isEmpty();
			case KMLPackage.SCHEMA_DATA_TYPE__SCHEMA_DATA_EXTENSION_GROUP:
				return schemaDataExtensionGroup != null && !schemaDataExtensionGroup.isEmpty();
			case KMLPackage.SCHEMA_DATA_TYPE__SCHEMA_DATA_EXTENSION:
				return !getSchemaDataExtension().isEmpty();
			case KMLPackage.SCHEMA_DATA_TYPE__SCHEMA_URL:
				return SCHEMA_URL_EDEFAULT == null ? schemaUrl != null : !SCHEMA_URL_EDEFAULT.equals(schemaUrl);
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
		result.append(" (schemaDataExtensionGroup: ");
		result.append(schemaDataExtensionGroup);
		result.append(", schemaUrl: ");
		result.append(schemaUrl);
		result.append(')');
		return result.toString();
	}

} //SchemaDataTypeImpl
