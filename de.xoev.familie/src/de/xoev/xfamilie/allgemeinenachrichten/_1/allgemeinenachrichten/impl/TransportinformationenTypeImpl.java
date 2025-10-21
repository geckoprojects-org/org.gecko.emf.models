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
package de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl;

import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.TransportinformationenType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transportinformationen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.TransportinformationenTypeImpl#getNachrichtenId <em>Nachrichten Id</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.TransportinformationenTypeImpl#getBetreff <em>Betreff</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.TransportinformationenTypeImpl#getSendezeitpunkt <em>Sendezeitpunkt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.TransportinformationenTypeImpl#getErgaenzendeHinweise <em>Ergaenzende Hinweise</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransportinformationenTypeImpl extends MinimalEObjectImpl.Container implements TransportinformationenType {
	/**
	 * The default value of the '{@link #getNachrichtenId() <em>Nachrichten Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachrichtenId()
	 * @generated
	 * @ordered
	 */
	protected static final String NACHRICHTEN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNachrichtenId() <em>Nachrichten Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachrichtenId()
	 * @generated
	 * @ordered
	 */
	protected String nachrichtenId = NACHRICHTEN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBetreff() <em>Betreff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetreff()
	 * @generated
	 * @ordered
	 */
	protected static final String BETREFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBetreff() <em>Betreff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetreff()
	 * @generated
	 * @ordered
	 */
	protected String betreff = BETREFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getSendezeitpunkt() <em>Sendezeitpunkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendezeitpunkt()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar SENDEZEITPUNKT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSendezeitpunkt() <em>Sendezeitpunkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendezeitpunkt()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar sendezeitpunkt = SENDEZEITPUNKT_EDEFAULT;

	/**
	 * The default value of the '{@link #getErgaenzendeHinweise() <em>Ergaenzende Hinweise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErgaenzendeHinweise()
	 * @generated
	 * @ordered
	 */
	protected static final String ERGAENZENDE_HINWEISE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErgaenzendeHinweise() <em>Ergaenzende Hinweise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErgaenzendeHinweise()
	 * @generated
	 * @ordered
	 */
	protected String ergaenzendeHinweise = ERGAENZENDE_HINWEISE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportinformationenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllgemeineNachrichtenPackage.Literals.TRANSPORTINFORMATIONEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNachrichtenId() {
		return nachrichtenId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNachrichtenId(String newNachrichtenId) {
		String oldNachrichtenId = nachrichtenId;
		nachrichtenId = newNachrichtenId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE__NACHRICHTEN_ID, oldNachrichtenId, nachrichtenId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBetreff() {
		return betreff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBetreff(String newBetreff) {
		String oldBetreff = betreff;
		betreff = newBetreff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE__BETREFF, oldBetreff, betreff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getSendezeitpunkt() {
		return sendezeitpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSendezeitpunkt(XMLGregorianCalendar newSendezeitpunkt) {
		XMLGregorianCalendar oldSendezeitpunkt = sendezeitpunkt;
		sendezeitpunkt = newSendezeitpunkt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE__SENDEZEITPUNKT, oldSendezeitpunkt, sendezeitpunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getErgaenzendeHinweise() {
		return ergaenzendeHinweise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErgaenzendeHinweise(String newErgaenzendeHinweise) {
		String oldErgaenzendeHinweise = ergaenzendeHinweise;
		ergaenzendeHinweise = newErgaenzendeHinweise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE__ERGAENZENDE_HINWEISE, oldErgaenzendeHinweise, ergaenzendeHinweise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE__NACHRICHTEN_ID:
				return getNachrichtenId();
			case AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE__BETREFF:
				return getBetreff();
			case AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE__SENDEZEITPUNKT:
				return getSendezeitpunkt();
			case AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE__ERGAENZENDE_HINWEISE:
				return getErgaenzendeHinweise();
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
			case AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE__NACHRICHTEN_ID:
				setNachrichtenId((String)newValue);
				return;
			case AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE__BETREFF:
				setBetreff((String)newValue);
				return;
			case AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE__SENDEZEITPUNKT:
				setSendezeitpunkt((XMLGregorianCalendar)newValue);
				return;
			case AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE__ERGAENZENDE_HINWEISE:
				setErgaenzendeHinweise((String)newValue);
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
			case AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE__NACHRICHTEN_ID:
				setNachrichtenId(NACHRICHTEN_ID_EDEFAULT);
				return;
			case AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE__BETREFF:
				setBetreff(BETREFF_EDEFAULT);
				return;
			case AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE__SENDEZEITPUNKT:
				setSendezeitpunkt(SENDEZEITPUNKT_EDEFAULT);
				return;
			case AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE__ERGAENZENDE_HINWEISE:
				setErgaenzendeHinweise(ERGAENZENDE_HINWEISE_EDEFAULT);
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
			case AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE__NACHRICHTEN_ID:
				return NACHRICHTEN_ID_EDEFAULT == null ? nachrichtenId != null : !NACHRICHTEN_ID_EDEFAULT.equals(nachrichtenId);
			case AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE__BETREFF:
				return BETREFF_EDEFAULT == null ? betreff != null : !BETREFF_EDEFAULT.equals(betreff);
			case AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE__SENDEZEITPUNKT:
				return SENDEZEITPUNKT_EDEFAULT == null ? sendezeitpunkt != null : !SENDEZEITPUNKT_EDEFAULT.equals(sendezeitpunkt);
			case AllgemeineNachrichtenPackage.TRANSPORTINFORMATIONEN_TYPE__ERGAENZENDE_HINWEISE:
				return ERGAENZENDE_HINWEISE_EDEFAULT == null ? ergaenzendeHinweise != null : !ERGAENZENDE_HINWEISE_EDEFAULT.equals(ergaenzendeHinweise);
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
		result.append(" (nachrichtenId: ");
		result.append(nachrichtenId);
		result.append(", betreff: ");
		result.append(betreff);
		result.append(", sendezeitpunkt: ");
		result.append(sendezeitpunkt);
		result.append(", ergaenzendeHinweise: ");
		result.append(ergaenzendeHinweise);
		result.append(')');
		return result.toString();
	}

} //TransportinformationenTypeImpl
