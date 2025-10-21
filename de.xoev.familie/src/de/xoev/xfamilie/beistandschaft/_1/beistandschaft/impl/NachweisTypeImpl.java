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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweisType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nachweis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.NachweisTypeImpl#getNachweisBeschreibung <em>Nachweis Beschreibung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.NachweisTypeImpl#getNachweisDokument <em>Nachweis Dokument</em>}</li>
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
	 * The cached value of the '{@link #getNachweisDokument() <em>Nachweis Dokument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisDokument()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisDokument;

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
		return BeistandschaftPackage.Literals.NACHWEIS_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.NACHWEIS_TYPE__NACHWEIS_BESCHREIBUNG, oldNachweisBeschreibung, nachweisBeschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisDokument() {
		if (nachweisDokument == null) {
			nachweisDokument = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, BeistandschaftPackage.NACHWEIS_TYPE__NACHWEIS_DOKUMENT);
		}
		return nachweisDokument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BeistandschaftPackage.NACHWEIS_TYPE__NACHWEIS_DOKUMENT:
				return ((InternalEList<?>)getNachweisDokument()).basicRemove(otherEnd, msgs);
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
			case BeistandschaftPackage.NACHWEIS_TYPE__NACHWEIS_BESCHREIBUNG:
				return getNachweisBeschreibung();
			case BeistandschaftPackage.NACHWEIS_TYPE__NACHWEIS_DOKUMENT:
				return getNachweisDokument();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BeistandschaftPackage.NACHWEIS_TYPE__NACHWEIS_BESCHREIBUNG:
				setNachweisBeschreibung((String)newValue);
				return;
			case BeistandschaftPackage.NACHWEIS_TYPE__NACHWEIS_DOKUMENT:
				getNachweisDokument().clear();
				getNachweisDokument().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case BeistandschaftPackage.NACHWEIS_TYPE__NACHWEIS_BESCHREIBUNG:
				setNachweisBeschreibung(NACHWEIS_BESCHREIBUNG_EDEFAULT);
				return;
			case BeistandschaftPackage.NACHWEIS_TYPE__NACHWEIS_DOKUMENT:
				getNachweisDokument().clear();
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
			case BeistandschaftPackage.NACHWEIS_TYPE__NACHWEIS_BESCHREIBUNG:
				return NACHWEIS_BESCHREIBUNG_EDEFAULT == null ? nachweisBeschreibung != null : !NACHWEIS_BESCHREIBUNG_EDEFAULT.equals(nachweisBeschreibung);
			case BeistandschaftPackage.NACHWEIS_TYPE__NACHWEIS_DOKUMENT:
				return nachweisDokument != null && !nachweisDokument.isEmpty();
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
