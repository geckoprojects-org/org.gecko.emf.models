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

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.CustodiansType;
import org.cyclonedx.schema.bom.DataGovernance;
import org.cyclonedx.schema.bom.OwnersType;
import org.cyclonedx.schema.bom.StewardsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Governance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DataGovernanceImpl#getCustodians <em>Custodians</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DataGovernanceImpl#getStewards <em>Stewards</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DataGovernanceImpl#getOwners <em>Owners</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataGovernanceImpl extends MinimalEObjectImpl.Container implements DataGovernance {
	/**
	 * The cached value of the '{@link #getCustodians() <em>Custodians</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodians()
	 * @generated
	 * @ordered
	 */
	protected CustodiansType custodians;

	/**
	 * The cached value of the '{@link #getStewards() <em>Stewards</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStewards()
	 * @generated
	 * @ordered
	 */
	protected StewardsType stewards;

	/**
	 * The cached value of the '{@link #getOwners() <em>Owners</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwners()
	 * @generated
	 * @ordered
	 */
	protected OwnersType owners;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataGovernanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getDataGovernance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustodiansType getCustodians() {
		return custodians;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustodians(CustodiansType newCustodians, NotificationChain msgs) {
		CustodiansType oldCustodians = custodians;
		custodians = newCustodians;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.DATA_GOVERNANCE__CUSTODIANS, oldCustodians, newCustodians);
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
	public void setCustodians(CustodiansType newCustodians) {
		if (newCustodians != custodians) {
			NotificationChain msgs = null;
			if (custodians != null)
				msgs = ((InternalEObject)custodians).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DATA_GOVERNANCE__CUSTODIANS, null, msgs);
			if (newCustodians != null)
				msgs = ((InternalEObject)newCustodians).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DATA_GOVERNANCE__CUSTODIANS, null, msgs);
			msgs = basicSetCustodians(newCustodians, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.DATA_GOVERNANCE__CUSTODIANS, newCustodians, newCustodians));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StewardsType getStewards() {
		return stewards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStewards(StewardsType newStewards, NotificationChain msgs) {
		StewardsType oldStewards = stewards;
		stewards = newStewards;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.DATA_GOVERNANCE__STEWARDS, oldStewards, newStewards);
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
	public void setStewards(StewardsType newStewards) {
		if (newStewards != stewards) {
			NotificationChain msgs = null;
			if (stewards != null)
				msgs = ((InternalEObject)stewards).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DATA_GOVERNANCE__STEWARDS, null, msgs);
			if (newStewards != null)
				msgs = ((InternalEObject)newStewards).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DATA_GOVERNANCE__STEWARDS, null, msgs);
			msgs = basicSetStewards(newStewards, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.DATA_GOVERNANCE__STEWARDS, newStewards, newStewards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OwnersType getOwners() {
		return owners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwners(OwnersType newOwners, NotificationChain msgs) {
		OwnersType oldOwners = owners;
		owners = newOwners;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.DATA_GOVERNANCE__OWNERS, oldOwners, newOwners);
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
	public void setOwners(OwnersType newOwners) {
		if (newOwners != owners) {
			NotificationChain msgs = null;
			if (owners != null)
				msgs = ((InternalEObject)owners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DATA_GOVERNANCE__OWNERS, null, msgs);
			if (newOwners != null)
				msgs = ((InternalEObject)newOwners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DATA_GOVERNANCE__OWNERS, null, msgs);
			msgs = basicSetOwners(newOwners, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.DATA_GOVERNANCE__OWNERS, newOwners, newOwners));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.DATA_GOVERNANCE__CUSTODIANS:
				return basicSetCustodians(null, msgs);
			case BOMPackage.DATA_GOVERNANCE__STEWARDS:
				return basicSetStewards(null, msgs);
			case BOMPackage.DATA_GOVERNANCE__OWNERS:
				return basicSetOwners(null, msgs);
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
			case BOMPackage.DATA_GOVERNANCE__CUSTODIANS:
				return getCustodians();
			case BOMPackage.DATA_GOVERNANCE__STEWARDS:
				return getStewards();
			case BOMPackage.DATA_GOVERNANCE__OWNERS:
				return getOwners();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BOMPackage.DATA_GOVERNANCE__CUSTODIANS:
				setCustodians((CustodiansType)newValue);
				return;
			case BOMPackage.DATA_GOVERNANCE__STEWARDS:
				setStewards((StewardsType)newValue);
				return;
			case BOMPackage.DATA_GOVERNANCE__OWNERS:
				setOwners((OwnersType)newValue);
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
			case BOMPackage.DATA_GOVERNANCE__CUSTODIANS:
				setCustodians((CustodiansType)null);
				return;
			case BOMPackage.DATA_GOVERNANCE__STEWARDS:
				setStewards((StewardsType)null);
				return;
			case BOMPackage.DATA_GOVERNANCE__OWNERS:
				setOwners((OwnersType)null);
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
			case BOMPackage.DATA_GOVERNANCE__CUSTODIANS:
				return custodians != null;
			case BOMPackage.DATA_GOVERNANCE__STEWARDS:
				return stewards != null;
			case BOMPackage.DATA_GOVERNANCE__OWNERS:
				return owners != null;
		}
		return super.eIsSet(featureID);
	}

} //DataGovernanceImpl
