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
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.DateiformatCodeType;
import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.FormatType;
import de.xoev.domea.domea.PrimaerdokumentType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Format Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.FormatTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.FormatTypeImpl#getSonstigerName <em>Sonstiger Name</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.FormatTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.FormatTypeImpl#getPrimaerdokument <em>Primaerdokument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormatTypeImpl extends MinimalEObjectImpl.Container implements FormatType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected DateiformatCodeType name;

	/**
	 * The default value of the '{@link #getSonstigerName() <em>Sonstiger Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSonstigerName()
	 * @generated
	 * @ordered
	 */
	protected static final String SONSTIGER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSonstigerName() <em>Sonstiger Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSonstigerName()
	 * @generated
	 * @ordered
	 */
	protected String sonstigerName = SONSTIGER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrimaerdokument() <em>Primaerdokument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaerdokument()
	 * @generated
	 * @ordered
	 */
	protected PrimaerdokumentType primaerdokument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormatTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.FORMAT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateiformatCodeType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(DateiformatCodeType newName, NotificationChain msgs) {
		DateiformatCodeType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.FORMAT_TYPE__NAME, oldName, newName);
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
	public void setName(DateiformatCodeType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.FORMAT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.FORMAT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.FORMAT_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSonstigerName() {
		return sonstigerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSonstigerName(String newSonstigerName) {
		String oldSonstigerName = sonstigerName;
		sonstigerName = newSonstigerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.FORMAT_TYPE__SONSTIGER_NAME, oldSonstigerName, sonstigerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.FORMAT_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimaerdokumentType getPrimaerdokument() {
		return primaerdokument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaerdokument(PrimaerdokumentType newPrimaerdokument, NotificationChain msgs) {
		PrimaerdokumentType oldPrimaerdokument = primaerdokument;
		primaerdokument = newPrimaerdokument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.FORMAT_TYPE__PRIMAERDOKUMENT, oldPrimaerdokument, newPrimaerdokument);
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
	public void setPrimaerdokument(PrimaerdokumentType newPrimaerdokument) {
		if (newPrimaerdokument != primaerdokument) {
			NotificationChain msgs = null;
			if (primaerdokument != null)
				msgs = ((InternalEObject)primaerdokument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.FORMAT_TYPE__PRIMAERDOKUMENT, null, msgs);
			if (newPrimaerdokument != null)
				msgs = ((InternalEObject)newPrimaerdokument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.FORMAT_TYPE__PRIMAERDOKUMENT, null, msgs);
			msgs = basicSetPrimaerdokument(newPrimaerdokument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.FORMAT_TYPE__PRIMAERDOKUMENT, newPrimaerdokument, newPrimaerdokument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.FORMAT_TYPE__NAME:
				return basicSetName(null, msgs);
			case DomeaPackage.FORMAT_TYPE__PRIMAERDOKUMENT:
				return basicSetPrimaerdokument(null, msgs);
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
			case DomeaPackage.FORMAT_TYPE__NAME:
				return getName();
			case DomeaPackage.FORMAT_TYPE__SONSTIGER_NAME:
				return getSonstigerName();
			case DomeaPackage.FORMAT_TYPE__VERSION:
				return getVersion();
			case DomeaPackage.FORMAT_TYPE__PRIMAERDOKUMENT:
				return getPrimaerdokument();
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
			case DomeaPackage.FORMAT_TYPE__NAME:
				setName((DateiformatCodeType)newValue);
				return;
			case DomeaPackage.FORMAT_TYPE__SONSTIGER_NAME:
				setSonstigerName((String)newValue);
				return;
			case DomeaPackage.FORMAT_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case DomeaPackage.FORMAT_TYPE__PRIMAERDOKUMENT:
				setPrimaerdokument((PrimaerdokumentType)newValue);
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
			case DomeaPackage.FORMAT_TYPE__NAME:
				setName((DateiformatCodeType)null);
				return;
			case DomeaPackage.FORMAT_TYPE__SONSTIGER_NAME:
				setSonstigerName(SONSTIGER_NAME_EDEFAULT);
				return;
			case DomeaPackage.FORMAT_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DomeaPackage.FORMAT_TYPE__PRIMAERDOKUMENT:
				setPrimaerdokument((PrimaerdokumentType)null);
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
			case DomeaPackage.FORMAT_TYPE__NAME:
				return name != null;
			case DomeaPackage.FORMAT_TYPE__SONSTIGER_NAME:
				return SONSTIGER_NAME_EDEFAULT == null ? sonstigerName != null : !SONSTIGER_NAME_EDEFAULT.equals(sonstigerName);
			case DomeaPackage.FORMAT_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DomeaPackage.FORMAT_TYPE__PRIMAERDOKUMENT:
				return primaerdokument != null;
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
		result.append(" (sonstigerName: ");
		result.append(sonstigerName);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //FormatTypeImpl
