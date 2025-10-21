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
package basisnachricht.impl;

import basisnachricht.BasisnachrichtPackage;
import basisnachricht.IdentifikationNachrichtType;

import code.Code;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifikation Nachricht Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link basisnachricht.impl.IdentifikationNachrichtTypeImpl#getNachrichtenUUID <em>Nachrichten UUID</em>}</li>
 *   <li>{@link basisnachricht.impl.IdentifikationNachrichtTypeImpl#getNachrichtentyp <em>Nachrichtentyp</em>}</li>
 *   <li>{@link basisnachricht.impl.IdentifikationNachrichtTypeImpl#getErstellungszeitpunkt <em>Erstellungszeitpunkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifikationNachrichtTypeImpl extends MinimalEObjectImpl.Container implements IdentifikationNachrichtType {
	/**
	 * The default value of the '{@link #getNachrichtenUUID() <em>Nachrichten UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachrichtenUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String NACHRICHTEN_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNachrichtenUUID() <em>Nachrichten UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachrichtenUUID()
	 * @generated
	 * @ordered
	 */
	protected String nachrichtenUUID = NACHRICHTEN_UUID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNachrichtentyp() <em>Nachrichtentyp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachrichtentyp()
	 * @generated
	 * @ordered
	 */
	protected Code nachrichtentyp;

	/**
	 * The default value of the '{@link #getErstellungszeitpunkt() <em>Erstellungszeitpunkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErstellungszeitpunkt()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ERSTELLUNGSZEITPUNKT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErstellungszeitpunkt() <em>Erstellungszeitpunkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErstellungszeitpunkt()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar erstellungszeitpunkt = ERSTELLUNGSZEITPUNKT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifikationNachrichtTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisnachrichtPackage.Literals.IDENTIFIKATION_NACHRICHT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNachrichtenUUID() {
		return nachrichtenUUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNachrichtenUUID(String newNachrichtenUUID) {
		String oldNachrichtenUUID = nachrichtenUUID;
		nachrichtenUUID = newNachrichtenUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTEN_UUID, oldNachrichtenUUID, nachrichtenUUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getNachrichtentyp() {
		return nachrichtentyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachrichtentyp(Code newNachrichtentyp, NotificationChain msgs) {
		Code oldNachrichtentyp = nachrichtentyp;
		nachrichtentyp = newNachrichtentyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTENTYP, oldNachrichtentyp, newNachrichtentyp);
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
	public void setNachrichtentyp(Code newNachrichtentyp) {
		if (newNachrichtentyp != nachrichtentyp) {
			NotificationChain msgs = null;
			if (nachrichtentyp != null)
				msgs = ((InternalEObject)nachrichtentyp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTENTYP, null, msgs);
			if (newNachrichtentyp != null)
				msgs = ((InternalEObject)newNachrichtentyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTENTYP, null, msgs);
			msgs = basicSetNachrichtentyp(newNachrichtentyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTENTYP, newNachrichtentyp, newNachrichtentyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getErstellungszeitpunkt() {
		return erstellungszeitpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErstellungszeitpunkt(XMLGregorianCalendar newErstellungszeitpunkt) {
		XMLGregorianCalendar oldErstellungszeitpunkt = erstellungszeitpunkt;
		erstellungszeitpunkt = newErstellungszeitpunkt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__ERSTELLUNGSZEITPUNKT, oldErstellungszeitpunkt, erstellungszeitpunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTENTYP:
				return basicSetNachrichtentyp(null, msgs);
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
			case BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTEN_UUID:
				return getNachrichtenUUID();
			case BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTENTYP:
				return getNachrichtentyp();
			case BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__ERSTELLUNGSZEITPUNKT:
				return getErstellungszeitpunkt();
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
			case BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTEN_UUID:
				setNachrichtenUUID((String)newValue);
				return;
			case BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTENTYP:
				setNachrichtentyp((Code)newValue);
				return;
			case BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__ERSTELLUNGSZEITPUNKT:
				setErstellungszeitpunkt((XMLGregorianCalendar)newValue);
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
			case BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTEN_UUID:
				setNachrichtenUUID(NACHRICHTEN_UUID_EDEFAULT);
				return;
			case BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTENTYP:
				setNachrichtentyp((Code)null);
				return;
			case BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__ERSTELLUNGSZEITPUNKT:
				setErstellungszeitpunkt(ERSTELLUNGSZEITPUNKT_EDEFAULT);
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
			case BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTEN_UUID:
				return NACHRICHTEN_UUID_EDEFAULT == null ? nachrichtenUUID != null : !NACHRICHTEN_UUID_EDEFAULT.equals(nachrichtenUUID);
			case BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTENTYP:
				return nachrichtentyp != null;
			case BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__ERSTELLUNGSZEITPUNKT:
				return ERSTELLUNGSZEITPUNKT_EDEFAULT == null ? erstellungszeitpunkt != null : !ERSTELLUNGSZEITPUNKT_EDEFAULT.equals(erstellungszeitpunkt);
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
		result.append(" (nachrichtenUUID: ");
		result.append(nachrichtenUUID);
		result.append(", erstellungszeitpunkt: ");
		result.append(erstellungszeitpunkt);
		result.append(')');
		return result.toString();
	}

} //IdentifikationNachrichtTypeImpl
