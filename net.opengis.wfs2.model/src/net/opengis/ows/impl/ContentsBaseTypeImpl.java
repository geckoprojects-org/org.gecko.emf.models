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
package net.opengis.ows.impl;

import java.util.Collection;

import net.opengis.ows.ContentsBaseType;
import net.opengis.ows.DatasetDescriptionSummaryBaseType;
import net.opengis.ows.MetadataType;
import net.opengis.ows.OWSPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contents Base Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ows.impl.ContentsBaseTypeImpl#getDatasetDescriptionSummary <em>Dataset Description Summary</em>}</li>
 *   <li>{@link net.opengis.ows.impl.ContentsBaseTypeImpl#getOtherSource <em>Other Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentsBaseTypeImpl extends MinimalEObjectImpl.Container implements ContentsBaseType {
	/**
	 * The cached value of the '{@link #getDatasetDescriptionSummary() <em>Dataset Description Summary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetDescriptionSummary()
	 * @generated
	 * @ordered
	 */
	protected EList<DatasetDescriptionSummaryBaseType> datasetDescriptionSummary;

	/**
	 * The cached value of the '{@link #getOtherSource() <em>Other Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSource()
	 * @generated
	 * @ordered
	 */
	protected EList<MetadataType> otherSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentsBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWSPackage.Literals.CONTENTS_BASE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatasetDescriptionSummaryBaseType> getDatasetDescriptionSummary() {
		if (datasetDescriptionSummary == null) {
			datasetDescriptionSummary = new EObjectContainmentEList<DatasetDescriptionSummaryBaseType>(DatasetDescriptionSummaryBaseType.class, this, OWSPackage.CONTENTS_BASE_TYPE__DATASET_DESCRIPTION_SUMMARY);
		}
		return datasetDescriptionSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetadataType> getOtherSource() {
		if (otherSource == null) {
			otherSource = new EObjectContainmentEList<MetadataType>(MetadataType.class, this, OWSPackage.CONTENTS_BASE_TYPE__OTHER_SOURCE);
		}
		return otherSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWSPackage.CONTENTS_BASE_TYPE__DATASET_DESCRIPTION_SUMMARY:
				return ((InternalEList<?>)getDatasetDescriptionSummary()).basicRemove(otherEnd, msgs);
			case OWSPackage.CONTENTS_BASE_TYPE__OTHER_SOURCE:
				return ((InternalEList<?>)getOtherSource()).basicRemove(otherEnd, msgs);
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
			case OWSPackage.CONTENTS_BASE_TYPE__DATASET_DESCRIPTION_SUMMARY:
				return getDatasetDescriptionSummary();
			case OWSPackage.CONTENTS_BASE_TYPE__OTHER_SOURCE:
				return getOtherSource();
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
			case OWSPackage.CONTENTS_BASE_TYPE__DATASET_DESCRIPTION_SUMMARY:
				getDatasetDescriptionSummary().clear();
				getDatasetDescriptionSummary().addAll((Collection<? extends DatasetDescriptionSummaryBaseType>)newValue);
				return;
			case OWSPackage.CONTENTS_BASE_TYPE__OTHER_SOURCE:
				getOtherSource().clear();
				getOtherSource().addAll((Collection<? extends MetadataType>)newValue);
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
			case OWSPackage.CONTENTS_BASE_TYPE__DATASET_DESCRIPTION_SUMMARY:
				getDatasetDescriptionSummary().clear();
				return;
			case OWSPackage.CONTENTS_BASE_TYPE__OTHER_SOURCE:
				getOtherSource().clear();
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
			case OWSPackage.CONTENTS_BASE_TYPE__DATASET_DESCRIPTION_SUMMARY:
				return datasetDescriptionSummary != null && !datasetDescriptionSummary.isEmpty();
			case OWSPackage.CONTENTS_BASE_TYPE__OTHER_SOURCE:
				return otherSource != null && !otherSource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContentsBaseTypeImpl
