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
package org.isotc211._2005.gmd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDDigitalTransferOptionsPropertyType;
import org.isotc211._2005.gmd.MDDistributionType;
import org.isotc211._2005.gmd.MDDistributorPropertyType;
import org.isotc211._2005.gmd.MDFormatPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Distribution Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDistributionTypeImpl#getDistributionFormat <em>Distribution Format</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDistributionTypeImpl#getDistributor <em>Distributor</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDistributionTypeImpl#getTransferOptions <em>Transfer Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDDistributionTypeImpl extends AbstractObjectTypeImpl implements MDDistributionType {
	/**
	 * The cached value of the '{@link #getDistributionFormat() <em>Distribution Format</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionFormat()
	 * @generated
	 * @ordered
	 */
	protected EList<MDFormatPropertyType> distributionFormat;

	/**
	 * The cached value of the '{@link #getDistributor() <em>Distributor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributor()
	 * @generated
	 * @ordered
	 */
	protected EList<MDDistributorPropertyType> distributor;

	/**
	 * The cached value of the '{@link #getTransferOptions() <em>Transfer Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<MDDigitalTransferOptionsPropertyType> transferOptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDDistributionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDDistributionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDFormatPropertyType> getDistributionFormat() {
		if (distributionFormat == null) {
			distributionFormat = new EObjectContainmentEList<MDFormatPropertyType>(MDFormatPropertyType.class, this, GMDPackage.MD_DISTRIBUTION_TYPE__DISTRIBUTION_FORMAT);
		}
		return distributionFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDDistributorPropertyType> getDistributor() {
		if (distributor == null) {
			distributor = new EObjectContainmentEList<MDDistributorPropertyType>(MDDistributorPropertyType.class, this, GMDPackage.MD_DISTRIBUTION_TYPE__DISTRIBUTOR);
		}
		return distributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDDigitalTransferOptionsPropertyType> getTransferOptions() {
		if (transferOptions == null) {
			transferOptions = new EObjectContainmentEList<MDDigitalTransferOptionsPropertyType>(MDDigitalTransferOptionsPropertyType.class, this, GMDPackage.MD_DISTRIBUTION_TYPE__TRANSFER_OPTIONS);
		}
		return transferOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_DISTRIBUTION_TYPE__DISTRIBUTION_FORMAT:
				return ((InternalEList<?>)getDistributionFormat()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_DISTRIBUTION_TYPE__DISTRIBUTOR:
				return ((InternalEList<?>)getDistributor()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_DISTRIBUTION_TYPE__TRANSFER_OPTIONS:
				return ((InternalEList<?>)getTransferOptions()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.MD_DISTRIBUTION_TYPE__DISTRIBUTION_FORMAT:
				return getDistributionFormat();
			case GMDPackage.MD_DISTRIBUTION_TYPE__DISTRIBUTOR:
				return getDistributor();
			case GMDPackage.MD_DISTRIBUTION_TYPE__TRANSFER_OPTIONS:
				return getTransferOptions();
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
			case GMDPackage.MD_DISTRIBUTION_TYPE__DISTRIBUTION_FORMAT:
				getDistributionFormat().clear();
				getDistributionFormat().addAll((Collection<? extends MDFormatPropertyType>)newValue);
				return;
			case GMDPackage.MD_DISTRIBUTION_TYPE__DISTRIBUTOR:
				getDistributor().clear();
				getDistributor().addAll((Collection<? extends MDDistributorPropertyType>)newValue);
				return;
			case GMDPackage.MD_DISTRIBUTION_TYPE__TRANSFER_OPTIONS:
				getTransferOptions().clear();
				getTransferOptions().addAll((Collection<? extends MDDigitalTransferOptionsPropertyType>)newValue);
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
			case GMDPackage.MD_DISTRIBUTION_TYPE__DISTRIBUTION_FORMAT:
				getDistributionFormat().clear();
				return;
			case GMDPackage.MD_DISTRIBUTION_TYPE__DISTRIBUTOR:
				getDistributor().clear();
				return;
			case GMDPackage.MD_DISTRIBUTION_TYPE__TRANSFER_OPTIONS:
				getTransferOptions().clear();
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
			case GMDPackage.MD_DISTRIBUTION_TYPE__DISTRIBUTION_FORMAT:
				return distributionFormat != null && !distributionFormat.isEmpty();
			case GMDPackage.MD_DISTRIBUTION_TYPE__DISTRIBUTOR:
				return distributor != null && !distributor.isEmpty();
			case GMDPackage.MD_DISTRIBUTION_TYPE__TRANSFER_OPTIONS:
				return transferOptions != null && !transferOptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MDDistributionTypeImpl
