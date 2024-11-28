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
import org.emau.icmvc.ganimed.ttp.cm2.ConsentDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ValidateConsent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validate Consent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ValidateConsentImpl#getConsent <em>Consent</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ValidateConsentImpl#isAllowRevoke <em>Allow Revoke</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ValidateConsentImpl#isValidateScan <em>Validate Scan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidateConsentImpl extends MinimalEObjectImpl.Container implements ValidateConsent {
	/**
	 * The cached value of the '{@link #getConsent() <em>Consent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsent()
	 * @generated
	 * @ordered
	 */
	protected ConsentDTO consent;

	/**
	 * The default value of the '{@link #isAllowRevoke() <em>Allow Revoke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowRevoke()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_REVOKE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowRevoke() <em>Allow Revoke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowRevoke()
	 * @generated
	 * @ordered
	 */
	protected boolean allowRevoke = ALLOW_REVOKE_EDEFAULT;

	/**
	 * This is true if the Allow Revoke attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowRevokeESet;

	/**
	 * The default value of the '{@link #isValidateScan() <em>Validate Scan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidateScan()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALIDATE_SCAN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValidateScan() <em>Validate Scan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidateScan()
	 * @generated
	 * @ordered
	 */
	protected boolean validateScan = VALIDATE_SCAN_EDEFAULT;

	/**
	 * This is true if the Validate Scan attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validateScanESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidateConsentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getValidateConsent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentDTO getConsent() {
		return consent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsent(ConsentDTO newConsent, NotificationChain msgs) {
		ConsentDTO oldConsent = consent;
		consent = newConsent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.VALIDATE_CONSENT__CONSENT, oldConsent, newConsent);
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
	public void setConsent(ConsentDTO newConsent) {
		if (newConsent != consent) {
			NotificationChain msgs = null;
			if (consent != null)
				msgs = ((InternalEObject)consent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.VALIDATE_CONSENT__CONSENT, null, msgs);
			if (newConsent != null)
				msgs = ((InternalEObject)newConsent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.VALIDATE_CONSENT__CONSENT, null, msgs);
			msgs = basicSetConsent(newConsent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.VALIDATE_CONSENT__CONSENT, newConsent, newConsent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowRevoke() {
		return allowRevoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowRevoke(boolean newAllowRevoke) {
		boolean oldAllowRevoke = allowRevoke;
		allowRevoke = newAllowRevoke;
		boolean oldAllowRevokeESet = allowRevokeESet;
		allowRevokeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.VALIDATE_CONSENT__ALLOW_REVOKE, oldAllowRevoke, allowRevoke, !oldAllowRevokeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAllowRevoke() {
		boolean oldAllowRevoke = allowRevoke;
		boolean oldAllowRevokeESet = allowRevokeESet;
		allowRevoke = ALLOW_REVOKE_EDEFAULT;
		allowRevokeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.VALIDATE_CONSENT__ALLOW_REVOKE, oldAllowRevoke, ALLOW_REVOKE_EDEFAULT, oldAllowRevokeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAllowRevoke() {
		return allowRevokeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isValidateScan() {
		return validateScan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidateScan(boolean newValidateScan) {
		boolean oldValidateScan = validateScan;
		validateScan = newValidateScan;
		boolean oldValidateScanESet = validateScanESet;
		validateScanESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.VALIDATE_CONSENT__VALIDATE_SCAN, oldValidateScan, validateScan, !oldValidateScanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetValidateScan() {
		boolean oldValidateScan = validateScan;
		boolean oldValidateScanESet = validateScanESet;
		validateScan = VALIDATE_SCAN_EDEFAULT;
		validateScanESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.VALIDATE_CONSENT__VALIDATE_SCAN, oldValidateScan, VALIDATE_SCAN_EDEFAULT, oldValidateScanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetValidateScan() {
		return validateScanESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.VALIDATE_CONSENT__CONSENT:
				return basicSetConsent(null, msgs);
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
			case Cm2Package.VALIDATE_CONSENT__CONSENT:
				return getConsent();
			case Cm2Package.VALIDATE_CONSENT__ALLOW_REVOKE:
				return isAllowRevoke();
			case Cm2Package.VALIDATE_CONSENT__VALIDATE_SCAN:
				return isValidateScan();
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
			case Cm2Package.VALIDATE_CONSENT__CONSENT:
				setConsent((ConsentDTO)newValue);
				return;
			case Cm2Package.VALIDATE_CONSENT__ALLOW_REVOKE:
				setAllowRevoke((Boolean)newValue);
				return;
			case Cm2Package.VALIDATE_CONSENT__VALIDATE_SCAN:
				setValidateScan((Boolean)newValue);
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
			case Cm2Package.VALIDATE_CONSENT__CONSENT:
				setConsent((ConsentDTO)null);
				return;
			case Cm2Package.VALIDATE_CONSENT__ALLOW_REVOKE:
				unsetAllowRevoke();
				return;
			case Cm2Package.VALIDATE_CONSENT__VALIDATE_SCAN:
				unsetValidateScan();
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
			case Cm2Package.VALIDATE_CONSENT__CONSENT:
				return consent != null;
			case Cm2Package.VALIDATE_CONSENT__ALLOW_REVOKE:
				return isSetAllowRevoke();
			case Cm2Package.VALIDATE_CONSENT__VALIDATE_SCAN:
				return isSetValidateScan();
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
		result.append(" (allowRevoke: ");
		if (allowRevokeESet) result.append(allowRevoke); else result.append("<unset>");
		result.append(", validateScan: ");
		if (validateScanESet) result.append(validateScan); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ValidateConsentImpl
