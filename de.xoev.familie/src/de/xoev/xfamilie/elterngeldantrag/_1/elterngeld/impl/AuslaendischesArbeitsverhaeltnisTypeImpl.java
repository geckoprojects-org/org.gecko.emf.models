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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslaendischesArbeitsverhaeltnisType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auslaendisches Arbeitsverhaeltnis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AuslaendischesArbeitsverhaeltnisTypeImpl#isAuslaendischesArbeitsverhaeltnis <em>Auslaendisches Arbeitsverhaeltnis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AuslaendischesArbeitsverhaeltnisTypeImpl#getBeschaeftigungsland <em>Beschaeftigungsland</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AuslaendischesArbeitsverhaeltnisTypeImpl#isAuslaendischesArbeitsverhaeltnisAndererET <em>Auslaendisches Arbeitsverhaeltnis Anderer ET</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuslaendischesArbeitsverhaeltnisTypeImpl extends MinimalEObjectImpl.Container implements AuslaendischesArbeitsverhaeltnisType {
	/**
	 * The default value of the '{@link #isAuslaendischesArbeitsverhaeltnis() <em>Auslaendisches Arbeitsverhaeltnis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuslaendischesArbeitsverhaeltnis()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUSLAENDISCHES_ARBEITSVERHAELTNIS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAuslaendischesArbeitsverhaeltnis() <em>Auslaendisches Arbeitsverhaeltnis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuslaendischesArbeitsverhaeltnis()
	 * @generated
	 * @ordered
	 */
	protected boolean auslaendischesArbeitsverhaeltnis = AUSLAENDISCHES_ARBEITSVERHAELTNIS_EDEFAULT;

	/**
	 * This is true if the Auslaendisches Arbeitsverhaeltnis attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean auslaendischesArbeitsverhaeltnisESet;

	/**
	 * The cached value of the '{@link #getBeschaeftigungsland() <em>Beschaeftigungsland</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschaeftigungsland()
	 * @generated
	 * @ordered
	 */
	protected CodeStaatType beschaeftigungsland;

	/**
	 * The default value of the '{@link #isAuslaendischesArbeitsverhaeltnisAndererET() <em>Auslaendisches Arbeitsverhaeltnis Anderer ET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuslaendischesArbeitsverhaeltnisAndererET()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUSLAENDISCHES_ARBEITSVERHAELTNIS_ANDERER_ET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAuslaendischesArbeitsverhaeltnisAndererET() <em>Auslaendisches Arbeitsverhaeltnis Anderer ET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuslaendischesArbeitsverhaeltnisAndererET()
	 * @generated
	 * @ordered
	 */
	protected boolean auslaendischesArbeitsverhaeltnisAndererET = AUSLAENDISCHES_ARBEITSVERHAELTNIS_ANDERER_ET_EDEFAULT;

	/**
	 * This is true if the Auslaendisches Arbeitsverhaeltnis Anderer ET attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean auslaendischesArbeitsverhaeltnisAndererETESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuslaendischesArbeitsverhaeltnisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getAuslaendischesArbeitsverhaeltnisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAuslaendischesArbeitsverhaeltnis() {
		return auslaendischesArbeitsverhaeltnis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuslaendischesArbeitsverhaeltnis(boolean newAuslaendischesArbeitsverhaeltnis) {
		boolean oldAuslaendischesArbeitsverhaeltnis = auslaendischesArbeitsverhaeltnis;
		auslaendischesArbeitsverhaeltnis = newAuslaendischesArbeitsverhaeltnis;
		boolean oldAuslaendischesArbeitsverhaeltnisESet = auslaendischesArbeitsverhaeltnisESet;
		auslaendischesArbeitsverhaeltnisESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS, oldAuslaendischesArbeitsverhaeltnis, auslaendischesArbeitsverhaeltnis, !oldAuslaendischesArbeitsverhaeltnisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAuslaendischesArbeitsverhaeltnis() {
		boolean oldAuslaendischesArbeitsverhaeltnis = auslaendischesArbeitsverhaeltnis;
		boolean oldAuslaendischesArbeitsverhaeltnisESet = auslaendischesArbeitsverhaeltnisESet;
		auslaendischesArbeitsverhaeltnis = AUSLAENDISCHES_ARBEITSVERHAELTNIS_EDEFAULT;
		auslaendischesArbeitsverhaeltnisESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS, oldAuslaendischesArbeitsverhaeltnis, AUSLAENDISCHES_ARBEITSVERHAELTNIS_EDEFAULT, oldAuslaendischesArbeitsverhaeltnisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAuslaendischesArbeitsverhaeltnis() {
		return auslaendischesArbeitsverhaeltnisESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeStaatType getBeschaeftigungsland() {
		return beschaeftigungsland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeschaeftigungsland(CodeStaatType newBeschaeftigungsland, NotificationChain msgs) {
		CodeStaatType oldBeschaeftigungsland = beschaeftigungsland;
		beschaeftigungsland = newBeschaeftigungsland;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__BESCHAEFTIGUNGSLAND, oldBeschaeftigungsland, newBeschaeftigungsland);
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
	public void setBeschaeftigungsland(CodeStaatType newBeschaeftigungsland) {
		if (newBeschaeftigungsland != beschaeftigungsland) {
			NotificationChain msgs = null;
			if (beschaeftigungsland != null)
				msgs = ((InternalEObject)beschaeftigungsland).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__BESCHAEFTIGUNGSLAND, null, msgs);
			if (newBeschaeftigungsland != null)
				msgs = ((InternalEObject)newBeschaeftigungsland).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__BESCHAEFTIGUNGSLAND, null, msgs);
			msgs = basicSetBeschaeftigungsland(newBeschaeftigungsland, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__BESCHAEFTIGUNGSLAND, newBeschaeftigungsland, newBeschaeftigungsland));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAuslaendischesArbeitsverhaeltnisAndererET() {
		return auslaendischesArbeitsverhaeltnisAndererET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuslaendischesArbeitsverhaeltnisAndererET(boolean newAuslaendischesArbeitsverhaeltnisAndererET) {
		boolean oldAuslaendischesArbeitsverhaeltnisAndererET = auslaendischesArbeitsverhaeltnisAndererET;
		auslaendischesArbeitsverhaeltnisAndererET = newAuslaendischesArbeitsverhaeltnisAndererET;
		boolean oldAuslaendischesArbeitsverhaeltnisAndererETESet = auslaendischesArbeitsverhaeltnisAndererETESet;
		auslaendischesArbeitsverhaeltnisAndererETESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS_ANDERER_ET, oldAuslaendischesArbeitsverhaeltnisAndererET, auslaendischesArbeitsverhaeltnisAndererET, !oldAuslaendischesArbeitsverhaeltnisAndererETESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAuslaendischesArbeitsverhaeltnisAndererET() {
		boolean oldAuslaendischesArbeitsverhaeltnisAndererET = auslaendischesArbeitsverhaeltnisAndererET;
		boolean oldAuslaendischesArbeitsverhaeltnisAndererETESet = auslaendischesArbeitsverhaeltnisAndererETESet;
		auslaendischesArbeitsverhaeltnisAndererET = AUSLAENDISCHES_ARBEITSVERHAELTNIS_ANDERER_ET_EDEFAULT;
		auslaendischesArbeitsverhaeltnisAndererETESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS_ANDERER_ET, oldAuslaendischesArbeitsverhaeltnisAndererET, AUSLAENDISCHES_ARBEITSVERHAELTNIS_ANDERER_ET_EDEFAULT, oldAuslaendischesArbeitsverhaeltnisAndererETESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAuslaendischesArbeitsverhaeltnisAndererET() {
		return auslaendischesArbeitsverhaeltnisAndererETESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__BESCHAEFTIGUNGSLAND:
				return basicSetBeschaeftigungsland(null, msgs);
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
			case ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS:
				return isAuslaendischesArbeitsverhaeltnis();
			case ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__BESCHAEFTIGUNGSLAND:
				return getBeschaeftigungsland();
			case ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS_ANDERER_ET:
				return isAuslaendischesArbeitsverhaeltnisAndererET();
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
			case ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS:
				setAuslaendischesArbeitsverhaeltnis((Boolean)newValue);
				return;
			case ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__BESCHAEFTIGUNGSLAND:
				setBeschaeftigungsland((CodeStaatType)newValue);
				return;
			case ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS_ANDERER_ET:
				setAuslaendischesArbeitsverhaeltnisAndererET((Boolean)newValue);
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
			case ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS:
				unsetAuslaendischesArbeitsverhaeltnis();
				return;
			case ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__BESCHAEFTIGUNGSLAND:
				setBeschaeftigungsland((CodeStaatType)null);
				return;
			case ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS_ANDERER_ET:
				unsetAuslaendischesArbeitsverhaeltnisAndererET();
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
			case ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS:
				return isSetAuslaendischesArbeitsverhaeltnis();
			case ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__BESCHAEFTIGUNGSLAND:
				return beschaeftigungsland != null;
			case ElterngeldPackage.AUSLAENDISCHES_ARBEITSVERHAELTNIS_TYPE__AUSLAENDISCHES_ARBEITSVERHAELTNIS_ANDERER_ET:
				return isSetAuslaendischesArbeitsverhaeltnisAndererET();
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
		result.append(" (auslaendischesArbeitsverhaeltnis: ");
		if (auslaendischesArbeitsverhaeltnisESet) result.append(auslaendischesArbeitsverhaeltnis); else result.append("<unset>");
		result.append(", auslaendischesArbeitsverhaeltnisAndererET: ");
		if (auslaendischesArbeitsverhaeltnisAndererETESet) result.append(auslaendischesArbeitsverhaeltnisAndererET); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AuslaendischesArbeitsverhaeltnisTypeImpl
