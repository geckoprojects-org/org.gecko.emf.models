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

import org.emau.icmvc.ganimed.ttp.cm2.AddScanToConsent;
import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Scan To Consent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddScanToConsentImpl#getConsentKey <em>Consent Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddScanToConsentImpl#getScanBase64 <em>Scan Base64</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddScanToConsentImpl#getFileType <em>File Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddScanToConsentImpl#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddScanToConsentImpl extends MinimalEObjectImpl.Container implements AddScanToConsent {
	/**
	 * The cached value of the '{@link #getConsentKey() <em>Consent Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentKey()
	 * @generated
	 * @ordered
	 */
	protected ConsentKeyDTO consentKey;

	/**
	 * The default value of the '{@link #getScanBase64() <em>Scan Base64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanBase64()
	 * @generated
	 * @ordered
	 */
	protected static final String SCAN_BASE64_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScanBase64() <em>Scan Base64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanBase64()
	 * @generated
	 * @ordered
	 */
	protected String scanBase64 = SCAN_BASE64_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileType() <em>File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileType()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileType() <em>File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileType()
	 * @generated
	 * @ordered
	 */
	protected String fileType = FILE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddScanToConsentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getAddScanToConsent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentKeyDTO getConsentKey() {
		return consentKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsentKey(ConsentKeyDTO newConsentKey, NotificationChain msgs) {
		ConsentKeyDTO oldConsentKey = consentKey;
		consentKey = newConsentKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.ADD_SCAN_TO_CONSENT__CONSENT_KEY, oldConsentKey, newConsentKey);
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
	public void setConsentKey(ConsentKeyDTO newConsentKey) {
		if (newConsentKey != consentKey) {
			NotificationChain msgs = null;
			if (consentKey != null)
				msgs = ((InternalEObject)consentKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.ADD_SCAN_TO_CONSENT__CONSENT_KEY, null, msgs);
			if (newConsentKey != null)
				msgs = ((InternalEObject)newConsentKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.ADD_SCAN_TO_CONSENT__CONSENT_KEY, null, msgs);
			msgs = basicSetConsentKey(newConsentKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ADD_SCAN_TO_CONSENT__CONSENT_KEY, newConsentKey, newConsentKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScanBase64() {
		return scanBase64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScanBase64(String newScanBase64) {
		String oldScanBase64 = scanBase64;
		scanBase64 = newScanBase64;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ADD_SCAN_TO_CONSENT__SCAN_BASE64, oldScanBase64, scanBase64));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileType() {
		return fileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileType(String newFileType) {
		String oldFileType = fileType;
		fileType = newFileType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ADD_SCAN_TO_CONSENT__FILE_TYPE, oldFileType, fileType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ADD_SCAN_TO_CONSENT__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.ADD_SCAN_TO_CONSENT__CONSENT_KEY:
				return basicSetConsentKey(null, msgs);
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
			case Cm2Package.ADD_SCAN_TO_CONSENT__CONSENT_KEY:
				return getConsentKey();
			case Cm2Package.ADD_SCAN_TO_CONSENT__SCAN_BASE64:
				return getScanBase64();
			case Cm2Package.ADD_SCAN_TO_CONSENT__FILE_TYPE:
				return getFileType();
			case Cm2Package.ADD_SCAN_TO_CONSENT__FILE_NAME:
				return getFileName();
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
			case Cm2Package.ADD_SCAN_TO_CONSENT__CONSENT_KEY:
				setConsentKey((ConsentKeyDTO)newValue);
				return;
			case Cm2Package.ADD_SCAN_TO_CONSENT__SCAN_BASE64:
				setScanBase64((String)newValue);
				return;
			case Cm2Package.ADD_SCAN_TO_CONSENT__FILE_TYPE:
				setFileType((String)newValue);
				return;
			case Cm2Package.ADD_SCAN_TO_CONSENT__FILE_NAME:
				setFileName((String)newValue);
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
			case Cm2Package.ADD_SCAN_TO_CONSENT__CONSENT_KEY:
				setConsentKey((ConsentKeyDTO)null);
				return;
			case Cm2Package.ADD_SCAN_TO_CONSENT__SCAN_BASE64:
				setScanBase64(SCAN_BASE64_EDEFAULT);
				return;
			case Cm2Package.ADD_SCAN_TO_CONSENT__FILE_TYPE:
				setFileType(FILE_TYPE_EDEFAULT);
				return;
			case Cm2Package.ADD_SCAN_TO_CONSENT__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
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
			case Cm2Package.ADD_SCAN_TO_CONSENT__CONSENT_KEY:
				return consentKey != null;
			case Cm2Package.ADD_SCAN_TO_CONSENT__SCAN_BASE64:
				return SCAN_BASE64_EDEFAULT == null ? scanBase64 != null : !SCAN_BASE64_EDEFAULT.equals(scanBase64);
			case Cm2Package.ADD_SCAN_TO_CONSENT__FILE_TYPE:
				return FILE_TYPE_EDEFAULT == null ? fileType != null : !FILE_TYPE_EDEFAULT.equals(fileType);
			case Cm2Package.ADD_SCAN_TO_CONSENT__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
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
		result.append(" (scanBase64: ");
		result.append(scanBase64);
		result.append(", fileType: ");
		result.append(fileType);
		result.append(", fileName: ");
		result.append(fileName);
		result.append(')');
		return result.toString();
	}

} //AddScanToConsentImpl
