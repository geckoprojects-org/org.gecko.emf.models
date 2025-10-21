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

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweisType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseDatenschutzType;

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
 * An implementation of the model object '<em><b>Nachweise Datenschutz Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.NachweiseDatenschutzTypeImpl#getNachweis <em>Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.NachweiseDatenschutzTypeImpl#isZustimmungET2 <em>Zustimmung ET2</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.NachweiseDatenschutzTypeImpl#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NachweiseDatenschutzTypeImpl extends MinimalEObjectImpl.Container implements NachweiseDatenschutzType {
	/**
	 * The cached value of the '{@link #getNachweis() <em>Nachweis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisType> nachweis;

	/**
	 * The default value of the '{@link #isZustimmungET2() <em>Zustimmung ET2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungET2()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZUSTIMMUNG_ET2_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZustimmungET2() <em>Zustimmung ET2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungET2()
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungET2 = ZUSTIMMUNG_ET2_EDEFAULT;

	/**
	 * This is true if the Zustimmung ET2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungET2ESet;

	/**
	 * The default value of the '{@link #isRichtigkeitAngaben() <em>Richtigkeit Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRichtigkeitAngaben()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RICHTIGKEIT_ANGABEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRichtigkeitAngaben() <em>Richtigkeit Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRichtigkeitAngaben()
	 * @generated
	 * @ordered
	 */
	protected boolean richtigkeitAngaben = RICHTIGKEIT_ANGABEN_EDEFAULT;

	/**
	 * This is true if the Richtigkeit Angaben attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean richtigkeitAngabenESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NachweiseDatenschutzTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErziehungshilfePackage.Literals.NACHWEISE_DATENSCHUTZ_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisType> getNachweis() {
		if (nachweis == null) {
			nachweis = new EObjectContainmentEList<NachweisType>(NachweisType.class, this, ErziehungshilfePackage.NACHWEISE_DATENSCHUTZ_TYPE__NACHWEIS);
		}
		return nachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZustimmungET2() {
		return zustimmungET2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZustimmungET2(boolean newZustimmungET2) {
		boolean oldZustimmungET2 = zustimmungET2;
		zustimmungET2 = newZustimmungET2;
		boolean oldZustimmungET2ESet = zustimmungET2ESet;
		zustimmungET2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.NACHWEISE_DATENSCHUTZ_TYPE__ZUSTIMMUNG_ET2, oldZustimmungET2, zustimmungET2, !oldZustimmungET2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZustimmungET2() {
		boolean oldZustimmungET2 = zustimmungET2;
		boolean oldZustimmungET2ESet = zustimmungET2ESet;
		zustimmungET2 = ZUSTIMMUNG_ET2_EDEFAULT;
		zustimmungET2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErziehungshilfePackage.NACHWEISE_DATENSCHUTZ_TYPE__ZUSTIMMUNG_ET2, oldZustimmungET2, ZUSTIMMUNG_ET2_EDEFAULT, oldZustimmungET2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZustimmungET2() {
		return zustimmungET2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRichtigkeitAngaben() {
		return richtigkeitAngaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRichtigkeitAngaben(boolean newRichtigkeitAngaben) {
		boolean oldRichtigkeitAngaben = richtigkeitAngaben;
		richtigkeitAngaben = newRichtigkeitAngaben;
		boolean oldRichtigkeitAngabenESet = richtigkeitAngabenESet;
		richtigkeitAngabenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.NACHWEISE_DATENSCHUTZ_TYPE__RICHTIGKEIT_ANGABEN, oldRichtigkeitAngaben, richtigkeitAngaben, !oldRichtigkeitAngabenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRichtigkeitAngaben() {
		boolean oldRichtigkeitAngaben = richtigkeitAngaben;
		boolean oldRichtigkeitAngabenESet = richtigkeitAngabenESet;
		richtigkeitAngaben = RICHTIGKEIT_ANGABEN_EDEFAULT;
		richtigkeitAngabenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErziehungshilfePackage.NACHWEISE_DATENSCHUTZ_TYPE__RICHTIGKEIT_ANGABEN, oldRichtigkeitAngaben, RICHTIGKEIT_ANGABEN_EDEFAULT, oldRichtigkeitAngabenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRichtigkeitAngaben() {
		return richtigkeitAngabenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErziehungshilfePackage.NACHWEISE_DATENSCHUTZ_TYPE__NACHWEIS:
				return ((InternalEList<?>)getNachweis()).basicRemove(otherEnd, msgs);
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
			case ErziehungshilfePackage.NACHWEISE_DATENSCHUTZ_TYPE__NACHWEIS:
				return getNachweis();
			case ErziehungshilfePackage.NACHWEISE_DATENSCHUTZ_TYPE__ZUSTIMMUNG_ET2:
				return isZustimmungET2();
			case ErziehungshilfePackage.NACHWEISE_DATENSCHUTZ_TYPE__RICHTIGKEIT_ANGABEN:
				return isRichtigkeitAngaben();
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
			case ErziehungshilfePackage.NACHWEISE_DATENSCHUTZ_TYPE__NACHWEIS:
				getNachweis().clear();
				getNachweis().addAll((Collection<? extends NachweisType>)newValue);
				return;
			case ErziehungshilfePackage.NACHWEISE_DATENSCHUTZ_TYPE__ZUSTIMMUNG_ET2:
				setZustimmungET2((Boolean)newValue);
				return;
			case ErziehungshilfePackage.NACHWEISE_DATENSCHUTZ_TYPE__RICHTIGKEIT_ANGABEN:
				setRichtigkeitAngaben((Boolean)newValue);
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
			case ErziehungshilfePackage.NACHWEISE_DATENSCHUTZ_TYPE__NACHWEIS:
				getNachweis().clear();
				return;
			case ErziehungshilfePackage.NACHWEISE_DATENSCHUTZ_TYPE__ZUSTIMMUNG_ET2:
				unsetZustimmungET2();
				return;
			case ErziehungshilfePackage.NACHWEISE_DATENSCHUTZ_TYPE__RICHTIGKEIT_ANGABEN:
				unsetRichtigkeitAngaben();
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
			case ErziehungshilfePackage.NACHWEISE_DATENSCHUTZ_TYPE__NACHWEIS:
				return nachweis != null && !nachweis.isEmpty();
			case ErziehungshilfePackage.NACHWEISE_DATENSCHUTZ_TYPE__ZUSTIMMUNG_ET2:
				return isSetZustimmungET2();
			case ErziehungshilfePackage.NACHWEISE_DATENSCHUTZ_TYPE__RICHTIGKEIT_ANGABEN:
				return isSetRichtigkeitAngaben();
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
		result.append(" (zustimmungET2: ");
		if (zustimmungET2ESet) result.append(zustimmungET2); else result.append("<unset>");
		result.append(", richtigkeitAngaben: ");
		if (richtigkeitAngabenESet) result.append(richtigkeitAngaben); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NachweiseDatenschutzTypeImpl
