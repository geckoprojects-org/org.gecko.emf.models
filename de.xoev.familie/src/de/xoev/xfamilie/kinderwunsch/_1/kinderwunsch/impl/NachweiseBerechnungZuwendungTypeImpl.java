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
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseBerechnungZuwendungType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nachweise Berechnung Zuwendung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseBerechnungZuwendungTypeImpl#getNegativbescheinigungVersicherungKostentraeger <em>Negativbescheinigung Versicherung Kostentraeger</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseBerechnungZuwendungTypeImpl#getZuschuesseKrankenversicherung <em>Zuschuesse Krankenversicherung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NachweiseBerechnungZuwendungTypeImpl extends MinimalEObjectImpl.Container implements NachweiseBerechnungZuwendungType {
	/**
	 * The cached value of the '{@link #getNegativbescheinigungVersicherungKostentraeger() <em>Negativbescheinigung Versicherung Kostentraeger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativbescheinigungVersicherungKostentraeger()
	 * @generated
	 * @ordered
	 */
	protected NachweisdokumentType negativbescheinigungVersicherungKostentraeger;

	/**
	 * The cached value of the '{@link #getZuschuesseKrankenversicherung() <em>Zuschuesse Krankenversicherung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZuschuesseKrankenversicherung()
	 * @generated
	 * @ordered
	 */
	protected ZuschuesseKrankenversicherungType zuschuesseKrankenversicherung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NachweiseBerechnungZuwendungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisdokumentType getNegativbescheinigungVersicherungKostentraeger() {
		return negativbescheinigungVersicherungKostentraeger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNegativbescheinigungVersicherungKostentraeger(NachweisdokumentType newNegativbescheinigungVersicherungKostentraeger, NotificationChain msgs) {
		NachweisdokumentType oldNegativbescheinigungVersicherungKostentraeger = negativbescheinigungVersicherungKostentraeger;
		negativbescheinigungVersicherungKostentraeger = newNegativbescheinigungVersicherungKostentraeger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER, oldNegativbescheinigungVersicherungKostentraeger, newNegativbescheinigungVersicherungKostentraeger);
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
	public void setNegativbescheinigungVersicherungKostentraeger(NachweisdokumentType newNegativbescheinigungVersicherungKostentraeger) {
		if (newNegativbescheinigungVersicherungKostentraeger != negativbescheinigungVersicherungKostentraeger) {
			NotificationChain msgs = null;
			if (negativbescheinigungVersicherungKostentraeger != null)
				msgs = ((InternalEObject)negativbescheinigungVersicherungKostentraeger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER, null, msgs);
			if (newNegativbescheinigungVersicherungKostentraeger != null)
				msgs = ((InternalEObject)newNegativbescheinigungVersicherungKostentraeger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER, null, msgs);
			msgs = basicSetNegativbescheinigungVersicherungKostentraeger(newNegativbescheinigungVersicherungKostentraeger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER, newNegativbescheinigungVersicherungKostentraeger, newNegativbescheinigungVersicherungKostentraeger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZuschuesseKrankenversicherungType getZuschuesseKrankenversicherung() {
		return zuschuesseKrankenversicherung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZuschuesseKrankenversicherung(ZuschuesseKrankenversicherungType newZuschuesseKrankenversicherung, NotificationChain msgs) {
		ZuschuesseKrankenversicherungType oldZuschuesseKrankenversicherung = zuschuesseKrankenversicherung;
		zuschuesseKrankenversicherung = newZuschuesseKrankenversicherung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__ZUSCHUESSE_KRANKENVERSICHERUNG, oldZuschuesseKrankenversicherung, newZuschuesseKrankenversicherung);
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
	public void setZuschuesseKrankenversicherung(ZuschuesseKrankenversicherungType newZuschuesseKrankenversicherung) {
		if (newZuschuesseKrankenversicherung != zuschuesseKrankenversicherung) {
			NotificationChain msgs = null;
			if (zuschuesseKrankenversicherung != null)
				msgs = ((InternalEObject)zuschuesseKrankenversicherung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__ZUSCHUESSE_KRANKENVERSICHERUNG, null, msgs);
			if (newZuschuesseKrankenversicherung != null)
				msgs = ((InternalEObject)newZuschuesseKrankenversicherung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__ZUSCHUESSE_KRANKENVERSICHERUNG, null, msgs);
			msgs = basicSetZuschuesseKrankenversicherung(newZuschuesseKrankenversicherung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__ZUSCHUESSE_KRANKENVERSICHERUNG, newZuschuesseKrankenversicherung, newZuschuesseKrankenversicherung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinderwunschPackage.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER:
				return basicSetNegativbescheinigungVersicherungKostentraeger(null, msgs);
			case KinderwunschPackage.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__ZUSCHUESSE_KRANKENVERSICHERUNG:
				return basicSetZuschuesseKrankenversicherung(null, msgs);
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
			case KinderwunschPackage.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER:
				return getNegativbescheinigungVersicherungKostentraeger();
			case KinderwunschPackage.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__ZUSCHUESSE_KRANKENVERSICHERUNG:
				return getZuschuesseKrankenversicherung();
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
			case KinderwunschPackage.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER:
				setNegativbescheinigungVersicherungKostentraeger((NachweisdokumentType)newValue);
				return;
			case KinderwunschPackage.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__ZUSCHUESSE_KRANKENVERSICHERUNG:
				setZuschuesseKrankenversicherung((ZuschuesseKrankenversicherungType)newValue);
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
			case KinderwunschPackage.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER:
				setNegativbescheinigungVersicherungKostentraeger((NachweisdokumentType)null);
				return;
			case KinderwunschPackage.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__ZUSCHUESSE_KRANKENVERSICHERUNG:
				setZuschuesseKrankenversicherung((ZuschuesseKrankenversicherungType)null);
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
			case KinderwunschPackage.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER:
				return negativbescheinigungVersicherungKostentraeger != null;
			case KinderwunschPackage.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__ZUSCHUESSE_KRANKENVERSICHERUNG:
				return zuschuesseKrankenversicherung != null;
		}
		return super.eIsSet(featureID);
	}

} //NachweiseBerechnungZuwendungTypeImpl
