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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SchuleType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SchuleTypeImpl#getMonatVoraussichtlicherAbschlussSchule <em>Monat Voraussichtlicher Abschluss Schule</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SchuleTypeImpl#getTatsacheMitNachweis <em>Tatsache Mit Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.SchuleTypeImpl#getSchulabschluss <em>Schulabschluss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchuleTypeImpl extends MinimalEObjectImpl.Container implements SchuleType {
	/**
	 * The default value of the '{@link #getMonatVoraussichtlicherAbschlussSchule() <em>Monat Voraussichtlicher Abschluss Schule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonatVoraussichtlicherAbschlussSchule()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MONAT_VORAUSSICHTLICHER_ABSCHLUSS_SCHULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonatVoraussichtlicherAbschlussSchule() <em>Monat Voraussichtlicher Abschluss Schule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonatVoraussichtlicherAbschlussSchule()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar monatVoraussichtlicherAbschlussSchule = MONAT_VORAUSSICHTLICHER_ABSCHLUSS_SCHULE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTatsacheMitNachweis() <em>Tatsache Mit Nachweis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTatsacheMitNachweis()
	 * @generated
	 * @ordered
	 */
	protected TatsacheMitNachweisType tatsacheMitNachweis;

	/**
	 * The default value of the '{@link #getSchulabschluss() <em>Schulabschluss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchulabschluss()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHULABSCHLUSS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchulabschluss() <em>Schulabschluss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchulabschluss()
	 * @generated
	 * @ordered
	 */
	protected String schulabschluss = SCHULABSCHLUSS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getSchuleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getMonatVoraussichtlicherAbschlussSchule() {
		return monatVoraussichtlicherAbschlussSchule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonatVoraussichtlicherAbschlussSchule(XMLGregorianCalendar newMonatVoraussichtlicherAbschlussSchule) {
		XMLGregorianCalendar oldMonatVoraussichtlicherAbschlussSchule = monatVoraussichtlicherAbschlussSchule;
		monatVoraussichtlicherAbschlussSchule = newMonatVoraussichtlicherAbschlussSchule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SCHULE_TYPE__MONAT_VORAUSSICHTLICHER_ABSCHLUSS_SCHULE, oldMonatVoraussichtlicherAbschlussSchule, monatVoraussichtlicherAbschlussSchule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TatsacheMitNachweisType getTatsacheMitNachweis() {
		return tatsacheMitNachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTatsacheMitNachweis(TatsacheMitNachweisType newTatsacheMitNachweis, NotificationChain msgs) {
		TatsacheMitNachweisType oldTatsacheMitNachweis = tatsacheMitNachweis;
		tatsacheMitNachweis = newTatsacheMitNachweis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SCHULE_TYPE__TATSACHE_MIT_NACHWEIS, oldTatsacheMitNachweis, newTatsacheMitNachweis);
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
	public void setTatsacheMitNachweis(TatsacheMitNachweisType newTatsacheMitNachweis) {
		if (newTatsacheMitNachweis != tatsacheMitNachweis) {
			NotificationChain msgs = null;
			if (tatsacheMitNachweis != null)
				msgs = ((InternalEObject)tatsacheMitNachweis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.SCHULE_TYPE__TATSACHE_MIT_NACHWEIS, null, msgs);
			if (newTatsacheMitNachweis != null)
				msgs = ((InternalEObject)newTatsacheMitNachweis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.SCHULE_TYPE__TATSACHE_MIT_NACHWEIS, null, msgs);
			msgs = basicSetTatsacheMitNachweis(newTatsacheMitNachweis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SCHULE_TYPE__TATSACHE_MIT_NACHWEIS, newTatsacheMitNachweis, newTatsacheMitNachweis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchulabschluss() {
		return schulabschluss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchulabschluss(String newSchulabschluss) {
		String oldSchulabschluss = schulabschluss;
		schulabschluss = newSchulabschluss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.SCHULE_TYPE__SCHULABSCHLUSS, oldSchulabschluss, schulabschluss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.SCHULE_TYPE__TATSACHE_MIT_NACHWEIS:
				return basicSetTatsacheMitNachweis(null, msgs);
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
			case UnterhaltsvorschussPackage.SCHULE_TYPE__MONAT_VORAUSSICHTLICHER_ABSCHLUSS_SCHULE:
				return getMonatVoraussichtlicherAbschlussSchule();
			case UnterhaltsvorschussPackage.SCHULE_TYPE__TATSACHE_MIT_NACHWEIS:
				return getTatsacheMitNachweis();
			case UnterhaltsvorschussPackage.SCHULE_TYPE__SCHULABSCHLUSS:
				return getSchulabschluss();
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
			case UnterhaltsvorschussPackage.SCHULE_TYPE__MONAT_VORAUSSICHTLICHER_ABSCHLUSS_SCHULE:
				setMonatVoraussichtlicherAbschlussSchule((XMLGregorianCalendar)newValue);
				return;
			case UnterhaltsvorschussPackage.SCHULE_TYPE__TATSACHE_MIT_NACHWEIS:
				setTatsacheMitNachweis((TatsacheMitNachweisType)newValue);
				return;
			case UnterhaltsvorschussPackage.SCHULE_TYPE__SCHULABSCHLUSS:
				setSchulabschluss((String)newValue);
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
			case UnterhaltsvorschussPackage.SCHULE_TYPE__MONAT_VORAUSSICHTLICHER_ABSCHLUSS_SCHULE:
				setMonatVoraussichtlicherAbschlussSchule(MONAT_VORAUSSICHTLICHER_ABSCHLUSS_SCHULE_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.SCHULE_TYPE__TATSACHE_MIT_NACHWEIS:
				setTatsacheMitNachweis((TatsacheMitNachweisType)null);
				return;
			case UnterhaltsvorschussPackage.SCHULE_TYPE__SCHULABSCHLUSS:
				setSchulabschluss(SCHULABSCHLUSS_EDEFAULT);
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
			case UnterhaltsvorschussPackage.SCHULE_TYPE__MONAT_VORAUSSICHTLICHER_ABSCHLUSS_SCHULE:
				return MONAT_VORAUSSICHTLICHER_ABSCHLUSS_SCHULE_EDEFAULT == null ? monatVoraussichtlicherAbschlussSchule != null : !MONAT_VORAUSSICHTLICHER_ABSCHLUSS_SCHULE_EDEFAULT.equals(monatVoraussichtlicherAbschlussSchule);
			case UnterhaltsvorschussPackage.SCHULE_TYPE__TATSACHE_MIT_NACHWEIS:
				return tatsacheMitNachweis != null;
			case UnterhaltsvorschussPackage.SCHULE_TYPE__SCHULABSCHLUSS:
				return SCHULABSCHLUSS_EDEFAULT == null ? schulabschluss != null : !SCHULABSCHLUSS_EDEFAULT.equals(schulabschluss);
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
		result.append(" (monatVoraussichtlicherAbschlussSchule: ");
		result.append(monatVoraussichtlicherAbschlussSchule);
		result.append(", schulabschluss: ");
		result.append(schulabschluss);
		result.append(')');
		return result.toString();
	}

} //SchuleTypeImpl
