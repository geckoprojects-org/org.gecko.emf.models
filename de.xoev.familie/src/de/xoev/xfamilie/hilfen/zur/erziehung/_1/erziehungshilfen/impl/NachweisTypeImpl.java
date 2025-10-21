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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweisType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nachweis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.NachweisTypeImpl#getNachweisBeschreibung <em>Nachweis Beschreibung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.NachweisTypeImpl#getNachweisDokument <em>Nachweis Dokument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NachweisTypeImpl extends MinimalEObjectImpl.Container implements NachweisType {
	/**
	 * The default value of the '{@link #getNachweisBeschreibung() <em>Nachweis Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected static final String NACHWEIS_BESCHREIBUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNachweisBeschreibung() <em>Nachweis Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected String nachweisBeschreibung = NACHWEIS_BESCHREIBUNG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNachweisDokument() <em>Nachweis Dokument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisDokument()
	 * @generated
	 * @ordered
	 */
	protected NachweisdokumentType nachweisDokument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NachweisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErziehungshilfePackage.Literals.NACHWEIS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNachweisBeschreibung() {
		return nachweisBeschreibung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNachweisBeschreibung(String newNachweisBeschreibung) {
		String oldNachweisBeschreibung = nachweisBeschreibung;
		nachweisBeschreibung = newNachweisBeschreibung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.NACHWEIS_TYPE__NACHWEIS_BESCHREIBUNG, oldNachweisBeschreibung, nachweisBeschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisdokumentType getNachweisDokument() {
		return nachweisDokument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachweisDokument(NachweisdokumentType newNachweisDokument, NotificationChain msgs) {
		NachweisdokumentType oldNachweisDokument = nachweisDokument;
		nachweisDokument = newNachweisDokument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.NACHWEIS_TYPE__NACHWEIS_DOKUMENT, oldNachweisDokument, newNachweisDokument);
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
	public void setNachweisDokument(NachweisdokumentType newNachweisDokument) {
		if (newNachweisDokument != nachweisDokument) {
			NotificationChain msgs = null;
			if (nachweisDokument != null)
				msgs = ((InternalEObject)nachweisDokument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.NACHWEIS_TYPE__NACHWEIS_DOKUMENT, null, msgs);
			if (newNachweisDokument != null)
				msgs = ((InternalEObject)newNachweisDokument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.NACHWEIS_TYPE__NACHWEIS_DOKUMENT, null, msgs);
			msgs = basicSetNachweisDokument(newNachweisDokument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.NACHWEIS_TYPE__NACHWEIS_DOKUMENT, newNachweisDokument, newNachweisDokument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErziehungshilfePackage.NACHWEIS_TYPE__NACHWEIS_DOKUMENT:
				return basicSetNachweisDokument(null, msgs);
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
			case ErziehungshilfePackage.NACHWEIS_TYPE__NACHWEIS_BESCHREIBUNG:
				return getNachweisBeschreibung();
			case ErziehungshilfePackage.NACHWEIS_TYPE__NACHWEIS_DOKUMENT:
				return getNachweisDokument();
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
			case ErziehungshilfePackage.NACHWEIS_TYPE__NACHWEIS_BESCHREIBUNG:
				setNachweisBeschreibung((String)newValue);
				return;
			case ErziehungshilfePackage.NACHWEIS_TYPE__NACHWEIS_DOKUMENT:
				setNachweisDokument((NachweisdokumentType)newValue);
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
			case ErziehungshilfePackage.NACHWEIS_TYPE__NACHWEIS_BESCHREIBUNG:
				setNachweisBeschreibung(NACHWEIS_BESCHREIBUNG_EDEFAULT);
				return;
			case ErziehungshilfePackage.NACHWEIS_TYPE__NACHWEIS_DOKUMENT:
				setNachweisDokument((NachweisdokumentType)null);
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
			case ErziehungshilfePackage.NACHWEIS_TYPE__NACHWEIS_BESCHREIBUNG:
				return NACHWEIS_BESCHREIBUNG_EDEFAULT == null ? nachweisBeschreibung != null : !NACHWEIS_BESCHREIBUNG_EDEFAULT.equals(nachweisBeschreibung);
			case ErziehungshilfePackage.NACHWEIS_TYPE__NACHWEIS_DOKUMENT:
				return nachweisDokument != null;
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
		result.append(" (nachweisBeschreibung: ");
		result.append(nachweisBeschreibung);
		result.append(')');
		return result.toString();
	}

} //NachweisTypeImpl
