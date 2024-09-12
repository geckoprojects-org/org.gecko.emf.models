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

import net.opengis.kml.DataType;
import net.opengis.kml.ExtendedDataType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.SchemaDataType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.ExtendedDataTypeImpl#getData <em>Data</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ExtendedDataTypeImpl#getSchemaData <em>Schema Data</em>}</li>
 *   <li>{@link net.opengis.kml.impl.ExtendedDataTypeImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendedDataTypeImpl extends MinimalEObjectImpl.Container implements ExtendedDataType {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> data;

	/**
	 * The cached value of the '{@link #getSchemaData() <em>Schema Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaData()
	 * @generated
	 * @ordered
	 */
	protected EList<SchemaDataType> schemaData;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getExtendedDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataType> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<DataType>(DataType.class, this, KMLPackage.EXTENDED_DATA_TYPE__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SchemaDataType> getSchemaData() {
		if (schemaData == null) {
			schemaData = new EObjectContainmentEList<SchemaDataType>(SchemaDataType.class, this, KMLPackage.EXTENDED_DATA_TYPE__SCHEMA_DATA);
		}
		return schemaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, KMLPackage.EXTENDED_DATA_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.EXTENDED_DATA_TYPE__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case KMLPackage.EXTENDED_DATA_TYPE__SCHEMA_DATA:
				return ((InternalEList<?>)getSchemaData()).basicRemove(otherEnd, msgs);
			case KMLPackage.EXTENDED_DATA_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.EXTENDED_DATA_TYPE__DATA:
				return getData();
			case KMLPackage.EXTENDED_DATA_TYPE__SCHEMA_DATA:
				return getSchemaData();
			case KMLPackage.EXTENDED_DATA_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
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
			case KMLPackage.EXTENDED_DATA_TYPE__DATA:
				getData().clear();
				getData().addAll((Collection<? extends DataType>)newValue);
				return;
			case KMLPackage.EXTENDED_DATA_TYPE__SCHEMA_DATA:
				getSchemaData().clear();
				getSchemaData().addAll((Collection<? extends SchemaDataType>)newValue);
				return;
			case KMLPackage.EXTENDED_DATA_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
			case KMLPackage.EXTENDED_DATA_TYPE__DATA:
				getData().clear();
				return;
			case KMLPackage.EXTENDED_DATA_TYPE__SCHEMA_DATA:
				getSchemaData().clear();
				return;
			case KMLPackage.EXTENDED_DATA_TYPE__ANY:
				getAny().clear();
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
			case KMLPackage.EXTENDED_DATA_TYPE__DATA:
				return data != null && !data.isEmpty();
			case KMLPackage.EXTENDED_DATA_TYPE__SCHEMA_DATA:
				return schemaData != null && !schemaData.isEmpty();
			case KMLPackage.EXTENDED_DATA_TYPE__ANY:
				return any != null && !any.isEmpty();
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
		result.append(" (any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //ExtendedDataTypeImpl
