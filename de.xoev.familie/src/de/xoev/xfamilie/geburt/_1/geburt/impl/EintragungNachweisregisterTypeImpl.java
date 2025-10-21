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
package de.xoev.xfamilie.geburt._1.geburt.impl;

import de.xoev.xfamilie.geburt._1.geburt.CodeAlleinsorgeEintragungType;
import de.xoev.xfamilie.geburt._1.geburt.EintragungNachweisregisterType;
import de.xoev.xfamilie.geburt._1.geburt.GeburtPackage;

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
 * An implementation of the model object '<em><b>Eintragung Nachweisregister Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.EintragungNachweisregisterTypeImpl#isEintragungVorhanden <em>Eintragung Vorhanden</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.EintragungNachweisregisterTypeImpl#getEintragungSorgeregisterArt <em>Eintragung Sorgeregister Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.EintragungNachweisregisterTypeImpl#getWohnortJugendamtMutter <em>Wohnort Jugendamt Mutter</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.EintragungNachweisregisterTypeImpl#getRegisterfuerhrendesJugendamt <em>Registerfuerhrendes Jugendamt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EintragungNachweisregisterTypeImpl extends MinimalEObjectImpl.Container implements EintragungNachweisregisterType {
	/**
	 * The default value of the '{@link #isEintragungVorhanden() <em>Eintragung Vorhanden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEintragungVorhanden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EINTRAGUNG_VORHANDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEintragungVorhanden() <em>Eintragung Vorhanden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEintragungVorhanden()
	 * @generated
	 * @ordered
	 */
	protected boolean eintragungVorhanden = EINTRAGUNG_VORHANDEN_EDEFAULT;

	/**
	 * This is true if the Eintragung Vorhanden attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eintragungVorhandenESet;

	/**
	 * The cached value of the '{@link #getEintragungSorgeregisterArt() <em>Eintragung Sorgeregister Art</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEintragungSorgeregisterArt()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeAlleinsorgeEintragungType> eintragungSorgeregisterArt;

	/**
	 * The default value of the '{@link #getWohnortJugendamtMutter() <em>Wohnort Jugendamt Mutter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnortJugendamtMutter()
	 * @generated
	 * @ordered
	 */
	protected static final String WOHNORT_JUGENDAMT_MUTTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWohnortJugendamtMutter() <em>Wohnort Jugendamt Mutter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnortJugendamtMutter()
	 * @generated
	 * @ordered
	 */
	protected String wohnortJugendamtMutter = WOHNORT_JUGENDAMT_MUTTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegisterfuerhrendesJugendamt() <em>Registerfuerhrendes Jugendamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterfuerhrendesJugendamt()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTERFUERHRENDES_JUGENDAMT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegisterfuerhrendesJugendamt() <em>Registerfuerhrendes Jugendamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterfuerhrendesJugendamt()
	 * @generated
	 * @ordered
	 */
	protected String registerfuerhrendesJugendamt = REGISTERFUERHRENDES_JUGENDAMT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EintragungNachweisregisterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeburtPackage.Literals.EINTRAGUNG_NACHWEISREGISTER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEintragungVorhanden() {
		return eintragungVorhanden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEintragungVorhanden(boolean newEintragungVorhanden) {
		boolean oldEintragungVorhanden = eintragungVorhanden;
		eintragungVorhanden = newEintragungVorhanden;
		boolean oldEintragungVorhandenESet = eintragungVorhandenESet;
		eintragungVorhandenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__EINTRAGUNG_VORHANDEN, oldEintragungVorhanden, eintragungVorhanden, !oldEintragungVorhandenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEintragungVorhanden() {
		boolean oldEintragungVorhanden = eintragungVorhanden;
		boolean oldEintragungVorhandenESet = eintragungVorhandenESet;
		eintragungVorhanden = EINTRAGUNG_VORHANDEN_EDEFAULT;
		eintragungVorhandenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__EINTRAGUNG_VORHANDEN, oldEintragungVorhanden, EINTRAGUNG_VORHANDEN_EDEFAULT, oldEintragungVorhandenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEintragungVorhanden() {
		return eintragungVorhandenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeAlleinsorgeEintragungType> getEintragungSorgeregisterArt() {
		if (eintragungSorgeregisterArt == null) {
			eintragungSorgeregisterArt = new EObjectContainmentEList<CodeAlleinsorgeEintragungType>(CodeAlleinsorgeEintragungType.class, this, GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__EINTRAGUNG_SORGEREGISTER_ART);
		}
		return eintragungSorgeregisterArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWohnortJugendamtMutter() {
		return wohnortJugendamtMutter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWohnortJugendamtMutter(String newWohnortJugendamtMutter) {
		String oldWohnortJugendamtMutter = wohnortJugendamtMutter;
		wohnortJugendamtMutter = newWohnortJugendamtMutter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__WOHNORT_JUGENDAMT_MUTTER, oldWohnortJugendamtMutter, wohnortJugendamtMutter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegisterfuerhrendesJugendamt() {
		return registerfuerhrendesJugendamt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegisterfuerhrendesJugendamt(String newRegisterfuerhrendesJugendamt) {
		String oldRegisterfuerhrendesJugendamt = registerfuerhrendesJugendamt;
		registerfuerhrendesJugendamt = newRegisterfuerhrendesJugendamt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__REGISTERFUERHRENDES_JUGENDAMT, oldRegisterfuerhrendesJugendamt, registerfuerhrendesJugendamt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__EINTRAGUNG_SORGEREGISTER_ART:
				return ((InternalEList<?>)getEintragungSorgeregisterArt()).basicRemove(otherEnd, msgs);
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
			case GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__EINTRAGUNG_VORHANDEN:
				return isEintragungVorhanden();
			case GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__EINTRAGUNG_SORGEREGISTER_ART:
				return getEintragungSorgeregisterArt();
			case GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__WOHNORT_JUGENDAMT_MUTTER:
				return getWohnortJugendamtMutter();
			case GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__REGISTERFUERHRENDES_JUGENDAMT:
				return getRegisterfuerhrendesJugendamt();
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
			case GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__EINTRAGUNG_VORHANDEN:
				setEintragungVorhanden((Boolean)newValue);
				return;
			case GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__EINTRAGUNG_SORGEREGISTER_ART:
				getEintragungSorgeregisterArt().clear();
				getEintragungSorgeregisterArt().addAll((Collection<? extends CodeAlleinsorgeEintragungType>)newValue);
				return;
			case GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__WOHNORT_JUGENDAMT_MUTTER:
				setWohnortJugendamtMutter((String)newValue);
				return;
			case GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__REGISTERFUERHRENDES_JUGENDAMT:
				setRegisterfuerhrendesJugendamt((String)newValue);
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
			case GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__EINTRAGUNG_VORHANDEN:
				unsetEintragungVorhanden();
				return;
			case GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__EINTRAGUNG_SORGEREGISTER_ART:
				getEintragungSorgeregisterArt().clear();
				return;
			case GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__WOHNORT_JUGENDAMT_MUTTER:
				setWohnortJugendamtMutter(WOHNORT_JUGENDAMT_MUTTER_EDEFAULT);
				return;
			case GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__REGISTERFUERHRENDES_JUGENDAMT:
				setRegisterfuerhrendesJugendamt(REGISTERFUERHRENDES_JUGENDAMT_EDEFAULT);
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
			case GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__EINTRAGUNG_VORHANDEN:
				return isSetEintragungVorhanden();
			case GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__EINTRAGUNG_SORGEREGISTER_ART:
				return eintragungSorgeregisterArt != null && !eintragungSorgeregisterArt.isEmpty();
			case GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__WOHNORT_JUGENDAMT_MUTTER:
				return WOHNORT_JUGENDAMT_MUTTER_EDEFAULT == null ? wohnortJugendamtMutter != null : !WOHNORT_JUGENDAMT_MUTTER_EDEFAULT.equals(wohnortJugendamtMutter);
			case GeburtPackage.EINTRAGUNG_NACHWEISREGISTER_TYPE__REGISTERFUERHRENDES_JUGENDAMT:
				return REGISTERFUERHRENDES_JUGENDAMT_EDEFAULT == null ? registerfuerhrendesJugendamt != null : !REGISTERFUERHRENDES_JUGENDAMT_EDEFAULT.equals(registerfuerhrendesJugendamt);
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
		result.append(" (eintragungVorhanden: ");
		if (eintragungVorhandenESet) result.append(eintragungVorhanden); else result.append("<unset>");
		result.append(", wohnortJugendamtMutter: ");
		result.append(wohnortJugendamtMutter);
		result.append(", registerfuerhrendesJugendamt: ");
		result.append(registerfuerhrendesJugendamt);
		result.append(')');
		return result.toString();
	}

} //EintragungNachweisregisterTypeImpl
