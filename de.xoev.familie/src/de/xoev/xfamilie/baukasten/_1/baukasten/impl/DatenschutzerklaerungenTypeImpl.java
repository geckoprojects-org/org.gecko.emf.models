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

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;
import de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datenschutzerklaerungen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.DatenschutzerklaerungenTypeImpl#isDsgvoBetreiber <em>Dsgvo Betreiber</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.DatenschutzerklaerungenTypeImpl#isDsgvoNachnutzer <em>Dsgvo Nachnutzer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatenschutzerklaerungenTypeImpl extends MinimalEObjectImpl.Container implements DatenschutzerklaerungenType {
	/**
	 * The default value of the '{@link #isDsgvoBetreiber() <em>Dsgvo Betreiber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDsgvoBetreiber()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DSGVO_BETREIBER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDsgvoBetreiber() <em>Dsgvo Betreiber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDsgvoBetreiber()
	 * @generated
	 * @ordered
	 */
	protected boolean dsgvoBetreiber = DSGVO_BETREIBER_EDEFAULT;

	/**
	 * This is true if the Dsgvo Betreiber attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dsgvoBetreiberESet;

	/**
	 * The default value of the '{@link #isDsgvoNachnutzer() <em>Dsgvo Nachnutzer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDsgvoNachnutzer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DSGVO_NACHNUTZER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDsgvoNachnutzer() <em>Dsgvo Nachnutzer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDsgvoNachnutzer()
	 * @generated
	 * @ordered
	 */
	protected boolean dsgvoNachnutzer = DSGVO_NACHNUTZER_EDEFAULT;

	/**
	 * This is true if the Dsgvo Nachnutzer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dsgvoNachnutzerESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatenschutzerklaerungenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.DATENSCHUTZERKLAERUNGEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDsgvoBetreiber() {
		return dsgvoBetreiber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDsgvoBetreiber(boolean newDsgvoBetreiber) {
		boolean oldDsgvoBetreiber = dsgvoBetreiber;
		dsgvoBetreiber = newDsgvoBetreiber;
		boolean oldDsgvoBetreiberESet = dsgvoBetreiberESet;
		dsgvoBetreiberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.DATENSCHUTZERKLAERUNGEN_TYPE__DSGVO_BETREIBER, oldDsgvoBetreiber, dsgvoBetreiber, !oldDsgvoBetreiberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDsgvoBetreiber() {
		boolean oldDsgvoBetreiber = dsgvoBetreiber;
		boolean oldDsgvoBetreiberESet = dsgvoBetreiberESet;
		dsgvoBetreiber = DSGVO_BETREIBER_EDEFAULT;
		dsgvoBetreiberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BaukastenPackage.DATENSCHUTZERKLAERUNGEN_TYPE__DSGVO_BETREIBER, oldDsgvoBetreiber, DSGVO_BETREIBER_EDEFAULT, oldDsgvoBetreiberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDsgvoBetreiber() {
		return dsgvoBetreiberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDsgvoNachnutzer() {
		return dsgvoNachnutzer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDsgvoNachnutzer(boolean newDsgvoNachnutzer) {
		boolean oldDsgvoNachnutzer = dsgvoNachnutzer;
		dsgvoNachnutzer = newDsgvoNachnutzer;
		boolean oldDsgvoNachnutzerESet = dsgvoNachnutzerESet;
		dsgvoNachnutzerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.DATENSCHUTZERKLAERUNGEN_TYPE__DSGVO_NACHNUTZER, oldDsgvoNachnutzer, dsgvoNachnutzer, !oldDsgvoNachnutzerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDsgvoNachnutzer() {
		boolean oldDsgvoNachnutzer = dsgvoNachnutzer;
		boolean oldDsgvoNachnutzerESet = dsgvoNachnutzerESet;
		dsgvoNachnutzer = DSGVO_NACHNUTZER_EDEFAULT;
		dsgvoNachnutzerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BaukastenPackage.DATENSCHUTZERKLAERUNGEN_TYPE__DSGVO_NACHNUTZER, oldDsgvoNachnutzer, DSGVO_NACHNUTZER_EDEFAULT, oldDsgvoNachnutzerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDsgvoNachnutzer() {
		return dsgvoNachnutzerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BaukastenPackage.DATENSCHUTZERKLAERUNGEN_TYPE__DSGVO_BETREIBER:
				return isDsgvoBetreiber();
			case BaukastenPackage.DATENSCHUTZERKLAERUNGEN_TYPE__DSGVO_NACHNUTZER:
				return isDsgvoNachnutzer();
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
			case BaukastenPackage.DATENSCHUTZERKLAERUNGEN_TYPE__DSGVO_BETREIBER:
				setDsgvoBetreiber((Boolean)newValue);
				return;
			case BaukastenPackage.DATENSCHUTZERKLAERUNGEN_TYPE__DSGVO_NACHNUTZER:
				setDsgvoNachnutzer((Boolean)newValue);
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
			case BaukastenPackage.DATENSCHUTZERKLAERUNGEN_TYPE__DSGVO_BETREIBER:
				unsetDsgvoBetreiber();
				return;
			case BaukastenPackage.DATENSCHUTZERKLAERUNGEN_TYPE__DSGVO_NACHNUTZER:
				unsetDsgvoNachnutzer();
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
			case BaukastenPackage.DATENSCHUTZERKLAERUNGEN_TYPE__DSGVO_BETREIBER:
				return isSetDsgvoBetreiber();
			case BaukastenPackage.DATENSCHUTZERKLAERUNGEN_TYPE__DSGVO_NACHNUTZER:
				return isSetDsgvoNachnutzer();
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
		result.append(" (dsgvoBetreiber: ");
		if (dsgvoBetreiberESet) result.append(dsgvoBetreiber); else result.append("<unset>");
		result.append(", dsgvoNachnutzer: ");
		if (dsgvoNachnutzerESet) result.append(dsgvoNachnutzer); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DatenschutzerklaerungenTypeImpl
