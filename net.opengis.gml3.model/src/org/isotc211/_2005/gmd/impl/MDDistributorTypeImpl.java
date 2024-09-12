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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.CIResponsiblePartyPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDDigitalTransferOptionsPropertyType;
import org.isotc211._2005.gmd.MDDistributorType;
import org.isotc211._2005.gmd.MDFormatPropertyType;
import org.isotc211._2005.gmd.MDStandardOrderProcessPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Distributor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDistributorTypeImpl#getDistributorContact <em>Distributor Contact</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDistributorTypeImpl#getDistributionOrderProcess <em>Distribution Order Process</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDistributorTypeImpl#getDistributorFormat <em>Distributor Format</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDDistributorTypeImpl#getDistributorTransferOptions <em>Distributor Transfer Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDDistributorTypeImpl extends AbstractObjectTypeImpl implements MDDistributorType {
	/**
	 * The cached value of the '{@link #getDistributorContact() <em>Distributor Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributorContact()
	 * @generated
	 * @ordered
	 */
	protected CIResponsiblePartyPropertyType distributorContact;

	/**
	 * The cached value of the '{@link #getDistributionOrderProcess() <em>Distribution Order Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionOrderProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<MDStandardOrderProcessPropertyType> distributionOrderProcess;

	/**
	 * The cached value of the '{@link #getDistributorFormat() <em>Distributor Format</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributorFormat()
	 * @generated
	 * @ordered
	 */
	protected EList<MDFormatPropertyType> distributorFormat;

	/**
	 * The cached value of the '{@link #getDistributorTransferOptions() <em>Distributor Transfer Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributorTransferOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<MDDigitalTransferOptionsPropertyType> distributorTransferOptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDDistributorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDDistributorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIResponsiblePartyPropertyType getDistributorContact() {
		return distributorContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistributorContact(CIResponsiblePartyPropertyType newDistributorContact, NotificationChain msgs) {
		CIResponsiblePartyPropertyType oldDistributorContact = distributorContact;
		distributorContact = newDistributorContact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_CONTACT, oldDistributorContact, newDistributorContact);
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
	public void setDistributorContact(CIResponsiblePartyPropertyType newDistributorContact) {
		if (newDistributorContact != distributorContact) {
			NotificationChain msgs = null;
			if (distributorContact != null)
				msgs = ((InternalEObject)distributorContact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_CONTACT, null, msgs);
			if (newDistributorContact != null)
				msgs = ((InternalEObject)newDistributorContact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_CONTACT, null, msgs);
			msgs = basicSetDistributorContact(newDistributorContact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_CONTACT, newDistributorContact, newDistributorContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDStandardOrderProcessPropertyType> getDistributionOrderProcess() {
		if (distributionOrderProcess == null) {
			distributionOrderProcess = new EObjectContainmentEList<MDStandardOrderProcessPropertyType>(MDStandardOrderProcessPropertyType.class, this, GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTION_ORDER_PROCESS);
		}
		return distributionOrderProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDFormatPropertyType> getDistributorFormat() {
		if (distributorFormat == null) {
			distributorFormat = new EObjectContainmentEList<MDFormatPropertyType>(MDFormatPropertyType.class, this, GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_FORMAT);
		}
		return distributorFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDDigitalTransferOptionsPropertyType> getDistributorTransferOptions() {
		if (distributorTransferOptions == null) {
			distributorTransferOptions = new EObjectContainmentEList<MDDigitalTransferOptionsPropertyType>(MDDigitalTransferOptionsPropertyType.class, this, GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_TRANSFER_OPTIONS);
		}
		return distributorTransferOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_CONTACT:
				return basicSetDistributorContact(null, msgs);
			case GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTION_ORDER_PROCESS:
				return ((InternalEList<?>)getDistributionOrderProcess()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_FORMAT:
				return ((InternalEList<?>)getDistributorFormat()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_TRANSFER_OPTIONS:
				return ((InternalEList<?>)getDistributorTransferOptions()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_CONTACT:
				return getDistributorContact();
			case GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTION_ORDER_PROCESS:
				return getDistributionOrderProcess();
			case GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_FORMAT:
				return getDistributorFormat();
			case GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_TRANSFER_OPTIONS:
				return getDistributorTransferOptions();
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
			case GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_CONTACT:
				setDistributorContact((CIResponsiblePartyPropertyType)newValue);
				return;
			case GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTION_ORDER_PROCESS:
				getDistributionOrderProcess().clear();
				getDistributionOrderProcess().addAll((Collection<? extends MDStandardOrderProcessPropertyType>)newValue);
				return;
			case GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_FORMAT:
				getDistributorFormat().clear();
				getDistributorFormat().addAll((Collection<? extends MDFormatPropertyType>)newValue);
				return;
			case GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_TRANSFER_OPTIONS:
				getDistributorTransferOptions().clear();
				getDistributorTransferOptions().addAll((Collection<? extends MDDigitalTransferOptionsPropertyType>)newValue);
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
			case GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_CONTACT:
				setDistributorContact((CIResponsiblePartyPropertyType)null);
				return;
			case GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTION_ORDER_PROCESS:
				getDistributionOrderProcess().clear();
				return;
			case GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_FORMAT:
				getDistributorFormat().clear();
				return;
			case GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_TRANSFER_OPTIONS:
				getDistributorTransferOptions().clear();
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
			case GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_CONTACT:
				return distributorContact != null;
			case GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTION_ORDER_PROCESS:
				return distributionOrderProcess != null && !distributionOrderProcess.isEmpty();
			case GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_FORMAT:
				return distributorFormat != null && !distributorFormat.isEmpty();
			case GMDPackage.MD_DISTRIBUTOR_TYPE__DISTRIBUTOR_TRANSFER_OPTIONS:
				return distributorTransferOptions != null && !distributorTransferOptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MDDistributorTypeImpl
