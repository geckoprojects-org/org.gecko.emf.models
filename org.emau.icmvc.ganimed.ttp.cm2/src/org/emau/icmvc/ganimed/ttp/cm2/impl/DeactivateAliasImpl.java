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

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.DeactivateAlias;
import org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deactivate Alias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DeactivateAliasImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DeactivateAliasImpl#getOriginalSignerId <em>Original Signer Id</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.DeactivateAliasImpl#getAliasSignerId <em>Alias Signer Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeactivateAliasImpl extends MinimalEObjectImpl.Container implements DeactivateAlias {
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
	 * The cached value of the '{@link #getOriginalSignerId() <em>Original Signer Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalSignerId()
	 * @generated
	 * @ordered
	 */
	protected SignerIdDTO originalSignerId;

	/**
	 * The cached value of the '{@link #getAliasSignerId() <em>Alias Signer Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasSignerId()
	 * @generated
	 * @ordered
	 */
	protected SignerIdDTO aliasSignerId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeactivateAliasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getDeactivateAlias();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.DEACTIVATE_ALIAS__DOMAIN_NAME, oldDomainName, domainName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignerIdDTO getOriginalSignerId() {
		return originalSignerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalSignerId(SignerIdDTO newOriginalSignerId, NotificationChain msgs) {
		SignerIdDTO oldOriginalSignerId = originalSignerId;
		originalSignerId = newOriginalSignerId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.DEACTIVATE_ALIAS__ORIGINAL_SIGNER_ID, oldOriginalSignerId, newOriginalSignerId);
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
	public void setOriginalSignerId(SignerIdDTO newOriginalSignerId) {
		if (newOriginalSignerId != originalSignerId) {
			NotificationChain msgs = null;
			if (originalSignerId != null)
				msgs = ((InternalEObject)originalSignerId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.DEACTIVATE_ALIAS__ORIGINAL_SIGNER_ID, null, msgs);
			if (newOriginalSignerId != null)
				msgs = ((InternalEObject)newOriginalSignerId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.DEACTIVATE_ALIAS__ORIGINAL_SIGNER_ID, null, msgs);
			msgs = basicSetOriginalSignerId(newOriginalSignerId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.DEACTIVATE_ALIAS__ORIGINAL_SIGNER_ID, newOriginalSignerId, newOriginalSignerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignerIdDTO getAliasSignerId() {
		return aliasSignerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAliasSignerId(SignerIdDTO newAliasSignerId, NotificationChain msgs) {
		SignerIdDTO oldAliasSignerId = aliasSignerId;
		aliasSignerId = newAliasSignerId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.DEACTIVATE_ALIAS__ALIAS_SIGNER_ID, oldAliasSignerId, newAliasSignerId);
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
	public void setAliasSignerId(SignerIdDTO newAliasSignerId) {
		if (newAliasSignerId != aliasSignerId) {
			NotificationChain msgs = null;
			if (aliasSignerId != null)
				msgs = ((InternalEObject)aliasSignerId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.DEACTIVATE_ALIAS__ALIAS_SIGNER_ID, null, msgs);
			if (newAliasSignerId != null)
				msgs = ((InternalEObject)newAliasSignerId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.DEACTIVATE_ALIAS__ALIAS_SIGNER_ID, null, msgs);
			msgs = basicSetAliasSignerId(newAliasSignerId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.DEACTIVATE_ALIAS__ALIAS_SIGNER_ID, newAliasSignerId, newAliasSignerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.DEACTIVATE_ALIAS__ORIGINAL_SIGNER_ID:
				return basicSetOriginalSignerId(null, msgs);
			case Cm2Package.DEACTIVATE_ALIAS__ALIAS_SIGNER_ID:
				return basicSetAliasSignerId(null, msgs);
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
			case Cm2Package.DEACTIVATE_ALIAS__DOMAIN_NAME:
				return getDomainName();
			case Cm2Package.DEACTIVATE_ALIAS__ORIGINAL_SIGNER_ID:
				return getOriginalSignerId();
			case Cm2Package.DEACTIVATE_ALIAS__ALIAS_SIGNER_ID:
				return getAliasSignerId();
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
			case Cm2Package.DEACTIVATE_ALIAS__DOMAIN_NAME:
				setDomainName((String)newValue);
				return;
			case Cm2Package.DEACTIVATE_ALIAS__ORIGINAL_SIGNER_ID:
				setOriginalSignerId((SignerIdDTO)newValue);
				return;
			case Cm2Package.DEACTIVATE_ALIAS__ALIAS_SIGNER_ID:
				setAliasSignerId((SignerIdDTO)newValue);
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
			case Cm2Package.DEACTIVATE_ALIAS__DOMAIN_NAME:
				setDomainName(DOMAIN_NAME_EDEFAULT);
				return;
			case Cm2Package.DEACTIVATE_ALIAS__ORIGINAL_SIGNER_ID:
				setOriginalSignerId((SignerIdDTO)null);
				return;
			case Cm2Package.DEACTIVATE_ALIAS__ALIAS_SIGNER_ID:
				setAliasSignerId((SignerIdDTO)null);
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
			case Cm2Package.DEACTIVATE_ALIAS__DOMAIN_NAME:
				return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
			case Cm2Package.DEACTIVATE_ALIAS__ORIGINAL_SIGNER_ID:
				return originalSignerId != null;
			case Cm2Package.DEACTIVATE_ALIAS__ALIAS_SIGNER_ID:
				return aliasSignerId != null;
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

} //DeactivateAliasImpl
