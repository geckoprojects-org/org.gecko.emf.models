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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VersuchType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Versuch Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.VersuchTypeImpl#getNummerDesVersuchs <em>Nummer Des Versuchs</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.VersuchTypeImpl#getDatumDesVersuchs <em>Datum Des Versuchs</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.VersuchTypeImpl#getNachweisVierterVersuch <em>Nachweis Vierter Versuch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersuchTypeImpl extends MinimalEObjectImpl.Container implements VersuchType {
	/**
	 * The default value of the '{@link #getNummerDesVersuchs() <em>Nummer Des Versuchs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNummerDesVersuchs()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMMER_DES_VERSUCHS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNummerDesVersuchs() <em>Nummer Des Versuchs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNummerDesVersuchs()
	 * @generated
	 * @ordered
	 */
	protected String nummerDesVersuchs = NUMMER_DES_VERSUCHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatumDesVersuchs() <em>Datum Des Versuchs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatumDesVersuchs()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATUM_DES_VERSUCHS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatumDesVersuchs() <em>Datum Des Versuchs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatumDesVersuchs()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar datumDesVersuchs = DATUM_DES_VERSUCHS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNachweisVierterVersuch() <em>Nachweis Vierter Versuch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisVierterVersuch()
	 * @generated
	 * @ordered
	 */
	protected NachweisdokumentType nachweisVierterVersuch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersuchTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.VERSUCH_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNummerDesVersuchs() {
		return nummerDesVersuchs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNummerDesVersuchs(String newNummerDesVersuchs) {
		String oldNummerDesVersuchs = nummerDesVersuchs;
		nummerDesVersuchs = newNummerDesVersuchs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.VERSUCH_TYPE__NUMMER_DES_VERSUCHS, oldNummerDesVersuchs, nummerDesVersuchs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getDatumDesVersuchs() {
		return datumDesVersuchs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatumDesVersuchs(XMLGregorianCalendar newDatumDesVersuchs) {
		XMLGregorianCalendar oldDatumDesVersuchs = datumDesVersuchs;
		datumDesVersuchs = newDatumDesVersuchs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.VERSUCH_TYPE__DATUM_DES_VERSUCHS, oldDatumDesVersuchs, datumDesVersuchs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisdokumentType getNachweisVierterVersuch() {
		return nachweisVierterVersuch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachweisVierterVersuch(NachweisdokumentType newNachweisVierterVersuch, NotificationChain msgs) {
		NachweisdokumentType oldNachweisVierterVersuch = nachweisVierterVersuch;
		nachweisVierterVersuch = newNachweisVierterVersuch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.VERSUCH_TYPE__NACHWEIS_VIERTER_VERSUCH, oldNachweisVierterVersuch, newNachweisVierterVersuch);
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
	public void setNachweisVierterVersuch(NachweisdokumentType newNachweisVierterVersuch) {
		if (newNachweisVierterVersuch != nachweisVierterVersuch) {
			NotificationChain msgs = null;
			if (nachweisVierterVersuch != null)
				msgs = ((InternalEObject)nachweisVierterVersuch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.VERSUCH_TYPE__NACHWEIS_VIERTER_VERSUCH, null, msgs);
			if (newNachweisVierterVersuch != null)
				msgs = ((InternalEObject)newNachweisVierterVersuch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.VERSUCH_TYPE__NACHWEIS_VIERTER_VERSUCH, null, msgs);
			msgs = basicSetNachweisVierterVersuch(newNachweisVierterVersuch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.VERSUCH_TYPE__NACHWEIS_VIERTER_VERSUCH, newNachweisVierterVersuch, newNachweisVierterVersuch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinderwunschPackage.VERSUCH_TYPE__NACHWEIS_VIERTER_VERSUCH:
				return basicSetNachweisVierterVersuch(null, msgs);
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
			case KinderwunschPackage.VERSUCH_TYPE__NUMMER_DES_VERSUCHS:
				return getNummerDesVersuchs();
			case KinderwunschPackage.VERSUCH_TYPE__DATUM_DES_VERSUCHS:
				return getDatumDesVersuchs();
			case KinderwunschPackage.VERSUCH_TYPE__NACHWEIS_VIERTER_VERSUCH:
				return getNachweisVierterVersuch();
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
			case KinderwunschPackage.VERSUCH_TYPE__NUMMER_DES_VERSUCHS:
				setNummerDesVersuchs((String)newValue);
				return;
			case KinderwunschPackage.VERSUCH_TYPE__DATUM_DES_VERSUCHS:
				setDatumDesVersuchs((XMLGregorianCalendar)newValue);
				return;
			case KinderwunschPackage.VERSUCH_TYPE__NACHWEIS_VIERTER_VERSUCH:
				setNachweisVierterVersuch((NachweisdokumentType)newValue);
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
			case KinderwunschPackage.VERSUCH_TYPE__NUMMER_DES_VERSUCHS:
				setNummerDesVersuchs(NUMMER_DES_VERSUCHS_EDEFAULT);
				return;
			case KinderwunschPackage.VERSUCH_TYPE__DATUM_DES_VERSUCHS:
				setDatumDesVersuchs(DATUM_DES_VERSUCHS_EDEFAULT);
				return;
			case KinderwunschPackage.VERSUCH_TYPE__NACHWEIS_VIERTER_VERSUCH:
				setNachweisVierterVersuch((NachweisdokumentType)null);
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
			case KinderwunschPackage.VERSUCH_TYPE__NUMMER_DES_VERSUCHS:
				return NUMMER_DES_VERSUCHS_EDEFAULT == null ? nummerDesVersuchs != null : !NUMMER_DES_VERSUCHS_EDEFAULT.equals(nummerDesVersuchs);
			case KinderwunschPackage.VERSUCH_TYPE__DATUM_DES_VERSUCHS:
				return DATUM_DES_VERSUCHS_EDEFAULT == null ? datumDesVersuchs != null : !DATUM_DES_VERSUCHS_EDEFAULT.equals(datumDesVersuchs);
			case KinderwunschPackage.VERSUCH_TYPE__NACHWEIS_VIERTER_VERSUCH:
				return nachweisVierterVersuch != null;
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
		result.append(" (nummerDesVersuchs: ");
		result.append(nummerDesVersuchs);
		result.append(", datumDesVersuchs: ");
		result.append(datumDesVersuchs);
		result.append(')');
		return result.toString();
	}

} //VersuchTypeImpl
