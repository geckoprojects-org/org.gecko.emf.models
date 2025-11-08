/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom.impl;

import java.util.Collection;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.DataClassificationType;
import org.cyclonedx.schema.bom.DataType1;
import org.cyclonedx.schema.bom.DataflowType;

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
 * An implementation of the model object '<em><b>Data Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DataType1Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DataType1Impl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DataType1Impl#getDataflow <em>Dataflow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataType1Impl extends MinimalEObjectImpl.Container implements DataType1 {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getDataflow() <em>Dataflow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataflow()
	 * @generated
	 * @ordered
	 */
	protected EList<DataflowType> dataflow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getDataType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, BOMPackage.DATA_TYPE1__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataClassificationType> getClassification() {
		return getGroup().list(BOMPackage.eINSTANCE.getDataType1_Classification());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataflowType> getDataflow() {
		if (dataflow == null) {
			dataflow = new EObjectContainmentEList<DataflowType>(DataflowType.class, this, BOMPackage.DATA_TYPE1__DATAFLOW);
		}
		return dataflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.DATA_TYPE1__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case BOMPackage.DATA_TYPE1__CLASSIFICATION:
				return ((InternalEList<?>)getClassification()).basicRemove(otherEnd, msgs);
			case BOMPackage.DATA_TYPE1__DATAFLOW:
				return ((InternalEList<?>)getDataflow()).basicRemove(otherEnd, msgs);
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
			case BOMPackage.DATA_TYPE1__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case BOMPackage.DATA_TYPE1__CLASSIFICATION:
				return getClassification();
			case BOMPackage.DATA_TYPE1__DATAFLOW:
				return getDataflow();
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
			case BOMPackage.DATA_TYPE1__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case BOMPackage.DATA_TYPE1__CLASSIFICATION:
				getClassification().clear();
				getClassification().addAll((Collection<? extends DataClassificationType>)newValue);
				return;
			case BOMPackage.DATA_TYPE1__DATAFLOW:
				getDataflow().clear();
				getDataflow().addAll((Collection<? extends DataflowType>)newValue);
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
			case BOMPackage.DATA_TYPE1__GROUP:
				getGroup().clear();
				return;
			case BOMPackage.DATA_TYPE1__CLASSIFICATION:
				getClassification().clear();
				return;
			case BOMPackage.DATA_TYPE1__DATAFLOW:
				getDataflow().clear();
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
			case BOMPackage.DATA_TYPE1__GROUP:
				return group != null && !group.isEmpty();
			case BOMPackage.DATA_TYPE1__CLASSIFICATION:
				return !getClassification().isEmpty();
			case BOMPackage.DATA_TYPE1__DATAFLOW:
				return dataflow != null && !dataflow.isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //DataType1Impl
