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
package de.xoev.xfamilie.baukasten._1.baukasten.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Antragsnachricht Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl#getZeitstempelAntragsstellung <em>Zeitstempel Antragsstellung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl#getTransaktionsid <em>Transaktionsid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AntragsnachrichtTypeImpl extends NachrichtTypeImpl implements AntragsnachrichtType {
	/**
	 * The default value of the '{@link #getZeitstempelAntragsstellung() <em>Zeitstempel Antragsstellung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitstempelAntragsstellung()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ZEITSTEMPEL_ANTRAGSSTELLUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZeitstempelAntragsstellung() <em>Zeitstempel Antragsstellung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitstempelAntragsstellung()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar zeitstempelAntragsstellung = ZEITSTEMPEL_ANTRAGSSTELLUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransaktionsid() <em>Transaktionsid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransaktionsid()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSAKTIONSID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransaktionsid() <em>Transaktionsid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransaktionsid()
	 * @generated
	 * @ordered
	 */
	protected String transaktionsid = TRANSAKTIONSID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AntragsnachrichtTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.ANTRAGSNACHRICHT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getZeitstempelAntragsstellung() {
		return zeitstempelAntragsstellung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZeitstempelAntragsstellung(XMLGregorianCalendar newZeitstempelAntragsstellung) {
		XMLGregorianCalendar oldZeitstempelAntragsstellung = zeitstempelAntragsstellung;
		zeitstempelAntragsstellung = newZeitstempelAntragsstellung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG, oldZeitstempelAntragsstellung, zeitstempelAntragsstellung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransaktionsid() {
		return transaktionsid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransaktionsid(String newTransaktionsid) {
		String oldTransaktionsid = transaktionsid;
		transaktionsid = newTransaktionsid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID, oldTransaktionsid, transaktionsid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG:
				return getZeitstempelAntragsstellung();
			case BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID:
				return getTransaktionsid();
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
			case BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG:
				setZeitstempelAntragsstellung((XMLGregorianCalendar)newValue);
				return;
			case BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID:
				setTransaktionsid((String)newValue);
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
			case BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG:
				setZeitstempelAntragsstellung(ZEITSTEMPEL_ANTRAGSSTELLUNG_EDEFAULT);
				return;
			case BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID:
				setTransaktionsid(TRANSAKTIONSID_EDEFAULT);
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
			case BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG:
				return ZEITSTEMPEL_ANTRAGSSTELLUNG_EDEFAULT == null ? zeitstempelAntragsstellung != null : !ZEITSTEMPEL_ANTRAGSSTELLUNG_EDEFAULT.equals(zeitstempelAntragsstellung);
			case BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID:
				return TRANSAKTIONSID_EDEFAULT == null ? transaktionsid != null : !TRANSAKTIONSID_EDEFAULT.equals(transaktionsid);
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
		result.append(" (zeitstempelAntragsstellung: ");
		result.append(zeitstempelAntragsstellung);
		result.append(", transaktionsid: ");
		result.append(transaktionsid);
		result.append(')');
		return result.toString();
	}

} //AntragsnachrichtTypeImpl
