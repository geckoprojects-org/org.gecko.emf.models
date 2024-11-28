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
package org.emau.icmvc.ganimed.ttp.cm2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerId;
import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Signer Id To Signer Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddSignerIdToSignerIdImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddSignerIdToSignerIdImpl#getExistentSignerId <em>Existent Signer Id</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddSignerIdToSignerIdImpl#getNewSignerId <em>New Signer Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddSignerIdToSignerIdImpl extends MinimalEObjectImpl.Container implements AddSignerIdToSignerId {
	/**
	 * The default value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected String domainName = DOMAIN_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExistentSignerId() <em>Existent Signer Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistentSignerId()
	 * @generated
	 * @ordered
	 */
	protected SignerIdDTO existentSignerId;

	/**
	 * The cached value of the '{@link #getNewSignerId() <em>New Signer Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewSignerId()
	 * @generated
	 * @ordered
	 */
	protected SignerIdDTO newSignerId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddSignerIdToSignerIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getAddSignerIdToSignerId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomainName() {
		return domainName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainName(String newDomainName) {
		String oldDomainName = domainName;
		domainName = newDomainName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__DOMAIN_NAME, oldDomainName, domainName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignerIdDTO getExistentSignerId() {
		return existentSignerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExistentSignerId(SignerIdDTO newExistentSignerId, NotificationChain msgs) {
		SignerIdDTO oldExistentSignerId = existentSignerId;
		existentSignerId = newExistentSignerId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__EXISTENT_SIGNER_ID, oldExistentSignerId, newExistentSignerId);
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
	public void setExistentSignerId(SignerIdDTO newExistentSignerId) {
		if (newExistentSignerId != existentSignerId) {
			NotificationChain msgs = null;
			if (existentSignerId != null)
				msgs = ((InternalEObject)existentSignerId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__EXISTENT_SIGNER_ID, null, msgs);
			if (newExistentSignerId != null)
				msgs = ((InternalEObject)newExistentSignerId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__EXISTENT_SIGNER_ID, null, msgs);
			msgs = basicSetExistentSignerId(newExistentSignerId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__EXISTENT_SIGNER_ID, newExistentSignerId, newExistentSignerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignerIdDTO getNewSignerId() {
		return newSignerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewSignerId(SignerIdDTO newNewSignerId, NotificationChain msgs) {
		SignerIdDTO oldNewSignerId = newSignerId;
		newSignerId = newNewSignerId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__NEW_SIGNER_ID, oldNewSignerId, newNewSignerId);
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
	public void setNewSignerId(SignerIdDTO newNewSignerId) {
		if (newNewSignerId != newSignerId) {
			NotificationChain msgs = null;
			if (newSignerId != null)
				msgs = ((InternalEObject)newSignerId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__NEW_SIGNER_ID, null, msgs);
			if (newNewSignerId != null)
				msgs = ((InternalEObject)newNewSignerId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__NEW_SIGNER_ID, null, msgs);
			msgs = basicSetNewSignerId(newNewSignerId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__NEW_SIGNER_ID, newNewSignerId, newNewSignerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__EXISTENT_SIGNER_ID:
				return basicSetExistentSignerId(null, msgs);
			case Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__NEW_SIGNER_ID:
				return basicSetNewSignerId(null, msgs);
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
			case Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__DOMAIN_NAME:
				return getDomainName();
			case Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__EXISTENT_SIGNER_ID:
				return getExistentSignerId();
			case Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__NEW_SIGNER_ID:
				return getNewSignerId();
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
			case Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__DOMAIN_NAME:
				setDomainName((String)newValue);
				return;
			case Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__EXISTENT_SIGNER_ID:
				setExistentSignerId((SignerIdDTO)newValue);
				return;
			case Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__NEW_SIGNER_ID:
				setNewSignerId((SignerIdDTO)newValue);
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
			case Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__DOMAIN_NAME:
				setDomainName(DOMAIN_NAME_EDEFAULT);
				return;
			case Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__EXISTENT_SIGNER_ID:
				setExistentSignerId((SignerIdDTO)null);
				return;
			case Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__NEW_SIGNER_ID:
				setNewSignerId((SignerIdDTO)null);
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
			case Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__DOMAIN_NAME:
				return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
			case Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__EXISTENT_SIGNER_ID:
				return existentSignerId != null;
			case Cm2Package.ADD_SIGNER_ID_TO_SIGNER_ID__NEW_SIGNER_ID:
				return newSignerId != null;
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
		result.append(" (domainName: ");
		result.append(domainName);
		result.append(')');
		return result.toString();
	}

} //AddSignerIdToSignerIdImpl
